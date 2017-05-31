package PayrollMasterPageObject;

import java.io.IOException;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pageObjects.Utility;

public class GenerateBarCode {
  WebDriver dr;
  String pg="GenerateBarCode";
  Utility u= new Utility();
		  
  public GenerateBarCode(WebDriver d)
  {
	  this.dr=d;
	  PageFactory.initElements(d, this);
  }
  public void openGenerateBarCode()
  {
	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Payroll-Master.png']"));
	  Actions builder= new Actions(dr);
	  builder.moveToElement(menu).build().perform();
	  dr.findElement(By.linkText("Generate Barcode")).click();
	  dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Payroll/Create-Barcode-Foremployee.aspx']")));
	  dr.findElement(By.xpath("//input[@type='text']")).click();
  }
  public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
	  Thread.sleep(1000);
	  u.captureScreenshot(dr,schl,pg,sc);
  }
}

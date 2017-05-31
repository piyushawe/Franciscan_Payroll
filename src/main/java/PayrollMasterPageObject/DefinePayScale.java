package PayrollMasterPageObject;

import java.io.IOException;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pageObjects.Utility;

public class DefinePayScale {
  WebDriver dr;
  String pg="DefinePayScale";
  Utility u= new Utility();
		  
  public DefinePayScale(WebDriver d)
  {
	  this.dr=d;
	  PageFactory.initElements(d, this);
  }
  public void openDefinePayScale()
  {
	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Payroll-Master.png']"));
	  Actions builder= new Actions(dr);
	  builder.moveToElement(menu).build().perform();
	  dr.findElement(By.linkText("Define Pay Scale")).click();
	  dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Payroll/DefinePayScale.aspx']")));
	  dr.findElement(By.className("csslabel")).click();
  }
  public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
	  Thread.sleep(1000);
	  u.captureScreenshot(dr,schl,pg,sc);
  }
}

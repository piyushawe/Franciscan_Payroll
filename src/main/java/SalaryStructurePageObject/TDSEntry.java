package SalaryStructurePageObject;

import java.io.IOException;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pageObjects.Utility;

public class TDSEntry {
  WebDriver dr;
  String pg="TDSEntry";
  Utility u= new Utility();
					  
  public TDSEntry(WebDriver d)
  {
	  this.dr=d;
	  PageFactory.initElements(d, this);
  }
  public void openTDSEntry()
  {
	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Salary-Structure.png']"));
	  Actions builder= new Actions(dr);
	  builder.moveToElement(menu).build().perform();
	  dr.findElement(By.linkText("TDS Entry")).click();
	  dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Payroll/TDSEntry.aspx']")));
	  dr.findElement(By.name("ctl00$ContentPlaceHolder1$BtnControls1$ctl01")).click();
  }
  public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
	  Thread.sleep(1000);
	  u.captureScreenshot(dr,schl,pg,sc);
  }
}

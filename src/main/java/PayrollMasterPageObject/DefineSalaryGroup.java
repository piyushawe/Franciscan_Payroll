package PayrollMasterPageObject;

import java.io.IOException;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pageObjects.Utility;

public class DefineSalaryGroup {
   WebDriver dr;
   String pg="DefineSalaryGroup";
   Utility u= new Utility();
				  	  
   public DefineSalaryGroup(WebDriver d)
   {
	  this.dr=d;
	  PageFactory.initElements(d, this);
   }
   public void openDefineSalaryGroup()
   {
	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Payroll-Master.png']"));
	  Actions builder= new Actions(dr);
	  builder.moveToElement(menu).build().perform();
	  dr.findElement(By.linkText("Define Salary Group")).click();
	  dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Payroll/DefineSalaryGroup.aspx']")));
	  dr.findElement(By.className("csslabel")).click();
   }
   public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
   {
	  Thread.sleep(1000);
	  u.captureScreenshot(dr,schl,pg,sc);
   }
}

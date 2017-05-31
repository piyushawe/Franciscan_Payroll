package PayrollMasterPageObject;

import java.io.IOException;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pageObjects.Utility;

public class DefineFixation {
	 WebDriver dr;
	  String pg="DefineFixation";
	  Utility u= new Utility();
			  
	  public DefineFixation(WebDriver d)
	  {
		  this.dr=d;
		  PageFactory.initElements(d, this);
	  }
	  public void openDefineFixation()
	  {
		  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Payroll-Master.png']"));
		  Actions builder= new Actions(dr);
		  builder.moveToElement(menu).build().perform();
		  dr.findElement(By.linkText("Define Fixation")).click();
		  dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Payroll/DefineFixation.aspx']")));
		  dr.findElement(By.className("content")).click();
	  }
	  public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
	  {
		  Thread.sleep(1000);
		  u.captureScreenshot(dr,schl,pg,sc);
	  }
}

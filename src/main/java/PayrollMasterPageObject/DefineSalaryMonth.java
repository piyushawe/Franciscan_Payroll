package PayrollMasterPageObject;

import java.io.IOException;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageObjects.Utility;

public class DefineSalaryMonth {
  WebDriver dr;
  String pg="DefineSalaryMonth";
  Utility u= new Utility();
		  
  @FindBy(id="ContentPlaceHolder1_txtslno_TextBox")WebElement serialno;
  
  public DefineSalaryMonth(WebDriver d)
  {
	  this.dr=d;
	  PageFactory.initElements(d, this);
  }
  public void openDefineSalaryMonth()
  {
	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Payroll-Master.png']"));
	  Actions builder= new Actions(dr);
	  builder.moveToElement(menu).build().perform();
	  dr.findElement(By.linkText("Define Salary Month")).click();
	  dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Payroll/DefineSalMonth.aspx']")));
	  dr.findElement(By.className("csslabel")).click();
  }
  public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
	  Thread.sleep(1000);
	  u.captureScreenshot(dr,schl,pg,sc);
	  verifySerialNo();
  }
  public void verifySerialNo()
  {
	  System.out.println(serialno.getAttribute("value"));
	  if(!(serialno.getAttribute("value").isEmpty()))
		 System.out.println("Serial no is there");
	  else
		  System.out.println("Serial No should Not be empty");  		 
  }
}

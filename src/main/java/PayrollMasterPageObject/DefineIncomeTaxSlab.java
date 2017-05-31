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

public class DefineIncomeTaxSlab {
  WebDriver dr;
  String pg="DefineIncomeTaxSlab";
  Utility u= new Utility();
			  
  @FindBy(id="ContentPlaceHolder1_txtSno_TextBox")WebElement serialno;
  
  public DefineIncomeTaxSlab(WebDriver d)
  {
	  this.dr=d;
	  PageFactory.initElements(d, this);
  }
  public void openDefineIncomeTaxSlab()
  {
	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Payroll-Master.png']"));
	  Actions builder= new Actions(dr);
	  builder.moveToElement(menu).build().perform();
	  dr.findElement(By.linkText("Define Income Tax Slab")).click();
	  dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Payroll/DefineIncomeTaxSlab.aspx']")));
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
	  if(!(serialno.getAttribute("value").isEmpty()))
		 System.out.println("Serial no is there");
	  else
		  System.out.println("Serial No should Not be empty");  		 
  }
}

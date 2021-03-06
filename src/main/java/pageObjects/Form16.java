package pageObjects;

import java.io.IOException;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Form16 {
  WebDriver dr;
  String r="Form16";
  Utility u= new Utility();
  
  @FindBy(id="ContentPlaceHolder1_ddlEmployeeType")WebElement stafftype;
  @FindBy(id="ContentPlaceHolder1_ddlEmployeeName")WebElement staffname;
  @FindBy(name="ctl00$ContentPlaceHolder1$SingleButton1$ctl00")WebElement show;
  
  public Form16(WebDriver d)
  {
	  this.dr=d; 
	  PageFactory.initElements(d, this);
  }
  public void openForm16()
  {
	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
	  Actions builder= new Actions(dr);
	  builder.moveToElement(menu).build().perform();
	  dr.findElement(By.linkText("Form 16")).click();
	  dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Report/Payroll/RptForm16.aspx']")));
  }
  public void selectStaffType(String stype)
  {
	  new Select(stafftype).selectByVisibleText(stype);
  }
  public void selectStaffName(String sname)
  {
	  new Select(staffname).selectByVisibleText(sname);
  }
  public void clickShow(String str, Collection<String>sc) throws InterruptedException, IOException
  {
 	 show.click();
     u.verifyShow(dr, str, r, sc);
 	 Thread.sleep(5000);
 	 u.captureScreenshot(dr, str, r,sc);
 	 //u.downloadPDF(dr);
  }
}

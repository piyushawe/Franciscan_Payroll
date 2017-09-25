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

public class GrossForm16 {
  WebDriver dr;
  String r="GrossForm16";
  Utility u= new Utility();
					  
  @FindBy(id="ContentPlaceHolder1_ddlSchoolName")WebElement schoolname;
  @FindBy(id="ContentPlaceHolder1_ddlSalaryAccName")WebElement schoolbank;
  @FindBy(id="ContentPlaceHolder1_ddlfinance")WebElement session;
  @FindBy(name="ctl00$ContentPlaceHolder1$SingleButton1$ctl00")WebElement show;
					  
  public GrossForm16(WebDriver d)
  {
	 this.dr=d; 
	 PageFactory.initElements(d, this);
  }
  public void openGrossForm16()
  {
	 WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
	 Actions builder= new Actions(dr);
	 builder.moveToElement(menu).build().perform();
	 dr.findElement(By.linkText("Gross Form 16")).click();
	 dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Report/Payroll/RptGrossForm16.aspx']")));
  }
  public void selectSchoolBank(String sbank)
  {
	  new Select(schoolbank).selectByVisibleText(sbank);
  }
  public void selectSchoolName(String sname)
  {
	  new Select(schoolname).selectByVisibleText(sname);
  }
  public void selectSession(String s)
  {
	  new Select(session).selectByVisibleText(s);
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

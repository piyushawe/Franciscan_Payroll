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

public class PFReport {
  WebDriver dr;
  String r="PFReport";
  Utility u= new Utility();
  
  @FindBy(id="ContentPlaceHolder1_ddlBank")WebElement schoolbank;
  @FindBy(id="ContentPlaceHolder1_ddlSalaryAccNo")WebElement salaryaccountno;
  @FindBy(id="ContentPlaceHolder1_ddlforformat")WebElement format;
  @FindBy(id="ContentPlaceHolder1_ddlSalaryMonth")WebElement salarymonth;
  @FindBy(id="ContentPlaceHolder1_btnShow")WebElement show;
  
  public PFReport(WebDriver d)
  {
	  this.dr=d; 
	  PageFactory.initElements(d, this);
  }
  public void openPFReport()
  {
	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
	  Actions builder= new Actions(dr);
	  builder.moveToElement(menu).build().perform();
	  dr.findElement(By.linkText("PF Report")).click();
	  dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Report/Payroll/PFChallanReport.aspx']")));
  }
  public void selectSchoolbank(String sbank)
  {
	  new Select(schoolbank).selectByVisibleText(sbank);
  }
  public void selectSalaryAccountNo(String sacc)
  {
	  new Select(salaryaccountno).selectByVisibleText(sacc);
  }
  public void selectSalaryMonth(String smonth)
  {
	  new Select(salarymonth).selectByVisibleText(smonth);
  }
  public void selectFormat(String f)
  {
	  new Select(format).selectByVisibleText(f);
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

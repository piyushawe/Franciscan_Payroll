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

public class ProfessionalTax {
  WebDriver dr;
  String r="ProfessionalTax";
  Utility u= new Utility();
	  
  @FindBy(id="ContentPlaceHolder1_ddlSalaryAccName")WebElement schoolbank;
  @FindBy(id="ContentPlaceHolder1_ddlSalaryAccNo")WebElement salaryaccountno;
  @FindBy(id="ContentPlaceHolder1_ddlSchoolName")WebElement schoolname;
  @FindBy(id="ContentPlaceHolder1_ddlSalaryMonth")WebElement salarymonth;
  @FindBy(name="ctl00$ContentPlaceHolder1$SingleButton1$ctl00")WebElement show;
	  
  public ProfessionalTax(WebDriver d)
  {
     this.dr=d; 
	 PageFactory.initElements(d, this);
  }
  public void openProfessionalTax()
  {
    WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
	Actions builder= new Actions(dr);
	builder.moveToElement(menu).build().perform();
	dr.findElement(By.linkText("Professional Tax")).click();
	dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Report/Payroll/RptPTax.aspx']")));
  }
  public void selectSchoolBank(String sbank)
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
  public void selectSchoolName(String sname)
  {
    new Select(schoolname).selectByVisibleText(sname);
  }
  public void clickShow(String str, Collection<String>sc) throws InterruptedException, IOException
  {
 	 show.click();
 	 Thread.sleep(5000);
 	 u.captureScreenshot(dr, str, r,sc);
 	 u.downloadPDF(dr);
  }
}

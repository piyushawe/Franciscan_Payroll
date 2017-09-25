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

public class BankStatementReport {
  WebDriver dr;
  String r="BankStatementReport";
  Utility u= new Utility();
  
  @FindBy(id="ContentPlaceHolder1_ddlSchoolName")WebElement school;
  @FindBy(id="ContentPlaceHolder1_ddlYearMonth")WebElement salarymonth;
  @FindBy(id="ContentPlaceHolder1_ddlSalaryAccount")WebElement schoolbank;
  @FindBy(id="ContentPlaceHolder1_ddlbankname")WebElement bankname;
  @FindBy(id="ContentPlaceHolder1_ddlChequeNo")WebElement salarycheque;
  @FindBy(id="ContentPlaceHolder1_ddlPreparedBy")WebElement preparedby;
  @FindBy(id="ContentPlaceHolder1_ddlApprovedBy")WebElement approvedby;
  @FindBy(name="ctl00$ContentPlaceHolder1$SingleButton1$ctl00")WebElement show;
  
  public BankStatementReport(WebDriver d)
  {
	 this.dr=d;
	 PageFactory.initElements(d, this);
  }
  public void openBankStatementReport()
  {
	WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Salary-Reports.png']"));
	Actions builder= new Actions(dr);
	builder.moveToElement(menu).build().perform();
	dr.findElement(By.linkText("Bank Statement Report")).click();
	dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Report/Payroll/RptBankStatement.aspx']")));
  }
  public void selectSchoolName(String sname)
  {
	 new Select(school).selectByVisibleText(sname); 
  }
  public void selectSalaryMonth(String smonth) throws InterruptedException
  {
	  new Select(salarymonth).selectByVisibleText(smonth);
	  Thread.sleep(3000);
  }
  public void selectSchoolBank(String sbank) throws InterruptedException
  {
	  new Select(schoolbank).selectByVisibleText(sbank);
	  Thread.sleep(3000);
  }
  public void selectBankName(String bname) throws InterruptedException
  {
	  new Select(bankname).selectByVisibleText(bname);
	  Thread.sleep(2000);
  }
  public void selectSalaryCheque(String schq)
  {
	  new Select(salarycheque).selectByVisibleText(schq);
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

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

public class GrossSalaryReport {
	WebDriver dr;
	String r= "GrossSalaryReport";
	Utility u= new Utility();
	  
	  @FindBy(id="ContentPlaceHolder1_ddlBank")WebElement schoolbank;
	  @FindBy(id="ContentPlaceHolder1_ddlSalaryAccNo")WebElement salaryaccountno;
	  @FindBy(id="ContentPlaceHolder1_ddlStaffType")WebElement stafftype;
	  @FindBy(id="ContentPlaceHolder1_ddlFYearMonth")WebElement frommonth;
	  @FindBy(id="ContentPlaceHolder1_ddlTYearMonth")WebElement tomonth;
	  @FindBy(name="ctl00$ContentPlaceHolder1$SingleButton1")WebElement show;
	  
	  public GrossSalaryReport(WebDriver d)
	  {
		 this.dr=d;
		 PageFactory.initElements(d, this);
	  }
	  public void openGrossSalaryReport()
	  {
		 WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Salary-Reports.png']"));
		 Actions builder= new Actions(dr);
		 builder.moveToElement(menu).build().perform();
		 dr.findElement(By.linkText("Gross Salary Report")).click();
		 dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Report/Payroll/RptGrossSalaryReport.aspx']")));
	  }
	  public void selectSchoolBank(String sbank)
	  {
		  new Select(schoolbank).selectByVisibleText(sbank);
	  }
	  public void selectSalaryAccountNo(String sacc)
	  {
		  new Select(salaryaccountno).selectByVisibleText(sacc);
	  }
	  public void selectStaffType(String stype)
	  {
		  new Select(stafftype).selectByVisibleText(stype);
	  }
	  public void selectFromMonth(String fmonth)
	  {
		  new Select(frommonth).selectByVisibleText(fmonth);
	  }
	  public void selectToMonth(String tmonth)
	  {
		  new Select(tomonth).selectByVisibleText(tmonth);
	  }
	  public void selectDesignation(String desig)
	  {
		  
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

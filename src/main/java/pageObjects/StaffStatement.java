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

public class StaffStatement {
  WebDriver dr;
  String r="StaffStatement";
  Utility u= new Utility();
  
  @FindBy(id="ContentPlaceHolder1_ddlBank")WebElement schoolbank;
  @FindBy(id="ContentPlaceHolder1_ddlSalaryAccNo")WebElement salaryaccountno;
  @FindBy(id="ContentPlaceHolder1_ddlStaffTpe")WebElement stafftype;
  @FindBy(id="ContentPlaceHolder1_txtDateFrom_TextBox")WebElement joiningfromdate;
  @FindBy(id="ContentPlaceHolder1_txtDateTo_TextBox")WebElement joiningtodate;
  @FindBy(id="ContentPlaceHolder1_ddlSalaryMonth")WebElement salarymonth;
  @FindBy(id="ContentPlaceHolder1_SingleButton1")WebElement show;
  
  public StaffStatement(WebDriver d)
  {
	  this.dr=d;
	  PageFactory.initElements(d, this);
  }
  public void openStaffStatement()
  {
	 WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Salary-Reports.png']"));
	 Actions builder= new Actions(dr);
	 builder.moveToElement(menu).build().perform();
	 dr.findElement(By.linkText("Staff Statement")).click();
	 dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Report/Payroll/RptStaffStatmentReport.aspx']")));
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
  public void selectJoiningFromdate(String mm, String yy, String dd) throws InterruptedException
  {
	  u.selectDate(dr, joiningfromdate, mm, yy, dd);
  }
  public void selectJoiningToDate(String mm, String yy, String dd) throws InterruptedException
  {
	  u.selectDate(dr, joiningtodate, mm, yy, dd);
  }
  public void selectSalaryMonth(String m)
  {
	  new Select(salarymonth).selectByVisibleText(m);
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

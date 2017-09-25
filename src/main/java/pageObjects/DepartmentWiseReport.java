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

public class DepartmentWiseReport {
  WebDriver dr;
  String r="DepartmentWiseReport";
  Utility u= new Utility();
  
  @FindBy(id="ContentPlaceHolder1_ddlBank")WebElement schoolbank;
  @FindBy(id="ContentPlaceHolder1_ddlSalaryAccNo")WebElement salaryaccountno;
  @FindBy(id="ContentPlaceHolder1_ddlSalaryMonFrom")WebElement monthfrom;
  @FindBy(id="ContentPlaceHolder1_ddlSalaryMonTo")WebElement monthto;
  @FindBy(id="ContentPlaceHolder1_ddlDeptName")WebElement department;
  @FindBy(id="ContentPlaceHolder1_SingleButton1")WebElement show;
  
  public DepartmentWiseReport(WebDriver d) 
  {
	  this.dr=d;
	  PageFactory.initElements(d, this);
  }
  public void openDepartmentWiseReport()
  {
	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Salary-Reports.png']"));
	  Actions builder= new Actions(dr);
	  builder.moveToElement(menu).build().perform();
	  dr.findElement(By.linkText("Department wise Report")).click();
	  dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Report/Payroll/RptDeptWiseSalaryReport.aspx']")));
  }
  public void selectSchoolBank(String sbank)
  {
	  new Select(schoolbank).selectByVisibleText(sbank);
  }
  public void selectSalaryAccountNo(String saccount)
  {
	  new Select(salaryaccountno).selectByVisibleText(saccount);
  }
  public void selectMonthFrom(String mfrom) throws InterruptedException
  {
	 new Select(monthfrom).selectByVisibleText(mfrom);
  }
  public void selectMonthTo(String mto) throws InterruptedException
  {
	  new Select(monthto).selectByVisibleText(mto);
  }
  public void selectDepartment(String dept)
  {
	  new Select(department).selectByVisibleText(dept);
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

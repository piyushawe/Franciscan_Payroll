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

public class EmployeeTypeWiseReport {
  WebDriver dr;
  String r= "EmployeeTypeWiseReport";
  Utility u= new Utility();
  
  @FindBy(id="ContentPlaceHolder1_ddlSalaryAccount")WebElement schoolbank;
  @FindBy(id="ContentPlaceHolder1_ddlEmpType")WebElement employeetype;
  @FindBy(id="ContentPlaceHolder1_ddlEmpName")WebElement employeename;
  @FindBy(name="ctl00$ContentPlaceHolder1$SingleButton1$ctl00")WebElement show;
  
  public EmployeeTypeWiseReport(WebDriver d)
  {
	 this.dr=d;
	 PageFactory.initElements(d, this);
  }
  public void openEmployeeTypeWiseReport()
  {
	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Salary-Reports.png']"));
	  Actions builder= new Actions(dr);
	  builder.moveToElement(menu).build().perform();
	  dr.findElement(By.linkText("Employee Type wise Report")).click();
	  dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Report/Payroll/RptEmpTypeSalaryReport.aspx']")));
  }
  public void selectSchoolBank(String sbank)
  {
	  new Select(schoolbank).selectByVisibleText(sbank);
  }
  public void selectEmployeeType(String etype)
  {
	  new Select(employeetype).selectByVisibleText(etype);
  }
  public void selectDesignation(String desig)
  {
	  
  }
  public void selectEmployeeName(String ename)
  {
	  new Select(employeename).selectByVisibleText(ename);
  }
  public void clickShow(String str, Collection<String>sc) throws InterruptedException, IOException
  {
 	 show.click();
 	 Thread.sleep(5000);
 	 u.captureScreenshot(dr, str, r,sc);
 	 u.downloadPDF(dr);
  }
}

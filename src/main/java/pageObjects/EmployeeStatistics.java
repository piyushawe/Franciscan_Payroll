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

public class EmployeeStatistics {
  WebDriver dr;
  String r="EmployeeStatistics";
  Utility u= new Utility();
  
  @FindBy(id="ContentPlaceHolder1_ddlBank")WebElement schoolbank;
  @FindBy(id="ContentPlaceHolder1_ddlBank")WebElement salaryaccountno;
  @FindBy(id="ContentPlaceHolder1_ddlDesignation")WebElement designation;
  @FindBy(id="ContentPlaceHolder1_ddlInActive")WebElement status;
  @FindBy(id="ContentPlaceHolder1_chkAll")WebElement selectall;
  @FindBy(name="ctl00$ContentPlaceHolder1$SingleButton1$ctl00")WebElement show;
  
  public EmployeeStatistics(WebDriver d)  {
	  this.dr=d;
	  PageFactory.initElements(d, this);
  }
  public void openEmployeeStatistics()
  {
	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
	  Actions builder= new Actions(dr);
	  builder.moveToElement(menu).build().perform();
	  dr.findElement(By.linkText("Employee Statistics")).click();
	  dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Report/Payroll/StaffStatisticsReport.aspx']")));
  }
  public void selectSchoolBank(String sbank)
  {
	  new Select(schoolbank).selectByVisibleText(sbank);
  }
  public void selectSalaryAccountNo(String sacc)
  {
	  new Select(salaryaccountno).selectByVisibleText(sacc);
  }
  public void selectDesignation(String desig)
  {
	  new Select(designation).selectByVisibleText(desig);
  }
  public void selectStatus(String st)
  {
	  new Select(status).selectByVisibleText(st);
  }
  public void clickSelectAll()
  {
	  selectall.click();
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

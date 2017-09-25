package pageObjects;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SalarySlip {
  WebDriver dr;
  String r= "SalarySlip";
  Utility u= new Utility();
  
  @FindBy(id="ContentPlaceHolder1_ddlSchoolName")WebElement schoolname;
  @FindBy(id="ContentPlaceHolder1_ddlStaffType")WebElement stafftype;
  @FindBy(id="ContentPlaceHolder1_ddlSalaryMonth")WebElement salarymonth;
  @FindBy(name="ctl00$ContentPlaceHolder1$btnShow$ctl00")WebElement show;
  @FindBy(name="ctl00$ContentPlaceHolder1$btnPrint$ctl00")WebElement print;
  
  public SalarySlip(WebDriver d)
  {
	  this.dr=d;
	  PageFactory.initElements(d, this);
  }
  public void openSalarySlip()
  {
	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Salary-Reports.png']"));
	  Actions builder= new Actions(dr);
	  builder.moveToElement(menu).build().perform();
	  dr.findElement(By.linkText("Salary Slip")).click();
	  dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Report/Payroll/SalarySlipReport.aspx']")));
  }
  public void selectSchoolName(String sname)
  {
	 new Select(schoolname).selectByVisibleText(sname);
  }
  public void selectStaffType(String stype)
  {
	  new Select(stafftype).selectByVisibleText(stype);
  }
  public void selectSalaryMonth(String smonth)
  {
	  new Select(salarymonth).selectByVisibleText(smonth);
  }
  public void clickShow()
  {
	  show.click();
  }
  public void selectEmployee(String emp) throws InterruptedException
  {
	  dr.findElement(By.xpath("//input[@placeholder='type here...']")).sendKeys(emp);
	  WebElement t= dr.findElement(By.id("example1"));
	  List<WebElement>cols= t.findElements(By.tagName("td"));
	  if(cols.size()>1) {
		   dr.findElement(By.xpath("//input[@type='checkbox']")).click();
		   Thread.sleep(1000);
		   //dr.findElement(By.id("CloseButton")).click();
		   }
		   else
			   System.out.println("No data is available"); 
  }
  public void clickPrint(String str, Collection<String> sc) throws IOException, InterruptedException
  {
	  print.click();
      u.verifyShow(dr, str, r, sc);
	  Thread.sleep(2000);
	  //u.captureScreenshot(dr, str, r,sc);
  }
}

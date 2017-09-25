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

public class IncrementReport {
  WebDriver dr;
  String r="IncrementReport";
  Utility u= new Utility();
						  
  @FindBy(id="ContentPlaceHolder1_ddlBank")WebElement schoolbank;
  @FindBy(id="ContentPlaceHolder1_ddlSalaryAccNo")WebElement salaryaccountno;
  @FindBy(id="ContentPlaceHolder1_ddlYearMonth")WebElement monthandyear;
  @FindBy(name="ctl00$ContentPlaceHolder1$rdblist")WebElement increment;
  @FindBy(name="ctl00$ContentPlaceHolder1$SingleButton1$ctl00")WebElement show;
						  
	  public IncrementReport(WebDriver d)
	  {
		 this.dr=d; 
		 PageFactory.initElements(d, this);
	  }
	  public void openIncrementReport()
	  {
		 WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
		 Actions builder= new Actions(dr);
		 builder.moveToElement(menu).build().perform();
		 dr.findElement(By.linkText("Increment Report")).click();
		 dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Report/Payroll/RptIncrementReport.aspx']")));
	  }
	  public void selectSchoolBank(String sbank)
	  {
		  new Select(schoolbank).selectByVisibleText(sbank);
	  }
	  public void selectSalaryAccountNo(String sacc)
	  {
		  new Select(salaryaccountno).selectByVisibleText(sacc);
	  }
	  public void selectMonthAndyear(String my)
	  {
		  new Select(monthandyear).selectByVisibleText(my);
	  }
	  public void selectIncrement(String inc)
	  {
		  List<WebElement>options= dr.findElements(By.name("ctl00$ContentPlaceHolder1$rdblist"));
		  String val;
		  for(WebElement option:options)
		  {   
			  if(inc.equals("basic salary")) {
			   val="1";
			  if(option.getAttribute("value").equals(val))   
				  option.click();
			  }
			  if(inc.equals("dearness allowance")) {
				  val="2";
				  if(option.getAttribute("value").equals(val))   
					  option.click();
			  }
			  if(inc.equals("transport allowance")) {
				  val="3";
				  if(option.getAttribute("value").equals(val))		 
					  option.click();
			 }
			  if(inc.equals("house rent allowance")) {
				  val="4";
				  if(option.getAttribute("value").equals(val)) 				  
					  option.click();
			 }
			  
		  }
	  }
	  public void selectStatus(String s)
	  {
		  List<WebElement>options=dr.findElements(By.name("ctl00$ContentPlaceHolder1$rdostatus"));
		  String status;
		  for(WebElement option:options)
		  {   
			  if(s.equals("Active")) {
			  status="1";	  
			  if(option.getAttribute("value").equals(status)) 
				  option.click();
			  }
			  if(s.equals("Deactive")) {
			  status="0";	  
			  if(option.getAttribute("value").equals(status)) 
				  option.click();
			  }
		  }
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

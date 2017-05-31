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

public class MACPList {
  WebDriver dr;
  String r="MACPList";
  Utility u= new Utility();
		  
  @FindBy(id="ContentPlaceHolder1_ddlBank")WebElement schoolbank;
  @FindBy(id="ContentPlaceHolder1_ddlSalaryAccNo")WebElement salaryaccountno;
  @FindBy(id="ContentPlaceHolder1_ddlFormat")WebElement format;
  @FindBy(name="ctl00$ContentPlaceHolder1$btnShow$ctl00")WebElement show;
		  
  public MACPList(WebDriver d)
  {
	 this.dr=d; 
	 PageFactory.initElements(d, this);
  }
  public void openMACPList()
  {
	 WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Reports.png']"));
	 Actions builder= new Actions(dr);
	 builder.moveToElement(menu).build().perform();
	 dr.findElement(By.linkText("MACP List")).click();
	 dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Report/Payroll/Rptmacpreports.aspx']")));
  }
  public void selectSchoolBank(String sbank)
  {
	  new Select(schoolbank).selectByVisibleText(sbank);
  }
  public void selectSalaryAccountNo(String sacc)
  {
	  new Select(salaryaccountno).selectByVisibleText(sacc);
  }
  public void selectFormat(String f)
  {
	  new Select(format).selectByVisibleText(f);
  }
  public void clickShow(String str, Collection<String>sc) throws InterruptedException, IOException
  {
 	 show.click();
 	 Thread.sleep(5000);
 	 u.captureScreenshot(dr, str, r,sc);
 	 u.downloadPDF(dr);
  }
}

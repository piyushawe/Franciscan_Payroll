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

public class QuarterlyForm24Q {
  WebDriver dr;
  String r="QuarterlyForm24Q";
  Utility u= new Utility();
  
  @FindBy(id="ContentPlaceHolder1_ddlSalaryAccName")WebElement schoolbank;
  @FindBy(id="ContentPlaceHolder1_ddlSalaryAccNo")WebElement salaryaccountno;
  @FindBy(xpath="//*[@id=\"MainLeftPanel\"]/div/div[1]/div[4]/div/button")WebElement salarymonth;
  @FindBy(id="ContentPlaceHolder1_btnShow")WebElement show;
  
  public QuarterlyForm24Q(WebDriver d)
  {
	  this.dr=d;
	  PageFactory.initElements(d, this);
  }
  public void openQuarterlyForm24Q()
  {
	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Salary-Reports.png']"));
	  Actions builder= new Actions(dr);
	  builder.moveToElement(menu).build().perform();
	  dr.findElement(By.linkText("Quarterly Form 24Q")).click();
	  dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Report/Payroll/QuarterlyForm24Q.aspx']")));
  }
  public void selectSchoolBank(String sbank)
  {
	  new Select(schoolbank).selectByVisibleText(sbank);
  }
  public void selectsalaryAccountNo(String sacc)
  {
	  new Select(salaryaccountno).selectByVisibleText(sacc);
  }
  public void selectSalaryMonth(String m)
  {
	  salarymonth.click();
	  WebElement select= dr.findElement(By.xpath("/html/body/div[4]/ul"));
	  List<WebElement>options= select.findElements(By.tagName("span"));
	  for(WebElement option:options)
		  if(m.equals(option.getText()))
			  option.click();
	  salarymonth.click();
  }
  public void clickShow(String str, Collection<String>sc) throws InterruptedException, IOException
  {
 	 show.click();
 	 Thread.sleep(5000);
 	 u.captureScreenshot(dr, str, r,sc);
 	 u.downloadPDF(dr);
  }
}

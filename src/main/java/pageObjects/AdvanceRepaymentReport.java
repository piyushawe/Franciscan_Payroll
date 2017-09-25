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

public class AdvanceRepaymentReport {
	 WebDriver dr;
	 String r="AdvanceRepaymentReport";
	 Utility u= new Utility();
	 
	 @FindBy(id="ContentPlaceHolder1_txtfromDate_TextBox")WebElement fromdate;
	 @FindBy(id="ContentPlaceHolder1_txttoDate_TextBox")WebElement todate;
	 @FindBy(id="ContentPlaceHolder1_ddlEmployeeType")WebElement employeetype;
	 @FindBy(id="ContentPlaceHolder1_ddlEmployeeName")WebElement employeename;
	 @FindBy(name="ctl00$ContentPlaceHolder1$SingleButton1$ctl00")WebElement show;
	 
	 public AdvanceRepaymentReport(WebDriver d)
	 {
		 this.dr=d;
		 PageFactory.initElements(d, this);
	 }
	 public void openAdvanceRepaymentReport()
	 {
		 WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Salary-Reports.png']"));
		 Actions builder= new Actions(dr);
		 builder.moveToElement(menu).build().perform();
		 dr.findElement(By.linkText("Advance Repayment Report")).click();
		 dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Report/Payroll/AdvanceRepayment.aspx']")));
	 }
	 public void selectFromDate(String mm, String yy, String dd) throws InterruptedException
	 {
		 u.selectDate(dr, fromdate, mm, yy, dd);
	 }
	 public void selectToDate(String mm, String yy, String dd) throws InterruptedException
	 {
		 u.selectDate(dr, todate, mm, yy, dd);
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
		 u.verifyShow(dr, str, r, sc);
		 Thread.sleep(5000);
		 u.captureScreenshot(dr, str, r,sc);
		 //u.downloadPDF(dr);
	 }
}

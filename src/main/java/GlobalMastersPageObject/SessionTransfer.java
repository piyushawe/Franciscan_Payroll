package GlobalMastersPageObject;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pageObjects.Utility;

public class SessionTransfer {
  WebDriver dr;
  String pg="SessionTransfer";
  Utility u= new Utility();
						  
  @FindBy(id="ContentPlaceHolder1_ddlcurAcadyear")WebElement currentsession;
  @FindBy(id="ContentPlaceHolder1_ddlcurfinyear")WebElement currentfinancialyear;
  
  public SessionTransfer(WebDriver d)
  {
     this.dr=d;
	 PageFactory.initElements(d, this); 
  }
  public void openSessionTransfer()
  {
     WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Global-Masters.png']"));
	 Actions builder= new Actions(dr);
	 builder.moveToElement(menu).build().perform();
	 dr.findElement(By.linkText("Session Transfer")).click();
	 dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/SchoolCommonDetails/TransferSessionMainPage.aspx']")));
	 
  }
  public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
     Thread.sleep(1000);
	 u.captureScreenshot(dr,schl,pg,sc);
  }
  public void verifyAccountManagerPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
     dr.findElement(By.xpath("//img[@src='/Images/layout/Account-Manager.png']")).click();
     String pg1="SessionTransferAccountManager";
	 u.captureScreenshot(dr,schl,pg1,sc);
	 String str1=new Select(currentsession).getFirstSelectedOption().getText();
	 String str2=new Select(currentfinancialyear).getFirstSelectedOption().getText();
	 if(str1.equalsIgnoreCase("Select")&&str2.equalsIgnoreCase("Select"))
		 System.out.println("Session Not defined");
	 else
		 System.out.println("Session Not defined");
  } 
  public void verifyFeesManagerPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
     dr.findElement(By.xpath("//img[@src='/Images/layout/Fee-Manager.png']")).click();
     dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/FeeManagement/TransferSessionFees.aspx']")));
     String pg1="SessionTransferFeesManager";
	 u.captureScreenshot(dr,schl,pg1,sc);
	 //dr.switchTo().defaultContent();
	 String str1=new Select(currentsession).getFirstSelectedOption().getText();
	 String str2=new Select(currentfinancialyear).getFirstSelectedOption().getText();
	 if(str1.equalsIgnoreCase("Select")&&str2.equalsIgnoreCase("Select"))
		 System.out.println("Session Not defined");
	 else
		 System.out.println("Session Not defined");
  }
  public void verifyPayrollManagerPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
     dr.findElement(By.xpath("//img[@src='/Images/layout/Payroll-Manager.png']")).click();
     String pg1="SessionTransferPayrollManager";
	 u.captureScreenshot(dr,schl,pg1,sc);
  }
  public void verifyAdmissionManagerPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
     dr.findElement(By.xpath("//img[@src='/Images/layout/Admission-Manager.png']")).click();
     String pg1="SessionTransferAdmissionManager";
	 u.captureScreenshot(dr,schl,pg1,sc);
  }
}

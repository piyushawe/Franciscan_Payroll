package AdvancePageObject;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pageObjects.Utility;

public class AdvanceRepayment {
  WebDriver dr;
  String pg="AdvanceRepayment";
  Utility u= new Utility();
						  
  public AdvanceRepayment(WebDriver d)
  {
	  this.dr=d;
	  PageFactory.initElements(d, this);
  }
  public void openAdvanceRepayment()
  {
	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Advance.png']"));
	  Actions builder= new Actions(dr);
	  builder.moveToElement(menu).build().perform();
	  dr.findElement(By.linkText("Advance Repayment")).click();
	  dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Payroll/PayAdvanceRepayment.aspx']")));
	  dr.findElement(By.name("ctl00$ContentPlaceHolder1$BtnControls1$ctl01")).click();
  }
  public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
	  Thread.sleep(1000);
	  u.captureScreenshot(dr,schl,pg,sc);
	  verifyPaymentMode();
  }
  public void verifyPaymentMode()
  {
	  List<WebElement>paymode= dr.findElements(By.name("ctl00$ContentPlaceHolder1$pay123"));
	  boolean flag= false;
	  int i=0;
	  for(WebElement pmode:paymode)
	  {
		  if(paymode.get(i).isSelected())
			  flag=true;
		  i++;
      }
	   if(flag)
		  System.out.println("Payment Mode is selected");
		 else
		  System.out.println("Payment Mode is not selected");
  }
}

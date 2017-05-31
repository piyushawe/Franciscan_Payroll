package AdvancePageObject;

import java.io.IOException;
import java.util.Collection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageObjects.Utility;

public class FixAdvanceAccount {
  WebDriver dr;
  String pg="FixAdvanceAccount";
  Utility u= new Utility();
  
  @FindBy(id="ContentPlaceHolder1_txtAccName_TextBox")WebElement accountname;
  @FindBy(id="ContentPlaceHolder1_ddlAcc")WebElement selectaccount;
  
  public FixAdvanceAccount(WebDriver d)
  {
	 this.dr=d;
	 PageFactory.initElements(d, this);
  }
  public void openFixAdvanceAccount()
  {
	 WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Advance.png']"));
	 Actions builder= new Actions(dr);
	 builder.moveToElement(menu).build().perform();
	 dr.findElement(By.linkText("Fix Advance A/c")).click();
	 dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Payroll/RelateAdvanceAccount.aspx']")));
	 dr.findElement(By.className("csslabel")).click();
  }
  public void verifyPage(String schl,Collection<String>sc) throws InterruptedException, IOException
  {
	  Thread.sleep(500);
	  u.captureScreenshot(dr,schl,pg,sc);
  }
}

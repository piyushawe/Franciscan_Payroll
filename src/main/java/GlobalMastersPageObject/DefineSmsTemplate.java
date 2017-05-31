package GlobalMastersPageObject;

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

import pageObjects.Utility;

public class DefineSmsTemplate {
  WebDriver dr;
  String pg="DefineSmsTemplate";
  Utility u= new Utility();
					  
  @FindBy(id="ContentPlaceHolder1_ddlSMSType")WebElement smstype;
  
  public DefineSmsTemplate(WebDriver d)
  {
     this.dr=d;
	 PageFactory.initElements(d, this); 
  }
  public void openDefineSmsTemplate()
  {
     WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Global-Masters.png']"));
	 Actions builder= new Actions(dr);
	 builder.moveToElement(menu).build().perform();
	 dr.findElement(By.linkText("Define SMS Template")).click();
	 dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/SchoolCommonDetails/DefineSMSTemplate.aspx']")));
	 dr.findElement(By.className("sms")).click();
  }
  public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
     Thread.sleep(1000);
	 u.captureScreenshot(dr,schl,pg,sc);
	 verifySMStype();
  }
  public void verifySMStype()
  {
	  Select stype= new Select(smstype);
	  List<WebElement>options= stype.getOptions();
	  if(options.size()>1)
		  System.out.println("SMS type is defined");
	  else
		  System.out.println("SMS type is not defined");
  }
}

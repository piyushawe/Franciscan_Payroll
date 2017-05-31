package GlobalMastersPageObject;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pageObjects.Utility;

public class DefineStaff {
  WebDriver dr;
  String pg="DefineStaff";
  Utility u= new Utility();
				  
  public DefineStaff(WebDriver d)
  {
     this.dr=d;
	 PageFactory.initElements(d, this); 
  }
  public void openDefineStaff()
  {
     WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Global-Masters.png']"));
	 Actions builder= new Actions(dr);
	 builder.moveToElement(menu).build().perform();
	 dr.findElement(By.linkText("Define Staff")).click();
	 dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/SchoolCommonDetails/DefineStaff.aspx']")));
  }
  public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
     Thread.sleep(1000);
	 u.captureScreenshot(dr,schl,pg,sc);
  }
  public void verifyGender()
  {
	  List<WebElement>gender= dr.findElements(By.name("ctl00$ContentPlaceHolder1$g"));
	  boolean flag= false;
	  int i=0;
	  for(WebElement gdr:gender)
	  {
		  if(gender.get(i).isSelected())
			  flag= true;
	  }
	  if(flag)
		  System.out.println("Gender is Selected");
	  else
		  System.out.println("Gender is Not Selected");
  }
  public void verifyMaritalStatus()
  {
	  List<WebElement>maritalstatus= dr.findElements(By.name("ctl00$ContentPlaceHolder1$ms"));
	  boolean flag= false;
	  int i=0;
	  for(WebElement mstatus:maritalstatus)
	  {
		  if(maritalstatus.get(i).isSelected())
			  flag= true;
	  }
	  if(flag)
		  System.out.println("Marital Status is Selected");
	  else
		  System.out.println("Marital Status is Not Selected");
  }
  public void verifyStaffSalaryHead()
  {
	  dr.findElement(By.xpath("//label[@for='t-3']")).click();
	  WebElement table= dr.findElement(By.id("example2"));
	  List<WebElement>cols= table.findElements(By.tagName("td"));
	  for(WebElement col:cols)
	  {
		  if(dr.findElement(By.id("ContentPlaceHolder1_rptStaffSaleryHeadDetails_chkSelected_0")).isSelected())
			  if(dr.findElement(By.id("ContentPlaceHolder1_rptStaffSaleryHeadDetails_txtHValue_0")).isEnabled())
				  System.out.println("");
	  }
  }
}

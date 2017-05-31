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

public class DefineAcademicYear {
  WebDriver dr;
  String pg="DefineAcademicYear";
  Utility u= new Utility();
  
  @FindBy(id="ContentPlaceHolder1_txtcalcstart_ddlyear")WebElement startyear;
  @FindBy(id="ContentPlaceHolder1_txtcalcstart_ddlmonth")WebElement startmonth;
  @FindBy(id="ContentPlaceHolder1_txtcalcstart_ddlday")WebElement startday;
  @FindBy(id="ContentPlaceHolder1_txtcalcend_ddlyear")WebElement endyear;
  @FindBy(id="ContentPlaceHolder1_txtcalcend_ddlmonth")WebElement endmonth;
  @FindBy(id="ContentPlaceHolder1_txtcalcend_ddlday")WebElement endday;
  
  public DefineAcademicYear(WebDriver d)
  {
	  this.dr=d;
	  PageFactory.initElements(d, this); 
  }
  public void openDefineAcademicYear()
  {
	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Global-Masters.png']"));
	  Actions builder= new Actions(dr);
	  builder.moveToElement(menu).build().perform();
	  dr.findElement(By.linkText("Define Academic Year")).click();
	  dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/SchoolCommonDetails/AcademicYear.aspx']")));
	  dr.findElement(By.className("csslabel")).click();
  }
  public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
	  Thread.sleep(1000);
	  u.captureScreenshot(dr,schl,pg,sc);
	  verifyStartYear();
	  verifyEndYear();
  }
  public void verifyStartYear()
  {
	  List<WebElement>options= new Select(startyear).getOptions();
	  if(options.size()>1)
		  System.out.println("Start Year is defined");
	  else
		  System.out.println("Start Year is NOT defined");
	  options= new Select(startmonth).getOptions();
	  if(options.size()>1)
		  System.out.println("Start Month is defined");
	  else
		  System.out.println("Start Month is NOT defined");
	  options= new Select(startday).getOptions();
	  if(options.size()>1)
		  System.out.println("Start Day is defined");
	  else
		  System.out.println("Start Day is NOT defined");
  }
  public void verifyEndYear()
  {
	  List<WebElement>options= new Select(endyear).getOptions();
	  if(options.size()>1)
		  System.out.println("End Year is defined");
	  else
		  System.out.println("End Year is NOT defined");
	  options= new Select(endmonth).getOptions();
	  if(options.size()>1)
		  System.out.println("End Month is defined");
	  else
		  System.out.println("End Month is NOT defined");
	  options= new Select(endday).getOptions();
	  if(options.size()>1)
		  System.out.println("End Day is defined");
	  else
		  System.out.println("End Day is NOT defined");
  }
}

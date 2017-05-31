package SalaryStructurePageObject;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pageObjects.Utility;

public class AutoIncrement {
  WebDriver dr;
  String pg="AutoIncrement";
  Utility u= new Utility();
					  
  public AutoIncrement(WebDriver d)
  {
	  this.dr=d;
	  PageFactory.initElements(d, this);
  }
  public void openAutoIncrement()
  {
	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Salary-Structure.png']"));
	  Actions builder= new Actions(dr);
	  builder.moveToElement(menu).build().perform();
	  dr.findElement(By.linkText("Auto Increment")).click();
	  dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Payroll/AutoInc.aspx']")));
	  dr.findElement(By.id("ContentPlaceHolder1_btnCancel")).click();
  }
  public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
	  Thread.sleep(1000);
	  u.captureScreenshot(dr,schl,pg,sc);
	  verifyIncrementType();
  }
  public void verifyIncrementType()
  {
	  List<WebElement>incrementtype= dr.findElements(By.name("ctl00$ContentPlaceHolder1$rdbforinrementtype"));
	  boolean flag= false;
	  int i=0;
	  for(WebElement itype:incrementtype)
	  {
		  if(incrementtype.get(i).isSelected())
			  flag=true;
		  i++;
	  }
	  if(flag)
		  System.out.println("Increment Type is selected");
	  else
		  System.out.println("Increment Type is not selected");
  }
}

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

public class IncrementRollback {
  WebDriver dr;
  String pg="IncrementRollback";
  Utility u= new Utility();
				  
  public IncrementRollback(WebDriver d)
  {
 	  this.dr=d;
	  PageFactory.initElements(d, this);
  }
  public void openIncrementRollback()
  {
	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Salary-Structure.png']"));
	  Actions builder= new Actions(dr);
	  builder.moveToElement(menu).build().perform();
	  dr.findElement(By.linkText("Increment Rollback")).click();
	  dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Payroll/IncrementRollback.aspx']")));
	  dr.findElement(By.name("ctl00$ContentPlaceHolder1$btnCancel$ctl00")).click();
  }
  public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
	  Thread.sleep(1000);
	  u.captureScreenshot(dr,schl,pg,sc);
	  verifyRollbackType();
  }
  public void verifyRollbackType()
  {
	  List<WebElement>rollbacktype= dr.findElements(By.name("ctl00$ContentPlaceHolder1$rdbList"));
	  boolean flag= false;
	  int i=0;
	  for(WebElement rbtype:rollbacktype)
	  {
		  if(rollbacktype.get(i).isSelected())
			  flag=true;
		  i++;
	  }
	  if(flag)
		  System.out.println("Rollback is selected");
	  else
		  System.out.println("Rollback is not selected");
  }
}

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

public class BankStatement {
  WebDriver dr;
  String pg="BankStatement";
  Utility u= new Utility();
				  
  public BankStatement(WebDriver d)
  {
	  this.dr=d;
	  PageFactory.initElements(d, this);
  }
  public void openBankStatement()
  {
	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Salary-Structure.png']"));
	  Actions builder= new Actions(dr);
	  builder.moveToElement(menu).build().perform();
	  dr.findElement(By.linkText("Bank Statement")).click();
	  dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Payroll/BankStatement.aspx']")));
	  dr.findElement(By.className("csslabel")).click();
  }
  public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
	  Thread.sleep(1000);
	  u.captureScreenshot(dr,schl,pg,sc);
	  verifyGeneratedNonGenerated();
  }
  public void verifyGeneratedNonGenerated()
  {
	  List<WebElement>generated= dr.findElements(By.name("ctl00$ContentPlaceHolder1$rbtnEntryList"));
	  boolean flag= false;
	  int i=0;
	  for(WebElement gng:generated)
	  {
		  if(generated.get(i).isSelected())
			  flag=true;
		  i++;
	  }
	  if(flag)
		  System.out.println("Entry List is selected");
	  else
		  System.out.println("Entry List is not selected");
  }
}

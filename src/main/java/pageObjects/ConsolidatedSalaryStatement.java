package pageObjects;

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

public class ConsolidatedSalaryStatement {
  WebDriver dr;
  String r= "ConsolidatedSalaryStatement";
  Utility u= new Utility();
	  
  @FindBy(id="ContentPlaceHolder1_lstEmployeeType")WebElement stafftype;
  @FindBy(id="ContentPlaceHolder1_btnShow")WebElement show;
  
	  
  public ConsolidatedSalaryStatement(WebDriver d)
  {
	  this.dr=d;
	  PageFactory.initElements(d, this);
  }
  public void openConsolidatedSalaryStatement()
  {
	  WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Salary-Reports.png']"));
	  Actions builder= new Actions(dr);
	  builder.moveToElement(menu).build().perform();
	  dr.findElement(By.linkText("Consolidated Salary Statement")).click();
	  dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/Report/Payroll/ConsolidatedSalStatement.aspx']")));
  }
  public void selectStaffType(String stype)
  {
	  new Select(stafftype).selectByVisibleText(stype);
  }
  public void selectSalaryMonth(String m)
  {
	  dr.findElement(By.xpath("//*[@id=\"MainLeftPanel\"]/div[1]/div/div/div[2]/div/button")).click();
	  WebElement select= dr.findElement(By.xpath("/html/body/div[4]/ul"));
	  List<WebElement>options=select.findElements(By.tagName("span"));
	  for(WebElement option:options)
	  {
		  if(option.getText().equals(m))
			  option.click();
	  }dr.findElement(By.xpath("//*[@id=\"MainLeftPanel\"]/div[1]/div/div/div[2]/div/button")).click();
  }
  public void selectEmployee(String emp, String str, Collection<String> sc) throws InterruptedException, IOException
  {
	  dr.findElement(By.xpath("//input[@placeholder='type here...']")).sendKeys(emp);
	  WebElement t= dr.findElement(By.id("example"));
	  List<WebElement>cols= t.findElements(By.tagName("td"));
	  if(cols.size()>1) {
		   dr.findElement(By.xpath("//input[@value='Print']")).click();
		   Thread.sleep(1000);
		   //dr.findElement(By.id("CloseButton")).click();
		   }
		   else
			   System.out.println("No data is available"); 
	  u.captureScreenshot(dr, str, r,sc);
  }
  public void clickShow()
  {
	  show.click();
  }
  
}

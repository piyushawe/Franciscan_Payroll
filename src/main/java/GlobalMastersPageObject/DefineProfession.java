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

import pageObjects.Utility;

public class DefineProfession {
  WebDriver dr;
  String pg="DefineProfession";
  Utility u= new Utility();
		  
  @FindBy(id="ContentPlaceHolder1_txtProfession_TextBox")WebElement profession;
  @FindBy(id="ContentPlaceHolder1_BtnControls1_btnSave")WebElement save;
  @FindBy(id="ContentPlaceHolder1_BtnControls1_btnView")WebElement view;

  public DefineProfession(WebDriver d)
  {
     this.dr=d;
	 PageFactory.initElements(d, this); 
  }
  public void openDefineProfession()
  {
     WebElement menu= dr.findElement(By.xpath("//img[@src='/Images/layout/Global-Masters.png']"));
	 Actions builder= new Actions(dr);
	 builder.moveToElement(menu).build().perform();
	 dr.findElement(By.linkText("Define Profession")).click();
	 dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@src='/SchoolCommonDetails/DefineProfession.aspx']")));
	 dr.findElement(By.className("csslabel")).click();
  }
  public void verifyPage(String schl,Collection<String>sc) throws IOException, InterruptedException
  {
     Thread.sleep(1000);
	 u.captureScreenshot(dr,schl,pg,sc);
  }
  public void enterProfession(String prf)
  {
      profession.sendKeys(prf);
  }
  public void clickSave(String school, Collection<String> sc)throws IOException
  {
      save.click();
      u.verifySave(dr, school, pg, sc);
  }
  public void clickView(String school, Collection<String> sc)throws IOException
  {
      view.click();
      WebElement table= dr.findElement(By.id("example"));
        List<WebElement> cells= table.findElements(By.tagName("td"));
        if (cells.size()>1) {
          for (WebElement cell : cells) {
              cell.findElement(By.xpath("//input[starts-with(@id,'ContentPlaceHolder1_rptProfession')]")).click();
              break;
          }
          dr.findElement(By.id("ContentPlaceHolder1_BtnControls1_btnModify")).click();
          dr.findElement(By.id("popup_ok")).click();
      }else
          System.out.println("No record Found");
      u.verifyView(dr,school, pg, sc);
  }
}

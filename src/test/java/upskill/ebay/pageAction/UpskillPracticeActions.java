 package upskill.ebay.pageAction;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
import upskill.ebay.pageElements.UpskillPracticeLocators;
import upskill.utilities.SetupDrivers;

public class UpskillPracticeActions {
	
	UpskillPracticeLocators UpSkillPracticeLocatorsObj;
	
	public UpskillPracticeActions(){
		UpSkillPracticeLocatorsObj = new UpskillPracticeLocators();
		PageFactory.initElements(SetupDrivers.driver, UpSkillPracticeLocatorsObj);
	}
	
	public void loadUpSkillPracticePage()throws Exception{
		SetupDrivers.driver.get("https://www.upskillconsultancy.com/automation-practice");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	public void mouseHover()throws Exception{
		Actions action = new Actions (SetupDrivers.driver);
		action.moveToElement(UpSkillPracticeLocatorsObj.linkMouseHover).perform();
			Thread.sleep(5000);
	}
	
	public void clickLink()throws Exception{
		UpSkillPracticeLocatorsObj.linkLink.isEnabled();
		UpSkillPracticeLocatorsObj.linkLink.click();
		Thread.sleep(5000);
	}
	
	public void selectDropDown()throws Exception{
		Select dropdown = new Select (UpSkillPracticeLocatorsObj.btnDropDown);
		dropdown.selectByValue("1");
		Thread.sleep(5000);
	}
	
	public void verifyDropDown()throws Exception{
		if(UpSkillPracticeLocatorsObj.linkLink.equals("Option 1")) {
			Assert.assertEquals("option 1",UpSkillPracticeLocatorsObj.linkLink.getText());
		}else {
			System.out.println("option not found.");
			Thread.sleep(5000);
		}
	}
	
	public void clickAlert()throws Exception{
		UpSkillPracticeLocatorsObj.bxAlert.click();
		Thread.sleep(5000);
	}
	
	public void clickOk()throws Exception{
		SetupDrivers.driver.switchTo().alert().accept();
		Thread.sleep(5000);
	}
	
	public void switchIframe(){
		SetupDrivers.driver.switchTo().frame("htmlComp-iframe");

	}
	
	public void writeTextbox(){
		UpSkillPracticeLocatorsObj.txtbx.sendKeys("Tesla");
	}
	public void clickradiobtn()throws Exception{
		UpSkillPracticeLocatorsObj.radiobtn.click();
	}
	public void clickcheckbx()throws Exception{
		UpSkillPracticeLocatorsObj.checkbx.click();
	}
	public void clicknewwindow()throws Exception{
		UpSkillPracticeLocatorsObj.newwindow.click();
	}

	public void switchNewWindow() {
	for(String winhandle:SetupDrivers.driver.getWindowHandles()) {
		SetupDrivers.driver.switchTo().window(winhandle);
	}
	}
//	public void clickConfirm()throws Exception{
//		UpSkillPracticeLocatorsObj.confirmbtn.click();
//		
//		
//	}
}
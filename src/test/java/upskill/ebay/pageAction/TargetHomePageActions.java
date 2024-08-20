package upskill.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import upskill.ebay.pageElements.EbayHomePageLocators;
import upskill.ebay.pageElements.TargetHomePageLocators;
import upskill.utilities.SetupDrivers;

public class TargetHomePageActions {
	
	TargetHomePageLocators TargetHomePageLocatorsObj;
	

public TargetHomePageActions() {
	
	TargetHomePageLocatorsObj = new TargetHomePageLocators ();
	PageFactory.initElements(SetupDrivers.driver,TargetHomePageLocatorsObj);
}
	public void loadTargetHomePage()throws  Exception{
		SetupDrivers.driver.get("https://www.target.com/");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
		
	public void searchDeals()throws Exception{	
	TargetHomePageLocatorsObj.btnDeals.click();

}   
	public void selectTopdeals() throws Exception {
	Select dropDown = new Select(TargetHomePageLocatorsObj.ddTopdeals);
	dropDown.selectByVisibleText("Topdeals");

}


		public void verifyTopdealsitem() throws Exception{
			//Option 1
			Assert.assertTrue(TargetHomePageLocatorsObj.ddTopdeals.isDisplayed());
			
			//Option 2
			Assert.assertEquals("Topdeals",TargetHomePageLocatorsObj.ddTopdeals.getText());
			
			//Option 3
			TargetHomePageLocatorsObj.ddTopdeals.isDisplayed();
		}
		
	
	
	
	public void searchNewandFeatured()throws Exception {	
		TargetHomePageLocatorsObj.btnNewF.click();

	}

     public void selectNewarrivals() throws Exception {
		Select dropDown = new Select(TargetHomePageLocatorsObj.ddNewarrivals);
		dropDown.selectByVisibleText("Newarrivals");

}
     public void switchNewWindow() {
 		for(String winhandle:SetupDrivers.driver.getWindowHandles()) {
 			SetupDrivers.driver.switchTo().window(winhandle);
 		}
 			
 		}
 		public void verifyNewarrivalsitem() throws Exception{
 			//Option 1
 			Assert.assertTrue(TargetHomePageLocatorsObj.ddNewarrivals.isDisplayed());
 			
 			//Option 2
 			Assert.assertEquals("Newarrivals",TargetHomePageLocatorsObj.ddNewarrivals.getText());
 			
 			//Option 3
 			TargetHomePageLocatorsObj.ddNewarrivals.isDisplayed();
 		}
}
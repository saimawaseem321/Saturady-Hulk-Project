package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.EbayCartLocators;
import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;

public class EbayCartActions {
	
     EbayCartLocators EbayCartLocatorsObj;
	
	public EbayCartActions(){
		
		EbayCartLocatorsObj = new EbayCartLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayCartLocatorsObj);
		
	}
	
	public void switchNewWindow() {
	for(String winhandle:SetupDrivers.driver.getWindowHandles()) {
		SetupDrivers.driver.switchTo().window(winhandle);
		
	}
	
	
	
	}
		public void selectSizeTypeDD() throws Exception {
			Select dropDown = new Select(EbayCartLocatorsObj.ddSizeType);
			dropDown.selectByVisibleText("Big & Tall");
			//dropDown.selectByVisibleText(ReadExcelSheet.getMapData("Size"));
		}
			
	public void selectMenSizeDD() throws Exception{
			
			Select dropDown = new Select(EbayCartLocatorsObj.ddMenSize);
			//dropDown.selectByVisibleText("8XLT");
			dropDown.selectByVisibleText(ReadExcelSheet.getMapData("Size"));
	}
		
	public void selectShadeDD() throws Exception {
		Select dropDown = new Select(EbayCartLocatorsObj.ddShade);
		//dropDown.selectByVisibleText("Black");
		//dropDown.selectByValue("14");
		dropDown.selectByValue(ReadExcelSheet.getMapData("Shade"));
	}
			
	public void enterQuantity() throws Exception {
		EbayCartLocatorsObj.txtbxQty.clear();
		//
		EbayCartLocatorsObj.txtbxQty.sendKeys(ReadExcelSheet.getMapData("quantity"));
		
	}
	
	
	public void addToCart(){
		EbayCartLocatorsObj.btnAddCart.click();
		
		
	}
	public void selectUSShoeSizeDD() {
Select dropdown=new Select(EbayCartLocatorsObj.ddUSShoeSize);
dropdown.selectByVisibleText("8");

}
}
			
			
		
			
		
			
			
			
			
		
		
		
	
	
	
	
	
	
	
	
	
	



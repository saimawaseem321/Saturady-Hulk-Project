package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {
	
	EbaySearchResultLocators EbaySearchResultLocatorsObj;
	
	public EbaySearchResultActions(){
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
	}
	
	public void verifyShoesItems(){
		
		//Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
		
		//Option 2
		Assert.assertEquals("Shoes", EbaySearchResultLocatorsObj.txtShoes.getText());
		
		//Option 3
		EbaySearchResultLocatorsObj.txtShoes.isDisplayed();
	}
		
		public void verifyPantsItems(){
			
			//Option 1
			Assert.assertTrue(EbaySearchResultLocatorsObj.txtPants.isDisplayed());
			
			//Option 2
			Assert.assertEquals("pants", EbaySearchResultLocatorsObj.txtPants.getText());
			
			//Option 3
			EbaySearchResultLocatorsObj.txtPants.isDisplayed();
		}
			
		public void verifyShirtsItems() throws Exception{
		
		
			
			//Option 1
			Assert.assertTrue(EbaySearchResultLocatorsObj.txtShirts.isDisplayed());
			
			//Option 2
			//Assert.assertEquals("Shirts", EbaySearchResultLocatorsObj.txtShirts.getText());
			Assert.assertEquals(ReadExcelSheet.getMapData("Search"), EbaySearchResultLocatorsObj.txtShirts.getText());
			
			//Option 3
			EbaySearchResultLocatorsObj.txtShirts.isDisplayed();
		}
		
		public void filtersbrand(String brand) {
			if(brand.equals("nike") )
			{EbaySearchResultLocatorsObj.cbxbrandnike.click();
			}
			else if(brand.equals("adidas") )
			{EbaySearchResultLocatorsObj.cbxbrandadidas.click();
			}
			else if(brand.equals("unbranded") )
			{EbaySearchResultLocatorsObj.cbxbrandunbranded.click();
			}
			
			
		}
		public void verifyBrandItems(String brand) {
			if(brand.equals("adidas") ) {
				Assert.assertEquals("Shirts", EbaySearchResultLocatorsObj.txtShirts.getText());
				
			}else if(brand.equals("nike") ) {
				Assert.assertEquals("Shoes", EbaySearchResultLocatorsObj.txtShoes.getText());
				
			}else if(brand.equals("unbranded") ) {
				Assert.assertEquals("pants", EbaySearchResultLocatorsObj.txtPants.getText());
					
			}
				
			
		}
			
			public void selectCottonTee(){
				EbaySearchResultLocatorsObj.linkShirtItems.click();
			}	
			public void selectNikeAirJordan4(){
				EbaySearchResultLocatorsObj.linkNikeshoesItems.click();
			}	
			
			
			
			
			
			
		}
		
			
			
			
			
			
			

		
			
		
			
		



		
		
		
		
		








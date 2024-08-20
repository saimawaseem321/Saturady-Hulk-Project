
package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {

	//Validate Shoes Item
	@FindBy(xpath="//span[2][contains(text(),'Shoes')]")
	public WebElement txtShoes;

		
	@FindBy(xpath="//span[2][contains(text(),'Shirts')]")
	public WebElement txtPants;
	
	//@FindBy(xpath="//span[2][contains(text(),'Shirts')]")
	@FindBy(xpath="//span[2][contains(text(),'This is From Excel File')]")
	public WebElement txtShirts;
	
	@FindBy(xpath="//input[@aria-label='Nike']")
	public WebElement cbxbrandadidas;
	
	@FindBy(xpath="//input[@aria-label='adidas']")
	public WebElement cbxbrandnike;
	
	@FindBy(xpath="//input[@aria-label='Unbranded']")
	public WebElement cbxbrandunbranded;

	//Shirt link
	@FindBy(xpath="//span[contains(text(),'Big & Tall Cotton Tee. Sizes 4 XLT to 8XLT. With')]")
	public WebElement linkShirtItems;

// Nike shoe link

@FindBy(xpath="//span[contains(text(),'Nike Air Jordan 4 Retro')] ")
public WebElement linkNikeshoesItems;

}
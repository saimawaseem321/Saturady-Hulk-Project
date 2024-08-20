package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TargetHomePageLocators {
	
	
	@FindBy (xpath ="//a[@aria-label= \"Deals\"]")

	public WebElement btnDeals;
	
	@FindBy (xpath ="//*[@id=\"overlay-:R13kmuqlm:\"]/ul/li[1]/a/div/span")

	public  WebElement ddTopdeals;
	
	
	@FindBy (xpath ="//a[contains(text(),'New & featured')]")

	public WebElement btnNewF;
	
	@FindBy (xpath ="//span[contains(text(),'Target New Arrivals')]")

	public WebElement ddNewarrivals;
	
	
}

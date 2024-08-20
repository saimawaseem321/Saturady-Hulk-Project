package upskill.ebay.pageElements;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpskillPracticeLocators {
	//MouseHover
		@FindBy (xpath="//button[contains(text(), 'Hover Over')]")
public WebElement linkMouseHover;
	//Link 1	
		@FindBy( xpath= "//a[contains(text(),'Link 1')]")
		public WebElement linkLink;
		
		//DropDown btn
		@FindBy (xpath= "//select[@class= 'form-select']")
		public WebElement btnDropDown;
		
		//validate option 1
		@FindBy (xpath= "//*[text()='Option 1']")
		public WebElement optionsdd;
		
		//alert box
		@FindBy  (xpath="//button[contains(text(),'Alert')]")

		public WebElement bxAlert;
		
		//textbox
	@FindBy ( xpath = "//*[contains(@placeholder,'search')]")

	public WebElement txtbx;
	
	// Radiobutton
	@FindBy ( xpath = "//label[contains(text(),'Radio 1')]")
	public WebElement radiobtn;
	
	// checkbox
	@FindBy( xpath ="//label[contains(text(),'Checkbox 1')]")
	public WebElement checkbx;
	
	//new window
	@FindBy( xpath="//button[contains(text(),'Open Window')]")
	public WebElement newwindow;
}

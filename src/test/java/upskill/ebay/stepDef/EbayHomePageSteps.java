package upskill.ebay.stepDef;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import upskill.ebay.pageAction.EbayHomePageActions;

public class EbayHomePageSteps {
	
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();

	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
		//Opening Ebay homepage in setup driver class
	}
	
	@When("^Search for Shoes$")
	public void search_for_Shoes() throws Throwable {
		EbayHomePageActionsObj.searchShoes();
	}
		@When("^Search for Pants$")
		public void search_for_Pants() throws Throwable {
			EbayHomePageActionsObj.searchPants();
		}
			
			@When("^Search for Shirts$")
			public void search_for_Shirts() throws Throwable {
				EbayHomePageActionsObj.searchShirts();
	}
	
		
	
@Given("Search for {string}")
public void search_for(String Items) {
 EbayHomePageActionsObj.searchItems(Items);
}


@Given("^Search for Big Tall Cotton Tee Shirt$")
public void search_for_Big_Tall_Cotton_Tee_Shirt() throws Throwable {
	EbayHomePageActionsObj.searchItems("Big & Tall Cotton Tee");
}

@Given("Search for Nike Air Jordan {int}")
public void search_for_nike_air_jordan(Integer int4) throws Throwable{
	EbayHomePageActionsObj.searchItems("nike air jordan 4");
	}

@When("Mouse Hover to MyEbay Summary")
public void mouse_hover_to_my_ebay_summary() {
	EbayHomePageActionsObj.mouseHoverEaby();
   
}@Then("Click on Summary")
public void click_on_summary() {
	EbayHomePageActionsObj.clickSummary();
	
}
}





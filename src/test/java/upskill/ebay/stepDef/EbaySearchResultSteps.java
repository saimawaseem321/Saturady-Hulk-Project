package upskill.ebay.stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import upskill.ebay.pageAction.EbaySearchResultActions;

public class EbaySearchResultSteps {
	
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	
	@Then("^Item list should have only Shoes related products$")
	public void item_list_should_have_only_Shoes_related_products() throws Throwable {
		EbaySearchResultActionsObj.verifyShoesItems();
	}
	@Then("^Item list should have only Pants related products$")
	public void item_list_should_have_only_Pants_related_products() throws Throwable {
		EbaySearchResultActionsObj.verifyPantsItems();

}
	@Then("^Item list should have only Shirts related products$")
	public void item_list_should_have_only_Shirts_related_products() throws Throwable {
		EbaySearchResultActionsObj.verifyShirtsItems();
	}
	
	
	 
	@When("Filter by {string}")
	public void filter_by(String brand) {
		EbaySearchResultActionsObj.filtersbrand(brand);
		
	}

	@Then("Item list should have products of {string}")
	public void item_list_should_have_products_of(String brand) {
		EbaySearchResultActionsObj.verifyBrandItems(brand);
	}
	
	@When("Select the first shirt on item list")
	public void select_the_first_shirt_on_item_list() {
		EbaySearchResultActionsObj.selectCottonTee();
	}
	@When("^Select the Big Tall Cotton Tee on item list$")
	public void select_the_Big_Tall_Cotton_Tee_on_item_list() throws Throwable {
		EbaySearchResultActionsObj.selectCottonTee();

	}
	@When("Select the Nike Air Jordan {int} on item list")
	public void select_the_nike_air_jordan_on_item_list(Integer int4)throws Throwable {
	  EbaySearchResultActionsObj.selectNikeAirJordan4();
	

}
}
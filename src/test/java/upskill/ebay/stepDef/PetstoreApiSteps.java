package upskill.ebay.stepDef;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import upskill.api.restassured.PetstoreRestAssuredActions;

public class PetstoreApiSteps {
	
	PetstoreRestAssuredActions PetstoreRestAssuredActionsObj = new PetstoreRestAssuredActions();

	@Given("^Create pet$")
	public void create_pet() throws Throwable {
		PetstoreRestAssuredActionsObj.createPet();
	}

	@When("^Update pet$")
	public void update_pet() throws Throwable {
		PetstoreRestAssuredActionsObj.updatePet();

	}

	@Then("^Get pet$")
	public void get_pet() throws Throwable {
		PetstoreRestAssuredActionsObj.getPet();

	}

	@Then("^Delete pet$")
	public void delete_pet() throws Throwable {
		PetstoreRestAssuredActionsObj.deletePet();
	}
}
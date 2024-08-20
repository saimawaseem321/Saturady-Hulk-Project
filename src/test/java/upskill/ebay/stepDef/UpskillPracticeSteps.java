package upskill.ebay.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import upskill.ebay.pageAction.UpskillPracticeActions;

public class UpskillPracticeSteps {
	
	UpskillPracticeActions UpSkillPracticeActionsObj = new  UpskillPracticeActions();
	
	@Given("^Open UpSkill Automation Practice page$")
	public void open_UpSkill_Automation_Practice_page() throws Throwable {
		UpSkillPracticeActionsObj.loadUpSkillPracticePage();
	}

		
@When("Mouse Hover to Hover Over Me")
public void mouse_hover_to_hover_over_me() throws Throwable{
	UpSkillPracticeActionsObj.mouseHover();
}

@Then("Click on Link")
public void click_on_link()throws Throwable {
	UpSkillPracticeActionsObj.clickLink();
}
@When("Select Option from dropdown")
public void select_option_from_dropdown() throws Throwable{
	UpSkillPracticeActionsObj.selectDropDown();

}

@Then("Verify Option selected")
public void verify_option_selected()throws Throwable {
	UpSkillPracticeActionsObj.verifyDropDown();

}

@When("Click on Alert")
public void click_on_alert() throws Throwable{
	UpSkillPracticeActionsObj.clickAlert();
	
}

@Then("Click on OK")
public void click_on_ok() throws Throwable{
	UpSkillPracticeActionsObj.clickOk();

}
@When("Switch to Practice iFrame")
public void switch_to_practice_i_frame() throws Throwable{
	UpSkillPracticeActionsObj.switchIframe();

}

@Then("User should able to write on Textbox")
public void user_should_able_to_write_on_textbox() throws Throwable{
	UpSkillPracticeActionsObj.writeTextbox();
}
@Then("Click on Radio {int}")
public void click_on_radio(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Click on Checkbox {int}")
public void click_on_checkbox(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Click on Open Window")
public void click_on_open_window() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Switch to new Window")
public void switch_to_new_window() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Click on Confirm")
public void click_on_confirm() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Verify Great")
public void verify_great() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Switch to iFrame Home")
public void switch_to_i_frame_home() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Click on Home")
public void click_on_home() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}




	}




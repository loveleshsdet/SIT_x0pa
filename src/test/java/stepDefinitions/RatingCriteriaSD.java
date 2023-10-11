package stepDefinitions;

import org.testng.Assert;

import apputils.Reusable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageElements.RatingCriteriaE;

public class RatingCriteriaSD extends Reusable{
	
	RatingCriteriaE rc=new RatingCriteriaE(driver);
	
	@When("click on rating criteria tab")
	public void click_on_rating_criteria_tab() {
	jseclick(rc.rating_criteria);
	}
	@When("click on add criteria")
	public void click_on_add_criteria() {
	jseclick(rc.add_criteria_btn);
	}
	@When("enter rating criteria name {string}")
	public void enter_rating_criteria_name(String string) {
	sendKeys(rc.txt_criteria,string);
	}
	@When("search for rating criteria {string}")
	public void search_for_rating_criteria(String string) {
	sendKeys(rc.txt_search,string);
	}
	@Then("verify created rating criteria {string} being fetched from list of rating criterias")
	public void verify_created_rating_criteria_being_fetched_from_list_of_rating_criterias(String string) throws InterruptedException {
	Thread.sleep(3000);
	String get_act_criteria=rc.get_criteria.getText();
	Assert.assertEquals(get_act_criteria,string);
	}
	@When("click on the submit button")
	public void click_on_the_submit_button() {
	jseclick(rc.submit_btn);
	}
	@When("click on edit button to rename rating criteria")
	public void click_on_edit_button_to_rename_rating_criteria() {
	jseclick(rc.edt_rating_crit);
	}
	@When("click on delete button of rating criteria")
	public void click_on_delete_button_of_rating_criteria() {
	jseclick(rc.del_rating_crit);
	}
	






	

}

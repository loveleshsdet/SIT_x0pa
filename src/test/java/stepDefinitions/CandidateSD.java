package stepDefinitions;



import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;

import apputils.Reusable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageElements.AssessmentCreationE;
import pageElements.CandidateE;

public class CandidateSD extends Reusable{
	
	CandidateE cd=new CandidateE(driver);
	
	public static String candidateurl;
	
	@When("navigate to candidates tab")
	public void navigate_to_candidates_tab() throws InterruptedException {
		cd=new CandidateE(driver);
		Thread.sleep(3000);	
	jseclick(cd.candidates_tab);
	Thread.sleep(2000);
	candidateurl=driver.getCurrentUrl();
	}
	@When("navigate to admin collaborators candidates page")
	public void navigate_to_admin_collaborators_candidates_page() throws InterruptedException {
	open_link(candidateurl);
	}
	@When("navigate to reviewer collaborators candidates page")
	public void navigate_to_reviewer_collaborators_candidates_page() throws InterruptedException {
		open_link(candidateurl);
	}

	@When("click on add candidate button to enter candidates information")
	public void click_on_add_candidate_button_to_enter_candidates_information() throws InterruptedException {
		Thread.sleep(3000);
	click(cd.add_cand_btn);
	}
	@When("enter first name of the candidate {string}")
	public void enter_first_name_of_the_candidate(String string) {
	sendKeys(cd.txt_first_name,string);
	}
	@When("enter last name of the candidate {string}")
	public void enter_last_name_of_the_candidate(String string) {
	sendKeys(cd.txt_last_name,string);
	}
	@When("enter email address of the candidate {string}")
	public void enter_email_address_of_the_candidate(String string) {
	sendKeys(cd.txt_mail,string);
	}

@When("click on bulk import candidates button")
public void click_on_bulk_import_candidates_button() {
click(cd.blk_import_btn);
}
@When("upload file which contains bulk assessment candidates {string}")
public void upload_file_which_contains_bulk_assessment_candidates(String string) {
uploadfile(string);
}
	
@Then("verify candidates {string} {string} {string} and {string} added to assessment or not")
public void verify_candidates_and_added_to_assessment_or_not(String string, String string2, String string3, String string4) throws InterruptedException {
	Thread.sleep(2000);
	String candidate_a=cd.get_act_cand_name_d.getText();
	Assert.assertEquals(candidate_a,string);
	System.out.println(candidate_a);
	String candidate_b=cd.get_act_cand_name_c.getText();
	Assert.assertEquals(candidate_b,string2);
	System.out.println(candidate_b);
	String candidate_c=cd.get_act_cand_name_b.getText();
	Assert.assertEquals(candidate_c,string3);
	System.out.println(candidate_c);
	String candidate_d=cd.get_act_cand_name_a.getText();
	Assert.assertEquals(candidate_d,string4);
	System.out.println(candidate_d);


}
@When("filter candidates by draft status")
public void filter_candidates_by_draft_status() {
jseclick(cd.filt_draft);
}
@Then("verify candidates having status {string} are being filtered or not")
public void verify_candidates_having_status_are_being_filtered_or_not(String string) throws InterruptedException {
	Thread.sleep(2000);
	String candidate_status=cd.get_draft_cand.getText();
	Assert.assertEquals(candidate_status,string);
}
@When("filter candidates by awaiting response status")
public void filter_candidates_by_awaiting_response_status() {
jseclick(cd.filt_ar);
}
@When("filter candidates by in progress status")
public void filter_candidates_by_in_progress_status() {
jseclick(cd.filt_ip);
}
@When("filter candidates by completed status")
public void filter_candidates_by_completed_status() {
jseclick(cd.filt_completed);
}
@When("uncheck filter candidates by draft status")
public void uncheck_filter_candidates_by_draft_status() throws InterruptedException {
Thread.sleep(1000);
jseclick(cd.filt_draft);
}
@When("uncheck filter candidates by awaiting response status")
public void uncheck_filter_candidates_by_awaiting_response_status() throws InterruptedException {
	Thread.sleep(1000);
	jseclick(cd.filt_ar);
}
@When("uncheck filter candidates by in progress status")
public void uncheck_filter_candidates_by_in_progress_status() throws InterruptedException {
	Thread.sleep(1000);
	jseclick(cd.filt_ip);
}
@When("uncheck filter candidates by completed status")
public void uncheck_filter_candidates_by_completed_status() throws InterruptedException {
	Thread.sleep(1000);
	jseclick(cd.filt_completed);
}
@Then("verify candidates having draft status {string} are being filtered or not")
public void verify_candidates_having_draft_status_are_being_filtered_or_not(String string) throws InterruptedException {
	Thread.sleep(2000);
	String candidate_status=cd.get_cand_status.getText();
	Assert.assertEquals(candidate_status,string);
}
@Then("verify candidates under awaiting status {string} are being filtered or not")
public void verify_candidates_under_awaiting_status_are_being_filtered_or_not(String string) throws InterruptedException {
	Thread.sleep(3000);
	if(driver.findElements(By.xpath("(//td/div/div[2]/span)[1]")).size() !=0)
	{
	
	Thread.sleep(2000);
	String candidate_status=cd.get_cand_status.getText();
	Assert.assertEquals(candidate_status,string);
	}
	else
	{
		nocandidatesmsg();
	}
}
@Then("verify candidates are in progress status {string} are being filtered or not")
public void verify_candidates_are_in_progress_status_are_being_filtered_or_not(String string) throws InterruptedException {
	Thread.sleep(3000);
	if(driver.findElements(By.xpath("(//td/div/div[2]/span)[1]")).size() !=0)
	{
	Thread.sleep(2000);
	String candidate_status=cd.get_cand_status.getText();
	Assert.assertEquals(candidate_status,string);
	}
	else
	{
		nocandidatesmsg();
	}
	
}
@Then("verify candidates having completed status {string} are being filtered or not")
public void verify_candidates_having_completed_status_are_being_filtered_or_not(String string) throws InterruptedException {
	Thread.sleep(3000);
	if(driver.findElements(By.xpath("(//td/div/div[2]/span)[1]")).size() !=0)
	{
	Thread.sleep(2000);
	String candidate_status=cd.get_cand_status.getText();
	Assert.assertEquals(candidate_status,string);
	}
	else
	{
		nocandidatesmsg();
	}
}

@When("filter shortlisted candidates by clicking on checkbox beside shortlisted")
public void filter_shortlisted_candidates_by_clicking_on_checkbox_beside_shortlisted() {
jseclick(cd.filt_shortlist);
}
@Then("verify shortlisted candidates {string} are filtered or not")
public void verify_shortlisted_candidates_are_filtered_or_not(String string) throws InterruptedException {
	Thread.sleep(3000);
	if(driver.findElements(By.xpath("(//td/div/div[2])[5]")).size() !=0)
	{
	Thread.sleep(2000);
	String act_filt_status=cd.get_fil_short.getText();
	Assert.assertEquals(act_filt_status,string); 
	}
	else
	{
		nocandidatesmsg();	
	}
}
@When("uncheck shortlisted filter checkbox")
public void uncheck_shortlisted_filter_checkbox() {
	jseclick(cd.filt_shortlist);
}

@When("filter rejected candidates by clicking on checkbox beside rejected")
public void filter_rejected_candidates_by_clicking_on_checkbox_beside_rejected() {
jseclick(cd.filt_rej);
}
@When("uncheck rejected filter checkbox")
public void uncheck_rejected_filter_checkbox() {
	jseclick(cd.filt_rej);
}
@When("filter non shortlisted or non rejected candidates by clicking on no decision checkbox")
public void filter_non_shortlisted_or_non_rejected_candidates_by_clicking_on_no_decision_checkbox() {
jseclick(cd.filt_no_decision);
}
@Then("verify all filtered candidates are not shortlisted {string} or not rejected {string}")
public void verify_all_filtered_candidates_are_not_shortlisted_or_not_rejected(String string, String string2) throws InterruptedException {
	Thread.sleep(2000);
	String show_shortlist_btn=cd.clk_to_shortlist.getText();
	String show_reject_btn=cd.clk_to_reject.getText();  
	Assert.assertNotEquals(show_shortlist_btn, string);
	Assert.assertNotEquals(show_reject_btn, string);
	
}
@When("uncheck no decision filter checkbox")
public void uncheck_no_decision_filter_checkbox() {
	jseclick(cd.filt_no_decision);
}

@When("click on add candidate button")
public void click_on_add_candidate_button() {

}
@When("click on the bulk import candidates button")
public void click_on_the_bulk_import_candidates_button() {
jseclick(cd.bulk_import_btn);
}
@When("filter candidates who passed the assessment")
public void filter_candidates_who_passed_the_assessment() {
jseclick(cd.fil_pass);
}
@Then("verify result of filtered candidates is {string} or displaying {string}")
public void verify_result_of_filtered_candidates_is_or_displaying(String string, String string2) throws InterruptedException {
	Thread.sleep(3000);
	if(driver.findElements(By.xpath("(//td/div/div[2]/span)[2]")).size() != 0)
	{
	
//		    	if(driver.findElements(By.xpath("//div[text()='This profile is currently inactive.']")).size() < 1)
				String act_result=cd.get_act_result.getText();
	            Assert.assertEquals(act_result, string);
					System.out.println("Test Pass");
		    	}
		    	else
		    	{
		    		Assert.assertEquals(cd.no_candidate_msg, string2);	
		    	}
}
@Then("verify candidate {string} got searched or not")
public void verify_candidate_got_searched_or_not(String string) {
String act_candidate=cd.get_cand.getText();
Assert.assertEquals(act_candidate, string);	
}
@When("click on clear filters button")
public void click_on_clear_filters_button() {
click(cd.clr_filters);
}
@When("filter candidates who failed the assessment")
public void filter_candidates_who_failed_the_assessment() {
jseclick(cd.fil_failed);
}
@When("filter candidates who have no result")
public void filter_candidates_who_have_no_result() {
jseclick(cd.fil_no_result);
}
@When("search for assessment {string}")
public void search_for_assessment(String string) throws InterruptedException {
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	Thread.sleep(4000);
sendKeys(cd.search_assessment,string);
}
@When("select any candidate")
public void select_any_candidate() {
click(cd.sel_cand);
}
@When("shortlist the candidate using bulk action")
public void shortlist_the_candidate_using_bulk_action() {
click(cd.blk_shortlist);
click(cd.submit_btn);
}
@Then("verify candidate {string} or not")
public void verify_candidate_or_not(String string) throws InterruptedException {
	Thread.sleep(2000);

	if(driver.findElements(By.xpath("(//div[@class='mt-2 ml-2 text-capitalize'])[1]")).size() != 0)
	{
	
//		    	if(driver.findElements(By.xpath("//div[text()='This profile is currently inactive.']")).size() < 1)
				String act_result=cd.get_decision.getText();
	            Assert.assertEquals(act_result, string);
					System.out.println("Test Pass");
		    	}
		    	else
		    	{
		    		nocandidatesmsg();
		    	}
}
@Then("verify candidate is {string} or not")
public void verify_candidate_is_or_not(String string) throws InterruptedException {
	Thread.sleep(2000);
	String act_result=cd.get_decision.getText();
    Assert.assertEquals(act_result, string);
		System.out.println("Test Pass");
}

@When("reject the candidate using bulk action")
public void reject_the_candidate_using_bulk_action() {
click(cd.blk_reject);
click(cd.submit_btn);
}
@When("delete the candidate using bulk action")
public void delete_the_candidate_using_bulk_action() {
click(cd.blk_delete);
click(cd.submit_btn);
}
@Then("verify candidate deleted or not")
public void verify_candidate_deleted_or_not() {
nocandidatesmsg();
}
@Then("verify overall score being displayed or not {string}")
public void verify_overall_score_being_displayed_or_not(String string) throws InterruptedException {
	Thread.sleep(2000);
String act_overall_score=cd.get_overall_score.getAttribute("title");
Assert.assertEquals(act_overall_score,string);
}

@When("click on edit symbol of the assessment")
public void click_on_edit_symbol_of_the_assessment() {
click(cd.edt_assessment);
}
@Then("verify overall rating disabled or not")
public void verify_overall_rating_disabled_or_not() {
	boolean condition = false;
	if(driver.findElements(By.xpath("//span[text()='Overall Score']")).size() < 1)
	{
		condition = true;
		System.out.println("Test Pass");
	}
	Assert.assertTrue(condition);
}







}

package stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import apputils.Reusable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageElements.AssessmentCreationE;
import pageElements.CollaboratorsE;

public class AssessmentCreationSD extends Reusable{
	
	AssessmentCreationE ac=new AssessmentCreationE(driver);
	
	public static String ques_txt;
	public static String get_catg_to_filt_qb;
	public static String get_assessment;
	public static String get_upload_source;
	
	
	@When("navigate to interview menu")
	public void navigate_to_interview_menu() throws InterruptedException {
		ac=new AssessmentCreationE(driver);
		Thread.sleep(2000);
	jseclick(ac.interview_menu);
	}
	@When("navigate to X0PA ROOM")
	public void navigate_to_x0pa_room() throws InterruptedException {
		Thread.sleep(2000);
	jseclick(ac.xopa_room);
	}
	@When("click on create new assessment button")
	public void click_on_create_new_assessment_button() {
	jseclick(ac.create_new_assmnt);
	}
	@When("enter assessment name {string}")
	public void enter_assessment_name(String string) {
	sendKeys(ac.txt_assmnt_name,string);
	}
	@When("enter information to test takers {string}")
	public void enter_information_to_test_takers(String string) {
//		sendKeys(ac.test_tkr_info,string);txt_inst
		sendKeys(ac.txt_inst,string);
	}
	@When("keep interview type fixed")
	public void keep_interview_type_fixed() {
	
	}
	@When("enable remainders")
	public void enable_remainders() {
	click(ac.remainder_tog);


	}
	@When("choose remainder interval {string} days and choose maximum remainders {string} times")
	public void choose_remainder_interval_days_and_choose_maximum_remainders_times(String string, String string2) {
	sendKeys(ac.remainder_int,string);
	sendKeys(ac.max_remainders,string);
	}
	@When("enable toggle which allows candidates to cut copy paste for essay type questions")
	public void enable_toggle_which_allows_candidates_to_cut_copy_paste_for_essay_type_questions() {
	click(ac.copy_paste_tog);
	}
	@When("enable toggle which allows candidates to retake the assessment")
	public void enable_toggle_which_allows_candidates_to_retake_the_assessment() {
	click(ac.retake_tog);
	}
	@When("enable toggle which allows candidates to see responses after submission of assessment")
	public void enable_toggle_which_allows_candidates_to_see_responses_after_submission_of_assessment() {
	click(ac.candt_responses);
	}
	@When("choose assessment start date and time {string}")
	public void choose_assessment_start_date_and_time(String string) throws InterruptedException {
//		Thread.sleep(1000);
//		jseclick(ac.assmnt_st_dt);
//		Thread.sleep(1000);
//		ac.assmnt_st_dt.clear();
//		Thread.sleep(2000);
//	
		ac.assmnt_st_dt.sendKeys(Keys.CONTROL + "a",Keys.DELETE);	
		sendKeys(ac.assmnt_st_dt,string);
	}
	@When("choose assessment end date {string}")
	public void choose_assessment_end_date(String string) throws InterruptedException {
		ac.assmnt_end_dt.sendKeys(Keys.CONTROL + "a",Keys.DELETE);
//		ac.assmnt_end_dt.clear();

	sendKeys(ac.assmnt_end_dt,string);
//	Thread.sleep(3000);
	}
	@When("enable company branding")
	public void enable_company_branding() {
	click(ac.enable_company_branding);
	}
	@When("enable masked hiring")
	public void enable_masked_hiring() {
	click(ac.msk_hire_tog);
	}
	@When("enable password and enter password {string} which allows users to review responses securely")
	public void enable_password_and_enter_password_which_allows_users_to_review_responses_securely(String string) {
	click(ac.share_url_pwd);
	sendKeys(ac.txt_pswd,string);
	}
	@When("enable password toggle which allows users to access url securely and review responses")
	public void enable_password_toggle_which_allows_users_to_access_url_securely_and_review_responses() {
		click(ac.share_url_pwd);
	}
	@When("enter security password {string}")
	public void enter_security_password(String string) {
		sendKeys(ac.txt_pswd,string);
	}

	@When("enable rating criteria which will enable rating criteria section while creating assessment questions")
	public void enable_rating_criteria_which_will_enable_rating_criteria_section_while_creating_assessment_questions() throws InterruptedException {
		Thread.sleep(3000);
	jseclick(ac.enable_rate_cri_tog);
	}
	@When("click on change banner button to upload assessment banner {string}")
	public void click_on_change_banner_button_to_upload_assessment_banner(String string) throws InterruptedException {
	uploadfile(string);
	Thread.sleep(4000);
	get_upload_source=ac.get_logo_src.getAttribute("src");
	}
	@When("click on submit button")
	public void click_on_submit_button() {
	click(ac.submit_btn);
	}
	@When("click on assessment to navigate to assessment setup page")
	public void click_on_assessment_to_navigate_to_assessment_setup_page() throws InterruptedException {
		Thread.sleep(3000);
		get_assessment=ac.clk_assmnt.getText();	
		Thread.sleep(2000);
	click(ac.clk_assmnt);
	}
	@When("click on add custom question button")
	public void click_on_add_custom_question_button() throws InterruptedException {
	Thread.sleep(2000);
	move(ac.ad_cstm_q);
	Thread.sleep(2000);
	jseclick(ac.ad_cstm_q);
	}
	@When("click on edit button to edit assessment start date")
	public void click_on_edit_button_to_edit_assessment_start_date() throws InterruptedException {
		Thread.sleep(2000);
		jseclick(ac.edt_st_dt);
	}
	@When("choose date {string}")
	public void choose_date(String string) throws InterruptedException {
		Thread.sleep(1000);
		ac.edt_date.sendKeys(Keys.CONTROL + "a",Keys.DELETE);
		Thread.sleep(1000);
	sendKeys(ac.edt_date,string);
	}
	@When("click on edit button to edit assessment end date")
	public void click_on_edit_button_to_edit_assessment_end_date() throws InterruptedException {
//		move(ac.edt_end_dt);
		Thread.sleep(4000);
	click(ac.edt_end_dt);
	}
	@When("choose question type as vedio")
	public void choose_question_type_as_vedio() {
	click(ac.vedio_radio);
	}
	@When("click on checkbox which will allows candidates to retake vedio")
	public void click_on_checkbox_which_will_allows_candidates_to_retake_vedio() {
	click(ac.enable_max_retakes);
	}
	@When("enter number of times candidate can retake vedio {string}")
	public void enter_number_of_times_candidate_can_retake_vedio(String string) {
	sendKeys(ac.txt_max_retakes,string);
	}

	@When("click on checkbox to decide how much time candidates can take between retakes")
	public void click_on_checkbox_to_decide_how_much_time_candidates_can_take_between_retakes() {
	click(ac.retake_dec_time);
	}
	@When("select retake decision time {string} minute and {string} seconds")
	public void select_retake_decision_time_minute_and_seconds(String string, String string2) throws InterruptedException {
	selectbyvisibletext(ac.retak_dec_min, string);
	selectbyvisibletext(ac.retak_dec_sec, string2);
	}
	@When("choose question type multiple choice")
	public void choose_question_type_multiple_choice() {
	jseclick(ac.mcq_radio);
	}
	@When("give options to the question option a {string} option b {string} option c {string} option d {string}")
	public void give_options_to_the_question_option_a_option_b_option_c_option_d(String string, String string2, String string3, String string4) throws InterruptedException {
	pickupbysendKeys(ac.txt_opt,string);
	Thread.sleep(1000);
	pickupbysendKeys(ac.txt_opt,string2);
	Thread.sleep(1000);
	pickupbysendKeys(ac.txt_opt,string3);
	Thread.sleep(1000);
	pickupbysendKeys(ac.txt_opt,string4);
	}
	@When("pick right options from the given options {string} or {string}")
	public void pick_right_options_from_the_given_options_or(String string, String string2) throws InterruptedException {
		pickupbysendKeys(ac.pik_right_opt,string);
		Thread.sleep(1000);
		pickupbysendKeys(ac.pik_right_opt,string2);
	}
	@When("pick red flag options from the given options {string} or {string}")
	public void pick_red_flag_options_from_the_given_options_or(String string, String string2) throws InterruptedException {
		pickupbysendKeys(ac.pik_red_flag_opt,string);
		Thread.sleep(1000);
		pickupbysendKeys(ac.pik_red_flag_opt,string2);
	}
	@When("click on checkbox which takes answer as correct if candidate chooses any of the right option")
	public void click_on_checkbox_which_takes_answer_as_correct_if_candidate_chooses_any_of_the_right_option() throws InterruptedException {
		Thread.sleep(2000);
	jseclick(ac.any_right_opt_is_crkt);
	}
	@When("click on checkbox which allows candidates to choose only one option")
	public void click_on_checkbox_which_allows_candidates_to_choose_only_one_option() {
	click(ac.allow_only_one_opt);
	}
	@When("give score {string} to the question")
	public void give_score_to_the_question(String string) {
	sendKeys(ac.txt_score,string);
	}
	@When("choose question type rating")
	public void choose_question_type_rating() {
	jseclick(ac.rating_radio);
	}
	@When("rating option a {string} and score for the option {string}")
	public void rating_option_a_and_score_for_the_option(String string, String string2) {
	sendKeys(ac.rating_opt_a,string);
	sendKeys(ac.rating_score_a,string2);
	}
	@When("click on add message to add next option and score")
	public void click_on_add_message_to_add_next_option_and_score() {
		click(ac.add_msg);
	}
	@When("rating option b {string} and score for the option {string}")
	public void rating_option_b_and_score_for_the_option(String string, String string2) {
		sendKeys(ac.rating_opt_b,string);
		sendKeys(ac.rating_score_b,string2);
	}
	@When("rating option c {string} and score for the option {string}")
	public void rating_option_c_and_score_for_the_option(String string, String string2) {
		sendKeys(ac.rating_opt_c,string);
		sendKeys(ac.rating_score_c,string2);
	}
	@When("rating option d {string} and score for the option {string}")
	public void rating_option_d_and_score_for_the_option(String string, String string2) {
		sendKeys(ac.rating_opt_d,string);
		sendKeys(ac.rating_score_d,string2);
	}
	@When("click on add from question bank button")
	public void click_on_add_from_question_bank_button() throws InterruptedException {
	Thread.sleep(2000);
	click(ac.ad_ques_qb);
	}
	@When("filter question bank by eassy type questions")
	public void filter_question_bank_by_eassy_type_questions() {
	jseclick(ac.fil_eassy);
	}
	@When("select a question from filtered questions and click on add button")
	public void select_a_question_from_filtered_questions_and_click_on_add_button() throws InterruptedException {
	Thread.sleep(1000);	
	click(ac.sel_ques);
	Thread.sleep(1000);
	ques_txt=ac.get_ques.getText();
	click(ac.add_btn);
	}
	@Then("verify question added to assessment or not")
	public void verify_question_added_to_assessment_or_not() throws InterruptedException {
		Thread.sleep(2000);
	String act_added_ques=ac.get_act_ques.getText();
	Assert.assertEquals(act_added_ques,act_added_ques);
	}
	@When("filter question bank by video type questions")
	public void filter_question_bank_by_video_type_questions() {
	jseclick(ac.filt_video_q);
	}
	@When("drag added question to first question and drop to reorder questions")
	public void drag_added_question_to_first_question_and_drop_to_reorder_questions() throws InterruptedException {
	Thread.sleep(5000);
	dragAndDrop(ac.last_ques,ac.first_ques);
	}
	@When("filter question bank by mcq type questions")
	public void filter_question_bank_by_mcq_type_questions() {
	jseclick(ac.filt_mcq_q);
	}
	@When("filter question bank by rating type questions")
	public void filter_question_bank_by_rating_type_questions() {
	jseclick(ac.fil_rating_q);
	}
	@Then("verify all questions filtered are of type {string} or not")
	public void verify_all_questions_filtered_are_of_type_or_not(String string) throws InterruptedException {
		Thread.sleep(3000);
	String ques_type=ac.get_ans_mode.getText();
	Assert.assertEquals(ques_type,string);
	}
    @When("navigate to global question bank")
    public void navigate_to_global_question_bank() throws InterruptedException {
    	Thread.sleep(1000);
    jseclick(ac.qb_global);
    }
    @When("filter question bank by question cateogory")
    public void filter_question_bank_by_question_cateogory() throws InterruptedException {
    get_catg_to_filt_qb=ac.get_fil_catg.getText();
    Thread.sleep(1000);
    click(ac.filt_catg);
    }
    @Then("verify questions are filtered by question cateogory or not")
    public void verify_questions_are_filtered_by_question_cateogory_or_not() throws InterruptedException {
    	Thread.sleep(3000);
    	if(driver.findElements(By.xpath("(//div[@class='ml-4'])[1]")).size() !=0)
    	{
    	 String get_catg_of_filtered_ques=ac.get_catg.getText();
    	 Assert.assertEquals(get_catg_of_filtered_ques,get_catg_to_filt_qb);
    	}
    	else
    	{
    		String no_ques_available=ac.get_no_ques_msg.getText();
    		Assert.assertEquals(no_ques_available,"There are no questions added to this assessment.");
    	}
    }
    @When("click on edit button beside any assessment")
    public void click_on_edit_button_beside_any_assessment() {
    click(ac.edit_assmnt_btn);
    }
    @When("filter assessments by {string}")
    public void filter_assessments_by(String string) throws InterruptedException {
    selectbyvisibletext(ac.sel_assmnts_by, string);
    }
    @When("verify assessment created by other user {string} is displayed or not")
    public void verify_assessment_created_by_other_user_is_displayed_or_not(String string) throws InterruptedException {
	Thread.sleep(2000);
	String act_added_ques=ac.get_assmnt.getText();
//	Assert.assertEquals(act_added_ques,string);
	Assert.assertTrue(act_added_ques.equalsIgnoreCase(string));
    }
    @When("verify assessment created by user {string} is displayed or not")
    public void verify_assessment_created_by_user_is_displayed_or_not(String string) throws InterruptedException {
    	Thread.sleep(4000);
    	String act_assessment=ac.get_assmnt.getText();
//    	Assert.assertEquals(act_assessment,string);
    	Assert.assertTrue(act_assessment.equalsIgnoreCase(string));
    }
    @When("make assessment as favourite by clicking on heart symbol")
    public void make_assessment_as_favourite_by_clicking_on_heart_symbol() throws InterruptedException {
    	Thread.sleep(2000);
    click(ac.set_assmnt_fav);
    }
    @Then("verify candidate masked or not")
    public void verify_candidate_masked_or_not() {
    
	
    }
    @When("shortlist the assessment candidate")
    public void shortlist_the_assessment_candidate() {
    jseclick(ac.shortlist);
    }
    @Then("verify candidate {string} masked or not")
    public void verify_candidate_masked_or_not(String string) throws InterruptedException {
    	Thread.sleep(3000);
    	String act_cand_name=ac.get_candidate_name.getText();
    	Assert.assertFalse(act_cand_name.equalsIgnoreCase(string));
//    	boolean condition = false;
//    	if(act_cand_name.("899966")) {
//    	    condition = true;
//    	}
//    	Assert.assertTrue(condition);
    }
    @Then("verify candidate name {string} visible or not")
    public void verify_candidate_name_visible_or_not(String string) throws InterruptedException {
    	Thread.sleep(3000);
    	String act_cand_name=ac.get_candidate_name.getText();
    	Assert.assertTrue(act_cand_name.equalsIgnoreCase(string));
    }

@When("click on the add custom question button")
public void click_on_the_add_custom_question_button() throws InterruptedException {
	Thread.sleep(2000);
click(ac.ad_cstm_ques);
}

@When("click on close assessment button")
public void click_on_close_assessment_button() throws InterruptedException {
	Thread.sleep(2000);		
click(ac.close_assmnt_btn);
click(ac.yes_close_assessment);
Thread.sleep(3000);
}
@When("navigate back to xopa room")
public void navigate_back_to_xopa_room() throws InterruptedException {
	Thread.sleep(3000);
jseclick(ac.lnk_x0pa_room);
}
@When("navigate to closed assessments")
public void navigate_to_closed_assessments() throws InterruptedException {
	Thread.sleep(3000);	
jseclick(ac.closed_assessmnts);
}
@When("search for the assessment")
public void search_for_the_assessment() {
sendKeys(ac.search_assessment,get_assessment);
}
@Then("verify the assessment closed being displayed in closed assessments list")
public void verify_the_assessment_closed_being_displayed_in_closed_assessments_list() throws InterruptedException {
	Thread.sleep(2000);
	System.out.println(get_assessment);
String act_assessment=ac.clk_assmnt.getText();
Assert.assertEquals(act_assessment,get_assessment);
}

@When("click on reopen assessment button")
public void click_on_reopen_assessment_button() throws InterruptedException {
	Thread.sleep(2000);
    click(ac.reopen_btn);
    Thread.sleep(2000);
    click(ac.yes_close_assessment);
}
@When("navigate to open assessments")
public void navigate_to_open_assessments() {

}
@Then("verify the assessment reopened being displayed in open assessments list")
public void verify_the_assessment_reopened_being_displayed_in_open_assessments_list() throws InterruptedException {
	Thread.sleep(4000);
	System.out.println(get_assessment);
String act_assessment=ac.clk_assmnt.getText();
Assert.assertEquals(act_assessment,get_assessment);
}
@When("click on clone assessment button")
public void click_on_clone_assessment_button() throws InterruptedException {
jseclick(ac.clone_assessment_btn);
Thread.sleep(2000);
click(ac.yes_close_assessment);
}
@Then("verify the assessment being cloned {string} or not")
public void verify_the_assessment_being_cloned_or_not(String string) throws InterruptedException {
	Thread.sleep(2000);
String act_assessment=ac.clk_assmnt.getText();
boolean condition = false;
if(act_assessment.contains(string))
{
condition=true;	
}
Assert.assertTrue(condition);
}
@When("click on total link")
public void click_on_total_link() throws InterruptedException {
	Thread.sleep(3000);
click(ac.total_link);
}
@Then("verify all candidates available as per count")
public void verify_all_candidates_available_as_per_count() throws InterruptedException {
	Thread.sleep(5000);
	Thread.sleep(3000);
	if(driver.findElements(By.xpath("(//td/div/div[2]/span)[1]")).size() !=0)
	{
String cand_status=ac.get_cand_status.getText();
boolean condition = false;
if(cand_status.equals("Draft") || cand_status.equals("Awaiting Response") || cand_status.equals("In Progress") || cand_status.equals("Completed"))
{
condition=true;	
Assert.assertTrue(condition);
}
	}
//Assert.assertTrue(condition);
	else
	{
		String no_ques_available=ac.get_no_ques_msg.getText();
		Assert.assertEquals(no_ques_available,"There are no candidates added to this assessment.");
	}
}
@When("click on draft link")
public void click_on_draft_link() throws InterruptedException {
	Thread.sleep(3000);
	click(ac.draft_link);
}
@When("click on awaiting response link")
public void click_on_awaiting_response_link() throws InterruptedException {
	Thread.sleep(3000);
click(ac.awaiting_link);
}
@When("click on in progress link")
public void click_on_in_progress_link() throws InterruptedException {
	Thread.sleep(3000);
	click(ac.inprogress_link);
}
@When("click on completed link")
public void click_on_completed_link() throws InterruptedException {
	Thread.sleep(3000);
click(ac.completed_link);
}
@Then("verify candidates having status status {string} are being filtered or not")
public void verify_candidates_having_status_status_are_being_filtered_or_not(String string) throws InterruptedException {
	Thread.sleep(3000);
	if(driver.findElements(By.xpath("(//td/div/div[2]/span)[1]")).size() !=0)
	{
	Thread.sleep(5000);
String act_status=ac.get_candidate_status.getText();
Assert.assertEquals(act_status,string);
	}
else
{
	String no_ques_available=ac.get_no_ques_msg.getText();
	Assert.assertEquals(no_ques_available,"There are no candidates added to this assessment.");
}
}
@Then("verify candidates having the status {string} are being filtered or not")
public void verify_candidates_having_the_status_are_being_filtered_or_not(String string) throws InterruptedException {
	Thread.sleep(3000);
	if(driver.findElements(By.xpath("(//td/div/div[2]/span)[1]")).size() !=0)
	{
	Thread.sleep(5000);
String act_status=ac.get_candidate_status.getText();    
Assert.assertEquals(act_status,string);
	}
else
{
	String no_ques_available=ac.get_no_ques_msg.getText();
	Assert.assertEquals(no_ques_available,"There are no candidates added to this assessment.");
}
}
@When("close the browser")
public void close_the_browser() {
driver.close();
}
@When("disable rating criteria")
public void disable_rating_criteria() throws InterruptedException {
	Thread.sleep(2000);
jseclick(ac.rating_cri_tog);
}
@When("click on edit button of essay type question")
public void click_on_edit_button_of_essay_type_question() throws InterruptedException {
	Thread.sleep(2000);
click(ac.edt_e_ques);
}
@When("set up pass threshold value {string}")
public void set_up_pass_threshold_value(String string) throws InterruptedException {
	Thread.sleep(2000);
sendKeys(ac.txt_pass_threshold,string);
Thread.sleep(2000);
}
@When("click on yes button to update passthreshold")
public void click_on_yes_button_to_update_passthreshold() throws InterruptedException {
	Thread.sleep(2000);
	click(ac.save_btn);
//	WebElement element =ac.yes_btn;
//    Actions builder = new Actions(driver);
//    builder.moveToElement(element).click(element);
//    builder.perform();
	Thread.sleep(3000);
	click(ac.yes_btn);
	Thread.sleep(3000);
}
@When("click on submit button to add question")
public void click_on_submit_button_to_add_question() throws InterruptedException {
	Thread.sleep(2000);	
click(ac.btn_submit);
}

@When("disable fixed type questions")
public void disable_fixed_type_questions() throws InterruptedException {
	Thread.sleep(2000);
click(ac.customise_ques_tog);
}
@When("choose number of questions to pick from category {string}")
public void choose_number_of_questions_to_pick_from_category(String string) throws InterruptedException {
selectbyvalue(ac.sel_value, string);
}
@When("click on the save button after customising questions")
public void click_on_the_save_button_after_customising_questions() {
click(ac.save_btn_b);
}

@When("create or add existing rating criteria {string} and {string} to this question")
public void create_or_add_existing_rating_criteria_and_to_this_question(String string, String string2) throws InterruptedException {
pickupbysendKeys(ac.pik_rating, string);
Thread.sleep(2000);
pickupbysendKeys(ac.pik_rating, string2);
}
@When("add existing rating criteria {string} to this question")
public void add_existing_rating_criteria_to_this_question(String string) throws InterruptedException {
	pickupbysendKeys(ac.pik_rating, string);
	Thread.sleep(1000);
}

















	





}

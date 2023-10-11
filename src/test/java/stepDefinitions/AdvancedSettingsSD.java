package stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import apputils.Reusable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageElements.AdvancedSettingsE;

public class AdvancedSettingsSD extends Reusable{
	
	AdvancedSettingsE ads=new AdvancedSettingsE(driver);
	
	@When("navigate to advanced settings tab")
	public void navigate_to_advanced_settings_tab() throws InterruptedException {
		Thread.sleep(2000);
	jseclick(ads.adv_settings_tab);
	}
	@When("expand essay type practice question")
	public void expand_essay_type_practice_question() {
	jseclick(ads.exp_collaps_pq_a);
	}
	@When("enter instructions to candidates regarding essay type question {string}")
	public void enter_instructions_to_candidates_regarding_essay_type_question(String string) throws InterruptedException {
		Thread.sleep(2000);
		jseclick(ads.txt_instruction_ques);
	sendKeys(ads.txt_instruction_ques,string);
	}
	@When("enter question {string}")
	public void enter_question(String string) {
	sendKeys(ads.txt_ques,string);
	}
	@When("select preparation time to answer the question {string} minute {string} seconds")
	public void select_preparation_time_to_answer_the_question_minute_seconds(String string, String string2) throws InterruptedException {
	selectbyvisibletext(ads.sel_prep_min, string);
	selectbyvisibletext(ads.sel_prep_sec, string2);
	}
	@When("select maximum time to answer question {string} minute {string} seconds")
	public void select_maximum_time_to_answer_question_minute_seconds(String string, String string2) throws InterruptedException {
		selectbyvisibletext(ads.sel_minutes_to_ans_pq, string);
		selectbyvisibletext(ads.sel_seconds_to_ans_pq, string2);
	}
	@When("choose minimum words {string} and maximum words {string} required to answer the question")
	public void choose_minimum_words_and_maximum_words_required_to_answer_the_question(String string, String string2) {
	 sendKeys(ads.min_words,string);
	 sendKeys(ads.max_words,string2);
	}
	@When("attach vedio {string} which will be displayed to the candidate along with the question")
	public void attach_vedio_which_will_be_displayed_to_the_candidate_along_with_the_question(String string) {
	upload(ads.upload_vedio, string);
	}
	@When("attach document {string} which will be displayed to the candidate along with the question")
	public void attach_document_which_will_be_displayed_to_the_candidate_along_with_the_question(String string) {
	upload(ads.upload_doc, string);
	}
	@When("collapse essay type practice question")
	public void collapse_essay_type_practice_question() {
	jseclick(ads.exp_collaps_pq_a);
	}
	@When("select multiple choice question which will be displayed as practice question to candidates")
	public void select_multiple_choice_question_which_will_be_displayed_as_practice_question_to_candidates() {
	jseclick(ads.practice_ques_mcq);
	}
	@When("expand mcq type practice question")
	public void expand_mcq_type_practice_question() {
	jseclick(ads.exp_collapse_pq_b);
	}
	@When("create options {string} {string} {string} and  {string}")
	public void create_options_and(String string, String string2, String string3, String string4) throws InterruptedException {
	click(ads.close_existing_opt);
	Thread.sleep(1000);
	pickupbysendKeys(ads.opt_mcq, string);
	pickupbysendKeys(ads.opt_mcq, string2);
	pickupbysendKeys(ads.opt_mcq, string3);
	pickupbysendKeys(ads.opt_mcq, string4);
	}
	@When("collapse mcq type practice question")
	public void collapse_mcq_type_practice_question() {
		jseclick(ads.exp_collapse_pq_b);
	}
	@When("select vedio type question which will be displayed as practice question to candidates")
	public void select_vedio_type_question_which_will_be_displayed_as_practice_question_to_candidates() throws InterruptedException {
	jseclick(ads.vedio_ques);
	Thread.sleep(10000);
	}
	@When("expand vedio type practice question")
	public void expand_vedio_type_practice_question() {
		jseclick(ads.exp_collapse_pq_c);
	}
	@When("choose number of retakes can candidate take {string}")
	public void choose_number_of_retakes_can_candidate_take(String string) {
	sendKeys(ads.txt_retakes,string);
	}
	@When("choose retake decision time {string} minute {string} seconds")
	public void choose_retake_decision_time_minute_seconds(String string, String string2) throws InterruptedException {
	selectbyvisibletext(ads.sel_pq_time_minutes, string);
	selectbyvisibletext(ads.sel_pq_time_seconds, string2);
	}
	@When("collapse vedio type practice question")
	public void collapse_vedio_type_practice_question() {
		jseclick(ads.exp_collapse_pq_c);
	}
	@When("enter instructions to candidates regarding mcq type question {string}")
	public void enter_instructions_to_candidates_regarding_mcq_type_question(String string) {

		sendKeys(ads.txt_instruction_ques,string);
	}
	@When("enter mcq question {string}")
	public void enter_mcq_question(String string) {

		sendKeys(ads.txt_ques,string);
	}
	@When("enter the mcq question {string}")
	public void enter_the_mcq_question(String string) {
		sendKeys(ads.ques_mcq,string);
	}
	@When("enter instructions to candidates to answer mcq type question {string}")
	public void enter_instructions_to_candidates_to_answer_mcq_type_question(String string) {
		sendKeys(ads.ins_mcq,string);	
	}
	@When("enter instructions to candidates regarding vedio type question {string}")
	public void enter_instructions_to_candidates_regarding_vedio_type_question(String string) {

		sendKeys(ads.txt_instruction_ques,string);
	}
	@When("enter the instructions to candidates regarding vedio type question {string}")
	public void enter_the_instructions_to_candidates_regarding_vedio_type_question(String string) {
		sendKeys(ads.ins_vedio,string);
	}
	@When("enter vedio question {string}")
	public void enter_vedio_question(String string) {

		sendKeys(ads.txt_ques,string);
	}
	@When("enter the vedio question {string}")
	public void enter_the_vedio_question(String string) {
		sendKeys(ads.ques_vedio,string);
	}
	@When("attach vedio {string} which will be displayed to the candidate along with the mcq question")
	public void attach_vedio_which_will_be_displayed_to_the_candidate_along_with_the_mcq_question(String string) {
	upload(ads.upload_video_b, string);
	}
	@When("attach document {string} which will be displayed to the candidate along with mcq the question")
	public void attach_document_which_will_be_displayed_to_the_candidate_along_with_mcq_the_question(String string) {
		upload(ads.upload_doc_b, string);
	}
	@When("attach vedio {string} which will be displayed to the candidate along with the vedio question")
	public void attach_vedio_which_will_be_displayed_to_the_candidate_along_with_the_vedio_question(String string) {
		upload(ads.upload_video_c, string);
	}
	@When("attach document {string} which will be displayed to the candidate along with the vedio question")
	public void attach_document_which_will_be_displayed_to_the_candidate_along_with_the_vedio_question(String string) {
		upload(ads.upload_doc_c, string);
	}
	@When("disable save as draft by enabling toggle")
	public void disable_save_as_draft_by_enabling_toggle() {
	jseclick(ads.disable_sav_drft);
	}
	@When("enter assessment end text {string}")
	public void enter_assessment_end_text(String string) throws InterruptedException {
		cleartxt(ads.assmnt_end_txt);
		Thread.sleep(1000);
	sendKeys(ads.assmnt_end_txt,string);
	}
	@When("enter the assessment end text {string}")
	public void enter_the_assessment_end_text(String string) throws InterruptedException {
		Thread.sleep(2000);
		ads.txt_instruction_ques.clear();
	sendKeys(ads.txt_instruction_ques,string);
	}
	@When("upload introduction vedio {string} by clicking on add vedio button which will be shown to the candidate before beginning of the assessment")
	public void upload_introduction_vedio_by_clicking_on_add_vedio_button_which_will_be_shown_to_the_candidate_before_beginning_of_the_assessment(String string) throws InterruptedException {
		Thread.sleep(3000);
		move(ads.add_video);
		Thread.sleep(3000);
	upload(ads.upload_start_vedio, string);
	}
	@When("click on checkbox below to play introduction vedio automatically once otp entered correctly")
	public void click_on_checkbox_below_to_play_introduction_vedio_automatically_once_otp_entered_correctly() throws InterruptedException {
		Thread.sleep(6000);
	jseclick(ads.show_into_vdeoaftotp);
	}
	@When("upload exit vedio {string} by clicking on add vedio button which  will be shown to the candidate after completion of the assessment")
	public void upload_exit_vedio_by_clicking_on_add_vedio_button_which_will_be_shown_to_the_candidate_after_completion_of_the_assessment(String string) {
	upload(ads.upload_end_vedio, string);
	}
	@When("click on save button")
	public void click_on_save_button() throws InterruptedException {
		Thread.sleep(5000);
	jseclick(ads.save_btn);
	}
	@When("drag this mcq practice question to the place of first practice question")
	public void drag_this_mcq_practice_question_to_the_place_of_first_practice_question() throws InterruptedException {
		Thread.sleep(2000);
//	dragAndDrop(ads.drag_mcq,ads.drop_essay);
		dragAndDrop(ads.ord_b,ads.ord_a);
	}
	@Then("verify the practice question {string} being reordered or not")
	public void verify_the_practice_question_being_reordered_or_not(String string) throws InterruptedException {
		Thread.sleep(2000);
	String get_first_ques=ads.get_reordered_ques_type.getText();
	Assert.assertEquals(get_first_ques,string);
	}
	@When("drag this vedio type practice question to the place of first practice question")
	public void drag_this_vedio_type_practice_question_to_the_place_of_first_practice_question() throws InterruptedException {
		Thread.sleep(2000);
		dragAndDrop(ads.ord_c,ads.ord_a);
	}
	@When("disable showing number of retakes left to the candidate")
	public void disable_showing_number_of_retakes_left_to_the_candidate() throws InterruptedException {
		Thread.sleep(2000);
     jseclick(ads.retakes_left_toggle_tog);
	}
	@When("disable toggle to restrict candidates to navigate to previous questions")
	public void disable_toggle_to_restrict_candidates_to_navigate_to_previous_questions() throws InterruptedException {
		Thread.sleep(2000);
    jseclick(ads.previous_btn_tog);
	}
	@When("disable assessment summary table")
	public void disable_assessment_summary_table() throws InterruptedException {
		Thread.sleep(2000);
    jseclick(ads.summary_table_tog);
    Thread.sleep(2000);
	}
	@When("disable practice questions setup")
	public void disable_practice_questions_setup() throws InterruptedException {
		Thread.sleep(2000);
		click(ads.disable_practice_ques);
		
	}
	@When("add introduction vedio {string} by clicking on add vedio button which will be shown to the candidate before beginning of the assessment")
	public void add_introduction_vedio_by_clicking_on_add_vedio_button_which_will_be_shown_to_the_candidate_before_beginning_of_the_assessment(String string) throws InterruptedException {
		Thread.sleep(2000);
		move(ads.upload_vedio);
		upload(ads.upload_vedio, string);
	}
	@When("upload the exit vedio {string} by clicking on add vedio button which  will be shown to the candidate after completion of the assessment")
	public void upload_the_exit_vedio_by_clicking_on_add_vedio_button_which_will_be_shown_to_the_candidate_after_completion_of_the_assessment(String string) throws InterruptedException {
		Thread.sleep(2000);
		move(ads.upload_doc);
		upload(ads.upload_doc, string);
	}





	
	

}

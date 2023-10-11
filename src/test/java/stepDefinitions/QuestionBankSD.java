package stepDefinitions;

import org.testng.Assert;

import apputils.Reusable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageElements.QuestionBankE;

public class QuestionBankSD extends Reusable{
	
	QuestionBankE qb=new QuestionBankE(driver);

	
	@When("navigate to question bank")
	public void navigate_to_question_bank() throws InterruptedException {
	jseclick(qb.ques_bank);
	Thread.sleep(2000);
	}
	@When("click on add question button")
	public void click_on_add_question_button() throws InterruptedException {
		Thread.sleep(2000);
	click(qb.add_ques_btn);
	}
	@When("enter the question {string}")
	public void enter_the_question(String string) {
	sendKeys(qb.txt_ques,string);
	}
	@When("click on next button")
	public void click_on_next_button() {
	click(qb.nxt_btn);
	}
	@When("choose question type as essay")
	public void choose_question_type_as_essay() {
	click(qb.eassy_radio);
	}
	@When("enter minimum words required to answer this question {string}")
	public void enter_minimum_words_required_to_answer_this_question(String string) {
	sendKeys(qb.min_words,string);
	}
	@When("enter maximum words required to answer this question {string}")
	public void enter_maximum_words_required_to_answer_this_question(String string) {
	sendKeys(qb.max_words,string);
	}
	@When("select preparation time required to question {string} min and {string} seconds")
	public void select_preparation_time_required_to_question_min_and_seconds(String string, String string2) throws InterruptedException {
	selectbyvisibletext(qb.prep_minutes, string);
	selectbyvisibletext(qb.prep_sec, string2);
	}
	@When("choose maximum time to answer the question {string} min and {string} seconds")
	public void choose_maximum_time_to_answer_the_question_min_and_seconds(String string, String string2) throws InterruptedException {
	selectbyvisibletext(qb.ans_time_min, string);
	selectbyvisibletext(qb.ans_time_Sec, string2);
	}
	@When("enable save as draft mode to avoid preparation time and max time to answer question")
	public void enable_save_as_draft_mode_to_avoid_preparation_time_and_max_time_to_answer_question() {
	jseclick(qb.enable_sav_as_drft);
	}
	@When("Create or choose a category {string} this question belongs to")
	public void create_or_choose_a_category_this_question_belongs_to(String string) throws InterruptedException {
	pickupbysendKeys(qb.pick_catg, string);
	}
	@When("filter questions by eassy type")
	public void filter_questions_by_eassy_type() {
	jseclick(qb.clk_fil_esy);
	}
	@Then("verify added question {string} filtered or not")
	public void verify_added_question_filtered_or_not(String string) {
	String act_ques=qb.get_ques.getText();
	Assert.assertEquals(act_ques,string);
	}
	@Then("verify cateogory of question added is {string} or not")
	public void verify_cateogory_of_question_added_is_or_not(String string) {
		String act_ques_catg=qb.get_ques_cateogory.getText();
		Assert.assertEquals(act_ques_catg,string);
	}
	@Then("verify mode of answer is eassy type {string} or not")
	public void verify_mode_of_answer_is_eassy_type_or_not(String string) {
		String act_ques_mode=qb.get_ans_mode.getText();
		Assert.assertEquals(act_ques_mode,string);
	}
	@When("navigate to the global question bank")
	public void navigate_to_the_global_question_bank() {
	click(qb.global_qb_btn);
	}


}

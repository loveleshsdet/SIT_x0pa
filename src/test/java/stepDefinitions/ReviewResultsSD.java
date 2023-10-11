package stepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.testng.Assert;

import apputils.Reusable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageElements.ReviewResultsE;

public class ReviewResultsSD extends Reusable {
	ReviewResultsE rr=new ReviewResultsE(driver);
	
	public static String review_responses_link;
	
	@Given("after candidate completed the assessment recruiter navigates back to candidates details page")
	public void after_candidate_completed_the_assessment_recruiter_navigates_back_to_candidates_details_page() throws InterruptedException {
	open_link(CandidateAssessmentSD.candidate_details_pg_url);
	}
	@Then("verify assessment status {string} or not")
	public void verify_assessment_status_or_not(String string) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(4000);
		rr=new ReviewResultsE(driver);
		String act_status=rr.assessment_status.getText();
		System.out.println(act_status);
		Thread.sleep(1000);
		Assert.assertEquals(act_status,string);
	}
	@Then("verify assessment result of the candidate {string} or not")
	public void verify_assessment_result_of_the_candidate_or_not(String string) throws InterruptedException {
		Thread.sleep(2000);
		String act_result=rr.assessment_result.getText();
		Assert.assertEquals(act_result,string);
	}
	@Then("verify assessment result of the candidate {string} or {string}")
	public void verify_assessment_result_of_the_candidate_or(String string, String string2) throws InterruptedException {
		Thread.sleep(2000);
		String act_result=rr.assessment_result.getText();
		boolean condition = false;
		if(act_result.equalsIgnoreCase(string)|| act_result.equalsIgnoreCase(string2))
		{
		condition=true;	
		}
		Assert.assertTrue(condition);
	}

	@When("scroll down to review candidates response")
	public void scroll_down_to_review_candidates_response() {
	 
	}
	@Then("verify candidates response is correct or not")
	public void verify_candidates_response_is_correct_or_not() throws InterruptedException { 
		Thread.sleep(2000);
		String correct_answers=rr.act_correct_answer.getText();
		String act_candidate_response=rr.cand_response.getText();
		Assert.assertTrue(correct_answers.contains(act_candidate_response));
	}
	@When("verify candidates score is {string} if candidates response is correct else {string}")
	public void verify_candidates_score_is_if_candidates_response_is_correct_else(String string, String string2) throws InterruptedException {
		Thread.sleep(2000);
		String correct_answers=rr.act_correct_answer.getText();
		String act_candidate_response=rr.cand_response.getText();
		String get_score=rr.get_act_score.getText();
		if(correct_answers.contains(act_candidate_response))
		{
			Assert.assertEquals(get_score,string);	
		}
		else
		{
			Assert.assertEquals(get_score,string2);	
		}
		
	}
	@Then("verify candidates score is {string}")
	public void verify_candidates_score_is(String string) throws InterruptedException {
		Thread.sleep(2000);
	String get_score=rr.get_act_score.getText();
	Assert.assertEquals(get_score,string);
	
	}
	@When("click on next button to review candidates response to next question")
	public void click_on_next_button_to_review_candidates_response_to_next_question() throws InterruptedException {
	Thread.sleep(2000);
	click(rr.nxt_ques);
	}
	@Then("verify candidates score for incorrect answer {string}")
	public void verify_candidates_score_for_incorrect_answer(String string) throws InterruptedException {
		Thread.sleep(2000);
		String get_score=rr.get_act_score.getText();
		Assert.assertEquals(get_score,string);
	}
	@Then("verify candidates response is incorrect or not")
	public void verify_candidates_response_is_incorrect_or_not() throws InterruptedException {
	Thread.sleep(2000);
	String get_redflag_opt=rr.red_flag_opt.getText();
	String act_candidate_response=rr.cand_response.getText();
	Assert.assertTrue(get_redflag_opt.contains(act_candidate_response));
	}
	@When("click on shorlist button to shortlist the candidate")
	public void click_on_shorlist_button_to_shortlist_the_candidate() throws InterruptedException {
		Thread.sleep(2000);
		move(rr.shortlist_btn);
		Thread.sleep(1000);
	click(rr.shortlist_btn);
	Thread.sleep(1000);
	click(rr.submit_btn);
	}
	@Then("verify candidate decision text {string} or not")
	public void verify_candidate_decision_text_or_not(String string) throws InterruptedException {
	driver.navigate().refresh();
	Thread.sleep(5000);
	String get_act_decision=rr.get_dec_shortlisted.getText();
	Assert.assertEquals(get_act_decision,string);
	}
	@Then("click on reject button to reject the candidate")
	public void click_on_reject_button_to_reject_the_candidate() throws InterruptedException {
		Thread.sleep(2000);
	click(rr.reject_btn);
	Thread.sleep(1000);
	click(rr.submit_btn);
	}
	@When("click on generate link button and copy url to share link with reviewers")
	public void click_on_generate_link_button_and_copy_url_to_share_link_with_reviewers() {
	click(rr.gen_link_btn);
	review_responses_link=rr.get_sharing_url.getAttribute("value");
	}
	@When("reviewer clicks on generated link")
	public void reviewer_clicks_on_generated_link() throws InterruptedException {
	open_link(review_responses_link);
	}
	@When("enter shared password {string}")
	public void enter_shared_password(String string) throws InterruptedException {
    rr=new ReviewResultsE(driver);
    Thread.sleep(2000);
    sendKeys(rr.txt_password,string);
    Thread.sleep(2000);
    click(rr.verify_btn);
		
	
	}
	@Then("reviwer reviews first question answered by candidate is correct or not")
	public void reviwer_reviews_first_question_answered_by_candidate_is_correct_or_not() throws InterruptedException {
		Thread.sleep(2000);
		String get_correct_ans=rr.correct_ans_a.getText();
		String act_candidate_response=rr.first_ans.getText();
		Assert.assertTrue(get_correct_ans.contains(act_candidate_response));
	}
	@Then("verify score generated correctly to the first answer {string} or not")
	public void verify_score_generated_correctly_to_the_first_answer_or_not(String string) throws InterruptedException {
		Thread.sleep(2000);
		String get_score=rr.score_a.getText();
		Assert.assertEquals(get_score,string);
	}
	@Then("reviwer reviews sencond question answered by candidate is correct or not")
	public void reviwer_reviews_sencond_question_answered_by_candidate_is_correct_or_not() throws InterruptedException {
		Thread.sleep(2000);
		String get_correct_ans=rr.correct_ans_b.getText();
		String act_candidate_response=rr.second_ans.getText();
		Assert.assertTrue(get_correct_ans.contains(act_candidate_response));
	}
	@Then("verify score generated correctly to the second answer {string} or not")
	public void verify_score_generated_correctly_to_the_second_answer_or_not(String string) throws InterruptedException {
		Thread.sleep(2000);
		String get_score=rr.score_b.getText();
		Assert.assertEquals(get_score,string);
	}
	@Then("reviwer reviews third question answered by candidate is wrong or not")
	public void reviwer_reviews_third_question_answered_by_candidate_is_wrong_or_not() throws InterruptedException {
		Thread.sleep(2000);
		String get_correct_ans=rr.correct_ans_c.getText();
		String act_candidate_response=rr.third_ans.getText();
		Assert.assertTrue(!get_correct_ans.contains(act_candidate_response));
	}
	@Then("verify score generated correctly to the third answer {string} or not")
	public void verify_score_generated_correctly_to_the_third_answer_or_not(String string) throws InterruptedException {
		Thread.sleep(2000);
		String get_score=rr.score_c.getText();
		Assert.assertEquals(get_score,string);
	}
	@Then("reviwer reviews fourth question answered by candidate is correct or not")
	public void reviwer_reviews_fourth_question_answered_by_candidate_is_correct_or_not() throws InterruptedException {
		Thread.sleep(2000);
		String get_correct_ans=rr.correct_ans_d.getText();
		String act_candidate_response=rr.fourth_ans.getText();
		Assert.assertTrue(!get_correct_ans.contains(act_candidate_response));
	}
	@Then("reviwer reviews fourth question answered by the candidate is correct or not")
	public void reviwer_reviews_fourth_question_answered_by_the_candidate_is_correct_or_not() throws InterruptedException {
		Thread.sleep(2000);
		String get_correct_ans=rr.correct_ans_d.getText();
		String act_candidate_response=rr.fourth_ans.getText();
		Assert.assertTrue(get_correct_ans.contains(act_candidate_response));
	}
	@Then("verify score generated correctly to the fourth answer {string} or not")
	public void verify_score_generated_correctly_to_the_fourth_answer_or_not(String string) throws InterruptedException {
		Thread.sleep(2000);
		String get_score=rr.score_d.getText();
		Assert.assertEquals(get_score,string);
	}

    @When("select candidate responses in list view {string}")
    public void select_candidate_responses_in_list_view(String string) throws InterruptedException {
    selectbyvisibletext(rr.sel_list_view, string);
    }
    @When("verify candidate response contains {string} or not")
    public void verify_candidate_response_contains_or_not(String string) throws InterruptedException {
    	Thread.sleep(5000);
		String act_candidate_response=driver.findElement(By.tagName("strong")).getText();
		System.out.println(act_candidate_response);
		Assert.assertTrue(act_candidate_response.contains(string));
    }

    @Then("verify logo source contains {string} or not")
    public void verify_logo_source_contains_or_not(String string) throws InterruptedException {
    	Thread.sleep(4000);	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    String act_logo_src=rr.get_logo_src.getAttribute("src");
    Assert.assertTrue(act_logo_src.contains(string));
    }
    @When("provide rating and feedback {string} to candidates response")
    public void provide_rating_and_feedback_to_candidates_response(String string) {
    click(rr.rate_a);
    sendKeys(rr.txt_feedback_a,string);
    }
    @When("provide another rating and feedback {string} to candidates response")
    public void provide_another_rating_and_feedback_to_candidates_response(String string) {
    	 click(rr.rate_b);
    	 sendKeys(rr.txt_feedback_b,string);
    }
    @When("click on Submit button")
    public void click_on_submit_button() {
    click(rr.clk_submit_btn);
    }

	
//    rr.first_ans


}

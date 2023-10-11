package stepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import apputils.Reusable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageElements.AssessmentCreationE;
import pageElements.CandidateAssessmentE;

public class CandidateAssessmentSD extends Reusable {

	CandidateAssessmentE ca=new CandidateAssessmentE(driver);
	
	public static String assessmnt_link;
	public static String candidate_details_pg_url;
	
	@When("navigate to assessment setup page")
	public void navigate_to_assessment_setup_page() throws InterruptedException {
		Thread.sleep(4000);
	jseclick(ca.asmnt_setup);
	}
	
	@When("click on send invite button to send assessment link to the candidate")
	public void click_on_send_invite_button_to_send_assessment_link_to_the_candidate() throws InterruptedException {
		Thread.sleep(2000);	
	jseclick(ca.send_invite);
	Thread.sleep(1000);	
	click(ca.submit_btn);
	}
	@Then("verify add candidate and send invite buttons are not showing or not")
	public void verify_add_candidate_and_send_invite_buttons_are_not_showing_or_not() {
		boolean condition = false;
    	if(driver.findElements(By.xpath("(//span[text()='Send Invite'])[1]")).size() <1 && driver.findElements(By.xpath("(//button[text()='Add Candidate'])[2]")).size() <1 )
		{
    		condition = true;                           
			System.out.println("Test Pass");
    	}
    	Assert.assertTrue(condition);
	}
	@When("click on candidate and copy assessment url")
	public void click_on_candidate_and_copy_assessment_url() throws InterruptedException {
		Thread.sleep(3000);		
	click(ca.candidate_details);
	Thread.sleep(2000);	
	assessmnt_link=ca.assessmnt_url.getText();
	Thread.sleep(5000);
	candidate_details_pg_url=driver.getCurrentUrl();
	Thread.sleep(5000);
	}
	@When("search for the candidate {string}")
	public void search_for_the_candidate(String string) throws InterruptedException {
		Thread.sleep(2000);
	sendKeys(ca.txt_search,string);
	}
	@When("click on candidate to view assessment details of candidate")
	public void click_on_candidate_to_view_assessment_details_of_candidate() throws InterruptedException {
		Thread.sleep(3000);	
		click(ca.candidate_details);
//	click(ca.candidate_pg);
	}
	@When("click on accept button to allow candidate to retake assessment")
	public void click_on_accept_button_to_allow_candidate_to_retake_assessment() throws InterruptedException {
	click(ca.accept_retake);
	Thread.sleep(1000);
	click(ca.submit_btn);
	}
	@When("copy assessment url")
	public void copy_assessment_url() {
    assessmnt_link=ca.assessmnt_url.getText();
	}

	@When("candidate opens assessment link")
	public void candidate_opens_assessment_link() throws InterruptedException {	
	open_link(assessmnt_link);
	}
	@When("candidate enters assessment otp {string}")
	public void candidate_enters_assessment_otp(String string) {
		ca=new CandidateAssessmentE(driver);
	sendKeys(ca.txt_otp,string);
	}
	@When("candidate clicks on check box which means accepting xopa terms and conditions")
	public void candidate_clicks_on_check_box_which_means_accepting_xopa_terms_and_conditions() throws InterruptedException {
		Thread.sleep(2000);
	jseclick(ca.terms_chkbox);
	}
	@When("click on start button to take assessment")
	public void click_on_start_button_to_take_assessment() throws InterruptedException {
	click(ca.start_btn);
	Thread.sleep(3000);
	}
	@Then("verify candidate able to see banner uploaded while creating assessment")
	public void verify_candidate_able_to_see_banner_uploaded_while_creating_assessment() throws InterruptedException {
		Thread.sleep(3000);
	String visible_banner=ca.get_assessment_banner.getAttribute("src");
	System.out.println(visible_banner);
	Assert.assertEquals(visible_banner,AssessmentCreationSD.get_upload_source);
	}
	@Then("verify assessment end time {string} being displayed to candidate or not")
	public void verify_assessment_end_time_being_displayed_to_candidate_or_not(String string) throws InterruptedException {
		ca=new CandidateAssessmentE(driver);
		Thread.sleep(3000);
	String displayed_expiry_time=ca.assessment_exp_time.getText();
	Assert.assertEquals(displayed_expiry_time,string);
	}
	@Then("verify assessment start time {string} being displayed to candidate or not")
	public void verify_assessment_start_time_being_displayed_to_candidate_or_not(String string) throws InterruptedException {
		Thread.sleep(3000);
		String displayed_start_time=ca.get_start_dt.getText();
		Assert.assertTrue(displayed_start_time.contains(string));	
	}
	@When("candidate clicks on start recording button to test auto and vedio")
	public void candidate_clicks_on_start_recording_button_to_test_auto_and_vedio() throws InterruptedException {
		Thread.sleep(3000);
		click(ca.st_rec_btn);
		Thread.sleep(10000);
	}
	@When("candidate clicks on stop recording button")
	public void candidate_clicks_on_stop_recording_button() {
	click(ca.stop_rec_btn);
	}
	@When("candidate clicks on play vedio button to check audio and vedio")
	public void candidate_clicks_on_play_vedio_button_to_check_audio_and_vedio() throws InterruptedException {
	click(ca.paly_vedio_btn);
	Thread.sleep(3000);
	}
	@When("candidate clicks on stop vedio button")
	public void candidate_clicks_on_stop_vedio_button() {
	click(ca.stop_vedio_btn);
	}
	@When("if candidate has not satisfied with the audio or vedio he can click on retake vedio button")
	public void if_candidate_has_not_satisfied_with_the_audio_or_vedio_he_can_click_on_retake_vedio_button() {
	click(ca.retake_prac_vedio);
	click(ca.stop_rec_btn);
	}
	@When("candidate selects radio button yes if vedio is visible when clicked on play video button")
	public void candidate_selects_radio_button_yes_if_vedio_is_visible_when_clicked_on_play_video_button() throws InterruptedException {
		Thread.sleep(1000);
	jseclick(ca.vedio_yes_radio);
	}
	@When("candidate selects radio button yes if audio is audible when clicked on play video button")
	public void candidate_selects_radio_button_yes_if_audio_is_audible_when_clicked_on_play_video_button() throws InterruptedException {
		Thread.sleep(2000);
	jseclick(ca.audio_yes_radio);
	}
	@When("candidate clicks on next button to proceed with practice questions")
	public void candidate_clicks_on_next_button_to_proceed_with_practice_questions() {
	click(ca.next_btn);
	}
	@When("click on the next button")
	public void click_on_the_next_button() throws InterruptedException {
		Thread.sleep(1000);
		jseclick(ca.next_btn);
	}

@When("click on Next button")
public void click_on_next_button() throws InterruptedException {
	Thread.sleep(2000);
	click(ca.next_btn);
}


	@When("candidate answers vedio type question")
	public void candidate_answers_vedio_type_question() {
	
	}
	@When("candidate clicks on delete answer and re attempt button")
	public void candidate_clicks_on_delete_answer_and_re_attempt_button() {
	click(ca.retake_vedio_ques);
	}
	@When("candidate clicks on proceed button from the alert displayed which will save current answer and takes to next question")
	public void candidate_clicks_on_proceed_button_from_the_alert_displayed_which_will_save_current_answer_and_takes_to_next_question() {
	click(ca.proceed_btn);
	}
	@When("candidate answers {string} to the eassy type question")
	public void candidate_answers_to_the_eassy_type_question(String string) {
	sendKeys(ca.txt_ans_eassy,string);
	}
	@When("candidate chooses right option to mcq type question")
	public void candidate_chooses_right_option_to_mcq_type_question() {
	click(ca.pr_mcq_ans_radio);
	}
	@When("candidate clicks next button to take actual assessment")
	public void candidate_clicks_next_button_to_take_actual_assessment() {
		click(ca.next_btn);
	}
	@When("candidate chooses right option to actual assessment mcq type question")
	public void candidate_chooses_right_option_to_actual_assessment_mcq_type_question() throws InterruptedException {
		Thread.sleep(2000);
	click(ca.act_mcq_ans);
	}
	@When("candidate chooses option for rating type question")
	public void candidate_chooses_option_for_rating_type_question() throws InterruptedException {
		Thread.sleep(2000);
		click(ca.act_mcq_ans);
	}
	@When("candidate chooses wrong option to actual assessment mcq type question")
	public void candidate_chooses_wrong_option_to_actual_assessment_mcq_type_question() throws InterruptedException {
		Thread.sleep(2000);
		click(ca.incorrect_mcq_ans);
	}

	@When("candidate clicks on retake assessment link")
	public void candidate_clicks_on_retake_assessment_link() {
	click(ca.retake_assessment_link);
	}
	@When("enters reason for requesting retake {string}")
	public void enters_reason_for_requesting_retake(String string) throws InterruptedException {
	sendKeys(ca.txt_retake_reason,string);
	Thread.sleep(2000);
	click(ca.submit_btn);
	}
	@When("verify vedio source contains {string}")
	public void verify_vedio_source_contains(String string) {
	String act_vedio_src=ca.get_vedio_src.getAttribute("src");
	Assert.assertTrue(act_vedio_src.contains(string));
	}
	@When("verify assessment end text {string} being displayed or not")
	public void verify_assessment_end_text_being_displayed_or_not(String string) throws InterruptedException {
		Thread.sleep(2000);
	String assessment_end_text=ca.get_end_msg_bold.getText();
	Assert.assertEquals(assessment_end_text,string);
	}
	@Then("verify xopa logo {string} displayed at top left corner or not")
	public void verify_xopa_logo_displayed_at_top_left_corner_or_not(String string) {
	String logo_src=ca.get_logo_src.getAttribute("src");
	Assert.assertTrue(logo_src.contains(string));
	}

    @When("copy some text and paste in answer field")
    public void copy_some_text_and_paste_in_answer_field() throws InterruptedException {
        Actions actions = new Actions(driver);
        sendKeys(ca.txt_ans_eassy,"who");
        
//        click(ca.txt_ans_eassy);
//        Thread.sleep(2000);
//      actions.keyDown(Keys.CONTROL);
//      actions.sendKeys("a");
//      actions.keyUp(Keys.CONTROL);
//      actions.build().perform();
        actions.doubleClick();
      ca.txt_ans_eassy.clear();
      Thread.sleep(4000);

//        
//        assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));
        actions.moveToElement(ca.get_some_txt)                     
        .click()
        .click()
        .click()
        .perform();
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("c");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        
        //Press the TAB Key to Switch Focus to Permanent Address
        actions.sendKeys(Keys.TAB);
        actions.build().perform();
        
        Thread.sleep(2000);
        click(ca.txt_ans_eassy);
        //Paste the Address in the Permanent Address field using CTRL + V
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("v");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        Thread.sleep(2000);
        click(ca.clk_txt);
        
        
        
//        actions.sendKeys(Keys.chord(Keys.CONTROL,"c"));
//        Thread.sleep(2000);
//    	// now apply the command to paste
//        click(ca.txt_ans_eassy);
//        Thread.sleep(2000);
//    	ca.txt_ans_eassy.sendKeys(Keys.chord(Keys.CONTROL, "v"));
    }
    @When("candidate reloads the page after completion of the assessment")
    public void candidate_reloads_the_page_after_completion_of_the_assessment() throws InterruptedException {
    driver.navigate().refresh();
    Thread.sleep(3000);
    }
    @Then("verify candidate able to see message {string}")
    public void verify_candidate_able_to_see_message(String string) {
    String review_msg=ca.review_msg.getText();
    Assert.assertEquals(review_msg,string);
    }
    @Then("verify second option is selected for the first question or not")
    public void verify_second_option_is_selected_for_the_first_question_or_not() {
     Assert.assertTrue(ca.is_selected_b_qa.isSelected());
    }
    @Then("verify second option is selected for the second question or not")
    public void verify_second_option_is_selected_for_the_second_question_or_not() {
    	Assert.assertTrue(ca.is_selected_b_qb.isSelected());
    }
    @Then("verify third option is selected for the third question or not")
    public void verify_third_option_is_selected_for_the_third_question_or_not() {
    	Assert.assertTrue(ca.is_selected_c.isSelected());
    }
    @When("candidate click on the next button")
    public void candidate_click_on_the_next_button() throws InterruptedException {
    	Thread.sleep(1000);
    click(ca.next_btn);
    }
    @Then("verify candidate able to see the message {string} or not")
    public void verify_candidate_able_to_see_the_message_or_not(String string) throws InterruptedException {
    Thread.sleep(2000);
    String act_start_txt=driver.findElement(By.tagName("p")).getText();
    Assert.assertEquals(act_start_txt,string);
    }
    @Then("verify retake assessment link is not visible to candidates or not")
    public void verify_retake_assessment_link_is_not_visible_to_candidates_or_not() {
    	boolean condition = false;
    	if(driver.findElements(By.xpath("//a[text()='Retake Assessment']")).size() < 1)
		{
    		condition = true;
			System.out.println("Test Pass");
    	}
    	Assert.assertTrue(condition);
    }
    
    @When("click on retake button to allow candidates to retake assessment")
    public void click_on_retake_button_to_allow_candidates_to_retake_assessment() {
    click(ca.retake_btn);
    }
    @When("choose questions to retake only specific questions")
    public void choose_questions_to_retake_only_specific_questions() {
    
    }
    @When("select questions by category {string} and select any question")
    public void select_questions_by_category_and_select_any_question(String string) throws InterruptedException {
    pickupbysendKeys(ca.txt_filt_category, string);
    Thread.sleep(3000);
    jseclick(ca.sel_ques);
    Thread.sleep(1000);
    }
    @When("click on submit to send invite to the candidate")
    public void click_on_submit_to_send_invite_to_the_candidate() {
    click(ca.submit_btn);
    }
    @Then("verify the text {string} is visible to candidates or not")
    public void verify_the_text_is_visible_to_candidates_or_not(String string) throws InterruptedException {
    	Thread.sleep(1000);
    String get_retakes_left_txt=ca.txt_retakes_left.getText();
    Assert.assertTrue(get_retakes_left_txt.contains(string));
    }
    @Then("verify the previous button is visible to candidates or not")
    public void verify_the_previous_button_is_visible_to_candidates_or_not() {
    	boolean condition = false;
    	if(driver.findElements(By.xpath("//button[text()='Previous']")).size() != 0 )
		{
    		condition = true;                           
			System.out.println("Test Pass");
    	}
    	Assert.assertTrue(condition);
    	
    	
    }
    @When("click on save button to make changes later")
    public void click_on_save_button_to_make_changes_later() {
    click(ca.save_btn);
    }
    @When("click on submit answer button to make it final answer")
    public void click_on_submit_answer_button_to_make_it_final_answer() {
    click(ca.submit_ans);
    }
    @When("click on previous button to navigate to previous question")
    public void click_on_previous_button_to_navigate_to_previous_question() {
    click(ca.previous_btn);
    }
    @Then("verify save and submit answer buttons are disabled or not")
    public void verify_save_and_submit_answer_buttons_are_disabled_or_not() throws InterruptedException {
    	Thread.sleep(1000);
    	String is_btn_a_disabled=ca.save_btn.getAttribute("class");
    	String is_btn_b_disabled=ca.save_btn.getAttribute("class");
    	Assert.assertTrue(is_btn_a_disabled.contains("disabled") || is_btn_b_disabled.contains("disabled"));
    }






	
	
}

package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CandidateAssessmentE {

	   public WebDriver driver;
	   public CandidateAssessmentE(WebDriver driver)
	   {
	   this.driver=driver;
	   PageFactory.initElements(new AjaxElementLocatorFactory(driver,60),this);
	   }
	     @FindBy(xpath="(//a[text()='Assessment Setup'])[1]")
	     public WebElement asmnt_setup;
	     @FindBy(xpath="(//span[text()='Send Invite'])[1]")
	     public WebElement send_invite;
	     @FindBy(xpath="((//div[@class='bx--row bx--type-zeta text-capitalize xpa-link'])[1]//a)[1]")
	     public WebElement candidate_details;
	     @FindBy(xpath="//div[@id='cand-assessment-link']")
	     public WebElement assessmnt_url;
//	     @FindBy(xpath="//input[@id='xpa-vi--otp']")
//	     public WebElement txt_otp;
	     @FindBy(xpath="//label[@for='acceptConditions']")
	     public WebElement terms_chkbox;
	     @FindBy(xpath="//button[text()='Start']")
	     public WebElement start_btn;
	     @FindBy(xpath="(//button[text()='Submit'])[1]")
	     public WebElement submit_btn;	
	     @FindBy(xpath="//img[@alt='x0pa']")
	     public WebElement get_assessment_banner;
	     @FindBy(xpath="(//div[@class='text-justify mt-2'])[1]//strong")
	     public WebElement assessment_exp_time;
	     @FindBy(xpath="//input[@type='text']")
	     public WebElement txt_otp;
	     @FindBy(xpath="//button[text()='Start Recording']")
	     public WebElement st_rec_btn;
	     @FindBy(xpath="//span[@class='text-danger font-weight-bold xpa--blink']")
	     public WebElement get_reco_txt;    //Recording...
	     @FindBy(xpath="//button[text()='Stop Recording']")
	     public WebElement stop_rec_btn;
	     @FindBy(xpath="//button[text()='Play Video']")
	     public WebElement paly_vedio_btn;
	     @FindBy(xpath="(//span[@class='text-success font-weight-bold'])[1]")
	     public WebElement get_vd_play_txt;	
	     @FindBy(xpath="//label[@for='video-yes']")
	     public WebElement vedio_yes_radio;
	     @FindBy(xpath="//label[@for='audio-yes']")
	     public WebElement audio_yes_radio;
	     @FindBy(xpath="//button[text()='Stop Video']")
	     public WebElement stop_vedio_btn;
	     @FindBy(xpath="//button[text()='Next']")
	     public WebElement next_btn;
	     @FindBy(xpath="//button[text()='Delete answer and reattempt?']")
	     public WebElement retake_vedio_ques;
	     @FindBy(xpath="//button[text()='Proceed']")
	     public WebElement proceed_btn;
	     @FindBy(xpath="//input[@type='file']")
	     public WebElement upload_file;
	     @FindBy(xpath="(//span[text()='pragramming Language'])[1]")
	     public WebElement pr_mcq_ans_radio;	
//		     @FindBy(xpath="//span[text()='Manual Testers']")     
	     @FindBy(xpath="(//label[@class='bx--radio-button__label'])[2]")
		     public WebElement act_mcq_ans;
	     @FindBy(xpath="(//label[@class='bx--radio-button__label'])[3]")
	     public WebElement incorrect_mcq_ans;
		     @FindBy(xpath="//a[text()='Retake Assessment']")
		     public WebElement retake_assessment_link;
		     @FindBy(tagName="h4")
		     public WebElement get_end_msg_bold;
		     @FindBy(tagName="p")
		     public WebElement get_end_greetings;
		     @FindBy(xpath="//textarea[@name='retakeReason']")
		     public WebElement txt_retake_reason;	
		     @FindBy(xpath="//button[text()='Retake?']")
		     public WebElement retake_prac_vedio;
		     @FindBy(xpath="//div[@aria-label='rdw-editor']")
		     public WebElement txt_ans_eassy;
		     @FindBy(xpath="//div[@class='DraftEditor-editorContainer']")
		     public WebElement ans_esy;
//		     @FindBy(xpath="(//button[text()='Submit'])[1]")
//		     public WebElement submit_btn;
		     @FindBy(xpath="(//input[@role='searchbox'])[1]")
		     public WebElement txt_search;
		     @FindBy(xpath="//button[text()='Accept']")
		     public WebElement accept_retake;
		     @FindBy(xpath="((//div[@class='bx--row bx--type-zeta text-capitalize xpa-link'])[1]//span)[1]")
		     public WebElement candidate_pg;
		     @FindBy(xpath="//video//source")
		     public WebElement get_vedio_src;
		   //  @FindBy(xpath="(//span[@class='bx--radio-button__appearance'])[2]")
		   //  public WebElement ;
		     @FindBy(xpath="//img[@class='xpa-top-header--logo-room']")
		     public WebElement get_logo_src;
		     @FindBy(tagName="p")
		     public WebElement get_ques;
		     @FindBy(xpath="//span[@class='font-weight-bold']")
		     public WebElement get_some_txt;
		     @FindBy(xpath="//div[@class='DraftEditor-root']")
		     public WebElement clk_txt;
		     @FindBy(xpath="//p[@class='bx--inline-notification__title']//span")
		     public WebElement review_msg;
		     @FindBy(xpath="(//input[@id='3'])[3]")
		     public WebElement is_selected_c;
		     @FindBy(xpath="(//input[@id='2'])[1]")
		     public WebElement is_selected_b_qa;
		     @FindBy(xpath="(//input[@id='2'])[2]")
		     public WebElement is_selected_b_qb;	
		     @FindBy(xpath="//small[@class='font-weight-bold bx--type-zeta bx--tag mt-2']")
		     public WebElement txt_retakes_left;
		     @FindBy(xpath="(//input[@type='text'])[1]")
		     public WebElement txt_filt_category;
		     @FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[1]")
		     public WebElement close_catg;
		     @FindBy(xpath="(//input[@id='sel-ques_new_0'])[1]")
		     public WebElement sel_ques;
		     @FindBy(xpath="//button[text()='Retake']")
		     public WebElement retake_btn;
		     @FindBy(xpath="(//div[text()='Answer Options']//following::div)[1]")
		     public WebElement get_rating_opt;
		     @FindBy(xpath="((//div[@class='text-justify mt-2'])[3]//following::div//div)[1]")
		     public WebElement get_start_dt;
		     @FindBy(xpath="//button[text()='save']")
		     public WebElement save_btn;	
			     @FindBy(xpath="//button[text()='Submit Answer']")
			     public WebElement submit_ans;
			     @FindBy(xpath="//button[text()='Previous']")
			     public WebElement previous_btn;
			   //  @FindBy(xpath="")
			   //  public WebElement ;
			   //  @FindBy(xpath="")
			   //  public WebElement ;
			   //  @FindBy(xpath="")
			   //  public WebElement ;
			   //  @FindBy(xpath="")
			   //  public WebElement ;
			   //  @FindBy(xpath="")
			   //  public WebElement ;
			   //  @FindBy(xpath="")
			   //  public WebElement ;
			   //  @FindBy(xpath="")
			   //  public WebElement ;
			   //  @FindBy(xpath="")
			   //  public WebElement ;
			   //  @FindBy(xpath="")
			   //  public WebElement ;
			   //  @FindBy(xpath="")
			   //  public WebElement ;
			   //  @FindBy(xpath="")
			   //  public WebElement ;
			   //  @FindBy(xpath="")
			   //  public WebElement ;
}

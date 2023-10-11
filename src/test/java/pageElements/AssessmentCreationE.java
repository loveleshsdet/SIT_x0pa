package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AssessmentCreationE {
	
	   public WebDriver driver;
	   public AssessmentCreationE(WebDriver driver)
	   {
	   this.driver=driver;
	   PageFactory.initElements(new AjaxElementLocatorFactory(driver,60),this);
	   }
	    @FindBy(xpath="(//b[text()='Interview'])[1]")
	    public WebElement interview_menu;
	    @FindBy(xpath="(//div[@class='ml-3 h6 text-dark']//a[@class='font-weight-bold'])[1]")
	    public WebElement xopa_room;
	    @FindBy(xpath="(//button[text()='Create New Assessment'])[1]")
	    public WebElement create_new_assmnt;
	    @FindBy(id="groupName")
	    public WebElement txt_assmnt_name;
	    @FindBy(xpath="//div[@class='DraftEditor-root']")
	    public WebElement test_tkr_info;
	    @FindBy(xpath="//label[@for='dataTabels']")
	    public WebElement fix_or_cstm_int;
	    @FindBy(xpath="//label[@for='reminderToggle']")
	    public WebElement remainder_tog;
	    @FindBy(xpath="//input[@id='reminderInterval']")
	    public WebElement remainder_int;
	    @FindBy(xpath="//input[@id='maxReminders']")
	    public WebElement max_remainders;
	    @FindBy(xpath="//label[@for='enableCopyAndPaste']")
	    public WebElement copy_paste_tog;
	    @FindBy(xpath="//label[@for='enableRetakeAssessment']")
	    public WebElement retake_tog;
	    @FindBy(xpath="//label[@for='responseVisibility']")
	    public WebElement candt_responses;
	    @FindBy(xpath="//label[@for='enableBanner']")
	    public WebElement enable_company_branding;
	    @FindBy(xpath="//label[@for='enableInclusiveHiring']")
	    public WebElement msk_hire_tog;
	    @FindBy(xpath="//label[@for='protectRoomMagicLink']")
	    public WebElement share_url_pwd;
	    @FindBy(xpath="//label[@for='enableRatingCritiria']")
	    public WebElement enable_rate_cri_tog;
	    @FindBy(xpath="//input[@type='file']")
	    public WebElement cng_bnr;
	    @FindBy(xpath="(//button[text()='Submit'])[2]")
	    public WebElement submit_btn;
	    @FindBy(xpath="(//input[@type='text'])[2]")
	    public WebElement assmnt_st_dt;
	    @FindBy(xpath="(//input[@type='text'])[3]")
	    public WebElement assmnt_end_dt;
	    @FindBy(xpath="//input[@id='magicLinkPassword']")
	    public WebElement txt_pswd;
	    @FindBy(xpath="//div[@aria-label='rdw-editor']")
	    public WebElement txt_inst;
	    @FindBy(xpath="(//h4[@class='text-capitalize xpa-link'])[1]")
	    public WebElement clk_assmnt;
	    @FindBy(xpath="(//button[text()='Edit'])[1]")
	    public WebElement edt_st_dt;
		     @FindBy(xpath="(//button[text()='Edit'])[2]")
		     public WebElement edt_end_dt;
		     @FindBy(xpath="(//input[@type='text'])[1]")
		     public WebElement edt_date;
		     @FindBy(xpath="(//button[text()='Add Custom Question'])[2]")
		     public WebElement ad_cstm_q;
		     @FindBy(xpath="(//button[text()='Add Custom Question'])[1]")
		     public WebElement ad_cstm_ques;
		     @FindBy(xpath="//label[@for='radio-2']")
		     public WebElement vedio_radio;
		     @FindBy(xpath="//label[@for='enableMaxRetakesInput']")
		     public WebElement enable_max_retakes;
		     @FindBy(xpath="//input[@id='maxRetakes']")
		     public WebElement txt_max_retakes;
		     @FindBy(xpath="//label[@for='enableRetakeDecisionTime']")
		     public WebElement retake_dec_time;
		     @FindBy(name="retakeDecisionTimeInMin")
		     public WebElement retak_dec_min;
		     @FindBy(name="retakeDecisionTimeInSec")
		     public WebElement retak_dec_sec;
		     @FindBy(xpath="//label[@for='radio-1']")
		     public WebElement mcq_radio;
		     @FindBy(xpath="(//input[@type='text'])[1]")
		     public WebElement txt_opt;
		     @FindBy(xpath="(//input[@type='text'])[2]")
		     public WebElement pik_right_opt;
		     @FindBy(xpath="(//input[@type='text'])[3]")
		     public WebElement pik_red_flag_opt;
		     @FindBy(xpath="//label[@for='sendEmalOnReject']")
		     public WebElement any_right_opt_is_crkt;
			     @FindBy(xpath="//label[@for='allowOnlySingleChoice']")
			     public WebElement allow_only_one_opt;
			     @FindBy(xpath="//input[@id='maxScore']")
			     public WebElement txt_score;
			     @FindBy(xpath="//label[@for='radio-6']")
			     public WebElement rating_radio;
			     @FindBy(xpath="//input[@id='rating-option-0']")
			     public WebElement rating_opt_a;
			     @FindBy(xpath="//input[@id='maxScore-0']")
			     public WebElement rating_score_a;
			       @FindBy(xpath="//input[@id='rating-option-1']")
				     public WebElement rating_opt_b;
				     @FindBy(xpath="(//input[@id='maxScore'])[1]")
				     public WebElement rating_score_b;
			       @FindBy(xpath="//input[@id='rating-option-2']")
				     public WebElement rating_opt_c;
				     @FindBy(xpath="(//input[@id='maxScore'])[2]")
				     public WebElement rating_score_c;
			       @FindBy(xpath="//input[@id='rating-option-3']")
				     public WebElement rating_opt_d;
				     @FindBy(xpath="(//input[@id='maxScore'])[3]")
				     public WebElement rating_score_d;
			     @FindBy(xpath="//button[text()='Add message']")
			     public WebElement add_msg;
			     @FindBy(xpath="//button[text()='Add from Question Bank']")
			     public WebElement ad_ques_qb;
			     @FindBy(xpath="//input[@id='example_facet_QUESTION TYPEEssay']")
			     public WebElement fil_eassy;
			     @FindBy(xpath="(//label[@aria-label='Select row'])[1]")
			     public WebElement sel_ques;
			     @FindBy(xpath="(//div[@class='ml-lg-4'])[1]")
			     public WebElement get_ques;
			     @FindBy(xpath="(//div[@class='ml-4'])[1]")
			     public WebElement get_catg;
			     @FindBy(xpath="(//div[@class='ml-4'])[2]")
			     public WebElement get_ans_mode;
			     @FindBy(xpath="//button[text()='Add']")
			     public WebElement add_btn;
			     @FindBy(xpath="(//div[@class='ml-lg-4'])[1]")
			     public WebElement get_act_ques;
			     @FindBy(xpath="(//div[@class='mr-2 text-uppercase ml-0 cds--end-line'])[1]")
			     public WebElement get_act_catg;
			     @FindBy(xpath="//div[text()='Mode of Answer']//following-sibling::div//div//div")
			     public WebElement act_mode_of_ans;
			     @FindBy(xpath="(//tbody[@data-rbd-droppable-id='hybridQuesTable']//tr)[1]")
			     public WebElement first_ques;
			     @FindBy(xpath="//input[@id='example_facet_QUESTION TYPEVideo']")
			     public WebElement filt_video_q;
			     @FindBy(xpath="//input[@id='example_facet_QUESTION TYPEMultiple Choice (MCQ)']")
			     public WebElement filt_mcq_q;
			     @FindBy(xpath="//input[@id='example_facet_QUESTION TYPERating']")
			     public WebElement fil_rating_q;
			       @FindBy(xpath="(//tbody[@data-rbd-droppable-id='hybridQuesTable']//tr)[last()]")
				     public WebElement last_ques;
				     @FindBy(xpath="//a[text()='Global Question Bank']")       
				     public WebElement qb_global;
				     @FindBy(xpath="(//input[starts-with(@id, 'example_facet_CATEGORY')]//following::span)[1]")
				     public WebElement get_fil_catg;
				     @FindBy(xpath="(//input[starts-with(@id, 'example_facet_CATEGORY')])[1]")
				     public WebElement filt_catg;
				     @FindBy(xpath="//p[@class='empty-title h5']")
				     public WebElement get_no_ques_msg;
				     @FindBy(xpath="(//a[@kind='ghost']//*[local-name()='svg'])[1]")
				     public WebElement edit_assmnt_btn;
				     @FindBy(xpath="(//select[@class='bx--select-input'])[1]")
				     public WebElement sel_assmnts_by;
				     @FindBy(xpath="(//h4[@class='text-capitalize xpa-link'])[1]")
				     public WebElement get_assmnt;
				     @FindBy(xpath="(//span[@class='cursor-pointer'])[1]")
				     public WebElement set_assmnt_fav;
				     @FindBy(xpath="(//div[@class='bx--row bx--type-zeta text-capitalize xpa-link']//span)[1]")
				     public WebElement get_candidate_name;
				     @FindBy(xpath="(//span[text()='Shortlist'])[1]")
				     public WebElement shortlist;
				     @FindBy(xpath="//button[text()='Close Assessment']")
				     public WebElement close_assmnt_btn;
				     @FindBy(xpath="//a[text()='X0PA ROOM']")
				     public WebElement lnk_x0pa_room;
				     @FindBy(xpath="//label[@for='closed']")
				     public WebElement closed_assessmnts;
				     @FindBy(xpath="(//input[@role='searchbox'])[1]")
					     public WebElement search_assessment;
					     @FindBy(xpath="//button[text()='Yes']")
					     public WebElement yes_close_assessment;
					     @FindBy(xpath="(//div[@class='d-flex']/h5)[1]")
					     public WebElement get_assessment_name;
					     @FindBy(xpath="//button[text()='Re-open Assessment']")
					     public WebElement reopen_btn;
					     @FindBy(xpath="//button[text()='Clone Assessment']")
					     public WebElement clone_assessment_btn;
					     @FindBy(xpath="(//a[@class='font-weight-bold'])[1]/span")
					     public WebElement total_link;
					     @FindBy(xpath="(//a[@class='font-weight-bold'])[2]/span")
					     public WebElement draft_link;
					     @FindBy(xpath="(//a[@class='font-weight-bold'])[3]/span")
					     public WebElement inprogress_link;
					     @FindBy(xpath="(//a[@class='font-weight-bold'])[4]/span")
					     public WebElement completed_link;
					     @FindBy(xpath="(//td/div/div[2]/span)[1]")
					     public WebElement get_cand_status;
					     @FindBy(xpath="//a[@class='font-weight-bold ']")
					     public WebElement awaiting_link;
					     @FindBy(xpath="(//td/div/div[2]/span)[1]")
					     public WebElement get_candidate_status;
					     @FindBy(xpath="//label[@for='enableRatingCritiria']")
					     public WebElement rating_cri_tog;
				       //  public WebElement ;
					     @FindBy(xpath="//img[@alt='Company Logo']")
					     public WebElement get_logo_src;
					     @FindBy(xpath="(//button[text()='Edit'])[3]")
					     public WebElement edt_e_ques;
					     @FindBy(xpath="//input[@id='pass_threshold']")
					     public WebElement txt_pass_threshold;
					     @FindBy(xpath="//button[text()='Save']")
					     public WebElement save_btn;
					     @FindBy(xpath="(//button[text()='Yes'])[1]")
					     public WebElement yes_btn;
					     @FindBy(xpath="(//button[text()='Submit'])[1]")
					     public WebElement btn_submit;
					     @FindBy(xpath="//select[@name='input-hr']")
					     public WebElement sel_value;
						     @FindBy(xpath="(//button[text()='Save'])[2]")
						     public WebElement save_btn_b;
						     @FindBy(xpath="//label[@for='interview-type-tg']")
						     public WebElement customise_ques_tog;
						     @FindBy(xpath="(//input[@type='text'])[2]")
						     public WebElement pik_rating;
						   
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

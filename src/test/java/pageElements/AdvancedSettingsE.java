package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class AdvancedSettingsE {
	
	   public WebDriver driver;
	   public AdvancedSettingsE(WebDriver driver)
	   {
	   this.driver=driver;
	   PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),this);
	   }
	     @FindBy(xpath="(//a[text()='Advanced Settings'])[1]")
	     public WebElement adv_settings_tab;
	     @FindBy(xpath="(//button[@title='Expand/Collapse'])[1]")
	     public WebElement exp_collaps_pq_a;
	     @FindBy(xpath="(//div[@aria-label='rdw-editor'])[1]")
	     public WebElement txt_instruction_ques;	
	     @FindBy(xpath="(//div[@aria-label='rdw-editor'])[2]")
	     public WebElement txt_ques;
	     @FindBy(xpath="//select[@name='prepTimeMinForEssay']")
	     public WebElement sel_prep_min;
	     @FindBy(xpath="//select[@name='prepTimeSecForEssay']")
	     public WebElement sel_prep_sec;
	     @FindBy(xpath="//select[@name='practiceMaxAnswerTimeMinForEssay']")
	     public WebElement sel_minutes_to_ans_pq;
	     @FindBy(xpath="//select[@name='practiceMaxAnswerTimeSecForEssay']")
	     public WebElement sel_seconds_to_ans_pq;
	     @FindBy(xpath="//input[@id='practiceMinCharsForEssay']")
	     public WebElement min_words;
	     @FindBy(xpath="//input[@id='practiceMaxCharsForEssay']")
	     public WebElement max_words;
	     @FindBy(xpath="(//input[@type='file'])[1]")
	     public WebElement upload_vedio;
	     @FindBy(xpath="(//input[@type='file'])[2]")
	     public WebElement upload_doc;	
	     @FindBy(xpath="//label[@for='showMCQPracticeQues']")
	     public WebElement practice_ques_mcq;
	     @FindBy(xpath="(//button[@title='Expand/Collapse'])[2]")
	     public WebElement exp_collapse_pq_b;
	     @FindBy(xpath="(//input[@type='text'])[1]")
	     public WebElement opt_mcq;
	     @FindBy(xpath="(//button[@title='Expand/Collapse'])[3]")
		 public WebElement exp_collapse_pq_c;
	     @FindBy(xpath="//label[@for='showVideoPracticeQues']")
	     public WebElement vedio_ques;
	     @FindBy(xpath="//input[@id='practiceMaxRetakesForVideo']")
	     public WebElement txt_retakes;
	     @FindBy(xpath="//select[@name='practiceRetakeDecisionTimeMinForVideo']")
	     public WebElement sel_pq_time_minutes;
	     @FindBy(xpath="//select[@name='practiceRetakeDecisionTimeSecForVideo']")
	     public WebElement sel_pq_time_seconds;
	     @FindBy(xpath="(//div[@aria-label='rdw-editor'])[3]")
	     public WebElement ins_mcq;
	     @FindBy(xpath="(//div[@aria-label='rdw-editor'])[4]")
	     public WebElement ques_mcq;
	     @FindBy(xpath="(//div[@aria-label='rdw-editor'])[5]")
	     public WebElement ins_vedio;
	     @FindBy(xpath="(//div[@aria-label='rdw-editor'])[6]")
	     public WebElement ques_vedio;
	     @FindBy(xpath="(//div[@aria-label='rdw-editor'])[7]")
	     public WebElement assmnt_end_txt;	
	     @FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[1]")
	     public WebElement close_existing_opt;
	     @FindBy(xpath="(//input[@type='file'])[3]")
	     public WebElement upload_video_b;
	     @FindBy(xpath="(//input[@type='file'])[4]")
	     public WebElement upload_doc_b;	
	     @FindBy(xpath="(//input[@type='file'])[5]")
	     public WebElement upload_video_c;
	     @FindBy(xpath="(//input[@type='file'])[6]")
	     public WebElement upload_doc_c;
	     @FindBy(xpath="//label[@for='enableSubmitOnNext']")
	     public WebElement disable_sav_drft;
	     @FindBy(xpath="(//input[@type='file'])[7]")
	     public WebElement upload_start_vedio;
	     @FindBy(xpath="(//input[@type='file'])[8]")
	     public WebElement upload_end_vedio;
	     @FindBy(xpath="//label[@for='showIntroVideoAftrOtp']")
	     public WebElement show_into_vdeoaftotp;
	     @FindBy(xpath="//button[text()='Save']")
	     public WebElement save_btn;
	     @FindBy(xpath="//li[@data-rbd-draggable-id='esy1']")
	     public WebElement drop_essay;
	     @FindBy(xpath="//li[@data-rbd-draggable-id='mpq1']")
	     public WebElement drag_mcq;
	     @FindBy(xpath="//li[@data-rbd-draggable-id='vdo2']")
		 public WebElement drag_vedio;
		     @FindBy(xpath="//ul/li[1]/div/div[2]/li/button/div/div")
		     public WebElement get_reordered_ques_type;
		     @FindBy(xpath="//ul[@data-rbd-droppable-id='items']/li[1]")
		     public WebElement order_1;
		     @FindBy(xpath="//ul[@data-rbd-droppable-id='items']/li[2]")
		     public WebElement order_2;
		     @FindBy(xpath="//ul[@data-rbd-droppable-id='items']/li[3]")
		     public WebElement order_3;
		     @FindBy(xpath="//div[@class='bx--tile mt-1 d-flex']")
		     public WebElement order_a;
		     @FindBy(xpath="//ul/li[2]/div/div[2]/li/button/div/div")
		     public WebElement get_mcq_type;	
		     @FindBy(xpath="//ul/li[1]/div/div[2]/li/button/div/div")
		     public WebElement get_vedio_type;
		     @FindBy(xpath="(//div[@class='p-2'])[1]")
		     public WebElement ord_a;
		     @FindBy(xpath="(//div[@class='p-2'])[2]")
		     public WebElement ord_b;
		     @FindBy(xpath="(//div[@class='p-2'])[3]")
		     public WebElement ord_c;
		     @FindBy(xpath="//label[@for='showNumOfRetakeLeftText']")
		     public WebElement retakes_left_toggle_tog;	
		     @FindBy(xpath="//label[@for='enablePreviousBtn']")
		     public WebElement previous_btn_tog;
		     @FindBy(xpath="//label[@for='showSummaryTable']")
		     public WebElement summary_table_tog;
		     @FindBy(xpath="//label[@for='skipPracticeQuestion']")
		     public WebElement disable_practice_ques;
		     @FindBy(xpath="(//span[text()='Add video'])[4]")
		     public WebElement add_video;
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

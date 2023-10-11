package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CandidateE {
	
	   public WebDriver driver;
	   public CandidateE(WebDriver driver)
	   {
	   this.driver=driver;
	   PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),this);

	   }
	   
	     @FindBy(xpath="//a[text()='Candidates']")
	     public WebElement candidates_tab;
	     @FindBy(xpath="(//button[text()='Add Candidate'])[1]")
	     public WebElement add_cand_btn;
	     @FindBy(xpath="//input[@id='firstName']")
	     public WebElement txt_first_name;
	     @FindBy(xpath="//input[@id='lastName']")
	     public WebElement txt_last_name;
	     @FindBy(xpath="//input[@id='email']")
	     public WebElement txt_mail;
	     @FindBy(xpath="(//button[text()='Bulk Import Candidates'])[2]")
	     public WebElement blk_import_btn;
	     @FindBy(xpath="(//button[text()='Bulk Import Candidates'])[1]")
	     public WebElement bulk_import_btn;
	     @FindBy(xpath="//input[@type='file']")
	     public WebElement upload_file;
	     @FindBy(xpath="(//div[@class='bx--row bx--type-zeta text-capitalize xpa-link']/span)[1]")
	     public WebElement get_act_cand_name_a;
	     @FindBy(xpath="(//div[@class='bx--row bx--type-zeta text-capitalize xpa-link']/span)[2]")
	     public WebElement get_act_cand_name_b;	
	     @FindBy(xpath="(//div[@class='bx--row bx--type-zeta text-capitalize xpa-link']/span)[3]")
	     public WebElement get_act_cand_name_c;
	     @FindBy(xpath="(//div[@class='bx--row bx--type-zeta text-capitalize xpa-link']/span)[4]")
	     public WebElement get_act_cand_name_d;
	     @FindBy(xpath="//input[@id='example_facet_StatusCompleted']")
	     public WebElement filt_completed;
	     @FindBy(xpath="//input[@id='example_facet_StatusDraft']")
	     public WebElement filt_draft;
	     @FindBy(xpath="//input[@id='example_facet_StatusAwaiting Response']")
	     public WebElement filt_ar;
	     @FindBy(xpath="//input[@id='example_facet_StatusIn Progress']")
	     public WebElement filt_ip;
	     @FindBy(xpath="(//span[@class='bx--tag bx--tag--green ml-0'])[1]")
	     public WebElement get_completed_cand;
	     @FindBy(xpath="(//span[@class='bx--tag bx--tag--yellow ml-0'])[1]")
	     public WebElement get_draft_cand;
	     @FindBy(xpath="(//span[@class='bx--tag bx--tag--blue ml-0'])[1]")
	     public WebElement get_ip_cand;	
	     @FindBy(xpath="(//span[@class='bx--tag bx--tag--cool-gray ml-0'])[2]")
	     public WebElement get_ar_cand;
	     @FindBy(xpath="(//td/div/div[2]/span)[1]")
	     public WebElement get_cand_status;
	     @FindBy(xpath="(//td/div/div[2])[5]")
	     public WebElement get_fil_short;
	     @FindBy(xpath="//input[@id='example_facet_DecisionShortlisted']")
	     public WebElement filt_shortlist;
	     @FindBy(xpath="//input[@id='example_facet_DecisionRejected']")
	     public WebElement filt_rej;
	     @FindBy(xpath="//input[@id='example_facet_DecisionNo Decision']")
	     public WebElement filt_no_decision;
	     @FindBy(xpath="((//td/div/div[2])[5]//span)[1]")
	     public WebElement clk_to_shortlist;
	     @FindBy(xpath="((//td/div/div[2])[5]//span)[2]")
	     public WebElement clk_to_reject;
	     @FindBy(xpath="//button[text()='Clear Filters']")
	     public WebElement clr_filters;
		     @FindBy(xpath="//input[@id='example_facet_ResultFail']")
		     public WebElement fil_failed;	
		     @FindBy(xpath="//input[@id='example_facet_ResultPass']")
		     public WebElement fil_pass;
		     @FindBy(xpath="//input[@id='example_facet_ResultNo result']")
		     public WebElement fil_no_result;
		     @FindBy(xpath="//p[@class='empty-title h5']")
		     public WebElement no_candidate_msg;
		     @FindBy(xpath="(//td/div/div[2]/span)[2]")
		     public WebElement get_act_result;
		     @FindBy(xpath="(//input[@role='searchbox'])[1]")
		     public WebElement search_assessment;
		     @FindBy(xpath="//label[@aria-label='Select row']")
		     public WebElement sel_cand;
		     @FindBy(xpath="//button[@id='shortlist']")
		     public WebElement blk_shortlist;
		     @FindBy(xpath="//button[@id='reject']")
		     public WebElement blk_reject;
		     @FindBy(xpath="//button[@id='delete']")
		     public WebElement blk_delete;	
		     @FindBy(xpath="(//div[@class='mt-2 ml-2 text-capitalize'])[1]")
		     public WebElement get_decision;	
		     @FindBy(xpath="(//button[text()='Submit'])[1]")
		     public WebElement submit_btn;
		     @FindBy(xpath="(//input[@role='searchbox'])[1]")
		     public WebElement txt_search;
		     @FindBy(xpath="//button[text()='Accept']")
		     public WebElement accept_retake;
		
		     @FindBy(xpath="(//div[@class='mb-0'])[2]")
		     public WebElement get_overall_score;
		     @FindBy(xpath="//span[text()='Overall Score']")
		     public WebElement candidate_overallscore;
		     @FindBy(xpath="//a[@class='ml-2 font-weight-bold xpa-link']")
		     public WebElement edt_assessment;
		     @FindBy(xpath="(//div[@class='bx--row bx--type-zeta text-capitalize xpa-link']//span)[1]")
		     public WebElement get_cand;
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

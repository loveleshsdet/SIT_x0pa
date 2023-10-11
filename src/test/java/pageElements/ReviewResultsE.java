package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ReviewResultsE {
	
	   public WebDriver driver;
	   public ReviewResultsE(WebDriver driver)
	   {
	   this.driver=driver;
	   PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),this);

	   }
	   
	     @FindBy(xpath="//div[text()='Score']//following-sibling::div")
	     public WebElement get_act_score;
	     @FindBy(xpath="//button[text()='Next']")
	     public WebElement nxt_ques;
	     @FindBy(xpath="//div[text()='Candidate Response']//following::div[1]")
	     public WebElement cand_response;
	     @FindBy(xpath="//div[text()='Correct answer']//following::div[1]")
	     public WebElement act_correct_answer;
	     @FindBy(xpath="//button[text()='Previous']")
	     public WebElement prev_button;
//	     @FindBy(xpath="//div//div/span[2]")
//	     public WebElement total_score;
	     @FindBy(xpath="(//div[1]/b[text()='Status']//following::div//div//span[1])[1]")
	     public WebElement assessment_status;
	     @FindBy(xpath="//div[1]/b[text()='Result']//following::div[1]//div//span[1]")
	     public WebElement assessment_result;	
	     @FindBy(xpath="//div[1]/b[text()='Result']//following::div[1]//div//span[2]")
	     public WebElement total_score;
	     @FindBy(xpath="//button[text()='Shortlist']")
	     public WebElement shortlist_btn;
	     @FindBy(xpath="(//div[text()='RedFlag Options']//following::div)[1]")
	     public WebElement red_flag_opt;
	     @FindBy(xpath="//button[text()='Submit']")
	     public WebElement submit_btn;
	     @FindBy(xpath="//div[1]/b[text()='Decision']//following::div[3]")
	     public WebElement get_dec_shortlisted;
	     @FindBy(xpath="//button[text()='Reject']")
	     public WebElement reject_btn;
	     @FindBy(xpath="//button[text()='Generate Link']")
	     public WebElement gen_link_btn;
	     @FindBy(xpath="//input[@id='sharing-url']")
	     public WebElement get_sharing_url;	
	     @FindBy(xpath="//input[@id='otp']")
	     public WebElement txt_password;
	     @FindBy(xpath="//button[text()='Verify']")
	     public WebElement verify_btn;
	     @FindBy(xpath="(//div[text()='Candidate Response']//following::div[1])[1]")
	     public WebElement first_ans;
	     @FindBy(xpath="(//div[text()='Candidate Response']//following::div[1])[2]")
	     public WebElement second_ans;
	     @FindBy(xpath="(//div[text()='Candidate Response']//following::div[1])[3]")
	     public WebElement third_ans;
	     @FindBy(xpath="(//div[text()='Candidate Response']//following::div[1])[4]")
	     public WebElement fourth_ans;
	     @FindBy(xpath="(//div[text()='Correct answer']//following::div[1])[1]")
	     public WebElement correct_ans_a;
	     @FindBy(xpath="(//div[text()='Correct answer']//following::div[1])[2]")
	     public WebElement correct_ans_b;	
	     @FindBy(xpath="(//div[text()='Correct answer']//following::div[1])[1]")
	     public WebElement correct_ans_c;
	     @FindBy(xpath="(//div[text()='Correct answer']//following::div[1])[2]")
	     public WebElement correct_ans_d;
	   //  @FindBy(xpath="")    assertThat(someCollection, not(hasItem(someItem)))
	   //  public WebElement ;
	     @FindBy(xpath="(//div[text()='Score']//following-sibling::div)[1]")
	     public WebElement score_a;
	     @FindBy(xpath="(//div[text()='Score']//following-sibling::div)[2]")
	     public WebElement score_b;
	     @FindBy(xpath="(//div[text()='Score']//following-sibling::div)[3]")
	     public WebElement score_c;
	     @FindBy(xpath="(//div[text()='Score']//following-sibling::div)[4]")
	     public WebElement score_d;
	     @FindBy(xpath="//img[@class='xpa-top-header--logo']")
	     public WebElement get_logo_src;
	     @FindBy(xpath="//select[@name='viewType']")
	     public WebElement sel_list_view;
	     @FindBy(xpath="(//div[text()='Candidate Response']//following::div[1])[1]//strong")
	     public WebElement copy_paste_ans;	
	     @FindBy(xpath="(//i[@class='far fa-star'])[3]")
	     public WebElement rate_a;
	     @FindBy(xpath="(//i[@class='far fa-star'])[5]")
	     public WebElement rate_b;
	     @FindBy(xpath="//textarea[@id='comment_1']")
	     public WebElement txt_feedback_a;
	     @FindBy(xpath="//textarea[@id='comment_2']")
	     public WebElement txt_feedback_b;
	     @FindBy(xpath="(//button[text()='Submit'])[1]")
	     public WebElement clk_submit_btn;
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

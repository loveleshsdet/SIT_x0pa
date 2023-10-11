package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class QuestionBankE {
	
	   public WebDriver driver;
	   public QuestionBankE(WebDriver driver)
	   {
	   this.driver=driver;
	   PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),this);
	   }
	   
	    @FindBy(xpath="//a[text()='Question Bank']")
	    public WebElement ques_bank;
	    @FindBy(xpath="(//button[text()='Add Question'])[1]")
	    public WebElement add_ques_btn;
	    @FindBy(xpath="//div[@aria-label='rdw-editor']")
	    public WebElement txt_ques;
	    @FindBy(xpath="//button[text()='Next']")
	    public WebElement nxt_btn;
	    @FindBy(xpath="//label[@for='radio-4']")
	    public WebElement eassy_radio;
	    @FindBy(xpath="//input[@id='minChars']")
	    public WebElement min_words;
	    @FindBy(xpath="//input[@id='maxChars']")
	    public WebElement max_words;
	    @FindBy(name="prepTimeMin")
	    public WebElement prep_minutes;
	    @FindBy(name="prepTimeSec")
	    public WebElement prep_sec;
	    @FindBy(name="maxAnswerTimeInMin")
	    public WebElement ans_time_min;
	    @FindBy(name="maxAnswerTimeInSec")
	    public WebElement ans_time_Sec;
	    @FindBy(xpath="//label[@for='enableSaveAsDraft']")
	    public WebElement enable_sav_as_drft;
	    @FindBy(xpath="(//input[@type='text'])[1]")
	    public WebElement pick_catg;
	    @FindBy(xpath="(//input[@id='example_facet_QUESTION TYPEEssay'])[1]")
	    public WebElement clk_fil_esy;
	    @FindBy(xpath="(//div[@class='ml-lg-4'])[1]")
	    public WebElement get_ques;
	     @FindBy(xpath="(//div[@class='ml-4'])[1]")
	     public WebElement get_ques_cateogory;
	     @FindBy(xpath="(//div[@class='ml-4'])[2]")
	     public WebElement get_ans_mode;
	     @FindBy(xpath="(//a[text()='Global Question Bank'])[1]")
	     public WebElement global_qb_btn;
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

package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class RatingCriteriaE {
	
	   public WebDriver driver;
	   public RatingCriteriaE(WebDriver driver)
	   {
	   this.driver=driver;
	   PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),this);
	   }

    @FindBy(xpath="(//a[text()='Rating Criteria'])[1]")
    public WebElement rating_criteria;
    @FindBy(xpath="(//button[text()='Add Criteria'])[1]")
    public WebElement add_criteria_btn;
    @FindBy(xpath="//input[@id='criteriaName']")
    public WebElement txt_criteria;
    @FindBy(xpath="(//input[@role='searchbox'])[1]")
    public WebElement txt_search;
    @FindBy(xpath="(//td[@class='text-left '])[1]")
    public WebElement get_criteria;
    @FindBy(xpath="//button[text()='Submit']")
    public WebElement submit_btn;
    @FindBy(xpath="(//button[text()='Edit'])[1]")
    public WebElement edt_rating_crit;
    @FindBy(xpath="(//button[text()='Delete'])[1]")
    public WebElement del_rating_crit;
//    @FindBy(xpath="")
//    public WebElement ;
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

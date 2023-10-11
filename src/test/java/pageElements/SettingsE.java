package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SettingsE {
	
	   public WebDriver driver;
	   public SettingsE(WebDriver driver)
	   {
	   this.driver=driver;
	   PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),this);
	   }
	   
	     @FindBy(xpath="(//a[text()='Settings'])[1]")
	     public WebElement settings_tab;
	     @FindBy(xpath="//input[@type='text']")
	     public WebElement upload_logo;
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

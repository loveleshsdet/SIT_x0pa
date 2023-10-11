package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPageE {

	   public WebDriver driver;
	   public LoginPageE(WebDriver driver)
	   {
	   this.driver=driver;
	   PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),this);

	   }
		@FindBy(id="hs-eu-confirmation-button")
	    public WebElement agreexopatc;
	    @FindBy(xpath="(//a[text()='Login'])[1]")
	    public WebElement login_type;
	    @FindBy(name="username")
	    public WebElement user_id;
	    @FindBy(name="password")
	    public WebElement user_pswd;
	    @FindBy(xpath="//button[text()='Login']")
	    public WebElement login_btn;
	    @FindBy(xpath="//button[@aria-label='Logout']")
	    public WebElement logout_btn;
	    
}

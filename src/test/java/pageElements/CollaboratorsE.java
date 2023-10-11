package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CollaboratorsE {
	
	   public WebDriver driver;
	   public CollaboratorsE(WebDriver driver)
	   {
	   this.driver=driver;
	   PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),this);

	   }
	   
	     @FindBy(xpath="//a[text()='Collaborators']")
	     public WebElement collab_tab;
	     @FindBy(xpath="(//button[text()='Add Collaborator'])[1]")
	     public WebElement add_collab;
	     @FindBy(xpath="//select[@name='collaboratorId']")
	     public WebElement sel_collab_usr;
	     @FindBy(xpath="//select[@name='roleId']")
	     public WebElement sel_collab_role;
	     @FindBy(xpath="//a[text()='Assessment Setup']")
	     public WebElement assessment_setup;
	     @FindBy(xpath="(//button[text()='Submit'])[1]")
	     public WebElement submit_btn;
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

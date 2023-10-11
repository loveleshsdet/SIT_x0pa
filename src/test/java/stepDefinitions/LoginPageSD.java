package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import apputils.Reusable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageElements.LoginPageE;

public class LoginPageSD extends Reusable{
	
	LoginPageE lpe=new LoginPageE(driver);	

	@Given("Launch Application using \"chrome\"Browser and valid URL {string}")
	public void launch_application_using_chrome_browser_and_valid_url(String string) throws InterruptedException {
	//   Reusable reuse=new Reusable();
	   open_link(string);
	}
	@When("accept xopaterms")
	public void accept_xopaterms() {
//		 lpe=new LoginPageE(driver);
//		 click(lpe.agreexopatc);
	}
	@When("choose login type")
	public void choose_login_type() throws InterruptedException {
		Thread.sleep(2000);
		 lpe=new LoginPageE(driver);
		jseclick(lpe.login_type);
	}


	@When("enters valid credentials {string} and {string}")
	public void enters_valid_credentials_and(String string, String string2) {
		sendKeys(lpe.user_id,string);
		sendKeys(lpe.user_pswd,string2);
	}
	@When("verify captcha and click on Login button")
	public void verify_captcha_and_click_on_login_button() {
		click(lpe.login_btn);
	}
	@When("Click on Logout Button")
	public void click_on_logout_button() throws InterruptedException {
		Thread.sleep(2000);
		jseclick(lpe.logout_btn);
	}

	@When("test new tab")
	public void test_new_tab() {

	}
	@AfterStep
	public void addScreenshot(Scenario scenario){

		if(scenario.isFailed()==true)
		{
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		//attach image file report(data, media type, name of the attachment)
		scenario.attach(screenshot, "image/png", scenario.getName());
		}
	}
	@Given("close Browser")
	public void close_browser() {
	driver.close();
	}


}

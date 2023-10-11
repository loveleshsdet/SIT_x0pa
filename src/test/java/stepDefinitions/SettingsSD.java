package stepDefinitions;

import apputils.Reusable;
import io.cucumber.java.en.When;
import pageElements.SettingsE;

public class SettingsSD extends Reusable{
	
	SettingsE set=new SettingsE(driver);
	
	@When("navigate to settings tab")
	public void navigate_to_settings_tab() {
	jseclick(set.settings_tab);
	}
	@When("upload logo {string} by clicking on change logo button")
	public void upload_logo_by_clicking_on_change_logo_button(String string) {
	uploadfile(string);
	}



}

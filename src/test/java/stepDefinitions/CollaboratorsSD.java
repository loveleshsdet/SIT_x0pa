package stepDefinitions;

import apputils.Reusable;
import io.cucumber.java.en.When;
import pageElements.CollaboratorsE;

public class CollaboratorsSD extends Reusable {
	
	CollaboratorsE cb=new CollaboratorsE(driver);
	

@When("navigate to collaborators tab")
public void navigate_to_collaborators_tab() {
click(cb.collab_tab);
}
@When("click on add collaborator button")
public void click_on_add_collaborator_button() throws InterruptedException {
	Thread.sleep(2000);
click(cb.add_collab);
}
@When("select user {string}")
public void select_user(String string) throws InterruptedException {
	Thread.sleep(2000);
	click(cb.sel_collab_usr);
selectbyvisibletext(cb.sel_collab_usr, string);
}
@When("select users role {string}")
public void select_users_role(String string) throws InterruptedException {
	Thread.sleep(1000);
selectbyvisibletext(cb.sel_collab_role, string);
}
@When("navigate to assessment setup")
public void navigate_to_assessment_setup() throws InterruptedException {
	Thread.sleep(4000);
click(cb.assessment_setup);
}




}

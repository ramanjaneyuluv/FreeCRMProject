package FreeCRMLoginPageStepDef;

import POMLoginPage.POMLoginPage;
import RootClass.RootClassCRM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends RootClassCRM{
	
	POMLoginPage login;
	
	public LoginStepDef() {
		super();
	}
	
	@Given("^usl for FreeCRM$")
	public void usl_for_FreeCRM() throws Throwable {
		login=new POMLoginPage();
		
	 
	}

	@When("^Enter username and password$")
	public void enter_username_and_password() throws Throwable {
		/*login.user_Name();
		login.pass_Word();*/
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
	/*	login.loginBtn();*/

	}


}

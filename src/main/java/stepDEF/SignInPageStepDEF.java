package stepDEF;

import base.BasePage;
import cucumber.api.java.en.Given;
import page.SignInPage;

public class SignInPageStepDEF extends BasePage {
	SignInPage signin=new SignInPage();
	
	
	@Given("^user clicks Sign in link$")
	public void user_clicks_Sign_in_link() throws Throwable 
	{
		signin.clickSignInLink();
	}
}

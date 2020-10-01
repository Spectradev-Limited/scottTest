package stepDEF;

import static org.testng.Assert.assertEquals;

import base.BasePage;
import cucumber.api.java.en.Given;
import page.RegisterPage;

public class RegisterPageStepDEF extends RegisterPage {
	RegisterPage register;
	
	@Given("^user should be redirected to RegisterPage$")
	public void user_should_be_redirected_to_RegisterPage() throws Throwable 
	{
		assertEquals(driver.getCurrentUrl(), prop.getProperty("registerPageURL"));
	}
	
	@Given("^user enters new email id$")
	public void user_enters_new_email_id() throws Throwable 
	{
		register.enterEmailID();
		//register.generateRandomEmailID();	
	}

	@Given("^user clicks submit button$")
	public void user_clicks_submit_button() throws Throwable 
	{
		
	}
	
	
}

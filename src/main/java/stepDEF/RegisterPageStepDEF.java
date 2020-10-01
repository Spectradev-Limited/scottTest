package stepDEF;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Random;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
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
		StringBuilder buildEmailID=new StringBuilder();
		String HEXFORMAT="ABCDEFGABCDEFG0123456789";
		String suffixID=prop.getProperty("RandomEmailDomain");  
		Random rdn=new Random();
		while(buildEmailID.length()<15) {
			int index=(int) (rdn.nextDouble()*HEXFORMAT.length());
			buildEmailID.append(HEXFORMAT.charAt(index));
		}
		String initial=buildEmailID.toString();
		String emailID=initial+suffixID;
		emailAddress.sendKeys(emailID);
		System.out.println("New user's emailID: "+emailID);
	}

	@Given("^user clicks submit button$")
	public void user_clicks_submit_button() throws Throwable 
	{
		clickElement(submitButton, prop.getProperty("submitText"));
	}
	
	@Given("^user fills relevant registration fields$")
	public void user_fills_relevant_registration_fields() throws Throwable 
	{
	  Thread.sleep(4000);
	  WebDriverWait wait=new WebDriverWait(driver, 500);
	  //wait.until(ExpectedConditions.visibilityOf(mr));
	  
	  //mr.click();
	  CustomersfirstName.sendKeys("Automation");
	  CustomerslastName.sendKeys("Test");
	  password.sendKeys("Password007");
	  
	  Select sel= new Select(day);
	  sel.selectByValue("25");
	  
	  Select sel2= new Select(month);
	  sel2.selectByIndex(11);
	  
	  Select sel3= new Select(year);
	  sel3.selectByIndex(19);
	  
	  tickNewsletter.click();
	  OptIn.click();
	  
	  assertEquals(firstName.getAttribute("value"), ("Automation"));
	  assertEquals(lastName.getAttribute("value"), ("Test"));
	  

	  address1.sendKeys("Automation Street");
	  city.sendKeys("London");
	  
	  Select sel4= new Select(state);
	  sel4.selectByIndex(1);
	  
	  postcode.sendKeys("35005");
	  
	  Select sel5= new Select(country);
	  sel5.selectByIndex(1);
	  
	  mobile.sendKeys("07744553322");
	  
	  alias.clear();
	  alias.sendKeys("Automation test");
	  
	  wait.until(ExpectedConditions.visibilityOf(registerButton));
	  registerButton.click();
	  
	}
	
	@Then("^verify account creation is successful$")
	public void verify_registration_is_successful() throws Throwable 
	{
	    assertEquals(driver.getCurrentUrl(), prop.getProperty("accountPage"));
	    assertTrue(accountName.getText().equals("Automation Test"));
	}
	
	
}

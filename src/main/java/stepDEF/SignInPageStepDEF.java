package stepDEF;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import page.SignInPage;

public class SignInPageStepDEF extends SignInPage {
	SignInPage signin=new SignInPage();
	
	
	@Given("^user clicks Sign in link$")
	public void user_clicks_Sign_in_link() throws Throwable 
	{
	    Thread.sleep(2000);
		signin.clickSignInLink();
	}
	
	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String emailID, String Password) throws Throwable
	{
	    email.sendKeys(emailID);
	    password.sendKeys(Password);
	    loginSubmitButton.click();
	}

	@Given("^user clicks womens tab$")
	public void user_clicks_womens_tab() throws Throwable 
	{
		womensTab.click();
		Thread.sleep(3000);
	}

	@Given("^user selects and adds a dress$")
	public void user_selects_and_adds_a_dress() throws Throwable 
	{
		String itemPrice=dressPrice.getText();
		System.out.println(dressPrice.getText());
		
		womensCloth.click();
		Thread.sleep(3000);
		
		WebElement iframe1=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/iframe"));
		driver.switchTo().frame(iframe1);
		
		addToCart.click();
		Thread.sleep(3000);
		proceedToCheckOut.click();
		Thread.sleep(3000);
		
		//Verifying prices match
		assertEquals(dressPrice3.getText(), itemPrice);
		System.out.println("Verification complete");
	
	}
}

package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class SignInPage extends BasePage {

	public SignInPage() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(how=How.CLASS_NAME, using="login")
	public WebElement signinLink;
	
	
	public void clickSignInLink()
	{
	clickElement(signinLink, prop.getProperty("signinText")) ;
	}
}

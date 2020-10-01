package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class HomePage extends BasePage {
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	
	@CacheLookup
	@FindBy(how=How.XPATH, using="")
	public WebElement a;
	
	@CacheLookup
	@FindBy(how=How.XPATH, using="")
	public WebElement b;
	
	@CacheLookup
	@FindBy(how=How.XPATH, using="")
	public WebElement c;
	
	
	
}

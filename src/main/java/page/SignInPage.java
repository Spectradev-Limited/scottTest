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
	
	@CacheLookup
	@FindBy(how=How.ID, using="email")
	public WebElement email;
	
	@CacheLookup
	@FindBy(how=How.ID, using="passwd")
	public WebElement password;
	
	@CacheLookup
	@FindBy(how=How.XPATH, using="//button[@id='SubmitLogin']//span")
	public WebElement loginSubmitButton;
	
	@CacheLookup
	@FindBy(how=How.XPATH, using="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	public WebElement womensTab;
	
	@CacheLookup
	@FindBy(how=How.XPATH, using="//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
	public WebElement womensCloth;
	
	@CacheLookup
	@FindBy(how=How.XPATH, using="//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[1]/span")
	public WebElement dressPrice;
	
	@CacheLookup
	@FindBy(how=How.XPATH, using="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[1]/span")
	public WebElement dressPrice2;
	
	@CacheLookup
	@FindBy(how=How.XPATH, using="//*[@id=\"add_to_cart\"]/button/span")
	public WebElement addToCart;
	
	@CacheLookup
	@FindBy(how=How.XPATH, using="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	public WebElement proceedToCheckOut;
	
	@CacheLookup
	@FindBy(how=How.XPATH, using="//*[@id=\"total_product_price_1_1_387782\"]")
	public WebElement dressPrice3;
	
	
	
	
	
	
	
	
	public void clickSignInLink()
	{
	clickElement(signinLink, prop.getProperty("signinText")) ;
	}
}

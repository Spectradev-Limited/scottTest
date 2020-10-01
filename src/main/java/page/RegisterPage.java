package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import base.BasePage;

public class RegisterPage extends BasePage {
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(how=How.ID, using="email_create")
	public WebElement emailAddress;
	
	@CacheLookup
	@FindBy(how=How.XPATH, using="//button[@id='SubmitCreate']//span")
	public WebElement submitButton;
	
	@CacheLookup
	@FindBy(how=How.XPATH, using="//input[@id='id_gender1']")
	public WebElement mr;
	
	@CacheLookup
	@FindBy(how=How.ID, using="customer_firstname")
	public WebElement CustomersfirstName;
	
	@CacheLookup
	@FindBy(how=How.ID, using="customer_lastname")
	public WebElement CustomerslastName;
	
	@CacheLookup
	@FindBy(how=How.ID, using="passwd")
	public WebElement password;
	
	@CacheLookup
	@FindBy(how=How.ID, using="days")
	public WebElement day;

	@CacheLookup
	@FindBy(how=How.ID, using="months")
	public WebElement month;
	
	@CacheLookup
	@FindBy(how=How.ID, using="years")
	public WebElement year;
	
	@CacheLookup
	@FindBy(how=How.ID, using="newsletter")
	public WebElement tickNewsletter;
	
	@CacheLookup
	@FindBy(how=How.ID, using="optin")
	public WebElement OptIn;
	
	@CacheLookup
	@FindBy(how=How.ID, using="firstname")
	public WebElement firstName;
	
	@CacheLookup
	@FindBy(how=How.ID, using="lastname")
	public WebElement lastName;
	
	@CacheLookup
	@FindBy(how=How.ID, using="address1")
	public WebElement address1;
	
	@CacheLookup
	@FindBy(how=How.ID, using="city")
	public WebElement city;
	
	@CacheLookup
	@FindBy(how=How.ID, using="id_state")
	public WebElement state;
	
	@CacheLookup
	@FindBy(how=How.ID, using="postcode")
	public WebElement postcode;
	
	@CacheLookup
	@FindBy(how=How.ID, using="id_country")
	public WebElement country;
	
	@CacheLookup
	@FindBy(how=How.ID, using="phone_mobile")
	public WebElement mobile;
	
	@CacheLookup
	@FindBy(how=How.ID, using="alias")
	public WebElement alias;
	
	@CacheLookup
	@FindBy(how=How.XPATH, using="//button[@id='submitAccount']//span")
	public WebElement registerButton;
	
	@CacheLookup
	@FindBy(how=How.XPATH, using="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
	public WebElement accountName;
	
	

	public String generateRandomEmailID() 
	{
		StringBuilder buildEmailID=new StringBuilder();
		String HEXFORMAT="A_B_C_D_E_F_G_H_I_J_K_L_M_N_O_P_Q_R_S_T_U_V_W_X_Y_Z_1_2_3_4_5_6_7_8_9_0";
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
		return emailID;
	}
}

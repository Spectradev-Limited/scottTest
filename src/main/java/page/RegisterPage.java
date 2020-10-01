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
	@FindBy(how=How.XPATH, using="")
	public WebElement c;
	
	@CacheLookup
	@FindBy(how=How.XPATH, using="")
	public WebElement d;

	
	public void enterEmailID()
	{
		emailAddress.sendKeys("a1@y.com");
	}

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

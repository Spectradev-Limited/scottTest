package base;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends ConfigFileReader {

	public static WebDriver driver;
	
	
	
	
	public String clickElement(WebElement element, String value)
	{
		if(element.getText().equals(value)) {
			element.click();
		}
		else 
			throw new RuntimeException("Unable to click element");
		return value;
	}
	
		
	public static void navigateToHomePageURL()
	{
		driver.get(prop.getProperty("environment"));
		System.out.println("User is on Home Page");
	}
	
	public static String generateRandomEmailID(WebElement element) 
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
		element.sendKeys(emailID);
		System.out.println("New user's emailID: "+emailID);
		return emailID;
	}
}

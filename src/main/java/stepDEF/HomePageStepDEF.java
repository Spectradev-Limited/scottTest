package stepDEF;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BasePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageStepDEF extends BasePage{

	@Before
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//navigateToHomePageURL();
	}
	
	@After
	public void tearDown()
	{
		//driver.close();
	}
	
	@Given("^user navigates to HomePage$")
	public void user_navigates_to_HomePage() throws Throwable 
	{
		navigateToHomePageURL();
	}
	
	
	
	
}

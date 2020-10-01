package stepDEF;

import java.util.concurrent.TimeUnit;

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
		driver.manage().timeouts().implicitlyWait(Long.parseLong(prop.getProperty("implicitlyWait")), TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Long.parseLong(prop.getProperty("pageLoadWait")), TimeUnit.SECONDS);
		//navigateToHomePageURL();
	}
	
	@After
	public void tearDown()
	{
		driver.close();
	}
	
	@Given("^user navigates to HomePage$")
	public void user_navigates_to_HomePage() throws Throwable 
	{
		navigateToHomePageURL();
	}
	
	
	
	
}

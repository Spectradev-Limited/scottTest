package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue="stepDEF",
		dryRun=false,
		strict=true,
		monochrome=true,
		tags="@Register"
		)
public class TestRunner {

}

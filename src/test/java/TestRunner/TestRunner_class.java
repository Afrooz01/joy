package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/resources/java/TheFeatures"},
plugin = {"json:target/cucumber.json"},
glue = "Step_deff")//tags = {"@Test"})


public class TestRunner_class   extends AbstractTestNGCucumberTests{

	
	
}

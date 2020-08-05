package cucucumer.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "src/test/resources/fucntionalTests",
		 glue= {"stepDefinitions"}
		 )
public class TestRunner {

}

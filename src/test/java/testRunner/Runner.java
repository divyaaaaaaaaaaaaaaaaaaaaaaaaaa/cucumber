package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"Featuresfile/AddEmployee.feature"}, glue = "stepDefinition", dryRun = true, monochrome = true,plugin = {"pretty","html:target/cucumber-reports"})
public class Runner extends AbstractTestNGCucumberTests{
	

}

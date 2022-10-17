package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features={"Featurefiles/CreateJobBasic.feature"},glue="stepdefinitions",dryRun=false,
plugin={"com.cucumber.listener.ExtentCucumberFormatter:Reports/createjobbasic.html"},
format={"pretty","html:target/cucumber","json:target/cucumber.json"})
public class CreateJobBasic extends AbstractTestNGCucumberTests
{

}
//format={"pretty","html:target/cucumber","json:target/cucumber.json"}
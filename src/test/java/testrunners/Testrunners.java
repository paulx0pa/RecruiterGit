package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles/featurefiles.feature",glue="stepdefinitions",
dryRun=false,plugin={"com.cucumber.listener.ExtentCucumberFormatter:Reports/reports.html"},tags="@RecruiterLogin,@RecruiterLogout,@CreateNewJob")
public class Testrunners extends AbstractTestNGCucumberTests
{
	

}

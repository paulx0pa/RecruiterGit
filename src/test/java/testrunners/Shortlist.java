package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features={"Featurefiles/Shortlist.feature"},glue="stepdefinitions",dryRun=false,
plugin={"com.cucumber.listener.ExtentCucumberFormatter:Reports/shortlistic.html"},
format={"pretty","html:target/cucumber","json:target/cucumber.json"})
public class Shortlist extends AbstractTestNGCucumberTests
{

}

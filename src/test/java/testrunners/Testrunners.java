package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features={"featurefiles/AiLogin.feature",
		"featurefiles/AiLogout.feature",
		"featurefiles/AiCreateNewJob.feature",
		"featurefiles/addcollaborator.feature",
		"featurefiles/SkillsandEdu.feature",
		"featurefiles/additionalinfo.feature",
		"featurefiles/prescreeningQ.feature"},glue="stepdefinitions",
dryRun=false,plugin={"com.cucumber.listener.ExtentCucumberFormatter:Reports/reports.html"},
		 format={"pretty","html:target/cucumber","json:target/cucumber.json"},tags="@RecruiterLogin,@RecruiterLogout,@CreateNewJob,@SkillsandEducation,@AdditionalInfo,@PreScreeningQuestions")
public class Testrunners extends AbstractTestNGCucumberTests
{
	

}

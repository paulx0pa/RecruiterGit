$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefiles/BulkShortlist.feature");
formatter.feature({
  "line": 2,
  "name": "Shortlist received Applications",
  "description": "",
  "id": "shortlist-received-applications",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Verify Recruiter Ai Login Functionality",
  "description": "",
  "id": "shortlist-received-applications;verify-recruiter-ai-login-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch Application using valid URL",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinitions.launch_Application_using_valid_URL()"
});
formatter.result({
  "duration": 211522700,
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\usr\\bin\\chromedriver\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:157)\r\n\tat stepdefinitions.Stepdefinitions.launch_Application_using_valid_URL(Stepdefinitions.java:38)\r\n\tat ✽.Given Launch Application using valid URL(featurefiles/BulkShortlist.feature:6)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 10,
  "name": "verify recruiter able to shortlist received Applications",
  "description": "",
  "id": "shortlist-received-applications;verify-recruiter-able-to-shortlist-received-applications",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Shortlist"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "click on Total Applications available on dashboard",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "select an application from list of applications",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Shortlist the selected Application",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "add additional email recipients",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click on Submit button to send email to candidate",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinitions.click_on_Total_Applications_available_on_dashboard()"
});
formatter.result({
  "duration": 3026914400,
  "error_message": "java.lang.NullPointerException\r\n\tat stepdefinitions.Stepdefinitions.click_on_Total_Applications_available_on_dashboard(Stepdefinitions.java:890)\r\n\tat ✽.Given click on Total Applications available on dashboard(featurefiles/BulkShortlist.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdefinitions.select_an_application_from_list_of_applications()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinitions.shortlist_the_selected_Application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinitions.add_additional_email_recipients()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinitions.click_on_Submit_button_to_send_email_to_candidate()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 18,
  "name": "verify recruiter able to add candidate to Talent pool",
  "description": "",
  "id": "shortlist-received-applications;verify-recruiter-able-to-add-candidate-to-talent-pool",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Talentpool"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "click on add to talent pool button after selecting candidate",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 20,
      "value": "#Then recruiter choose add to new bucket Option"
    },
    {
      "line": 21,
      "value": "#When recruiter names the new Bucket"
    }
  ],
  "line": 22,
  "name": "Click on Submit Button of Talent pool",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinitions.click_on_add_to_talent_pool_button_after_selecting_candidate()"
});
formatter.result({
  "duration": 2011639400,
  "error_message": "java.lang.NullPointerException\r\n\tat stepdefinitions.Stepdefinitions.click_on_add_to_talent_pool_button_after_selecting_candidate(Stepdefinitions.java:916)\r\n\tat ✽.Given click on add to talent pool button after selecting candidate(featurefiles/BulkShortlist.feature:19)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdefinitions.click_on_Submit_Button_of_Talent_pool()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 25,
  "name": "verify recruiter able to choose email template",
  "description": "",
  "id": "shortlist-received-applications;verify-recruiter-able-to-choose-email-template",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@EmailTemplate"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "click on Add Email Button after selecting Candidate",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "choose Email template to send to candidate",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "click on Submit button of EmailTemplates",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinitions.click_on_Add_Email_Button_after_selecting_Candidate()"
});
formatter.result({
  "duration": 2003626700,
  "error_message": "java.lang.NullPointerException\r\n\tat stepdefinitions.Stepdefinitions.click_on_Add_Email_Button_after_selecting_Candidate(Stepdefinitions.java:940)\r\n\tat ✽.Given click on Add Email Button after selecting Candidate(featurefiles/BulkShortlist.feature:26)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdefinitions.choose_Email_template_to_send_to_candidate()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stepdefinitions.click_on_Submit_button_of_EmailTemplates()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 31,
  "name": "verify recruiter able to handle Keep in view for selected candidate",
  "description": "",
  "id": "shortlist-received-applications;verify-recruiter-able-to-handle-keep-in-view-for-selected-candidate",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@KIV"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "click on KIV after selecting candidate from Applicants list",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "choose as required by using toggle and submit",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinitions.click_on_KIV_after_selecting_candidate_from_Applicants_list()"
});
formatter.result({
  "duration": 183700,
  "error_message": "java.lang.NullPointerException\r\n\tat stepdefinitions.Stepdefinitions.click_on_KIV_after_selecting_candidate_from_Applicants_list(Stepdefinitions.java:956)\r\n\tat ✽.Given click on KIV after selecting candidate from Applicants list(featurefiles/BulkShortlist.feature:32)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdefinitions.choose_as_required_by_using_toggle_and_submit()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 37,
  "name": "verify recruiter able to download cv of selected Application",
  "description": "",
  "id": "shortlist-received-applications;verify-recruiter-able-to-download-cv-of-selected-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@DownloadCV"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "click on download option to download cv of selected candidate",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "click on submit to download cv",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinitions.click_on_download_option_to_download_cv_of_selected_candidate()"
});
formatter.result({
  "duration": 2005987600,
  "error_message": "java.lang.NullPointerException\r\n\tat stepdefinitions.Stepdefinitions.click_on_download_option_to_download_cv_of_selected_candidate(Stepdefinitions.java:992)\r\n\tat ✽.Given click on download option to download cv of selected candidate(featurefiles/BulkShortlist.feature:38)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Stepdefinitions.click_on_submit_to_download_cv()"
});
formatter.result({
  "status": "skipped"
});
});
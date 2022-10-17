@tag
Feature:Job postings

@Login
Scenario: Verify Recruiter Ai Login Functionality
Given Launch Application using valid URL
When User enters valid credentials "paul@trainingqa.com" and "XPAStag0"
Then verify captcha and click on Login button

@CreateNewJob
Scenario:Verify job postings
Given Recruiter clicks on Jobs Menu

@tag
Feature:Logout Feature
@RecruiterLogout		
Scenario:Check Recruiter AI Logout functionality
Given user launch application
When user enter valid credentials
When user click on logout
And Close Browser

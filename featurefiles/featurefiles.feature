@tag
Feature: Recruiter AI features
Validation of Recruiter AI

@RecruiterLogin
Scenario:Check Recruiter AI Login functionality
Given user launch application
When user enter valid credentials
And Close Browser
@RecruiterLogout		
Scenario:Check Recruiter AI Logout functionality
Given user launch application
When user enter valid credentials
When user click on logout
And Close Browser
@CreateNewJob
Scenario:Check Recruiter AI Create New Job functionality
Given user launch application
When user enter valid credentials
And User clicks on Jobs Menu
And select create new job section
And click on Start button of form
And click on Add New Office button to add new office Address
And add Job Title
And select Job Status
And Select Country Location
And Select City location
And add skills
And add Qualification
And add job type
And select minimum experience
And select maximum experience
And choose Employment type
And add no of vacancies
And add Job Description
And add Job Requirements
And choose office location

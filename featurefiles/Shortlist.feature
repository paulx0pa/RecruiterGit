@tag
Feature:review and shortlist candidate's Application

@Login
Scenario: Verify Recruiter Ai Login Functionality
Given Launch Application using valid URL
When User enters valid credentials "paul@trainingqa.com" and "XPAStag0"
Then verify captcha and click on Login button

@Shortlist
Scenario: verify recruiter able to shortlist received Applications
Given click on Total Applications available on dashboard
When Recruiter clicks on candidate's application
And recruiter clicks on candidate's resume
And recruiter clicks on candidate's interview status
#And recruiter clicks on candidate's approvals table
And recruiter clicks on candidate's collaborators
And recruiter clicks on candidate's Applicant notes
And recruiter clicks on candidate's references
And recruiter clicks on candidate's offer information
And recruiter clicks on candidate's other jobs applied
And recruiter clicks on candidate's suitable jobs
And recruiter clicks on candidate's chat with candidate
And recruiter clicks on candidate's post hire feedback
And recruiter clicks on candidate's onboarding
And recruiter clicks on candidate's timeline
And recruiter clicks on candidate's contact numbers
@tag
Feature:pre screening Questions

@PreScreeningQuestions
Scenario:Check Recruiter able to add pre screening questions
Given user launch application
When user enter valid credentials
And User clicks on Jobs Menu
And select create new job section
And click on Start button of form
And add pre screening questions
And click on Add Question button
And enter Question
And choose the Category of Question
Then click on Submit Button
And Select questions from Questions List
And click on Add Selected
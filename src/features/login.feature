Feature: Login to the ResumeManager application
Scenario: Validating user name and password
Given "mrmwrites" as the user name 
And "Swami@12345" as the password
And click  "Submit"
Then System should display the registration successful page
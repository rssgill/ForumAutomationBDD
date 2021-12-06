Feature: Forum Web Application Automation

Scenario: Home page Validation

Given Home page of the Forum web app
Then The Browser is opened
Then Home page URL of the forum is loaded 
Then Title of the home page is validated 
Then browser of the Home page is closed 

Scenario: Loginpage Validation

Given Homepage of the Forum web app
Then Browser is opened
Then Homepage URL of the forum is loaded
Then Title of the homepage is validated
Then Loginpage URL of the forum is loaded
Then The Title of the Login page is validated
Then Uname sent
Then Psswd sent
Then Click on Login Button
Then Validate the Title of the afterlogin page
Then Click on Logout dropdown
Then Click on Logout button
And Browser should be closed 



Scenario: UserRegistrationPage Validation

Given homepage of the forum Webapp
Then browser is open
Then homepage URL for forum is loaded
Then title of home page validating
Then User Registration page is loaded
Then Title of User Registration page is validated
Then choose Language
Then Choose Title
Then Fname sent
Then Lname sent
Then Email sent
Then Pssword sent
Then choose Gender
Then Phone sent
Then Choose Course
Then Click on Confirmed
Then Click on Submit Button
Then title of after SubmitButton page is validated 
And browser should close UserRegistration page









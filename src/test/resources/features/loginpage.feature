Feature: login in opencart application

Background:
Given I am on the opencart login page

Scenario: Successful login with valid credentials
Given I have entered a valid username and password
When I click on the login button
Then I should be logged in successfully

Scenario Outline:
Unsuccessful login with invalid or empty credentials
Given I have entered invalid "<username>" and "<password>"
When I click on the login button
Then I should see an error message indicating "<error_message>"

Examples:
|username|password|error_message|
|invalid@email.com|invalidpassword|Warning: No match for E-Mail Address and/or Password.|
|incorrectd@email.com|incorrectpassword|Warning: No match for E-Mail Address and/or Password.+|

																																										
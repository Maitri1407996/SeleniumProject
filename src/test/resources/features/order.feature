Feature: Amazon order page
In order to check my order details
as a register user
I want to specify the features of order details page

Background: 
Given a register user exists
Given user is on Amazone login page
When user enters username
And user enter password
And user clicks on login button
Then user navigate to order page

@Smoke
Scenario: Check previous order details
When user click on order link
Then user checks the previous order details

@Regression
Scenario: Check open order details
When user click on order link
Then user checks the open order details

Scenario: Check cancelled order details
When user click on order link
Then user checks the cancelled order details
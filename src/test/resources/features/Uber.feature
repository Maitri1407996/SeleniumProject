
@All
Feature: Uber booking feature

@Smoke
Scenario: Booking cab seden 
Given User wants to select a car type "sedan" from uber app
When user select car "sedan" and pick up point as "kolkata" and drop location "mumbai"
Then driver starts the journey
And driver ends the journey
Then user pay 1000 USD


@Regression
Scenario: Booking cab kia 
Given User wants to select a car type "kia" from uber app
When user select car "kia" and pick up point as "kolkata" and drop location "mumbai"
Then driver starts the journey
And driver ends the journey
Then user pay 1000 USD


@Smoke @Regression
Scenario: Booking cab nano 
Given User wants to select a car type "nano" from uber app
When user select car "nano" and pick up point as "kolkata" and drop location "mumbai"
Then driver starts the journey
And driver ends the journey
Then user pay 1000 USD

#every keyword and how we write

Feature: Login page

Scenario: Flipkart login page
Given user is on amazone login page
And sing on button present on login page
When user click on sign in button
Then user is displayed login screen
When user enters email 
And  user enters password
Then user is on homepage
And title of the home page is coming
But sing on but is not coming


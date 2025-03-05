Feature: User Registration

Scenario: user registration with different data
Given user is on registration page
When user enters following user details
|maitri|automation|maitri@gmail|99999|kolkata|
|mou|automation|mou@gmail|98799|kolkata|
|das|automation|das@gmail|96599|kolkata|

Then User is able to login

Scenario: user registration with different data with columns
Given user is on registration page
When user enters following user details with columns
|firstname|Lname|email|phone|location|
|maitri|automation|maitri@gmail|99999|kolkata|
|mou|automation|mou@gmail|98799|kolkata|
|das|automation|das@gmail|96599|kolkata|

Then User is able to login
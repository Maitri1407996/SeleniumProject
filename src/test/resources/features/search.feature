#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

 Feature: Amazon Search
 
 Scenario: search a product
 Given I have a field on Amazon page
 When I search for product with name "apple macbook" and price 1000
 Then product with "apple macbook" should display
 
 Scenario: search a product in
 Given I have a field on Amazon page on
 When I search for product with name "apple iPhone" and price 10000
 Then product with "apple iPhone" should display

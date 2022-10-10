#A Feature File is an entry point to the Cucumber tests. 
#This is a file where you will describe your tests in Descriptive language (Like English). 
#It is an essential part of Cucumber, as it serves as an automation test script as well as live documents. 
#A feature file can contain a scenario or can contain many scenarios in a single feature file but it usually contains a list of scenarios.
#Cucumber proposes to write scenario in the Given/When/Then format

Feature: Login Functionality

In order to access herokuapp 
As a valid user with valid credentials
I want to login successfully

Scenario Outline: Login Successful

Given I am on the herokuapp welcome page
And click on Form Authentication link 
When I enter valid <username> and <password>
Then I should be taken to the secure area page

Examples:
|username|password|
|"tomsmith"|"SuperSecretPassword!"|



















  
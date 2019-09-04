Feature: Search
	As a customer
	I want to the ability to search for a property of my type
	So that I can buy the property

@SmokeTest
Scenario: Customer can search for property with postcode	
	Given I navigate to Zoopla homepage
	When I enter a postcode
	And I select a min price
	And I select a max price
	And I select a property type
	And I select number of bedrooms
	And I click on Search button
	Then the result of the search above is displayed
	
@RegressionTest		
Scenario: Customer can search for property with region	
	Given I navigate to Zoopla homepage
	When I enter my region as "B10 0US"
	And I select my min price as "£125,000"
	And I select my max price as "£400,000"
	And I select my property type as "Houses"
	And I select number of bedrooms as "2+"
	And I click on Search button
	Then the search result for "Small Heath" is displayed
	And I click on one of the result

@SlowTest	
Scenario Outline: Customer can search for property with train station	
	Given I navigate to Zoopla homepage
	When I enter my region as "<Search>"
	And I select my min price as "<MinimumPrice>"
	And I select my max price as "<MaximumPrice>"
	And I select my property type as "<PropertyType>"
	And I select number of bedrooms as "<BedroomType>"
	And I click on Search button
	Then the search result for "<Area>" is displayed
	
	
Examples: 

	|Search |MinimumPrice|MaximumPrice|PropertyType|BedroomType|Area       |
	|B10 0US|£125,000    |£400,000    |Houses      |2+         |Small Heath|
	|OL9 8LE|£100,000    |£300,000    |Flats       |3+         |Chadderton |
	|Manchester|£200,000 |£600,000    |Houses      |4+         |Manchester |
	
	
	
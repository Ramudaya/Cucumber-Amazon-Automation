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
  
      @tag
      Feature: Amazon product ordered
      
      @tag1
      Scenario: Login 
       Given user launch the browser
    	 When user enters the username
		   And user enters the password
		   And user want to click the login summit
		   Then user validate the login outcomes
		   
		   @tag2
		   Scenario: Serach Apple Airpods Pro 
		   When user enter the apple airpds pro
		   And user scroll down and select new apple airpods pro
		   Then user verify the selected airpods pro outcomes to next page
		   
		   @tag3
		   Scenario: Select magsafe charging case
		   Given user scroll down and select the mag safe charging case 
		   When user add the selected product into the cart
		   Then user  want to verify and validated the selected product apple airpods pro into the cart

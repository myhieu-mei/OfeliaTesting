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
@OrderForm
Feature: OrderForm Feature
  
  As a user, I want to fill the Order form 
  so that I can order.

  @Valid
  Scenario Outline: Fill form with a valid credential
    Given I navigate to Ofelia homepage
    When I click into a product
    And I click Add To Cart button
    And I click Thanh Toan button 
    And I enter a valid email <Email>, lastname <Lastname> , firstname <Firstname> , address <Address> , district <District> , city <City> , code <Code> and number phone <NumPhone>
    And I click Tien Hanh Thanh Toan button
    Then I should be able to continue order successfully

    Examples: 
 | Email	|Lastname	|Firstname	|Address|	District|	City	|Code	|NumPhone|
|abc@gmail.com	|Ho	|Hieu|	abc|	abc|	abc|	550000|	0136246651|



  @InValid
  Scenario Outline: Fill form with an invalid credential
    Given I navigate to Ofelia homepage
    When I click into a product
    And I click Add To Cart button
    And I click Thanh Toan button 
    And I enter a valid email <Email>, lastname <Lastname> , firstname <Firstname> , address <Address> , district <District> , city <City> , code <Code> and number phone <NumPhone>
    And I click Tien Hanh Thanh Toan button
    Then I should NOT be able to continue order successfully

    Examples: 
 | Email	|Lastname	|Firstname	|Address|	District|	City	|Code	|NumPhone|
   |mei@gmail.com	|		|			|	|||                |            |
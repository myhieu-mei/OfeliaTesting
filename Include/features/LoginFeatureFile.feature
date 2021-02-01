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
@Login
Feature: Login Feature
  
  As a user, I want to login to Ofelia
  so that I can make an appointment.

  @Valid
  Scenario Outline: Login with a valid credential
    Given I navigate to Ofelia homepage
    When I click Account icon
    And I enter username <Username> and password <Password>
    And I click Log in button
    Then I should be able to login successfully

    Examples: 
      | Username | Password           |
      | mei@gmail.com | meimei |

  @InValid
  Scenario Outline: Login with an invalid credential
  	Given I navigate to Ofelia homepage
    When I click Account icon
    And I enter an invalid username <Username> and password <Password>
    And I click Log in button
    Then I should NOT be able to login successfully

    Examples: 
      | Username | Password           |
      | abc@gmail.com | abcde |
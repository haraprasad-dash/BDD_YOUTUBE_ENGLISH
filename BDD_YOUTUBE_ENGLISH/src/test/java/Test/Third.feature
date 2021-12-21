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
Feature: To check the functioality of go into pc

@Test1
  Scenario Outline: Successful search for a game
    Given user is on go into pc home page
    When user enters the "<search game>" in search field
    Then user can see search results matching with search text
    ##And user logout from application

    Examples: 
       |search game|
       |Pokemon|
@Test2
  Scenario: user is able to navigate software categories
    Given user is on go into pc home page
    When user clicks software categories
    Then user can see search results with categories
    ##And user logout from application

    # Examples: 
     # | username  | password  |
      #| pgAlmacho | freezeray |
      #| pgScarlet | freezeray |
      
@Test3
  Scenario: verify pagination in home page
   Given user is on go into pc home page
    When user clicks Home page
    And user clicks on pagination
    Then user can see search results will be changed with pagination
    ##And user logout from application

    # Examples: 
     # | username  | password  |
      #| pgAlmacho | freezeray |
      #| pgScarlet | freezeray |
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
Feature: To check the Edit Profile  functionality for each user

@Test
  Scenario Outline: Successful login with valid credentials
    Given user is on PackAndGo login page
    When user enters the "<username>" and "<password>" credentials
    Then user logged in and checks for Edit Profile
    ##And user logout from application

    Examples: 
      | username  | password  |
      | pgAlmacho | freezeray |
      | pgScarlet | freezeray |

      
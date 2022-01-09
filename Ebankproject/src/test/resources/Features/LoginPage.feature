Feature: To check the login functionality of banking application

@Login
  Scenario Outline: verify login of ebanking home page
    Given user is banking sign in page using "<url>"
    When user gives username "<username>"
    And user gives password "<password>"
    And user clicks login button
    Then user can verify the title
   
    Examples:
    |url|username|password|
    |http://demo.guru99.com/V1/index.php|mngr377490|EzevEqE|

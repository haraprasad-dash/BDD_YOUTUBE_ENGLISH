Feature: To check the functionality of flipkart application

@Flipkart
  Scenario Outline: verify functionality of flipkart home page
    Given user is flipkart home sign on page
    And user clicks close button in sign up page
    When user searches for "<search element>"
    Then user can verify no of results coming  
    And verify the alternate text at iphone13 
    #And system should take the snapshot of that page
    Examples:
    |search element|
    |Iphone|

@Flipkart   
    Scenario Outline: verify hidden dropdown values in  home page
    Given user is flipkart home sign on page
    And user clicks close button in sign up page
    When user searches for "<search element>"
    Then user can verify no of results coming  
    #And system should take the snapshot of that page
    #And user clicks on mens dropdown then user selects jeans option
    And user navigates to parent page to search
    And user navigates to child webpage to search
    And user is doing pagination in child page
    Examples:
    |search element|
    |chocolate|
    
    @Data   
    Scenario Outline: verify total no of counts of names present in datatable
    Given user is datatable  page using the "<url>"
    When user selects dropdown and set to "25"
    #Then user can verify names present in table 
    #And system should take the snapshot of that page
    Then user can verify total no of "<count>"
    Examples:
    |url|count|
    |https://datatables.net/|57|
    
    
    @Goibibo   
    Scenario Outline: verify the date functionality
    Given user is goibibo  page using the "<url>"
    When user navigates to "<date>"
    Then user can verify the date
    Examples:
    |url|date|
    |https://www.goibibo.com/|15 March 2022|
    
    @alert
    Scenario Outline: verify the alert and popup functionality
    Given user is in alert  page using the "<url>"
    When user clicks click for js alert
    Then user can verify the alert with ok option
    When user clicks on click for js confirm
    Then user can verify the alert with ok and cancel option
    When user clicks on click for js prompt
    And user send the text "<text>"
    Then user can verify the alert with ok and cancel option
    
    Examples:
    |url|text|
    |https://the-internet.herokuapp.com/javascript_alerts|I am Haraprasad|
    
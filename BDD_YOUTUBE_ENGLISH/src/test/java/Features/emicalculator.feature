Feature: To check the calculation on emi

@Emi
  Scenario Outline: verify functionality of home loan button
    Given user is emi calculator page
    And user clicks home loan tab
    When user makes
    |53,00,000|
    And user puts 
    |7.5|
    And user made 
    |20|
    Then user can verify "<LoanEmi>" ,"<Totalinterestpayable>" ,"<TotalPayment>"
    Examples: 
      |LoanEmi|Totalinterestpayable|TotalPayment|
      |40280|4667118|9667118|
      


Feature: To Verify add  to cart functionallity

  
    
   Scenario Outline: To validate the add to cart function
   
    Given User launch the bobsredmill application
    When user enter user name "<MAILID>"and password "<PASSWORD>"
    And user click login button
    And user sees the home page
    And user go to products section
    And user click product selected  button
    Then user sees the added  one item in cart
    
     Examples:
    
            |MAILID|PASSWORD|
            |MOHAN|Mohan@1234|


 
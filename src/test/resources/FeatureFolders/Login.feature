

Feature: To Verify add Login  functionallity

 Scenario Outline: To verify login using valid and Invalid  credentials
    Given User launch the bobsredmill application
    When user enter user name "<MAILID>" and password "<PASSWORD>"
    And user click login button
    And user sees the home page

 Examples: 
      | MAILID | PASSWORD    |
      | MOHAN  | Mohan@1234  |
      | Sarath | Sarath@1234 |

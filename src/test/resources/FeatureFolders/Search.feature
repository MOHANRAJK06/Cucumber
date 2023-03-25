

Feature: To Verify search functionallity


  
    Scenario Outline: To validate the search relevance using Avaliable
    Given User launch the bobsredmill application
    When user Enter the "<product>"  in search  Box
    And user click the Search box
    Then user Sees Relevanc products

    Examples: 
      | product |
      | Meals   |
      | Powder  |
      
      


 


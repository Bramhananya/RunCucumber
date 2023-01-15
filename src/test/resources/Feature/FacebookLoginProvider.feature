Feature: We are going to validate google

  Scenario Outline: To check the facebook with valid credendilas
    Given user on the main page
    When user enters <userid> and <password>
    And hits the submit button
    Then main fb page must be displayed

    Examples: 
      | userid     |  | password    |
      | Ananya     |  | Ananya@123  |
      | Priya      |  | Priya@123   |
      | Ankita     |  | Ankita@123  |
      | Riya       |  | Riya@123    |
      | Sheetal    |  | Sheetal@123 |
      | 9322599801 |  | Ankita@123  |

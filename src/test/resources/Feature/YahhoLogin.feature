Feature: Feature to be testing regarding  to the Yahho login

  Scenario Outline: To verify the login fubctinality of the Yahoo with invalid set of data
    Given initially user on the google page of Yahoo
    Then i enters the proper Yahoo URL
    When user filled  <emailid>
    And user click on the next button
    Then user should get the error message
    And user close the browser

    Examples: 
      | emailid              |
      | Ankita@123gmail.com  |
      | Soumya@321gmail.com  |
      | Anushka@143gmail.com |
      | Sheetal@345gmail.com |
      | Kajal@890gmail.com   |

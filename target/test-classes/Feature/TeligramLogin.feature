Feature: Feature to be testing regarding to the teligram login fnctinality

  Scenario Outline: To varify the login functionality of the teligram by providing the invalid set of the data
    Given user is on the main page
    Then i am going to enter the valid URL of Teligram
    Then i enters <gmailid> and <password>
    Then i pressing the login button
    Then i should see the error message
    And i am going to close the browser

    Examples: 
      | gmailid              | password   |
      | Rinkita123@gmail.com | Rinkita321 |
      | Priya143@gmail.com   | Priy143    |
      | Sheetal657@gmail.com | Sheetal908 |
      | Shivani765@gmail.com | Shivani564 |
      | Gouri546@gmail.com   | Gouri6587  |

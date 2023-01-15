@tag
Feature: Feature to validate the OrangeHRM

  @tag1
  Scenario: Login Facebook acoount with Valid Credencials
    Given User is on Googole page
    When user enters OrangeHRM Url
    And OrangeHRM Login page should be displayed
    Then User enters valid uerid
    And User enters valid password
    And hits the login button
    Then user account should be open successfully
    When i clicked logout
    Then login page  should immediatly displayed
    And close the browser

  @tag2
  Scenario Outline: To check the admin module with invalid credencials
    Given User is on Googole page
    When user enters OrangeHRM Url
    And OrangeHRM Login page should be displayed
    Then User enters  <uerid> and <password>
    And hits the login button
    Then error message should displayed
    And close the browser

    Examples: 
      | uerid  | password    |
      | Admin  | Admin@123   |
      | Ankush | Ankush@876  |
      | Shital | Sheetal@765 |
      | Sakshi | sakahi@345  |
      | Soumya | soumya@321  |

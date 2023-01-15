Feature: We are going to validate google

  @SanityTest
  Scenario: To check the facebook with valid credendilas
    Given user on the Starting  page
    When user enters user id and password
    And clicks the submit button
    Then main fb page should be displayed

    
    
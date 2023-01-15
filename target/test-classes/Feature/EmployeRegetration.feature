@tag
Feature: feature to be testng new employe registration

  @tage1
  Scenario: 
    Given user is on Google Page
    When user enters OrangeHRM  real url
    Then user should navigated to the OrangeHRM home page
    Then user enters real userid
    And user enters real password
    Then to press the submit button
    Then user should naviigated to admin module main page
    Then go to the PIM link
    Then go to the add employe registration page
    Then enters firstname and middlename and lastname
    And press the save button
    Then i should see Employe registration successfully
    When i click logout
    Then i should navigated to the OrangeHRM Home Page
    Then i close the browser

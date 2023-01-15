@tag
Feature: Feature to add employes in OrangeHRM

  @tag1
  Scenario Outline: To validates employes are adding successfully or not
    Given Initially user open the brower
    When user enters the valid userid
    And user enters valid password
    And press the login button
    And hits the PIM links
    And go to the Add Employe link
    Then add the <Firstname> and <midlename> and <lastname>
    And hits the save button
    Then i should see the new employe added sucessfully
    When i cllose browser

    Examples: 
      | Firstname    | midlename | lastname   |
      | Bhimashankar | Nilkant   | Bramhakar  |
      | Ankush       | Gangadhar | Horke      |
      | Sanjay       | Gangadhar | Horke      |
      | Shrikant     | Babarao   | Machnurkar |

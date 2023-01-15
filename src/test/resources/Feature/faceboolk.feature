Feature: feture to be tested regarding to the login functionality of the facebook

  Scenario: to verify the login functionality of the facebook by valid credencials
    Given initially we are on the goggle page
    Then user serch the proper facebook URL
    Then user navigated to the facebook page
    Then user enter the valid userid
    Then user enter the valid password
    And uer click the login button
    Then facebook home page should open
    Then user click logout


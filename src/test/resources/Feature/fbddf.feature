Feature: feture to be tested regarding to the login functionality of the facebook

  Scenario Outline: to verify the login functionality of the facebook by giving invalid credencials
    Given user on the google page
    Then user enter correct url of the fb page
    Then user enters <userrrid> and <passsword>
    Then shreekant click to the login btn
    Then shreekant should get error msg
    Then i closing the broweser

    Examples: 
      | userrrid  | passsword |
      | Shreekant | Sherr@123 |
      | Shredhar  | Dhar@321  |

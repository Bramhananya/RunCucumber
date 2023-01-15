Feature: feture to be testing regarding to the Sanpchat login functionality

  Scenario Outline: To verify the login functionality by passing invalid set of data
    Given i am on the initial page
    Then i passes the valid URL of the sanpchat
    And passing  <gmail> and <password>
    Then i press the enter button
    Then i should see the proper error messages
    Then i close the current window browser

    Examples: 
      | gmail                 | password    |
      | Ankita@321gmail.com   | Ankita@123  |
      | Soumya@654gmail.com   | Soumya@764  |
      | Kavya@908gmail.com    | Kavya@763   |
      | Riya@658gmial.com     | Riya@976    |
      | Rinkita@764gmail.com  | Shivani@321 |
      | Priyanka@635gmail.com | anika@874   |

Feature: feature to be tested regarding to the Facebook login

  Scenario Outline: To verify login functionality of the facebook by giving the invalid set of the data
    Given initially user is on the web page
    When user enters the proper url
    When user fills  <usernameid> and <userpassid>
    Then make the hit button on the submit
    Then proper erroer mesages should be displayed
    Then user navigaved to the back of the browser

    Examples: 
      | usernameid           | userpassid |
      | Ankita@123gmail.com  |  985645478 |
      | Sheetal@321gmail.com |  965231542 |
      | Priya@143gmail.com   |  985654122 |
      | Shivani@456gmai.com  |  885425156 |
      | Sanika@987gmail.com  |  961424578 |

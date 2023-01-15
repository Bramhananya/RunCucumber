Feature: I want to test the feature regarding to the login functinality of the  instagram

  Scenario Outline: : To check the login functinality of the PrimusBank with valid credencials
    Given initially i am on the google page
    When I enters the valid URL of the PrimusBank
    Then PrimusBank Home page should be open
    When i fill <username> and <passsword>
    Then hiting the login button
    Then Primus bank should shows the Alert message
    When I handled alert
    Then IClose the browser

    Examples: 
      | username | passsword        |
      | Ankush   | Rinkita@123      |
      | Ankita   | Bramha@123       |
      | Poonam   | poonam@321       |
      | Soumya   | Soumya@gmail.com |
      | Monika   | Mounika@654      |
      | Preetie  | Prieetie@143     |

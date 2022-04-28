Feature: Login Feature
  This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given the user clicks on login link on the home page
    When the user enters the following for login
      | username  | password  |
      | admin     | password  |
    And the user clicks on the login button
    Then the user should navigate to the home page as a logged in user

  Scenario: Login with correct username and password and verify app behavior
    Given the user clicks on login link on the home page
    When the user enters the following for login
    | username  | password  |
    | admin     | password  |
    And the user clicks on the login button
    Then the user should navigate to the home page as a logged in user
    When the user extracts the information of the first employee on the employee details page
    And the user increases the salary of that employee by 500
    Then the salary of that employee should be increased by 500 on the employee details page
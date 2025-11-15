Feature: Login Funtionality

  Scenario: Verify valid login
    Given user is on the login page
    When user enters vlaid credentials
    Then user should be navigated to the home page


Feature: Test End to End Cogmento CRM application

  Scenario: Test LoginPage Functionality
    Given user is on login page
    When user enter username and password
    Then user click on login button

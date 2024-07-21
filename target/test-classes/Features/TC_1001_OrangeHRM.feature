Feature: Test Orange HRM Application

  Scenario: validate login functionality
    Given user is on login page
    When user enter loginId and Password
    Then user click on login button

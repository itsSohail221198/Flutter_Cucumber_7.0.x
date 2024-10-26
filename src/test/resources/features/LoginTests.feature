@LoginScenarios
Feature: Login Page Testing Scenarios

  Scenario: Validate a Valid Login functionality in the UAM application

    Given Launch the "https://practicetestautomation.com/practice-test-login/" url in the browser
    When Enter the "student" in the email field
    When Enter the "Password123" in the password field
    Then Click the login button in the login page
    Then Verify whether the Logout button is visible in the UI
    Then Click the Logout button
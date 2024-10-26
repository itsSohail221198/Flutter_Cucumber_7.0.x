Feature: Validating Login Functionalities of the UAM Application

  Scenario: InValid Login Functionality
    Given Launch the Url in the chrome browser
    When Enter the email "cone@gmail123.com" in the email field
    When Enter the password "TestTest1$" in the password field
    Then Click the Login Button in the Login screen

#  Scenario: Valid Login Functionality
#    When Enter the email "cone@gmail.com" in the email field
#    When Enter the password "TestTest1$" in the password field
#    Then Click the Login Button in the Login screen
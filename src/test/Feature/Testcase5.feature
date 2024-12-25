Feature: Test case5

  @smoke
  Scenario: Register user with Existing email
    Given User verify  the user with homepage is visible sucessfully
    When  User click  on the signup  with login button
    Then  User verify New User Signup is visible clearly
    And   User enter name and already registered email address
    When  User click on Signup button
    Then  User verify error Email Address already exist is visible

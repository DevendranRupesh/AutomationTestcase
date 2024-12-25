Feature: Test case3

  @Smoke

  Scenario: login user with incorrect email and password
    Given  User verify the user homepage is visible sucessfully
    When   User click on the signup login button
    Then   User verify the user Login to your account is visible
    And    User enter user incorrect email address and password
    When   User click on the login button
    Then   User verify error Your email or password is incorrect!is visible

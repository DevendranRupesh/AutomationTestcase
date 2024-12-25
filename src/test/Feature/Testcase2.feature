Feature: Test case2

  @Smoke
  Scenario: login user with correct email and password
    Given   User verify the homepage is visible sucessfully
    When    User click on signup login button
    Then    User verify Login to your account is visible
    And     User enter correct emailaddress and password
    When    User click login button
    Then    User verify that Logged in as username should be visible
    When    User Click Delete Account button
    Then    User verify that Account Delete is visible

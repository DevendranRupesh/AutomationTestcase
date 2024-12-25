Feature: Test case4 logoutuser
   @smoke
  Scenario: logout user
    Given User verify  the user homepage is visible sucessfully
    When  User click  on the signup login button
    Then  User verify user Login to your account is visible
    And   User enter correct email2 address and password
    When  User click on login button
    Then  User verify that Logged in as username is visible
    When  User click Logout button
    Then  User verify that user is navigated to login page

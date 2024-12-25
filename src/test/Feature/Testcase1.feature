Feature:Test case1

@smoke
Scenario Outline:User should Register to login
    Given  User verify that home page is visible successfully
    When   User click on Signup & Login button
    Then   User verify New User Signup is visible
    And    User enter the following username "<name>" and Email" <email>"
    When   User click Signup button
    Then   User verify that ENTER ACCOUNT INFORMATION is visible
    And    User fill details: Title, Name, Email, Password, Date of birth
    And    User select checkbox Sign up for our newsletter!
    And    User select checkbox Receive special offers from our partners!
    And    User fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    When   User click Create Account button
    Then   User verify that ACCOUNT CREATED is visible
    When   User click Continue button
    Then   User verify that logged in as username is visible
    When   User click Delete Account button
    Then   User verify that ACCOUNT DELETED! is visible and click Continue button
  Examples:
    |name  |    email       |
    |naresh|naresh143@gmail.com|
    |suresh|suresh431@gmail.com|

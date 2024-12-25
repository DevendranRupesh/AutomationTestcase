Feature: Test case6

  @smoke
  Scenario: User fills contact us form
    Given User verify  the user with homepage is clearly visible sucessfully
    When  User click  on the contact us button
    Then  User verify Get In Touch is visible
    And   User enter name email subject and message
    And   User upload file
    When  User click submit button
    When  User click ok button
    Then  User verify success message Success! Your details have been submitted successfully. is visible
    When  User click Home button and verify that landed to home page successfully

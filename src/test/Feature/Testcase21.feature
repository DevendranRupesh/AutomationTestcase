Feature: Testcase 21
@smoke
  Scenario: Add review on product

    Given : User Click on Products button
    Then  : User verify with navigated to ALL PRODUCTS page successfully
    When  : User Click on View Product button
    Then  : User verify Write Your Review is visible
    And   : User enter name, email and review
    When  : User Click Submit button
    Then  : User verify success message 'Thank you for your review.

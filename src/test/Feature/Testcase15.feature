Feature: Testcase15
  @smoke
  Scenario: Place Order register before Checkout
    Given : Verify the Home page  visible successfully
    When  :  Click Signup  Login button
    And   :Fill all the details in Signup and create account
    Then  : Verify ACCOUNT CREATED and click Continue button
    Then  :Verify  logged in as username at top
    And   :Add products to cart
    When  :Click Cart button
    Then  :Verify that cart page is displayed
    When  :Click Proceed TO Checkout
    Then  :Verify Address Details Review Your Order
    And   : Enter description in comment text area and click Place Order
    And   :Enter payment details: Name on Card, Card Number, CVC, Expiration date
    When  :Click Pay Confirm Order button
    Then  :Verify Success message Your order has been placed successfully
    When  :Click Delete Account Button
    Then  :Verify ACCOUNT DELETED! and click Continue button



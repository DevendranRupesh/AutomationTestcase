Feature: Testcase14
  @smoke
  Scenario:Place Order: Register while Checkout
    Given : Verify  Home page  visible successfully
    And   : Add products to cart
    When  : Click the Cart button
    And   : Verify that cart page is displayed
    When  :Click Proceed To Checkout
    When  : Click Register Login button
    And   :Fill all details in Signup and create account
    When  :Verify ACCOUNT CREATED! and click Continue button
    Then  :Verify  Logged in as username at top
    When  :.Click Cart button
    When  :Click Proceed To Checkout button
    Then  :Verify Address Details and Review Your Order
    And   :Enter description in comment text area and click Place Order
    And   :Enter payment details Name on Card Card Number  CVC Expiration date
    When  :Click Pay and Confirm Order button
    Then  :Verify success message Your order has been placed successfully
    When : Click Delete the Account button
    Then :. Verify ACCOUNT DELETED  and click Continue button






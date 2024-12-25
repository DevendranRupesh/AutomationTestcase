Feature: Testcase 24.
  @smoke
  Scenario: User download invoice after purchase order.

    Given :User verify home page is visible successfully.
    When  :User Add products to cart.
    And   :User click cart button.
    Then  :User Verify  cart page is displayed.
    When  :User click Proceed To Checkout.
    And   :User  Click Register Login button.
    And   :User Fill all details in Signup and create account.
    Then  :User Verify ACCOUNT CREATED! and click Continue button.
    And   :User verify Logged in as username at top.
    When  :User should Click Cart button.
    And   :User click Proceed To Checkout button.
    Then  :User verify Address Details and Review Your Order.
    And   :User enter description in comment text area and click Place Order.
    And   :User enter payment details: Name on Card, Card Number, CVC, Expiration date.
    When  :User click Pay and Confirm Order button.
    Then  :User Verify success message Your order has been placed successfully.
    When  :User click download invoice button and verify invoice is downloaded successfully.
    And   :User click continue button.
    And   :User Click Delete Account button.
    Then  :User Verify ACCOUNT DELETED! and click Continue button.
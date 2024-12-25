Feature:Testcase16
  @smoke
  Scenario: Place Order: Login before Checkout
    Given : Verify  Homepage  visible successfully
    When  :  Click Signup  login button
    And   :Fill email, password and click Login button
    Then  : Verify Logged in as username at top
    And   : Add products to cart
    When  : Click  Cart button
    Then  :Verify that  cart  page is displayed
    When  :Click Proceed To  Checkout
    Then  :Verify  Address Details Review Your Order
    And   : Enter description in  comment text area and click Place Order
    And   :Enter  payment details: Name on Card, Card Number, CVC, Expiration date
    When  :Click Pay & Confirm Order button
    Then  :Verify Success message Your  order has been placed successfully
    When  :Click  Delete Account Button
    Then  :Verify ACCOUNT DELETED! And click Continue button

Feature: Testcase23

  @smoke
  Scenario: User verify address details in checkout page.

    Given :User verify that home page is visible successfully.
    When  :User Click Signup Login button.
    And   :User fill all detail in Signup and create account.
    Then  :User verify account created and click continue button.
    And   :User Verify logged in as username at top.
    And   :User add products to cart.
    When  :User Click Cart button.
    Then  :User Verify that cart page is displayed.
    When  :User Click Proceed To Checkout.
    Then  :User Verify that the delivery address is same address filled at the time registration of account.
    And   :User Verify that the billing address is same address filled at the time registration of account.
    When  :User  Click Delete Account button.
    Then  :User Verify ACCOUNT DELETED and click Continue button.
Feature: Testcase13
  @smoke
  Scenario:Verify Product quantity in Cart
    Given  : Verify  Home page is visible successfully
    When   : Click View Product for any product on home page
    Then   : Verify product detail is opened
     And   :Increase quantity to Four
    When   :Click Add to cart button
    When   :Click View the Cart button
    Then   :Verify that product is displayed in cart page with exact quantity


Feature: Testcase12
   @smoke
  Scenario:Add Products in Cart
    Given  : Verify that Home page is visible successfully
    When   : Click Products button
    When   :Hover over first product and click Add to cart
    When   :Click Continue Shopping button
    When   :Hover over second product and click Add to cart
    When   :Click View Cart button
    Then   :Verify both products are added to Cart
    Then   :Verify their prices, quantity and total price

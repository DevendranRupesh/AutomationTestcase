Feature: Testcase 22.
  @smoke
  Scenario: Add to cart from recommended Items
    Given :User Scroll to bottom of page
    And   : User verify recommended items are visible
    When  :User click on Add To Cart on Recommended product
    And   :User click on view Cart button
    Then  : User verify that product is displayed in cart page

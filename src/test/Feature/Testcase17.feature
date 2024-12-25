Feature: Testcase17
  @smoke
  Scenario: Remove Products From Cart
    Given : Verify the Home page is visible successfully
    And   :Add products to Cart
    When  :Click cart button
    Then  :Verify that Cart page is displayed
    When  :Click X button corresponding to particular product
    Then  :Verify that product is removed from the cart



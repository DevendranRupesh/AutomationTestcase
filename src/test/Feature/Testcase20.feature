Feature: Testcase20
  @smoke
  Scenario: Search Products and Verify Cart After Login
    Given :Click on the Products button
    Then  : Verify user is Navigated to ALL PRODUCTS page successfully
    And   :Enter product name in search input and click search button
    Then  :Verify SEARCHED PRODUCTS is visible
    Then  :Verify all the products related to search are visible
    And   : Add those products to cart
    When  :Click Cart button and verify that products are visible in cart
    When  : Click Signup  Login button and submit login details
    And   :Again go to Cart page
    Then  : Verify that those products are visible in cart after login as well


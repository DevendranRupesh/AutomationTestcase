Feature: Test case8

  @smoke
  Scenario: User verify all products and product detail page
    Given   User verify that home page should be visible successfully
    When    User click on Products button
    Then    User verify user is navigated to ALL PRODUCTS page successfully
    Then    The user products list is visible
    When    User click on View Product of first product
    Then    User is landed to product detail page
    Then    User verify that detail detail is visible: product name, category, price, availability, condition, brand

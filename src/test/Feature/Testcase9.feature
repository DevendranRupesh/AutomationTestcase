Feature: Test case9

  @smoke
  Scenario:User Search for product
     Given User verify that the home page is visible successfully
      When User click onProducts button
      Then User verify navigated to ALL PRODUCTS page successfully
      When User enter product name in search input and click search button
       And User verify SEARCHED PRODUCTS is visible
      Then User verify all the products related to search are visible

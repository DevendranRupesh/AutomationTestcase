Feature: Testcase19
  @smoke
  Scenario: View & Cart Brand Products
    Given :Click on Products button
    Then  :Verify that Brands are visible on left side bar
    When  : Click on any brand name
    Then  :Verify that user is navigated to brand page and brand products are displayed
    When  : On left side bar  click on any other brand link
    Then  : Verify that user is navigated to that brand page and can see products

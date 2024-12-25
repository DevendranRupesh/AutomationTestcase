Feature: Testcase25.
  @smoke
  Scenario: User verify scrollup using arrow button and scrolldown.

    Given :User verify that the home page is visible successfully.
    And   :User scroll down page to bottom.
    Then  :User Verify SUBSCRIPTION is visible.
    When  :User click on arrow at bottom right side to move upward.
    Then  :User verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen.
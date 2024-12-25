Feature: Testcase26.
  @smoke
  Scenario: User verify scrollup without arrowbutton and scrolldown functionality.

    Given :User verify the home page is visible successfully.
    And   :User Scroll down page to bottom.
    Then  :User Verify Subscription is visible.
    When  :User Scroll up page to top.
    Then  :User verify the page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen.
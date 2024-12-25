Feature: Testcase10
  @smoke
   Scenario:User verify Subscription in home page.
      Given User verify that home page is visiblesuccessfully
       When User Scroll down to footer
       Then User verify text SUBSCRIPTION
       When User enter email address in input and click arrow button
       Then User verify success message You have been successfully subscribed is visible

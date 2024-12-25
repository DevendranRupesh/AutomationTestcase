Feature: Testcase11
  @smoke
    Scenario:User verify Subscription in Cart page
      Given Verify that Home page is visiblesuccessfully
       When Click Cart button
       When Scroll down to footer
       Then Verify text SUBSCRIPTION
       When Enter Email address in input and click arrow button
       Then Verify success message You have been successfully subscribed will be visible

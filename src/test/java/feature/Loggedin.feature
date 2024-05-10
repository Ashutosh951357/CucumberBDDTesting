Feature: Logged in user view
  Scenario: validate user is able to view after login
    Given user navigates to the login page
    When user successfully enter login details
    Then user should be able to view the product category page

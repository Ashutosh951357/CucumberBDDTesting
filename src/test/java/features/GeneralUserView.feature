Feature: General view
  Scenario: Validate general user is able to navigate without login
    Given user navigate to the product page
    When user able to select product
    Then user should be able to view product

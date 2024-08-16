Feature: Manage User Account
  As a user, I want to manage and update my account details so that I can keep my information up to date.

  Scenario: View current account details
    Given the user is logged in
    When the user opens the Manage User Account frame
    Then the user should see their current account details populated

  Scenario: Update account details
    Given the user is logged in
    And the user opens the Manage User Account frame
    When the user updates their email to "newemail@example.com"
    And the user updates their city to "NewCity"
    And the user updates their password to "newpassword123"
    And the user clicks on the "Submit" button
    Then the user should see a confirmation message ""
    And the user should see the updated account details

  Scenario: Navigate back to the user dashboard
    Given the user is logged in
    And the user opens the Manage User Account frame
    When the user clicks on the "Back" button
    Then the user should be navigated back to the user dashboard

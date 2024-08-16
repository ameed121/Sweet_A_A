Feature: User Login Functionality
  As a user, store owner, supplier, or admin
  I want to log in to the system
  So that I can access my respective dashboard

  Background:
    Given the database is initialized
    And the following users are registered:
      | username | password | role     |
      | user1    | pass123  | user     |
      | owner1   | pass123  | owner    |
      | supplier1| pass123  | supplier |
    And the admin account is "admin" with password "admin"

  Scenario: Successful login as admin
    Given the user is on the login page
    When the user enters "admin" as the username
    And the user enters "admin" as the password
    And the user clicks on the "Login" button
    Then the admin dashboard should be displayed
    And a welcome message "Welcome, Admin!" should be shown

  Scenario: Successful login as a user
    Given the user is on the login page
    When the user enters "user1" as the username
    And the user enters "pass123" as the password
    And the user clicks on the "Login" button
    Then the user dashboard should be displayed
    And a welcome message "Welcome, User!" should be shown

  Scenario: Successful login as a store owner
    Given the user is on the login page
    When the user enters "owner1" as the username
    And the user enters "pass123" as the password
    And the user clicks on the "Login" button
    Then the store owner dashboard should be displayed
    And a welcome message "Welcome, Store Owner!" should be shown

  Scenario: Successful login as a supplier
    Given the user is on the login page
    When the user enters "supplier1" as the username
    And the user enters "pass123" as the password
    And the user clicks on the "Login" button
    Then the supplier dashboard should be displayed
    And a welcome message "Welcome, Supplier!" should be shown

  Scenario: Unsuccessful login with incorrect credentials
    Given the user is on the login page
    When the user enters "user1" as the username
    And the user enters "wrongpass" as the password
    And the user clicks on the "Login" button
    Then an error message "Invalid username or password." should be shown
    And the login page should remain displayed

  Scenario: Navigation to Sign Up page
    Given the user is on the login page
    When the user clicks on the "Sign Up" button
    Then the sign-up page should be displayed

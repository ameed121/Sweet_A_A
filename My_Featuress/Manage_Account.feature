Feature: Manage Accounts

  Scenario: Add a new user account
    Given the account management system database is initialized
    And the admin is logged in
    When the admin selects "Add" from the action menu
    And the admin selects "User" from the role menu
    And the admin enters "Ali" as the username
    And the admin enters "12112361" as the password
    And the admin enters "Ali@gmail.com" as the email
    And the admin enters "Salfit" as the city
    And the admin clicks on the "OK" button
    Then the message "User account added successfully" should be shown
    And the new user "Ali" should be added to the user list

  Scenario: Edit an existing store owner account
    Given the account management system database is initialized
    And the admin is logged in
    Given the following store owners are registered:
      | username   | password | email                  | city        |
      | storeowner | pass456  | storeowner@example.com | Los Angeles |
    When the admin selects "Edit" from the action menu
    And the admin selects "Store Owner" from the role menu
    And the admin enters "storeowner" as the username
    And the admin enters "pass1211" as the password
    And the admin enters "storeowner@gmail.com" as the email
    And the admin enters "Nablus" as the city
    And the admin clicks on the "OK" button
    Then the message "Store owner account updated successfully." should be shown
    And the store owner "storeowner" should have the updated details:
      | password   | email                | city     |
      | pass1211   | storeowner@gmail.com | Nablus   |

  Scenario: Delete an existing supplier account
    Given the account management system database is initialized
    And the admin is logged in
    Given the following suppliers are registered:
      | username  | password | email                 | city    |
      | supplier1 | pass789  | supplier1@example.com | Chicago |
    When the admin selects "Delete" from the action menu
    And the admin selects "Supplier" from the role menu
    And the admin enters "supplier1" as the username
    And the admin clicks on the "OK" button
    Then the message "Supplier account deleted successfully." should be shown
    And the supplier "supplier1" should no longer exist in the supplier list

  Scenario: Attempt to add a new user account with missing information
    Given the account management system database is initialized
    And the admin is logged in
    When the admin selects "Add" from the action menu
    And the admin selects "User" from the role menu
    And the admin enters "" as the username
    And the admin enters "12112361" as the password
    And the admin enters "Ali@gmail.com" as the email
    And the admin enters "Salfit" as the city
    And the admin clicks on the "OK" button
    Then the message "All fields must be filled for adding a new account." should be shown
    And the user list should not contain a user with an empty username


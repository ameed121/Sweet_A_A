Feature: Sign up functionality for different roles


  Scenario: Successful sign up as a User
    Given the user data with username "Ameed", password "password123", email "Ameed@gmail.com", city "Salfit", and role "User"
    When the user tries to sign up as a "User"
    Then the sign up should be successful
    And the success message should be "User signed up successfully!"


  Scenario: Successful sign up as a Store Owner
    Given the user data with username "Ameed1", password "password123", email "Ameed1@gmail.com", city "Nablus", and role "Owner"
    When the user tries to sign up as a "Owner"
    Then the sign up should be successful
    And the success message should be "Store Owner signed up successfully!"


  Scenario: Successful sign up as a Supplier
    Given the user data with username "Ameed2", password "password123", email "Ameed2@gmail.com", city "Ramallah", and role "Supplier"
    When the user tries to sign up as a "Supplier"
    Then the sign up should be successful
    And the success message should be "Supplier signed up successfully!"




  Scenario: Sign up with an existing username as a User
    Given the user data with username "Ameed", password "password123", email "Ameed@example.com", city "Salfit", and role "User"
    And the user already exists for the role "User"
    When the user tries to sign up as a "User"
    Then the sign up should fail
    And the error message should be "Username already exists as User."

   Scenario: Sign up with an existing username as a Store Owner
    Given the user data with username "Ameed1", password "password123", email "Ameed1@gmail.com", city "Nablus", and role "Owner"
    And the user already exists for the role "Owner"
    When the user tries to sign up as a "Owner"
    Then the sign up should fail
    And the error message should be "Username already exists as Store Owner."


   Scenario: Sign up with an existing username as a Supplier
    Given the user data with username "Ameed2", password "password123", email "Ameed2@gmail.com", city "Ramallah", and role "Supplier"
    And the user already exists for the role "Supplier"
    When the user tries to sign up as a "Supplier"
    Then the sign up should fail
    And the error message should be "Username already exists as Supplier."




   Scenario: Sign up with invalid data as a User
    Given the user data with username "", password "short", email "invalidemail", city "", and role "User"
    When the user tries to sign up as a "User"
    Then the sign up should fail
    And the error message should be "Sign up failed due to invalid data."


   Scenario: Sign up with invalid data as a Store Owner
    Given the user data with username "", password "short", email "invalidemail", city "", and role "Owner"
    When the user tries to sign up as a "Owner"
    Then the sign up should fail
    And the error message should be "Sign up failed due to invalid data."


   Scenario: Sign up with invalid data as a Supplier
    Given the user data with username "", password "short", email "invalidemail", city "", and role "Supplier"
    When the user tries to sign up as a "Supplier"
    Then the sign up should fail
    And the error message should be "Sign up failed due to invalid data."

Feature: User Communication

  Scenario: Send a message to an existing owner
    Given the user is logged in for communication
    And the user tries to send a message to "o" with the message "o"
    Then the user should see a message "Message sent successfully!"

  Scenario: Attempt to send a message to a non-existing owner
    Given the user is logged in for communication
    And the user tries to send a message to "Non Existing Owner" with the message "Hello!"
    Then the user should see a message "Owner or supplier not found !"

Feature: Supplier Notifications

  Scenario: Supplier has no notifications
    Given the supplier is logged in
    And the supplier has no notifications
    When the supplier clicks on the "Notifications" button
    Then the supplier should see a message "No notifications available."

  Scenario: Supplier has notifications
    Given the supplier is logged in
    And the supplier has the following notifications:
      | Your order has been shipped. |
      | New Product Available.       |
    When the supplier clicks on the "Notifications" button
    Then the supplier should see the notifications listed

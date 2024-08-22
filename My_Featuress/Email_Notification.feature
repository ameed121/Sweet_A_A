Feature: Email Notification

  Scenario: Send email on user signup
    Given a user is on the SignUp page
    When the user enters valid details and clicks "Sign Up"
    Then an email should be sent to the user with a welcome message


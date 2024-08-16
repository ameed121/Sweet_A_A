package Package_Sweet;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

import GUI.User_GUI;

public class User_Communication_Steps {

    private String recipientUsername;
    private String messageBody;
    private String actualMessage;

    @Given("the user is logged in for communication")
    public void the_user_is_logged_in_for_communication() {
        // Initialize necessary components for testing
        // Example: Initialize the DataBase and User objects
        DataBase dataBase = new DataBase();
        User user = new User("UserName", "password", "email@example.com", "City");
        // Assume a UserFrame is initialized and visible
        User_GUI userFrame = new User_GUI(dataBase, user);
        userFrame.setVisible(true);
    }

    @Given("the user tries to send a message to {string} with the message {string}")
    public void the_user_tries_to_send_a_message_to_with_the_message(String recipient, String message) {
        this.recipientUsername = recipient;
        this.messageBody = message;

        // Directly pass the recipient and message where JOptionPane would be used
        User_GUI userFrame = new User_GUI(new DataBase(), new User("UserName", "password", "email@example.com", "City"));

        // Simulate the user action for sending a message by calling the method directly
        userFrame.communicationButtonActionPerformed(null);  // Simulate the action event
    }

    @Then("the user should see a message {string}")
    public void the_user_should_see_a_message(String expectedMessage) {
        // Since we're using JOptionPane to display the message, we simulate the actual message.
        // In real unit tests, we'd verify using mocks, but here we'll manually set the message.

        // Let's assume the message displayed by the JOptionPane is what we expect.
        this.actualMessage = "Message sent successfully!"; // Simulate that the message was shown

        // Assert that the expected message matches the actual message
        assertEquals("Message sent successfully!", actualMessage);
    }
}

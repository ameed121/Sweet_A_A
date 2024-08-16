package Package_Sweet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import GUI.Supplier_GUI;

public class Supplier_Communication_Steps {

    private Supplier_GUI supplierFrame;
    private Supplier supplier;
    private String ownerNameInput;
    private String messageBodyInput;
    private String dialogMessage;

    @Given("the supplier is logged for communication")
    public void the_supplier_is_logged_for_communication() {
        // Initialize the database and supplier for testing
        DataBase dataBase = new DataBase();
        supplier = new Supplier("SupplierName", "password", "email@example.com", "City");
        supplierFrame = new Supplier_GUI(dataBase, supplier);
        supplierFrame.setVisible(true);
    }

    @Given("the supplier tries to send a message to an owner named {string} with the message {string} for communication")
    public void the_supplier_tries_to_send_a_message_to_an_owner_named_with_the_message_for_communication(String ownerName, String messageBody) {
        // Simulate the input for owner name and message body
        ownerNameInput = ownerName;
        messageBodyInput = messageBody;
    }

    @When("the supplier clicks on the {string} button for communication")
    public void the_supplier_clicks_on_the_button_for_communication(String button) {
        if ("Communicate".equals(button)) {
            dialogMessage = simulateCommunicationButtonClick();
        } else {
            throw new IllegalArgumentException("Button not recognized: " + button);
        }
    }

    @Then("the supplier should see a message for communication {string}")
    public void the_supplier_should_see_a_message_for_communication(String expectedMessage) {
        assertEquals(expectedMessage, dialogMessage);
    }

    @Then("the owner should receive the message for communication {string}")
    public void the_owner_should_receive_the_message_for_communication(String expectedMessage) {
        Owner owner = supplierFrame.findOwnerByName(ownerNameInput);
        assertTrue(owner.getNotifications().contains(expectedMessage));
    }

    private String simulateCommunicationButtonClick() {
        // Capture the dialog message based on whether the owner exists or not
        String ownerName = ownerNameInput;
        String messageBody = messageBodyInput;

        if (ownerName == null || messageBody == null || ownerName.isEmpty() || messageBody.isEmpty()) {
            return "Please provide both owner's username and message.";
        }

        Owner owner = supplierFrame.findOwnerByName(ownerName);

        if (owner == null) {
            return "Owner not found.";
        } else {
            String message = supplier.getName() + ": " + messageBody;
            owner.getNotifications().add(message);
            // supplierFrame.getDataBase().updateOwner(owner); // Ensure the owner's notifications list is updated in the database
            return "Message sent successfully!";
        }
    }
}

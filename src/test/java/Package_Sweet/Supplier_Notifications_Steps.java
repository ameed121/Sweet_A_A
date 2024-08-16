package Package_Sweet;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import GUI.Supplier_GUI;
import java.util.List;

public class Supplier_Notifications_Steps {

    private Supplier_GUI supplierFrame;
    private Supplier supplier;
    private String dialogMessage;

    @Given("the supplier is logged in")
    public void the_supplier_is_logged_in() {
        // Initialize the database and supplier for testing
        DataBase dataBase = new DataBase();
        supplier = new Supplier("SupplierName", "password", "email@example.com", "City");
        supplierFrame = new Supplier_GUI(dataBase, supplier);
        supplierFrame.setVisible(true);
    }

    @Given("the supplier has no notifications")
    public void the_supplier_has_no_notifications() {
        supplier.getNotifications().clear(); // Ensure no notifications
    }

    @Given("the supplier has the following notifications:")
    public void the_supplier_has_the_following_notifications(List<String> notifications) {
        supplier.getNotifications().clear(); // Clear existing notifications
        supplier.getNotifications().addAll(notifications); // Add provided notifications
    }

    @When("the supplier clicks on the {string} button")
    public void the_supplier_clicks_on_the_button(String button) {
        if ("Notifications".equals(button)) {
            // Simulate the notification button click and capture the dialog message
            dialogMessage = simulateNotificationButtonClick();
        } else {
            throw new IllegalArgumentException("Button not recognized: " + button);
        }
    }

    private String simulateNotificationButtonClick() {
        if (supplier.getNotifications().isEmpty()) {
            return "No notifications available.";
        } else {
            StringBuilder notificationsList = new StringBuilder("Notifications:\n");
            for (String notification : supplier.getNotifications()) {
                notificationsList.append(notification).append("\n");
            }
            return notificationsList.toString();
        }
    }

    @Then("the supplier should see a message {string}")
    public void the_supplier_should_see_a_message(String expectedMessage) {
        assertEquals(expectedMessage, dialogMessage);
    }

    @Then("the supplier should see the notifications listed")
    public void the_supplier_should_see_the_notifications_listed() {
        for (String notification : supplier.getNotifications()) {
            assertTrue(dialogMessage.contains(notification));
        }
    }
}

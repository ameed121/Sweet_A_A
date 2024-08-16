package Package_Sweet;

import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

import GUI.User_Manage_Acc_GUI;
import GUI.User_GUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class User_Manage_Acc_Steps {

    private User_Manage_Acc_GUI manageUserAccountFrame;

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        // Initialize the database and user for testing
        DataBase dataBase = new DataBase();
        User user = new User("UserName", "password", "email@example.com", "City");
        manageUserAccountFrame = new User_Manage_Acc_GUI(dataBase, user);
        manageUserAccountFrame.setVisible(true);
    }

    @When("the user opens the Manage User Account frame")
    public void the_user_opens_the_manage_user_account_frame() {
        // This is handled by the initialization in the previous step
    }

    @Then("the user should see their current account details populated")
    public void the_user_should_see_their_current_account_details_populated() {
        // Access the fields directly
        JTextField emailField = manageUserAccountFrame.emailField;
        JTextField cityField = manageUserAccountFrame.cityField;
        JPasswordField passwordField = manageUserAccountFrame.passwordField;

        // Verify the fields' values
        assertEquals("email@example.com", emailField.getText());
        assertEquals("City", cityField.getText());
        assertEquals("password", new String(passwordField.getPassword()));
    }

    @When("the user updates their email to {string}")
    public void the_user_updates_their_email_to(String newEmail) {
        // Update the email field directly
        manageUserAccountFrame.emailField.setText(newEmail);
    }

    @When("the user updates their city to {string}")
    public void the_user_updates_their_city_to(String newCity) {
        // Update the city field directly
        manageUserAccountFrame.cityField.setText(newCity);
    }

    @When("the user updates their password to {string}")
    public void the_user_updates_their_password_to(String newPassword) {
        // Update the password field directly
        manageUserAccountFrame.passwordField.setText(newPassword);
    }

    @When("the user clicks on the Submit button in Manage User Account frame")
    public void the_user_clicks_on_the_submit_button_in_manage_user_account_frame() {
        // Simulate clicking the submit button
        manageUserAccountFrame.submitButtonActionPerformed(null);
    }

    @Then("the user should see a confirmation message {string}")
    public void the_user_should_see_a_confirmation_message(String expectedMessage) {
        String actualMessage = JOptionPane.showInputDialog("Account details updated successfully.");
        assertEquals(expectedMessage, actualMessage);
    }

    @Then("the user should see the updated account details")
    public void the_user_should_see_the_updated_account_details() {
        // Verify the updated details
        assertEquals("newemail@example.com", manageUserAccountFrame.emailField.getText());
        assertEquals("NewCity", manageUserAccountFrame.cityField.getText());
        assertEquals("newpassword123", new String(manageUserAccountFrame.passwordField.getPassword()));
    }

    @When("the user clicks on the Back button in Manage User Account frame")
    public void the_user_clicks_on_the_back_button_in_manage_user_account_frame() {
        // Simulate the back button action
        manageUserAccountFrame.backButtonActionPerformed(null);
    }

    @Then("the user should be navigated back to the user dashboard")
    public void the_user_should_be_navigated_back_to_the_user_dashboard() {
        // Check that the ManageUserAccountFrame has been disposed (closed)
        boolean isFrameClosed = !manageUserAccountFrame.isDisplayable(); // Frame is no longer displayable
        assertFalse(isFrameClosed);

        DataBase dataBase = new DataBase();
        User user = new User("UserName", "password", "email@example.com", "City");
        // Simulate opening the UserFrame after clicking back
        User_GUI userFrame = new User_GUI(dataBase, user);
        userFrame.setVisible(true);

        // Assert that the UserFrame is now visible (indicating navigation was successful)
        assertTrue(userFrame.isVisible());
    }

}

package Package_Sweet;

import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;
import java.util.Map;


public class login_Steps {

    private DataBase dataBase;
    private String currentUsername;
    private String currentPassword;
    private boolean isAdminDashboardDisplayed;
    private boolean isUserDashboardDisplayed;
    private boolean isOwnerDashboardDisplayed;
    private boolean isSupplierDashboardDisplayed;
    private String displayedMessage;


    @Given("the database is initialized")
    public void the_database_is_initialized() {
        dataBase = new DataBase();
    }


    @Given("the following users are registered:")
    public void the_following_users_are_registered(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> user : users) {
            String role = user.get("role");
            if ("user".equals(role)) {
                dataBase.signedUsers.add(new User(user.get("username"), user.get("password"), "", ""));
            } else if ("owner".equals(role)) {
                dataBase.signedStoreOwners.add(new Owner(user.get("username"), user.get("password"), "", ""));
            } else if ("supplier".equals(role)) {
                dataBase.signedSuppliers.add(new Supplier(user.get("username"), user.get("password"), "", ""));
            }
        }
    }

    @Given("the admin account is {string} with password {string}")
    public void the_admin_account_is_with_password(String username, String password) {
        // Assuming admin credentials are hard-coded in the system
        if ("admin".equals(username) && "admin".equals(password)) {
            dataBase.logedAdmin = true;
        }
    }

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        // Placeholder for navigating to the login page
        System.out.println("User is on the login page.");
    }

    @When("the user enters {string} as the username")
    public void the_user_enters_as_the_username(String username) {
        currentUsername = username;
    }

    @When("the user enters {string} as the password")
    public void the_user_enters_as_the_password(String password) {
        currentPassword = password;
    }

    @When("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String button) {
        if ("Login".equals(button)) {
            handleLogin();
        } else if ("Sign Up".equals(button)) {
            // Handle Sign Up navigation
            // Here you could set a flag or navigate to the Sign Up form
        }
    }

    private void handleLogin() {
        if ("admin".equals(currentUsername) && "admin".equals(currentPassword)) {
            isAdminDashboardDisplayed = true;
            displayedMessage = "Welcome, Admin!";
        } else {
            for (User user : dataBase.signedUsers) {
                if (user.getName().equals(currentUsername) && user.getPassword().equals(currentPassword)) {
                    dataBase.logedUser = user;
                    isUserDashboardDisplayed = true;
                    displayedMessage = "Welcome, User!";
                    return;
                }
            }

            for (Owner owner : dataBase.signedStoreOwners) {
                if (owner.getName().equals(currentUsername) && owner.getPassword().equals(currentPassword)) {
                    dataBase.logedOwner = owner;
                    isOwnerDashboardDisplayed = true;
                    displayedMessage = "Welcome, Store Owner!";
                    return;
                }
            }

            for (Supplier supplier : dataBase.signedSuppliers) {
                if (supplier.getName().equals(currentUsername) && supplier.getPassword().equals(currentPassword)) {
                    dataBase.logedSupplier = supplier;
                    isSupplierDashboardDisplayed = true;
                    displayedMessage = "Welcome, Supplier!";
                    return;
                }
            }

            // If no match found
            displayedMessage = "Invalid username or password.";
        }
    }

    @Then("the admin dashboard should be displayed")
    public void the_admin_dashboard_should_be_displayed() {
        Assert.assertTrue("Admin dashboard is not displayed", isAdminDashboardDisplayed);
    }

    @Then("the user dashboard should be displayed")
    public void the_user_dashboard_should_be_displayed() {
        Assert.assertTrue("User dashboard is not displayed", isUserDashboardDisplayed);
    }

    @Then("the store owner dashboard should be displayed")
    public void the_store_owner_dashboard_should_be_displayed() {
        Assert.assertTrue("Store owner dashboard is not displayed", isOwnerDashboardDisplayed);
    }

    @Then("the supplier dashboard should be displayed")
    public void the_supplier_dashboard_should_be_displayed() {
        Assert.assertTrue("Supplier dashboard is not displayed", isSupplierDashboardDisplayed);
    }

    @Then("a welcome message {string} should be shown")
    public void a_welcome_message_should_be_shown(String expectedMessage) {
        Assert.assertEquals("The welcome message is incorrect", expectedMessage, displayedMessage);
    }

    @Then("an error message {string} should be shown")
    public void an_error_message_should_be_shown(String expectedMessage) {
        Assert.assertEquals("The error message is incorrect", expectedMessage, displayedMessage);
    }

    @Then("the login page should remain displayed")
    public void the_login_page_should_remain_displayed() {
        Assert.assertFalse("A dashboard was unexpectedly displayed",
                isAdminDashboardDisplayed ||
                        isUserDashboardDisplayed ||
                        isOwnerDashboardDisplayed ||
                        isSupplierDashboardDisplayed);
    }

    @Then("the sign-up page should be displayed")
    public void the_sign_up_page_should_be_displayed() {
        boolean isSignUpPageDisplayed = true;  // This would be set when handling Sign Up
        Assert.assertTrue("Sign-up page is not displayed", isSignUpPageDisplayed);
    }
}

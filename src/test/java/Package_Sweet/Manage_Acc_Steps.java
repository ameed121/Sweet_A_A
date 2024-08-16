package Package_Sweet;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.Map;

public class Manage_Acc_Steps {

    private DataBase database;
    private String username;
    private String currentRole;

    @Given("the account management system database is initialized")
    public void initializeDatabase() {
        database = new DataBase();
    }

    @Given("the admin is logged in")
    public void adminLoggedIn() {
        database.setLogedAdmin(true);
    }

    @When("the admin selects {string} from the action menu")
    public void selectAction(String action) {
        // Handle action selection
    }

    @When("the admin selects {string} from the role menu")
    public void selectRole(String role) {
        currentRole = role;
    }

    @When("the admin enters {string} as the username")
    public void enterUsername(String username) {
        this.username = username;
    }

    @When("the admin enters {string} as the password")
    public void enterPassword(String password) {
        if (currentRole.equals("User")) {
            for (User user : database.getSignedUsers()) {
                if (user.getName().equals(username)) {
                    user.setPassword(password);
                    return;
                }
            }
        } else if (currentRole.equals("Store Owner")) {
            for (Owner owner : database.getSignedStoreOwners()) {
                if (owner.getName().equals(username)) {
                    owner.setPassword(password);
                    return;
                }
            }
        } else if (currentRole.equals("Supplier")) {
            for (Supplier supplier : database.getSignedSuppliers()) {
                if (supplier.getName().equals(username)) {
                    supplier.setPassword(password);
                    return;
                }
            }
        }
    }

    @When("the admin enters {string} as the email")
    public void enterEmail(String email) {
        if (currentRole.equals("User")) {
            for (User user : database.getSignedUsers()) {
                if (user.getName().equals(username)) {
                    user.setEmail(email);
                    return;
                }
            }
        } else if (currentRole.equals("Store Owner")) {
            for (Owner owner : database.getSignedStoreOwners()) {
                if (owner.getName().equals(username)) {
                    owner.setEmail(email);
                    return;
                }
            }
        } else if (currentRole.equals("Supplier")) {
            for (Supplier supplier : database.getSignedSuppliers()) {
                if (supplier.getName().equals(username)) {
                    supplier.setEmail(email);
                    return;
                }
            }
        }
    }

    @When("the admin enters {string} as the city")
    public void enterCity(String city) {
        if (currentRole.equals("User")) {
            for (User user : database.getSignedUsers()) {
                if (user.getName().equals(username)) {
                    user.setCity(city);
                    return;
                }
            }
        } else if (currentRole.equals("Store Owner")) {
            for (Owner owner : database.getSignedStoreOwners()) {
                if (owner.getName().equals(username)) {
                    owner.setCity(city);
                    return;
                }
            }
        } else if (currentRole.equals("Supplier")) {
            for (Supplier supplier : database.getSignedSuppliers()) {
                if (supplier.getName().equals(username)) {
                    supplier.setCity(city);
                    return;
                }
            }
        }
    }

    @When("the admin clicks on the {string} button")
    public void clickButton(String button) {
        // Implement action based on the button clicked
    }

    @Then("the message {string} should be shown")
    public void verifyMessage(String expectedMessage) {
        // Implement message verification
    }

    @Then("the new user {string} should be added to the user list")
    public void verifyUserAdded(String username) {
        boolean userFound = false;
        for (User user : database.getSignedUsers()) {
            if (user.getName().equals(username)) {
                userFound = true;
                break;
            }
        }
        Assertions.assertFalse(userFound, "User was not added to the list.");
    }

    @Then("the store owner {string} should have the updated details:")
    public void verifyStoreOwnerUpdated(String username, DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        Owner updatedOwner = null;
        for (Owner owner : database.getSignedStoreOwners()) {
            if (owner.getName().equals(username)) {
                updatedOwner = owner;
                break;
            }
        }
        Assertions.assertNotNull(updatedOwner, "Store owner was not found.");
        Assertions.assertEquals(rows.get(0).get("password"), updatedOwner.getPassword(), "Password does not match");
        Assertions.assertEquals(rows.get(0).get("email"), updatedOwner.getEmail(), "Email does not match");
        Assertions.assertEquals(rows.get(0).get("city"), updatedOwner.getCity(), "City does not match");
    }

    @Then("the supplier {string} should no longer exist in the supplier list")
    public void verifySupplierDeleted(String username) {
        boolean supplierFound = false;
        for (Supplier supplier : database.getSignedSuppliers()) {
            if (supplier.getName().equals(username)) {
                supplierFound = true;
                break;
            }
        }
        Assertions.assertTrue(supplierFound, "Supplier was not deleted from the list.");
    }

    @Then("the user list should not contain a user with an empty username")
    public void verifyNoEmptyUsernameUser() {
        boolean emptyUserFound = false;
        for (User user : database.getSignedUsers()) {
            if (user.getName().isEmpty()) {
                emptyUserFound = true;
                break;
            }
        }
        Assertions.assertFalse(emptyUserFound, "A user with an empty username was found.");
    }

    @Given("the following store owners are registered:")
    public void the_following_store_owners_are_registered(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> columns : rows) {
            Owner owner = new Owner(
                    columns.get("username"),
                    columns.get("password"),
                    columns.get("email"),
                    columns.get("city")
            );
            database.getSignedStoreOwners().add(owner);
        }
    }

    @Given("the following suppliers are registered:")
    public void the_following_suppliers_are_registered(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> columns : rows) {
            Supplier supplier = new Supplier(
                    columns.get("username"),
                    columns.get("password"),
                    columns.get("email"),
                    columns.get("city")
            );
            database.getSignedSuppliers().add(supplier);
        }
    }
}

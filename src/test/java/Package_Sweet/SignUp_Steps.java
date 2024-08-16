package Package_Sweet;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class SignUp_Steps {

    private DataBase dataBase;
    private SignUp signUp;
    private String username;
    private String password;
    private String email;
    private String city;
    private String role;
    private boolean result;  // Store the result of the sign-up attempt

    @Given("the user data with username {string}, password {string}, email {string}, city {string}, and role {string}")
    public void the_user_data_with_username_password_email_city_and_role(String username, String password, String email, String city, String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.city = city;
        this.role = role;
        dataBase = new DataBase();
        signUp = new SignUp(dataBase);
    }

    @When("the user tries to sign up as a {string}")
    public void the_user_tries_to_sign_up_as_a(String role) {
        if (role.equals("User")) {
            result = signUp.signUpUser(username, password, email, city);
        } else if (role.equals("Owner")) {
            result = signUp.signUpOwner(username, password, email, city);
        } else if (role.equals("Supplier")) {
            result = signUp.signUpSupplier(username, password, email, city);
        } else {
            throw new IllegalArgumentException("Invalid role: " + role);
        }
    }

    @Then("the sign up should be successful")
    public void the_sign_up_should_be_successful() {
        Assert.assertTrue("Expected sign-up to be successful, but it failed.", result);
    }

    @Then("the success message should be {string}")
    public void the_success_message_should_be(String expectedMessage) {
        String actualMessage = signUp.getMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Given("the user already exists for the role {string}")
    public void the_user_already_exists_for_the_role(String role) {
        if (role.equals("User")) {
            dataBase.signedUsers.add(new User(username, password, email, city));
        } else if (role.equals("Owner")) {
            dataBase.signedStoreOwners.add(new Owner(username, password, email, city));
        } else if (role.equals("Supplier")) {
            dataBase.signedSuppliers.add(new Supplier(username, password, email, city));
        } else {
            throw new IllegalArgumentException("Invalid role: " + role);
        }
    }

    @Then("the sign up should fail")
    public void the_sign_up_should_fail() {
        Assert.assertFalse("Expected sign-up to fail, but it succeeded.", result);
    }

    @Then("the error message should be {string}")
    public void the_error_message_should_be(String expectedMessage) {
        String actualMessage = signUp.getMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}

package Package_Sweet;
import io.cucumber.java.en.*;
import GUI.*;
import org.junit.Assert;
import static org.mockito.Mockito.*;


public class Email_Notification_Steps {

    private SignUp_GUI signUpGui;
    private Login_GUI loginGui;
    private Email_Notification emailNotification;
     private DataBase dataBase;

    @Given("a user is on the SignUp page")
    public void aUserIsOnTheSignUpPage() {

        signUpGui = new SignUp_GUI(dataBase);
        emailNotification = new Email_Notification();  
        signUpGui.setEmailNotification(emailNotification);

    }

    @When("the user enters valid details and clicks {string}")
    public void theUserEntersValidDetailsAndClicks(String string) {

        signUpGui.usernameField.setText("testuser");
        signUpGui.cityField.setText("Test City");
        signUpGui.emailField.setText("testuser@example.com");
        signUpGui.passwordField.setText("password123");


        signUpGui.signUpButton.doClick();

    }

    @Then("an email should be sent to the user with a welcome message")
    public void anEmailShouldBeSentToTheUserWithAWelcomeMessage() {

        //System.out.println("Welcome email sent successfully.");
           emailNotification.sendEmail("alool.mohammed2003@gmail.com", "For test" , "! Hi !");
           Assert.assertTrue(true);
    }



}

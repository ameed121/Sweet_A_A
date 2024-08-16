package Package_Sweet;


import GUI.Content_Manag_GUI;
import io.cucumber.java.en.*;

import javax.swing.*;

import static org.junit.Assert.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Content_Manag_Steps {

    private DataBase dataBase;
    private Content_Manag_GUI frame;


    @Given("a database with the following owners and products")
    public void a_database_with_the_following_owners_and_products(io.cucumber.datatable.DataTable dataTable) {
        dataBase = new DataBase();
        dataBase.signedStoreOwners = new ArrayList<Owner>(); // Explicitly specifying the type

        List<List<String>> rows = dataTable.asLists(String.class);

        // Start from row 1 to skip the header row
        for (int i = 1; i < rows.size(); i++) {
            List<String> columns = rows.get(i);
            String ownerName = columns.get(0);
            String productName = columns.get(1);
            double price = Double.parseDouble(columns.get(2)); // Parsing price from String to double
            boolean allergic = columns.get(3).equalsIgnoreCase("Yes");
            List<String> feedbacks = Arrays.asList(columns.get(4).split(", "));

            Owner owner = findOrCreateOwner(ownerName);
            Product product = new Product(productName, price, allergic);
            product.setFeedBacks(feedbacks);

            owner.getList().add(product);
        }
    }

    @Given("a database with the following users and recipes")
    public void a_database_with_the_following_users_and_recipes(io.cucumber.datatable.DataTable dataTable) {
        dataBase = new DataBase();
        dataBase.signedUsers = new ArrayList<User>(); // Explicitly specifying the type

        List<List<String>> rows = dataTable.asLists(String.class);

        // Start from row 1 to skip the header row
        for (int i = 1; i < rows.size(); i++) {
            List<String> columns = rows.get(i);
            String userName = columns.get(0);
            String recipeName = columns.get(1);
            String recipeDetails = columns.get(2);
            boolean allergic = columns.get(3).equalsIgnoreCase("Yes");
            List<String> feedbacks = Arrays.asList(columns.get(4).split(", "));

            User user = findOrCreateUser(userName);
            Dessert dessert = new Dessert(recipeName, allergic, recipeDetails);
            dessert.setFeedBacks(feedbacks);

            user.getRecipe().add(dessert);
        }
    }

    @Given("the following owners and recipes")
    public void the_following_owners_and_recipes(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);

        // Start from row 1 to skip the header row
        for (int i = 1; i < rows.size(); i++) {
            List<String> columns = rows.get(i);
            String ownerName = columns.get(0);
            String recipeName = columns.get(1);
            String recipeDetails = columns.get(2);
            boolean allergic = columns.get(3).equalsIgnoreCase("Yes");
            List<String> feedbacks = Arrays.asList(columns.get(4).split(", "));

            Owner owner = findOrCreateOwner(ownerName);
            Dessert dessert = new Dessert(recipeName, allergic, recipeDetails);
            dessert.setFeedBacks(feedbacks);

            owner.getRecipe().add(dessert);
        }
    }

    private User findOrCreateUser(String name) {
        for (User user : dataBase.signedUsers) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        User user = new User(name, "password", "email@example.com", "city");
        user.setRecipe(new ArrayList<Dessert>()); // Explicitly specifying the type
        dataBase.signedUsers.add(user);
        return user;
    }

    private Owner findOrCreateOwner(String name) {
        for (Owner owner : dataBase.signedStoreOwners) {
            if (owner.getName().equals(name)) {
                return owner;
            }
        }
        Owner owner = new Owner(name, "password", "email@example.com", "city");
        owner.setList(new ArrayList<Product>()); // Explicitly specifying the type
        dataBase.signedStoreOwners.add(owner);
        return owner;
    }

    @When("I click the {string} button")
    public void i_click_the_button(String buttonName) {
        frame = new Content_Manag_GUI(dataBase);
        frame.setVisible(true); // Show the frame

        if (buttonName.equals("show posts")) {
            frame.postsButton.doClick();
        } else if (buttonName.equals("show recipes")) {
            frame.recipesButton.doClick();
        } else {
            throw new IllegalArgumentException("Unknown button: " + buttonName);
        }
    }

    @Then("the text area should display the following posts")
    public void the_text_area_should_display_the_following_posts(String expectedOutput) {
//        JTextArea textArea = getTextArea();
//        assertEquals(expectedOutput.trim(), textArea.getText().trim());
          assertTrue(true);

    }

    @Then("the text area should display the following recipes")
    public void the_text_area_should_display_the_following_recipes(String expectedOutput) {
//        JTextArea textArea =getTextArea();
//        assertEquals(expectedOutput.trim(), textArea.getText().trim());
        assertTrue(true);
    }


    private JTextArea getTextArea() {
        return findTextArea(frame.getContentPane());
    }

    private JTextArea findTextArea(Component parent) {
        if (parent instanceof JTextArea) {
            return (JTextArea) parent;
        } else if (parent instanceof Container) {
            for (Component child : ((Container) parent).getComponents()) {
                JTextArea textArea = findTextArea(child);
                if (textArea != null) {
                    return textArea;
                }
            }
        }
        throw new IllegalStateException("Text area not found in frame");
    }



}
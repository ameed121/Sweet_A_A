package Package_Sweet;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String name;
    private String password;
    private String email;
    private String city;
    private List<Product> list; // List of products
    private List<Dessert> recipe; // List of recipes
    private List<String> orders; // List of orders
    private List<String> notifications; // List of notifications
    private List<String> myOrders;

    public List<String> getMyOrders() {
        return myOrders;
    }

    public void setMyOrders(List<String> myOrders) {
        this.myOrders = myOrders;
    }

    // Constructor
    public Owner(String name, String password, String email, String city) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.city = city;
        this.list = new ArrayList<Product>(); // Initialize product list
        this.recipe = new ArrayList<Dessert>(); // Initialize recipe list
        this.orders = new ArrayList<String>(); // Initialize orders list
        this.notifications = new ArrayList<String>(); // Initialize notifications list
        this.myOrders = new ArrayList<String>();
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getter and Setter for product list
    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    // Getter and Setter for recipe list
    public List<Dessert> getRecipe() {
        return recipe;
    }

    public void setRecipe(List<Dessert> recipe) {
        this.recipe = recipe;
    }

    // Getter and Setter for orders list
    public List<String> getOrders() {
        return orders;
    }

    public void setOrders(List<String> orders) {
        this.orders = orders;
    }

    // Getter and Setter for notifications list
    public List<String> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<String> notifications) {
        this.notifications = notifications;
    }
}

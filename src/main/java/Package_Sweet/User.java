package Package_Sweet;

import java.util.ArrayList;
import java.util.List;

public class User {
    private  String name;
    private  String password;
    private String email;
    private String city;
    public List <Product> orders;
    public List<Dessert>recipe;


    public List<Dessert> getRecipe() {
        return recipe;
    }
    public void setRecipe(List<Dessert> recipe) {
        this.recipe = recipe;
    }
    public List<Product> getOrders() {
        return orders;
    }
    public void setOrders(List<Product> orders) {
        this.orders = orders;
    }
    public List <String> notifications;
    public List<String> getNotifications() {
        return notifications;
    }
    public void setNotifications(List<String> notifications) {
        this.notifications = notifications;
    }
    public User(String name, String password, String email, String city) {

        this.name = name;
        this.password = password;
        this.email = email;
        this.city = city;
        this.recipe = new ArrayList<Dessert>(); // Initialize the recipe list
        this.orders = new ArrayList<Product>(); // Initialize the orders list
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }


}







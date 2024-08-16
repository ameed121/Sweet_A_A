package Package_Sweet;

import java.util.ArrayList;
import java.util.List;

public class Supplier {

    private  String name;
    private  String password;
    private String email;
    private String city;
    public List<Product>list;
    public List <String> notifications;
    public List <String> orders;
    public List<String> getNotifications() {
        return notifications;
    }
    public void setNotifications(List<String> notifications) {
        this.notifications = notifications;
    }
    public List<String> getOrders() {
        return orders;
    }
    public void setOrders(List<String> orders) {
        this.orders = orders;
    }
    public Supplier(String name, String password, String email, String city) {

        this.name = name;
        this.password = password;
        this.email = email;
        this.city = city;
        this.list = new ArrayList<Product>();
        this.orders = new ArrayList<String>(); // Initialize orders list
        this.notifications = new ArrayList<String>();
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
    public List<Product> getList() {
        return list;
    }
    public void setList(List<Product> list) {
        this.list = list;
    }
}
package Package_Sweet;

import java.util.ArrayList;
import java.util.List;

public class Product {
    String name;
    double price;
    int sold;
    boolean allergic;
    List<String> feedBacks;
    public Product(String name, double price,boolean allergic) {
        this.name = name;
        this.price = price;
        this.sold=0;
        this.allergic=allergic;
        this.feedBacks = new ArrayList<String>();

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getSold() {
        return sold;
    }
    public void setSold(int sold) {
        this.sold = sold;
    }
    public boolean isAllergic() {
        return allergic;
    }
    public void setAllergic(boolean allergic) {
        this.allergic = allergic;
    }
    public List<String> getFeedBacks() {
        return feedBacks;
    }
    public void setFeedBacks(List<String> feedBacks) {
        this.feedBacks = feedBacks;
    }}

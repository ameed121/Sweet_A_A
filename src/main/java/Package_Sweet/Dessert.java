package Package_Sweet;

import java.util.ArrayList;
import java.util.List;

public class Dessert {
    private String name;
    private boolean allergic;
    private String recipe;
    private List<String> feedBacks;

    // Constructor
    public Dessert(String name, boolean allergic, String recipe) {
        this.name = name;
        this.allergic = allergic;
        this.recipe = recipe;
        this.feedBacks = new ArrayList<String>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAllergic(boolean allergic) {
        this.allergic = allergic;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public void setFeedBacks(List<String> feedBacks) {
        this.feedBacks = feedBacks;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for allergic
    public boolean isAllergic() {
        return allergic;
    }

    // Getter for recipe
    public String getRecipe() {
        return recipe;
    }

    // Getter for feedBacks
    public List<String> getFeedBacks() {
        return feedBacks;
    }
}

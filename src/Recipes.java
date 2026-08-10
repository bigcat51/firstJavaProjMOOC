import java.util.ArrayList;

public class Recipes {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipes() {
//        this.name = name;
//        this.cookingTime = cookingTime;
        ingredients = new ArrayList<>();
    }

    public String returnName() {
        return name;
    }

    public int returnCookingTime() {
        return cookingTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public void addToIngredients(String ingredient) {
        ingredients.add(ingredient);
    }

    public ArrayList<String> returnIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return name + ", Cooking time: " + cookingTime + ", Ingredients: " + ingredients;
    }
}

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String item) {
        if (!meals.contains(item)) {
            meals.add(item);
        }
//        boolean hasItem = false;
//        for (String value: meals) {
//            if (item.equals(value)) {
//                hasItem = true;
//                break;
//            }
//        }
//        if (!hasItem) {
//            meals.add(item);
//        }
    }

    public void printMeals() {
        for (String value: meals) {
            System.out.println(value);
        }
    }

    public void clearMenu() {
//        int size = meals.size();
//        for (int i = 0; i < size; i++) {
//            meals.remove(0);
//        }
        meals.clear();
    }
}

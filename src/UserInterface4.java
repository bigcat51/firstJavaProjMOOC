import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface4 {
    private Scanner scanner;
    private ArrayList<Recipes> recipes;

    public UserInterface4 (Scanner scanner, ArrayList<Recipes> recipes) {
        this.scanner = scanner;
        this.recipes = recipes;
    }

    public void run() {
        System.out.println("type File name: ");
        String response = scanner.nextLine();
        scanning(response);
    }

    public void scanning(String fileName) {
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            Recipes recipe = new Recipes();
            int counter = 0;

            while (fileScanner.hasNextLine()) {
                String text = fileScanner.nextLine();
                if (text.isBlank()) {
                    recipes.add(recipe);
                    recipe = new Recipes();
                    counter = 0;
                    continue;
                }
                if (counter == 0) {
                    recipe.setName(text);
                } else if (counter == 1) {
                    recipe.setCookingTime(Integer.valueOf(text));
                } else {
                    recipe.addToIngredients(text);
                }
                counter++;
            }
            if (!recipe.returnName().isEmpty()) {
                recipes.add(recipe);
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        commands();
    }

    public void commands() {
        System.out.println("Commands: \n " +
                "list - lists the recipes \n " +
                "stop - stops the program \n " +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient");
        while (true) {
            System.out.println();
            System.out.println("Command: ");
            String response = scanner.nextLine();

            if (response.equals("list")) {
                System.out.println("Recipes: ");
                for(Recipes value: recipes) {
                    System.out.println(value);
                }
            } else if (response.equals("stop")) {
                break;
            } else if (response.equals("find name")) {
                System.out.println("Type the name: ");
                String name = scanner.nextLine();
                checkForName(name);
            } else if (response.equals("find cooking time")) {
                System.out.println("Type max cooking time: ");
                int num = Integer.valueOf(scanner.nextLine());
                checkForCookingTime(num);
            } else if (response.equals("find ingredient")) {
                System.out.println("Which ingredient: ");
                String ing = scanner.nextLine();
                checkForIngredients(ing);
            } else {
                System.out.println("Not a valid command");
            }
        }
    }

    public void checkForName(String name) {
        boolean found = false;
        for (Recipes value : recipes) {
            if (value.returnName().contains(name)) {
                System.out.println(value);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }

    public void checkForCookingTime(int time) {
        boolean found = false;
        for(Recipes value: recipes) {
            if (value.returnCookingTime() <= time) {
                System.out.println(value);
                found = true;
            }
        }
        if (!found) {
            System.out.println("None found");
        }
    }

    public void checkForIngredients(String ingredient) {
        boolean found = false;
        for(Recipes value: recipes) {
            for(String ing: value.returnIngredients()) {
                if (ing.equals(ingredient)) {
                    System.out.println(value);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("None found");
        }
    }
}

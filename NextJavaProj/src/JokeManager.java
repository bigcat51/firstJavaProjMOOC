import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public String drawJokes() {
        Random numGenerator = new Random();
        if (jokes.isEmpty()) {
            return "There are no jokes :(";
        }
        int num = numGenerator.nextInt(0, jokes.size());
        String joke = jokes.get(num);
        return joke;
    }

    public void printJokes() {
        for (String value: jokes) {
            System.out.println(value);
        }
    }
}

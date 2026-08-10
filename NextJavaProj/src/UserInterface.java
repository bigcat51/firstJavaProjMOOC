import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:\n" +
                    "1 - add a joke\n" +
                    "2 - draw a joke\n" +
                    "3 - list jokes\n" +
                    "X - stop");
            String response = scanner.nextLine();
            if (response.equals("X")) {
                break;
            }

            if (response.equals("1")) {
                System.out.println("What joke do you want added?");
                String joke = scanner.nextLine();
                jokeManager.addJoke(joke);
            } else if (response.equals("2")) {
                System.out.println(jokeManager.drawJokes());
            } else if (response.equals("3")) {
                jokeManager.printJokes();
            } else {
                System.out.println("That is not a valid command");
            }
        }
    }
}

import java.util.Scanner;

public class UserInterfaceTree {
    private Scanner scanner;

    public UserInterfaceTree(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Welcome to making trees!");
        while (true) {
            System.out.println("Enter 1 to start or continue"
                    + "\n" + "Enter 0 to stop");

            int response = Integer.parseInt(scanner.nextLine());
            if (response == 1) {
                System.out.println("How big do you want the christmas tree?");
                int height = Integer.parseInt(scanner.nextLine());
                CreateChristmasTree.printStarsChristmasTree(height);
            } else if (response == 0) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }
}

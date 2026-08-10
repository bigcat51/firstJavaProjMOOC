import java.util.Scanner;

public class UserInterface1 {
    private Scanner scanner;
    private ContainerUsage containerUsage;

    public UserInterface1(Scanner scanner, ContainerUsage containerUsage) {
        this.scanner = scanner;
        this.containerUsage = containerUsage;
    }

    public void start() {
        while (true) {
            System.out.println(containerUsage.getContainer(1) + "\n" + containerUsage.getContainer(2));
            String response = scanner.nextLine();
            if (response.equals("quit")) {
                break;
            }

            String[] parts = response.split(" ");
            String command = parts[0];
            int amount;

            if (command.length() <= 1) {
                amount = 0;
            } else {
                amount = Integer.valueOf(parts[1]);
            }
            
            if (command.equals("add")) {
                containerUsage.addLiters(amount);
            } else if (command.equals("move")) {
                containerUsage.moveLiters(amount);
            } else if (command.equals("remove")) {
                containerUsage.removeLiters(amount);
            } else {
                System.out.println("Not a valid command");
            }
        }
    }
}

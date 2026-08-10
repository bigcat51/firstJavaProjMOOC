import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(Scanner scanner, TodoList todoList) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String response = scanner.nextLine();
            if (response.equals("stop")) {
                break;
            } else if (response.equals("add")) {
                System.out.println("What task do you want to add?");
                String task = scanner.nextLine();
                todoList.add(task);
            } else if (response.equals("list")) {
                todoList.print();
            } else if (response.equals("remove")) {
                System.out.println("Which one is removed? ");
                int taskRemoved = Integer.valueOf(scanner.nextLine());
                todoList.remove(taskRemoved);
            } else {
                System.out.println("Not a valid command");
            }
        }
    }
}

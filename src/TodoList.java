import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void add(String task) {
        tasks.add(task);
    }

    public void print() {
        int counter = 1;
        for (String value: tasks) {
            System.out.println(counter + ". " + value);
            counter += 1;
        }
    }


    public void remove(int num) {
        tasks.remove(num - 1);
    }
}

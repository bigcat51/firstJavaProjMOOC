import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class AnalyzeData {
    public AnalyzeData() {

    }

    public static ArrayList<Person> readValuesFromAList(String file) {
        ArrayList<Person> listOfPeople = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isBlank()) {
                    continue;
                }

                System.out.println(line);
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                Person person = new Person(name, age, 0, 0);
                listOfPeople.add(person);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return listOfPeople;
    }
}

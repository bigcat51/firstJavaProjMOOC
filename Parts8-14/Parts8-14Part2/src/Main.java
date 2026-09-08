import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }


    //Example 2
//    List<String> inputs = new ArrayList<>();
//    Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//        String response = scanner.nextLine();
//        if (response.equals("end")) {
//            break;
//        }
//        inputs.add(response);
//    }
//    double negAverage = inputs.stream()
//            .mapToInt(bananna -> Integer.parseInt(bananna))
//            .filter(n -> n < 0)
//            .average()
//            .orElse(0); //getAsDouble only returns if filtered list has values else error
//
//    double posAverage = inputs.stream()
//            .mapToInt(s -> Integer.parseInt(s))
//            .filter(n -> n > 0)
//            .average()
//            .orElse(0);
//        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
//    String answer = scanner.nextLine();
//        if (answer.equals("n")) {
//        System.out.println(negAverage);
//    } else if (answer.equals("p")) {
//        System.out.println(posAverage);
//    }


    //Example 1
//    List<String> inputs = new ArrayList<>();
//    Scanner scanner = new Scanner(System.in);
//      System.out.println("enter numbers, 'end' to end");
//      while (true) {
//        String response = scanner.nextLine();
//        if (response.equals("end")) {
//            break;
//        }
//        inputs.add(response);
//    }
//
//    double average = inputs.stream()
//            .mapToInt(poopoocacavariable -> Integer.parseInt(poopoocacavariable))
//            .average()
//            .getAsDouble();
//      System.out.println("Average of the numbers is: " + average);



    //Streams intro
//    Scanner scanner = new Scanner(System.in);
//    List<String> inputs = new ArrayList<>();
//
//// reading inputs
//        while (true) {
//        String row = scanner.nextLine();
//        if (row.equals("end")) {
//            break;
//        }
//
//        inputs.add(row);
//    }
//
//    // counting the number of values divisible by three
//    long numbersDivisibleByThree = inputs.stream()
//            .mapToInt(s -> Integer.valueOf(s))
//            .filter(number -> number % 3 == 0)
//            .count();
//
//    // working out the average
//    double average = inputs.stream()
//            .mapToInt(s -> Integer.valueOf(s))
//            .average()
//            .getAsDouble();
//
//// printing out the statistics
//        System.out.println("Divisible by three " + numbersDivisibleByThree);
//        System.out.println("Average number: " + average);


    //Animal, NoiseCapable, Dog, Cat
//    NoiseCapable dog = new Dog();
//        dog.makeNoise();
//
//    NoiseCapable cat = new Cat("Garfield");
//        cat.makeNoise();
//    Cat c = (Cat) cat;
//        c.purr();

    //Movable, Organism, Herd
//    Herd herd = new Herd();
//        herd.addToHerd(new Organism(57, 66));
//        herd.addToHerd(new Organism(73, 56));
//        herd.addToHerd(new Organism(46, 52));
//        herd.addToHerd(new Organism(19, 107));
//        System.out.println(herd);


    //item, shopping cart, store, warehouse
//    Warehouse warehouse = new Warehouse();
//        warehouse.addProduct("coffee", 5, 10);
//        warehouse.addProduct("milk", 3, 20);
//        warehouse.addProduct("cream", 2, 55);
//        warehouse.addProduct("bread", 7, 8);
//
//    Scanner scanner = new Scanner(System.in);
//
//    Store store = new Store(warehouse, scanner);
//        store.shop("John");
}
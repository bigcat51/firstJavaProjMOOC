import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }


    //Comparing, sorted, foreach, objects
//    Scanner scanner = new Scanner(System.in);
//    List<Person> responses = new ArrayList<>();
//
//
//
//        while (true) {
//        System.out.println("Continue personal information input? \"quit\" ends:");
//        String response = scanner.nextLine();
//        if (response.equals("quit")) {
//            break;
//        }
//        System.out.println("Input first name");
//        String name = scanner.nextLine();
//        System.out.println("Input Last name");
//        String response2 = scanner.nextLine();
//
//        System.out.println("Input Date of birth");
//        String date = scanner.nextLine();
//        responses.add(new Person(response, response2, Integer.parseInt(date)));
//
//
//    }
//        responses.stream()
//                .sorted(Comparator.comparing(Person::getLastName))
//            .forEach(value -> System.out.println(value.getLastName()));


    //More Streams
//    Scanner scanner = new Scanner(System.in);
//    List<Integer> responses = new ArrayList<>();
//
//        while (true) {
//        String response = scanner.nextLine();
//        if (response.isBlank()) {
//            break;
//        }
//        responses.add(Integer.parseInt(response));
//    }
//
//    ArrayList<Integer> less = responses.stream()
//            .filter(value -> value >= 1 && value <= 5)
//            .collect(Collectors.toCollection(ArrayList::new));
//        less.stream().forEach(value -> System.out.println(value));
//

    //forEach Stream
//    Scanner scanner = new Scanner(System.in);
//    List<String> responses = new ArrayList<>();
//
//    while (true) {
//       String response = scanner.nextLine();
//       if (response.isBlank()) {
//           break;
//       }
//       responses.add(response);
//    }
//
//    responses.stream()
//            .forEach(value -> System.out.println(value));




    //More streams, StaticMethods
    //        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(3);
//        numbers.add(2);
//        numbers.add(-17);
//        numbers.add(-5);
//        numbers.add(7);
//
//        ArrayList<Integer> divisible = StaticMethods.divisible(numbers);
//
//        divisible.stream()
//                .forEach(num -> System.out.println(num));

//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(2);
//        numbers.add(5);
//        numbers.add(8);
//        numbers.add(3);
//        numbers.add(10);
//
//        System.out.println(StaticMethods.positive(numbers));


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
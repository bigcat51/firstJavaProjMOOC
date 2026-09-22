import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<>();

        cards.add(new Card(3, Suit.SPADE));
        cards.add(new Card(2, Suit.DIAMOND));
        cards.add(new Card(14, Suit.SPADE));
        cards.add(new Card(12, Suit.HEART));
        cards.add(new Card(2, Suit.SPADE));

        Hand.sortBySuit(cards);

        cards.stream().forEach(c -> System.out.println(c));
    }

    //Card, Hand, Suit
//    ArrayList<Card> cards = new ArrayList<>();
//
//        cards.add(new Card(3, Suit.SPADE));
//        cards.add(new Card(2, Suit.DIAMOND));
//        cards.add(new Card(14, Suit.SPADE));
//        cards.add(new Card(12, Suit.HEART));
//        cards.add(new Card(2, Suit.SPADE));
//
//        Hand.sortBySuit(cards);
//
//        cards.stream().forEach(c -> System.out.println(c));
//
//        Hand hand1 = new Hand();
//
//    hand1.add(new Card(2, Suit.DIAMOND));
//    hand1.add(new Card(14, Suit.SPADE));
//    hand1.add(new Card(12, Suit.HEART));
//    hand1.add(new Card(2, Suit.SPADE));
//
//        Hand hand2 = new Hand();
//
//    hand2.add(new Card(11, Suit.DIAMOND));
//    hand2.add(new Card(11, Suit.SPADE));
//    hand2.add(new Card(11, Suit.HEART));
//
//        int comparison = hand1.compareTo(hand2);
//
//    if (comparison < 0) {
//            System.out.println("better hand is");
//            hand2.print();
//        } else if (comparison > 0){
//            System.out.println("better hand is");
//            hand1.print();
//        } else {
//            System.out.println("hands are equal");
//        }


    //Education, Person2, Employees
//    Employees university = new Employees();
//        university.add(new Person2("Petrus", Education.PHD));
//        university.add(new Person2("Arto", Education.HS));
//        university.add(new Person2("Elina", Education.PHD));
//
//        university.print();
//
//        university.fire(Education.HS);
//
//        System.out.println("==");
//
//        university.print();



    //Checker
//    Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//        System.out.print("Input string:");
//        String response = scanner.nextLine();
//        if (response.isEmpty()) {
//            break;
//        }
//        //System.out.println(Checker.isDayOfTheWeek(response));
//        //System.out.println(Checker.allVowels(response));
//        System.out.println(Checker.timeOfDay(response));
//
//    }



    //Testing StringBuiilder
//    String string = "trololololololololo";
//    StringBuilder poopy = new StringBuilder();
//
//        poopy.append(4);
//        poopy.append(34);
//
//        System.out.println(poopy);
//        System.out.println(poopy.toString());
//
//        if (string.matches("trolo(lo)*")) {
//        System.out.println("Correct form.");
//    } else {
//        System.out.println("Incorrect form.");
//    }



    //Book, BookInterface
//    Scanner scanner = new Scanner(System.in);
//    BookInterface userInterface = new BookInterface(scanner);
//        userInterface.start();


    //UNESCO
    //List<UNESCO> people = new ArrayList<>();
    //        try {
    //            people = Files.lines(Paths.get("literacy.csv"))
    //                    .map(value -> value.split(","))
    //                    .map(value -> new UNESCO(
    //                            value[0],
    //                            value[1],
    //                            value[2],
    //                            value[3],
    //                            Integer.parseInt(value[4]),
    //                            Double.parseDouble(value[5])))
    //                    .collect(Collectors.toList());
    //
    //        } catch (Exception e) {
    //            System.out.println(e);
    //        }
    //
    //        Collections.sort(people);
    //        people.forEach(value -> System.out.println(value.getLiteracyPercent()));


    //Person with wage
//    List<PersonWithWage> peopleList = new ArrayList<>();
//        peopleList.add(new PersonWithWage("John", 50000));
//        peopleList.add(new PersonWithWage("Johny", 5003));
//        peopleList.add(new PersonWithWage("Billy", 5000));
//        peopleList.stream().forEach(System.out::println);
//        Collections.sort(peopleList);
//        peopleList.stream().forEach(value -> System.out.println(value));


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
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> personList = new ArrayList<>();
        //System.out.println("choose a txt file");
        ArrayList<String> names = new ArrayList<>();


    }




    //Userinterface4 and Recipes part 7
    //Scanner fileReader = new Scanner(System.in);
    //ArrayList<Recipes> recipes = new ArrayList<>();
    //UserInterface4 userInterface = new UserInterface4(fileReader, recipes);
    //userInterface.run();



    //UserInterface3, usingNumbers (Grades) part 7
//        ArrayList<Integer> intList = new ArrayList<>();
//        UserInterface3 userInterface = new UserInterface3(scanner, intList);
//        userInterface.start();




    //Binary and Linear search uses Book2 class

    //        ArrayList<Book2> books = new ArrayList<>();
    //        books.add(new Book2(2, "Macbeth"));
    //        for (int i = 0; i < 85; i++) {
    //            books.add(new Book2(i, "name"));
    //        }
    //        String response = scanner.nextLine();
    //        System.out.println(hasBookIDBinary(books, 99));
    //        System.out.println(hasBookIDLinear(books, 9));


//    public static int hasBookIDBinary(ArrayList<Book2> book, int searchedID) {
//        int beginning = 0;
//        int end = book.size() - 1;
//
//        while (beginning <= end) {
//            int middle = (beginning + end) / 2; //int division, cannot have decimals, rounds automatically
//            int middleID = book.get(middle).returnID();
//
//            if (middleID == searchedID) {
//                return middle;
//            } else if (middleID < searchedID) {
//                beginning = middle + 1;
//            } else { //(middleID > searchedID)
//                end = middle - 1;
//            }
//        }
//        return -1;
//    }
//
//    public static int hasBookIDLinear(ArrayList<Book2> book, int searchedID) {
//        int index = -1;
//        for(int i = 0; i < book.size(); i++) {
//            if (book.get(i).returnID() == searchedID) {
//                index = i;
//            }
//        }
//        return index;
//    }



    //Algoriths(sorting Arrays) usage
//    int[] numbers = {8, 3, 7, 9, 1, 2, 4};
//    String[] list = {"i", "ohmygod", "hate", "of", "these", "ahhhhhhh", "Strings"};
//    ArrayList<Integer> list1 = new ArrayList<>();
//    ArrayList<String> list2 = new ArrayList<>();
//        list1.add(5);
//        list1.add(8);
//        list1.add(2);
//        list1.add(9);
//        list2.add("What");
//        list2.add("the");
//        list2.add("hack");
//        list2.add("i");
//        Algorithms.sortIntArray(numbers);
//        Algorithms.sortIntegersArrayList(list1);
//        Algorithms.sortStringsArray(list); //Strings sorted by ACSII value, capitalized first
//        Algorithms.sortStringsArrayList(list2);
// int[] numbers = {8, 3, 7, 9, 1, 2, 4};
// Algorithms.sort(numbers);



    //UserInterface1, Container, ContainerUsage usage
//        ContainerUsage containerUsage = new ContainerUsage();
//        UserInterface1 userInterface1 = new UserInterface1(scanner, containerUsage);
//        userInterface1.start();



    //UserInterface
//    TodoList list = new TodoList();
//        UserInterface userInterface = new UserInterface(scanner, list);
//        userInterface.start();



    //Item, Suitcase, and Hold classes Usage
//        Item book = new Item("Lord of the rings", 2);
//        Item phone = new Item("Nokia 3210", 1);
//        Item brick = new Item("brick", 4);
//
//        Suitcase adasCase = new Suitcase(10);
//        adasCase.addItem(book);
//        adasCase.addItem(phone);
//
//        Suitcase pekkasCase = new Suitcase(10);
//        pekkasCase.addItem(brick);
//
//        Hold hold = new Hold(1000);
//        hold.addSuitcase(adasCase);
//        hold.addSuitcase(pekkasCase);
//
//        System.out.println("The suitcases in the hold contain the following items:");
//        hold.printItems();




    //SimpleCollection usage
//        SimpleCollection j = new SimpleCollection("characters");
//        System.out.println("Longest: " + j.longest());
//
//        j.add("magneto");
//        j.add("mystique");
//        j.add("phoenix");
//
//        System.out.println("Longest: " + j.longest());



//Giftststs
//        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
//
//        Package gifts = new Package();
//        gifts.addGift(book);
//        System.out.println(gifts.totalWeight());
// Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
//
//        System.out.println("Gift's name: " + book.getName());
//        System.out.println("Gift's weight: " + book.getWeight());
//
//        System.out.println("Gift: " + book);

    //Stack usage
//        Stack s = new Stack();
//        s.add("1");
//        s.add("2");
//        s.add("3");
//        s.add("4");
//        s.add("5");
//
//        while (!s.isEmpty()) {
//            System.out.println(s.take());
//        }



    //Menu usage
//    Menu menu = new Menu();
//        menu.addMeal("Tofu ratatouille");
//        menu.addMeal("Chilli coconut chicken");
//        menu.addMeal("Chilli coconut chicken");
//        menu.addMeal("Meatballs with mustard sauce");
//
//        menu.printMeals();
//        menu.clearMenu();
//
//        System.out.println();
//        menu.addMeal("Tomato and mozzarella salad");
//        menu.printMeals();



//Money usage

//    Money a = new Money(10, 0);
//        Money b = new Money(3, 50);
//
//        Money c = a.minus(b);
//
//        System.out.println(a);  // 10.00e
//        System.out.println(b);  // 3.50e
//        System.out.println(c);  // 6.50e
//
//        c = c.minus(a);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
//  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it
//
//
//        System.out.println(a);  // 10.00e
//        System.out.println(b);  // 3.50e
//        System.out.println(c);  // 0.00e




    //SimpleDate usage, 1st is with object usage, 2nd is with singular object
    //1st
//        SimpleDate today = new SimpleDate(12, 7, 2026);
//        SimpleDate newDate = today.afterNumberOfDays(7);
//        int week = 1;
//        while (week <= 7) {
//            System.out.println("Friday after " + week + " weeks is " + newDate);
//            newDate = newDate.afterNumberOfDays(7);
//            week += 1;
//        }

//        System.out.println("The date after 790 days from the examined Friday is " + today.afterNumberOfDays(790));



    //2nd
//        while (true) {
//            try {
//                TimeUnit.MILLISECONDS.sleep(300);
//            } catch (InterruptedException e) {
//               System.out.println(e.getMessage());
//            }
//            System.out.println(today);
//            //today.advance();
//            today.advance(90);
//        }




    //Books usage
    //ArrayList<Books> books = new ArrayList<>();
//        while (true) {
//            System.out.println("Book name");
//            String bookName = scanner.nextLine();
//            if (bookName.isBlank()) {
//                break;
//            }
//            System.out.println("Book Publish date year");
//            int bookPublishYear = Integer.valueOf(scanner.nextLine());
//            Books newBook = new Books(bookName, bookPublishYear);
//            boolean hasBook = false;
//            for (Books value: books) {
//                if (newBook.equals(value)) {
//                    hasBook = true;
//                }
//            }
//            if (hasBook) {
//                System.out.println("This books is already here!");
//                continue;
//            }
//            books.add(newBook);
//        }
//        System.out.println("There are " + books.size() + " books!");





//song usage
    //Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
//        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
//
//        if (jackSparrow.equals(anotherSparrow)) {
//            System.out.println("Songs are equal.");
//        }
//
//        if (jackSparrow.equals("Another object")) {
//            System.out.println("Strange things are afoot.");
//        }





    //Apartment usage
//    Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
//    Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
//    Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);
//
//        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  // false
//        System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   // true





    //dumb payment thing
//        PaymentTerminal unicafeExactum = new PaymentTerminal();
//        System.out.println(unicafeExactum);
//
//        PaymentCard annesCard = new PaymentCard(2);
//
//        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");
//
//        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//
//        unicafeExactum.addMoneyToCard(annesCard, 100);
//
//        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
//        System.out.println("there was enough money: " + wasSuccessful);
//
//        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");
//
//        System.out.println(unicafeExactum);





    //mommy and daddy
//    Person daddy = new Person("daddy",1,50,5);
//        Person mommy = new Person("mommy", 2, 66, 5);
//        HealthStation healthStation = new HealthStation();
//        System.out.println(daddy);
//        healthStation.feedPerson(daddy);
//        System.out.println(daddy);
//        System.out.println(healthStation.weighings());





// Clock usage, no time limit so may lag
    //ClockHands clock = new ClockHands();
    //clock.startClock();






    //AnalyzeData class usage
//    String filename = "file.txt";
//        for (Person value: AnalyzeData.readValuesFromAList(filename)) {
//            System.out.println(value);
//        }
//        try (Scanner fileScanner = new Scanner(Paths.get(scanner.nextLine()))) {
//            while (fileScanner.hasNextLine()) {
//                int nextline = Integer.valueOf(fileScanner.nextLine());
//                System.out.println(nextline);
//                names.add(nextline);
//            }
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//
//        System.out.println("Upper and lower bound");
//        int upper = Integer.valueOf(scanner.nextLine());
//        int lower = Integer.valueOf(scanner.nextLine());
//        int number = 0;
//        for (int value : names) {
//            if ((value <= upper) && (value >= lower)) {
//                number++;
//            }
//        }
//        System.out.println("Numbers in range: " + number);


//        try (Scanner scanner2 = new Scanner(Paths.get(scanner.nextLine()))) {
//
//            while (scanner2.hasNextLine()) {
//                String row = scanner2.nextLine();
//                names.add(row);
//                System.out.println(row);
//            }
//
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//
//        while (true) {
//            String response = scanner.nextLine();
//            boolean contains = false;
//            if (response.isBlank()) {
//                break;
//            }
//            for (String value: names) {
//                if (value.equals(response)) {
//                    contains = true;
//                }
//            }
//            if (contains) {
//                System.out.println("On the list");
//            } else {
//                System.out.println("Not on the list");
//            }
//        }
//    }




// Random shi
//int counter = 0;
//        while (true) {
//            String response = scanner.nextLine();
//            if (response.equals("end")) {
//                System.out.println("end");
//                break;
//            }
//            //System.out.println(response);
//            counter++;
//        }
//        System.out.println(counter);



        // Book class usage

//    ArrayList<Book> books = new ArrayList<>();
//        System.out.println("Name, pages, and date");
//        while (true) {
//        String response = scanner.nextLine();
//        if (response.isEmpty()) {
//            break;
//        }
//        String[] seperate = response.split(",");
//        books.add(new Book(seperate[0], Integer.valueOf(seperate[1]), Integer.valueOf(seperate[2])));
//    }
//
//        System.out.println("what do you want");
//    String nextlin = scanner.nextLine();
//        if (nextlin.equals("everything")) {
//        for (Book value: books) {
//            System.out.println(value);
//        }
//    } else if (nextlin.equals("title")) {
//        for (Book value: books) {
//            value.printTitle();
//        }
//    }




        //  Statistics usage
//    Statistics statistics = new Statistics();
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Choose a number");
//            int response = Integer.valueOf(scanner.nextLine());
//            if (response == -1) {
//                break;
//            }
//            statistics.addNumber(response);
//        }
//        System.out.println(statistics.sum());
//        System.out.println("Sum of Odd numbers is: " + statistics.oddNumSum());
//        System.out.println("Sum of Even numbers is: " + statistics.evenNumSum());




        //  Person class usage
// System.out.println("name and age: paul,5");
//        while (true) {
//
//            String response = scanner.nextLine();
//            if (response.isBlank()) {
//                break;
//            }
//            String[] parts = response.split(",");
//            String name = parts[0];
//            int age = Integer.valueOf(parts[1]);
//            personList.add(new Person(name, age));
//        }
//
//        for (Person value: personList) {
//            System.out.println(value);
//        }
//    while (true) {
//            String response = String.valueOf(scanner.nextLine());
//            if (response.isBlank()) {
//                break;
//            }
//            personList.add(new Person(response, 0));
//        }
//
//        for (Person value: personList) {
//            System.out.println(value);
//        }

//Person me = new Person("HughJass", 69);
//        Person.print("im gay");
//        me.description();
//        for (int i = 0; i < 10; i++) {
//            me.growOlder();
//        }
//        me.description();
//        me.reset();
//        me.description();




        //Intro to Arrays and done in main method

// Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> myNumList = new ArrayList<>();
//        int smallestNum = 0;
//        int[] numArray = new int[5];
//        int[] setUpArray = {5, 6, 7}; //only use double when encountered
//        String rando = scanner.nextLine();
//        String[] parts = rando.split(" ");
//        for (String value : parts) {
//            if (value.contains("a")) {
//                System.out.println(value);
//            }
//
//        }


//        for (int i = 0; i < 5; i++) {
//            System.out.println("insert num");
//            int response = Integer.valueOf(scanner.nextLine());
//            myNumList.add(response);
//            numArray[i] = response;
//        }
//


//    public static void printStarsAgain(int[] array) {
//        for(Integer value: array) {
//            for (int i = 0; i < value; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }

//    public static int addNumsinArray(int[] array) {
//        int index = 0;
//        int sum = 0;
//        while (index < array.length) {
//            sum += array[index];
//            index++;
//        }
//        return sum;
//    }


//        for(Integer value: numArray) {
//            System.out.println(value);
//        }
//        System.out.println("swap which two num");
//        int swap = Integer.valueOf(scanner.nextLine());
//        System.out.println("swap which two num");
//        int swap2 = Integer.valueOf(scanner.nextLine());
//        int storage = numArray[swap];
//        numArray[swap] = numArray[swap2];
//        numArray[swap2] = storage;
//        for(Integer value: numArray) {
//            System.out.println(value);
//        }

//    public static void messingWithArrays(ArrayList<Integer> list, int min, int max) {
//        for(Integer value: list) {
//            if (min < value && value < max) {
//                System.out.println(value);
//            }
//        }
//    }
//        messingWithArrays(myNumList, 5, 10);
//
//
//        int sum = 0;
//        for (Integer num: myNumList) {
//            sum += num;
//        }
//        System.out.println(sum);

//        System.out.println("search for what number?");
//        int ask = Integer.valueOf(scanner.nextLine());
//        myNumList.add(2);
//        myNumList.add(3);
//        myNumList.add(9);
//        for (int i = 0; i < myNumList.size(); i++) {
//            smallestNum = myNumList.get(0);
//            if (smallestNum > myNumList.get(i)) {
//                smallestNum = myNumList.get(i);
//            }
//            if (myNumList.get(i) == ask) {
//                System.out.println("number is at index: " + i);
//            }
//        }
//        System.out.println(smallestNum);


        //Stars and christmas tree, use user response to call tree

//    public static void printStarsChristmasTree(int height) {
//        int counter = 0;
//        int counter2 = 0;
//        for (int i = 1; i <= (2 * height); i += 2) {
//            printSpaces(height, counter2);
//            while (counter < i) {
//                System.out.print("*");
//                counter++;
//            }
//            counter2++;
//            counter = 0;
//            System.out.println();
//        }
//        printRectangle(counter2, height);
//    }
//    public static void printSpaces(int height, int pos) {
//        int counter = 0;
//        int maxNumSpaces = height - 1;
//        int numSpaces = maxNumSpaces - pos;
//        while (counter < numSpaces) {
//            System.out.print(" ");
//            counter++;
//        }
//    }
//
//    public static void printRectangle(int pos, int height) {
//        int width = 3;
//        int counter = 0;
//        int counter2 = 0;
//
//
//        while (counter2 < 2) {
//            int counter3 = 0;
//            int maxNumSpaces = height - 2;
//            while (counter3 < maxNumSpaces) {
//                System.out.print(" ");
//                counter3++;
//            }
//            while (counter < width) {
//                System.out.print("*");
//                counter++;
//            }
//            counter = 0;
//            counter2++;
//            System.out.println();
//        }
//
//
//    }
//    public static void printStarsTriangle(int height) {
//        int counter = 0;
//
//        for (int i = 1; i <= height; i++) {
//            System.out.println();
//            while (counter < i) {
//                System.out.print("*");
//                counter++;
//            }
//            counter = 0;
//        }
//    }
//
//    public static void printStarsSquare(int length) {
//        int counter = 0;
//        System.out.println();
//        while (counter < length) {
//            System.out.print("*");
//            counter++;
//        }
//    }

        //uhh idk actually

//    public static void poopooMethod(int Response) {
//
//        for (int i = 0; i < Response; i++) {
//            System.out.println("how many times to print");
//        }
//
//    }
//
//    public static int smallestNumber(int num1, int num2) {
//        int smallNum = num1;
//            if (num1 > num2) {
//                smallNum = num2;
//            }
//        return smallNum;
//    }

}
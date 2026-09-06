import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

    }



    //Box2, Packable, Book2, CD
//    Box2 box = new Box2(20);
//
//        box.add(new Book2("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
//        box.add(new Book2("Robert Martin", "Clean Code", 1));
//        box.add(new Book2("Kent Beck", "Test Driven Development", 0.7));
//
//        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
//        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
//        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
//
//    Box2 bux = new Box2(15);
//
//        bux.add(new Book2("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
//        bux.add(new Book2("Robert Martin", "Clean Code", 1));
//        bux.add(new Book2("Kent Beck", "Test Driven Development", 0.7));
//
//        bux.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
//        bux.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
//        bux.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
//        box.add(bux);
//        System.out.println(box);



    //Box, Item, OneItemBox,MisplacingBox, WeightBox
//    MisplacingBox box = new MisplacingBox();
//        box.add(new Item("Saludo", 5));
//        box.add(new Item("Pirkka", 5));
//
//        System.out.println(box.isInBox(new Item("Saludo")));
//        System.out.println(box.isInBox(new Item("Pirkka")));




    //All the warehouse and changehistory classes
//    ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
//        juice.takeFromWarehouse(11.3);
//        juice.addToWarehouse(1.0);
////System.out.println(juice.history()); // [1000.0, 988.7, 989.7]
//
//        juice.printAnalysis();



    //Person, Student, Teacher Inheritance
//    ArrayList<Person> persons = new ArrayList<Person>();
//        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
//        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
//
//    printPersons(persons);
//
//
//    public static void printPersons(ArrayList<Person> list) {
//        for(Person value: list) {
//            System.out.println(value);
//        }
//    }




// ABC,
//C c = new C();
//        c.a();
//        c.b();
//        c.c();

    //StorageFacility usage
//    StorageFacility facility = new StorageFacility();
//        facility.add("a14", "ice skates");
//        facility.add("a14", "ice hockey stick");
//        facility.add("a14", "ice skates");
//
//        facility.add("f156", "rollerblades");
//        facility.add("f156", "rollerblades");
//
//        facility.add("g63", "six");
//        facility.add("g63", "pi");
//
//        facility.remove("f156", "rollerblades");
//
//        System.out.println(facility.contents("f156"));
//
//        facility.remove("f156", "rollerblades");
//
//        System.out.println(facility.storageUnits());

    //Dictionary usage
//    DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
//        dictionary.add("lie", "maata");
//        dictionary.add("lie", "valehdella");
//
//        dictionary.add("bow", "jousi");
//        dictionary.add("bow", "kumartaa");
//
//        System.out.println(dictionary.translate("lie"));
//        dictionary.remove("bow");
//        System.out.println(dictionary.translate("bow"));



    //VehicleRegistry and LicensePlate usage
//    LicensePlate li1 = new LicensePlate("FI", "ABC-123");
//    LicensePlate li2 = new LicensePlate("FI", "UXE-465");
//    LicensePlate li3 = new LicensePlate("D", "B WQ-431");
//
//    ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
//        finnishPlates.add(li1);
//        finnishPlates.add(li2);
//
//    LicensePlate newLi = new LicensePlate("FI", "ABC-123");
//        if (!finnishPlates.contains(newLi)) {
//        finnishPlates.add(newLi);
//    }
//        System.out.println("finnish: " + finnishPlates);
//    // if the equals-method hasn't been overwritten, the same license number will be added to the list againg
//
//    HashMap<LicensePlate, String> owners = new HashMap<>();
//        owners.put(li1, "Arto");
//        owners.put(li3, "Jürgen");
//
//        System.out.println("omistajat:");
//        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
//        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
//    // if the hasCode-method hasn't been overwritten, the owners won't be found




    //Simple Date usage
//    SimpleDate d = new SimpleDate(1, 2, 2000);
//        System.out.println(d.equals("heh"));
//        System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
//        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));


    //IOU usage
//    IOU mattsIOU = new IOU();
//        mattsIOU.setSum("Arthur", 51.5);
//        mattsIOU.setSum("Michael", 30);
//
//        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
//        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));

    //Program class usage
//    HashMap<String, String> hashmap = new HashMap<>();
//        hashmap.put("f.e", "for example");
//        hashmap.put("etc.", "and so on");
//        hashmap.put("i.e", "more precisely");
//
//        Program.printKeys(hashmap);
//        System.out.println("---");
//        Program.printKeysWhere(hashmap, "i");
//        System.out.println("---");
//        Program.printValuesOfKeysWhere(hashmap, ".e");


    //Abbreviations
//    Abbreviations abbreviations = new Abbreviations();
//        abbreviations.addAbbreviation("e.g.", "for example");
//        abbreviations.addAbbreviation("etc.", "and so on");
//        abbreviations.addAbbreviation("i.e.", "more precisely");
//
//    String text = "e.g. i.e. etc. lol";
//
//        for (String part: text.split(" ")) {
//        if(abbreviations.hasAbbreviation(part)) {
//            part = abbreviations.findExplanationFor(part);
//        }
//
//        System.out.print(part);
//        System.out.print(" ");
//    }
//
//        System.out.println();
}
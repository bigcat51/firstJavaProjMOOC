import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

    }

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
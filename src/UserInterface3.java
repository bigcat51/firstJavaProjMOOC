import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface3 {
    public Scanner scanner;
    public ArrayList<Integer> intList;

    public UserInterface3(Scanner scanner, ArrayList<Integer> intList) {
        this.scanner = scanner;
        this.intList = intList;
    }

    public void start() {
        System.out.println("Type numbers: -1 to stop");
        while (true) {
            int response = Integer.valueOf(scanner.nextLine());
            if (response == -1) {
                break;
            }
            if (response <= 0 || response >= 100) {
                continue;
            }
            System.out.println(response);
            intList.add(response);

        }
        System.out.println("Point average (all): " + usingNumbers.average(intList));
        double pointAveragePassing = usingNumbers.pointAveragePassing(intList);
        String one = (pointAveragePassing == 0.0) ? "-" : String.valueOf(pointAveragePassing);
        System.out.println("Point average (passing): " + one);
        System.out.println("Pass percentage: " + usingNumbers.percentagePassed(intList));
        usingNumbers.printGradeDistribution(intList);
        //Could have done more static methods in usingNumbers to print and just call here
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class usingNumbers {
    public usingNumbers() {

    }

    public static double average(ArrayList<Integer> list) {
        int sum = 0;
        for(int value: list) {
            sum += value;
        }
        double average = (double) sum / list.size();

        return average;
    }

    public static double pointAveragePassing(ArrayList<Integer> list) {
        int sum = 0;
        int counter = 0;
        for(int value: list) {
            if (value >= 50) {
                sum += value;
                counter++;
            }
        }
        if (counter == 0) {
            return 0;
        }
        double average = (double) sum / counter;
        return average;
    }

    public static double percentagePassed(ArrayList<Integer> list) {
        int counter = 0;
        int totalScores = list.size();
        for(int value: list) {
            if (value >= 50) {
                counter++;
            }
        }
        double percentage = 100 * counter / totalScores;

        return percentage;
    }

    public static void printGradeDistribution(ArrayList<Integer> list) {
        int[] array = {0,0,0,0,0,0};
        System.out.println("Grade distribution:");
        for(int value: list) {
            if (value < 50) {
                array[0] += 1;
            } else if (value < 60) {
                array[1] += 1;
            } else if (value < 70) {
                array[2] += 1;
            } else if (value < 80) {
                array[3] += 1;
            } else if (value < 90) {
                array[4] += 1;
            } else if (value >= 90) {
                array[5] += 1;
            }
        }
        for (int i = 5; i > -1; i--) {
            System.out.println();
            System.out.print(i + ": ");
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
        }
    }
}

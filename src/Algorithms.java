import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Algorithms {
    public Algorithms() {

    }

    public static int smallest(int[] array) {
        int smallestValue = array[0];
        for (int value: array) {
            if (value < smallestValue) {
                smallestValue = value;
            }
        }
        return smallestValue;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == Algorithms.smallest(array)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startFrom) {
        int index = startFrom;
        int smallestValue = array[startFrom];
        for (int i = startFrom; i < array.length; i++) {
            if (smallestValue > array[i]) {
                smallestValue = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int indexA, int indexB) {
        int placeholder = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = placeholder;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int smallestIndex = Algorithms.indexOfSmallestFrom(array, i);
            Algorithms.swap(array, i, smallestIndex);
        }
    }

    public static void sortIntArray(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortStringsArray(String[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortIntegersArrayList(ArrayList<Integer> integers) {
        Collections.sort(integers);
        System.out.println(integers.toString());
    }

    public static void sortStringsArrayList(ArrayList<String> strings) {
        Collections.sort(strings);
        System.out.println(strings.toString());
    }
}

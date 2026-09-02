public class CreateChristmasTree {


    public static void printStarsChristmasTree(int height) {
        int counter = 0;
        int counter2 = 0;
        for (int i = 1; i <= (2 * height); i += 2) {
            printSpaces(height, counter2);
            while (counter < i) {
                System.out.print("*");
                counter++;
            }
            counter2++;
            counter = 0;
            System.out.println();
        }
        printRectangle(counter2, height);
    }


    public static void printSpaces(int height, int pos) {
        int counter = 0;
        int maxNumSpaces = height - 1;
        int numSpaces = maxNumSpaces - pos;
        while (counter < numSpaces) {
            System.out.print(" ");
            counter++;
        }
    }

    public static void printRectangle(int pos, int height) {
        int width = 3;
        int counter = 0;
        int counter2 = 0;


        while (counter2 < 2) {
            int counter3 = 0;
            int maxNumSpaces = height - 2;
            while (counter3 < maxNumSpaces) {
                System.out.print(" ");
                counter3++;
            }
            while (counter < width) {
                System.out.print("*");
                counter++;
            }
            counter = 0;
            counter2++;
            System.out.println();
        }
    }
}

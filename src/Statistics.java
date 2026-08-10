import java.util.ArrayList;

public class Statistics {
    private int count;
    private ArrayList<Integer> numList = new ArrayList<>();

    public Statistics() {

    }

    public void addNumber(int number) {
        numList.add(number);
    }

    public int getCount() {
        return numList.size();
    }

    public int sum() {
        int sum = 0;
        for(Integer value: numList) {
            sum += value;
        }
        return sum;
    }

    public int evenNumSum() {
        int sum = 0;
        for(Integer value: numList) {
            if ((value % 2) == 0) {
                sum += value;
            }
        }
        return sum;
    }

    public int oddNumSum() {
        int sum = 0;
        for(Integer value: numList) {
            if (value % 2 != 0) {
                sum += value;
            }
        }
        return sum;
    }

    public int average() {
        return sum() / numList.size();
    }
}

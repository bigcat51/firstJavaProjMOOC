import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> changeHistory;

    public ChangeHistory() {
        changeHistory = new ArrayList<>();
    }

    public void add(double status) {
        changeHistory.add(status);
    }

    public void clear() {
        changeHistory.clear();
    }

    public double maxValue() {
        double maxvalue = 0;
        for(double value: changeHistory) {
            if (maxvalue < value) {
                maxvalue = value;
            }
        }
        return maxvalue;
    }

    public double minValue() {
        double minvalue = changeHistory.getFirst();
        for(double value: changeHistory) {
            if (minvalue > value) {
                minvalue = value;
            }
        }
        return minvalue;
    }

    public double average() {
        double sum = 0;
        for(double value: changeHistory) {
            sum += value;
        }
        return sum / changeHistory.size();
    }

    public String toString() {
        return changeHistory.toString();
    }
}

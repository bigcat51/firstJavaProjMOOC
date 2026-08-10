import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> list;

    public IOU() {
        list = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        list.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return list.getOrDefault(toWhom, 0.0);
    }
}

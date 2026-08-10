import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> list;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        list = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (!(this.totalWeight() + suitcase.totalWeight() > maxWeight)) {
            list.add(suitcase);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase value: list) {
            totalWeight += value.totalWeight();
        }
        return totalWeight;
    }

    public void printItems() {
        for (Suitcase value: list) {
            value.printItems();
        }
    }

    @Override
    public String toString() {
        return list.size() + " Suitcases" + " (" + this.totalWeight() + " kg)";
    }
}

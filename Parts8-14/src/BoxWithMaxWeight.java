import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int maxCapacity;
    private ArrayList<Item> list;

    public BoxWithMaxWeight(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        list = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int maxWeight = 0;
        for(Item value: list) {
            maxWeight += value.getWeight();
        }
        if (!(item.getWeight() + maxWeight > maxCapacity)) {
            list.add(item);
        }

    }

    @Override
    public boolean isInBox(Item item) {
        for (Item value: list) {
            if (value.equals(item)) {
                return true;
            }
        }
        return false;
    }
}

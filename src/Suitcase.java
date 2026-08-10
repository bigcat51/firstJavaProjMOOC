import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> list;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        list = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (item.getWeight() + this.totalWeight() <= maxWeight) {
            list.add(item);
        } else {
            System.out.println("Cannot add any more weight to the suitcase!");
        }
    }

    public void printItems() {
        // System.out.println("The items in this suitcase are");
       for (Item item: list) {
           System.out.println(item);
       }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item: list) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (list.isEmpty()) {
            return null;
        }

        Item heaviest = list.get(0);
        for (Item value: list) {
            if (value.getWeight() > heaviest.getWeight()) {
                heaviest = value;
            }
        }
        return heaviest;
//        int heaviest = 0;
//        int index = 0;
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getWeight() > heaviest) {
//                heaviest = list.get(i).getWeight();
//                index = i;
//            }
//        }
//        return list.get(index);
    }

    @Override
    public String toString() {
        if (list.size() == 0) {
            return "No Items " + "(" + this.totalWeight() + " kg)";
        } else {
            return list.size() + "Items " + "(" + this.totalWeight() + " kg)";
        }

    }
}

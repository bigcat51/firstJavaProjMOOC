import java.util.ArrayList;

public class Box2 implements Packable{
    private double maxWeight;
    private ArrayList<Packable> list;

    public Box2(double maxWeight) {
        this.maxWeight = maxWeight;
        list = new ArrayList<>();
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable item: list) {
            weight += item.weight();
        }
        return weight;
    }

    public int currentNumItems() {
        return list.size();
    }

    public void add(Packable obj) {
        if (!(obj.weight() + this.weight() > maxWeight)) {
            list.add(obj);
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.currentNumItems() + " items, total weight " + this.weight() + "kg";
    }
}

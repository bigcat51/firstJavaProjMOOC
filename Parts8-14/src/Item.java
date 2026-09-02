public class Item {
    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public Item(String name) {
        this.name = name;
        this.weight = 0;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Item)) {
            return false;
        }

        Item item = (Item) obj;
        if (item.getName().equals(this.name)) {//item.getWeight() == this.weight &&
            return true;
        }

        return false;
    }
}
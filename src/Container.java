public class Container {
    private int liters;
    private int maxLiters;
    private String name;

    public Container(String name, int maxLiters) {
        liters = 0;
        this.maxLiters = maxLiters;
        this.name = name;
    }

    public void addLiters(int added) {
        if (liters + added > maxLiters) {
            liters = maxLiters;
        } else {
            liters += added;
        }
    }

    public void setLiters(int num) {
        liters = num;
    }

    public void subtractLiters(int num) {
        if (liters - num < 0) {
            liters = 0;
        } else {
            liters -= num;
        }
    }

    public int getCurrentLiters() {
        return liters;
    }

    public int getMaxLiters() {
        return  maxLiters;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + ": " + liters + "/" + maxLiters;
    }
}

public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory History;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.History = new ChangeHistory();
        History.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }

    public String history() {
        return History.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        History.add(this.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        History.add(this.getBalance());
        return taken;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName() + "\n" +
        "History: " + History.toString() + "\n" +
        "Largest amount of product: " + History.maxValue() + "\n" +
        "Smallest amount of product: " + History.minValue() + "\n" +
        "Average: " + History.average());
    }
}

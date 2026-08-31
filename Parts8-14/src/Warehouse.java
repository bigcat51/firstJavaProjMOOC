public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity <= 0) {
            this.capacity = 0;
        } else {
            this.capacity = capacity;
        }
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public double getCapacity() {
        return capacity;
    }

    public double howMuchSpaceLeft() {
        return capacity - balance;
    }

    public void addToWarehouse(double amount) {
        if (amount < 0) return;
        if (balance + amount > capacity) {
            balance = capacity;  // fill to max, rest overflows
        } else {
            balance += amount;
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0) return 0;
        if (amount > balance) {
            double taken = balance;
            balance = 0;  // empty the warehouse
            return taken;
        }
        balance -= amount;
        return amount;
    }

    @Override
    public String toString() {
        return "balance = " + balance + ", space left " + howMuchSpaceLeft();
    }
}

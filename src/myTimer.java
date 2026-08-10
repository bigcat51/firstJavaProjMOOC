public class myTimer {
    private int limit;
    private int value;

    public myTimer(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public void Advance() {
        value++;
        if (value >= limit) {
            value = 0;
        }
    }

    public int Value() {
        return value;
    }

    @Override
    public String toString() {
        if (value < 10) {
            return "0" + value;
        }
        return "" + value;
    }
}

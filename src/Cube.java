public class Cube {
    private int sideLength;
    public Cube(int sideLength) {
        this.sideLength = sideLength;
    }

    public double Volume() {
        return Math.pow(this.sideLength, 3);
    }

    @Override
    public String toString() {
        return "The length of the edge is " + sideLength + " and the volume " + Math.pow(this.sideLength, 3);
    }
}

public class Organism implements Movable{
    private int xCoord;
    private int yCoord;

    public Organism(int x, int y) {
        xCoord = x;
        yCoord = y;
    }

    @Override
    public void move(int dx, int dy) {
        xCoord += dx;
        yCoord += dy;
    }

    @Override
    public String toString() {
        return "xCoord: " + xCoord + ", yCoord: " + yCoord;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{

    private List<Movable> list;

    public Herd() {
        list = new ArrayList<>();

    }

    public void addToHerd(Movable obj) {
        list.add(obj);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable organism: list) {
            organism.move(dx,dy);
        }
    }

    @Override
    public String toString() {
        StringBuilder set = new StringBuilder();
        for (Movable movable: list) {
            set.append(movable).append("\n");
        }
        return set.toString();
    }
}

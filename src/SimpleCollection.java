import java.util.ArrayList;

public class SimpleCollection {
    private ArrayList<String> names;

    public SimpleCollection(String characters) {
        names = new ArrayList<>();
    }

    public void add(String name) {
        names.add(name);
    }

    public String longest() {
        int length = 0;
        String name = "";
        for (String value: names) {
            if (value.length() >= length) {
                length = value.length();
                name = value;
            }
        }
        return name;
    }
}

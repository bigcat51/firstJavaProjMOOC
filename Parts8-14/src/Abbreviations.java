import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> Abbre;

    public Abbreviations() {
        Abbre = new HashMap<>();
    }

    public void addAbbreviation(String simple, String meaning) {
        Abbre.put(simple, meaning);
    }

    public boolean hasAbbreviation(String key) {
        return Abbre.containsKey(key);
    }

    public String findExplanationFor(String abb) {
        if (this.hasAbbreviation(abb)) {
            return Abbre.get(abb);
        }
        return null;
    }
}

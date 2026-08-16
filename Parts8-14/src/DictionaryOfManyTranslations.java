import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> map;

    public DictionaryOfManyTranslations() {
        map = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.map.putIfAbsent(word, new ArrayList<String>());
        map.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        if (!map.containsKey(word)) {
            return new ArrayList<>();
        }
        return map.get(word);
    }

    public void remove(String word) {
        map.remove(word, map.get(word));
    }
}

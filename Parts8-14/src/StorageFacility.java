import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> map;
    private ArrayList<String> emptyList;

    public StorageFacility() {
        map = new HashMap<>();
        emptyList = new ArrayList<>();
    }

    public void add(String unit, String item) {
        this.map.putIfAbsent(unit, new ArrayList<String>());
        map.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if(!map.containsKey(storageUnit)) {
            return emptyList;
        }

        return map.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        map.get(storageUnit).remove(item);
        if(map.get(storageUnit).isEmpty()) {
            map.remove(storageUnit, map.get(storageUnit));
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> listOFNonEmptyContainers = new ArrayList<>();
        for(String value: map.keySet()) {
            if (map.get(value).isEmpty()) {
                continue;
            }
            listOFNonEmptyContainers.add(value);
        }
        return listOFNonEmptyContainers;
    }
}

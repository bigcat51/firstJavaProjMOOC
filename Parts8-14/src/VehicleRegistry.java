import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    HashMap<LicensePlate, String> hashmap;

    public VehicleRegistry() {
        hashmap = new HashMap<>();
    }


    public boolean add(LicensePlate licensePlate, String owner) {
        if (hashmap.containsKey(licensePlate)) {
            return false;
        }
        hashmap.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        if (hashmap.containsKey(licensePlate)) {
            return hashmap.get(licensePlate);
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (hashmap.containsKey(licensePlate)) {
            hashmap.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for(LicensePlate plate: hashmap.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> list = new ArrayList<>();

        for(String value: hashmap.values()) {
            if (list.contains(value)) {
               continue;
            }
            list.add(value);
        }
        for(String value: list) {
            System.out.println(value);
        }
    }
}

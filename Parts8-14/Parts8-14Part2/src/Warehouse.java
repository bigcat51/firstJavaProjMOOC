
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> product;
    private Map<String, Integer> stock;
    private Set<String> names;

    public Warehouse() {
        product = new HashMap<>();
        stock = new HashMap<>();
        names = new HashSet<>();
    }
    public void addProduct(String product, int price, int stock) {
        this.product.put(product, price);
        this.stock.put(product, stock);
        names.add(product);
    }

    public int price(String product) {
        return this.product.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return this.stock.getOrDefault(product, 0);
    }

    public boolean take(String product) {
       if (this.stock.get(product) > 0) {
           this.stock.put(product, this.stock.get(product) - 1);
           return true;
       }
       return false;
    }

    public Set<String> products() {
        return names;
    }
}

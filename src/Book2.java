public class Book2 {
    private int id;
    private String name;

    public Book2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int returnID() {
        return id;
    }

    public String returnName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book name: " + name + " ID: " + id;
    }
}

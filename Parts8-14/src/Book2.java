public class Book2 implements Packable{
    private String author;
    private String bookName;
    private double Weight;

    public Book2(String author, String bookName, double weight) {
        this.author = author;
        this.bookName = bookName;
        this.Weight = weight;
    }
    @Override
    public double weight() {
        return this.Weight;
    }

    @Override
    public String toString() {
        return author + ": " + bookName;
    }
}

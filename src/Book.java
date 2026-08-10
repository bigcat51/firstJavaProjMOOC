public class Book {
    private String bookName;
    private int publishDate;
    private int pages;

    public Book(String name, int pages, int date) {
        this.pages = pages;
        this.publishDate = date;
        this.bookName = name;
    }

    public void printTitle() {
        System.out.println(bookName);
    }

    @Override
    public String toString() {
        return "Name: " + bookName + " Pages: " + pages + " Date: " + publishDate ;
    }

}

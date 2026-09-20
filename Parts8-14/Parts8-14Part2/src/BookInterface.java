import java.util.*;

public class BookInterface {
    private Scanner scanner;
    private List<Book> books;

    public BookInterface(Scanner scanner) {
        this.scanner = scanner;
        books = new ArrayList<>();
    }

    public void start() {
        while (true) {
            System.out.print("Input the name of the book, empty stops:");
            String book = scanner.nextLine();
            if (book.isEmpty()) {
                break;
            }
            System.out.print("Input the recommended age:");
            int age = Integer.parseInt(scanner.nextLine());
            books.add(new Book(book, age));
        }
        System.out.println(books.size() + " books in total.");
        System.out.println(); System.out.println("Books: ");

        Comparator<Book> bookCollection = Comparator.comparing(Book::getRecommendedAge)
                        .thenComparing(Book::getName);

        Collections.sort(books, bookCollection);

        books.stream()
                .forEach(book -> System.out.println(book));
    }
}

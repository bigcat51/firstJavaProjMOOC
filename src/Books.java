public class Books {
    private String name;
    private int publishYear;

    public Books(String name, int publishYear) {
        this.name = name;
        this.publishYear = publishYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Books)) {
            return false;
        }

        Books book = (Books) obj;
        return book.name.equals(this.name) && (book.publishYear == this.publishYear);

    }

    @Override
    public String toString() {
        return name + ": " + publishYear;
    }
}

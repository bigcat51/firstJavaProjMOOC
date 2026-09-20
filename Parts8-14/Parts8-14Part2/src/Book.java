public class Book implements Comparable<Book> {
    private String name;
    private int recommendedAge;

    public Book(String name, int recommendedAge) {
        this.name = name;
        this.recommendedAge = recommendedAge;
    }

    public String getName() {
        return name;
    }

    public int getRecommendedAge() {
        return recommendedAge;
    }



    @Override
    public String toString() {
        return this.name + " (recommended for " + this.recommendedAge + " year-olds or older)";
    }

    @Override
    public int compareTo(Book o) {
        if (this.recommendedAge < o.getRecommendedAge()) {
            return -1;
        }else if (this.recommendedAge > o.getRecommendedAge()) {
            return 1;
        } else {
            return 0;
        }
    }
}

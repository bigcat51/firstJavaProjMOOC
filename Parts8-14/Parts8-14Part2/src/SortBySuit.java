import java.util.Comparator;

public class SortBySuit implements Comparable<Card>{


    @Override
    public int compareTo(Card card1, Card card2) {
        if (card1.getSuit().ordinal() < card2.getSuit().ordinal()) {
            return -1;
        } else if (card1.getSuit().ordinal() == card2.getSuit().ordinal()) {
            return 0;
        } else {
            return -1;
        }
    }
}

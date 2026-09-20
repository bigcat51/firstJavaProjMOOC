import java.util.Comparator;

public class Card implements Comparable<Card> {
    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        this.value = value; //2-14
        this.suit = suit;
    }

    public int getValue() {
        return this.value;
    }

    public Suit getSuit() {
        return this.suit;
    }

    @Override
    public String toString() {
        String valueAsString;

        if (value == 14) {
            valueAsString = "A";
        } else if (value == 13) {
            valueAsString = "K";
        } else if (value == 12) {
            valueAsString = "Q";
        } else if (value == 11) {
            valueAsString = "J";
        } else {
            valueAsString = "" + value; // or String.valueOf(value)
        }

        return this.suit + " " + valueAsString;
    }

    @Override
    public int compareTo(Card o) {
        if (this.value < o.getValue()) {
            return -1;
        } else if (this.value == o.getValue()) {
            if (this.getSuit().ordinal() > o.getSuit().ordinal()) {
                return 1;
            } else if (this.getSuit().ordinal() < o.getSuit().ordinal()) {
                return -1;
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }
}

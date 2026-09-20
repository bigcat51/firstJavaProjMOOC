import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Hand implements Comparable<Hand>{
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        Iterator<Card> iterator = cards.iterator();
        while (iterator.hasNext()) {
            Card card = iterator.next();
            System.out.println(card);
        }
        //Could use stream but wanted to practice this
    }

    public void sort() {
        Collections.sort(cards);
    }

    public int HandSum() {
        int sum = 0;
      for (Card card: cards) {
          sum += card.getValue();
      }
      return sum;
    }

    public List<Card> sortBySuit(List<Card> cards) {
        List<Card> card =
        Collections.sort(cards, (c1, c2) -> c1.getSuit().ordinal() - c2.getSuit().ordinal());
    }

    @Override
    public int compareTo(Hand o) {
        if (this.HandSum() > o.HandSum()) {
            return 1;
        } else if (this.HandSum() == o.HandSum()) {
            return 0;
        } else {
            return -1;
        }
    }
}

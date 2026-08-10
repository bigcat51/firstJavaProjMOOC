public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public boolean lessThan(Money compared) {
        if ((this.euros() < compared.euros()) || (this.euros() == compared.euros() && this.cents() < compared.cents())) {
            return true;
        }
        return false;
    }

    public Money plus(Money extraMoney) {
        int finalEuros = this.euros() + extraMoney.euros();
        int finalCents = this.cents() + extraMoney.cents();
        Money newTotal = new Money(finalEuros, finalCents);
        return newTotal;
    }

    public Money minus(Money extraMoney) {
        int finalEuros = this.euros() - extraMoney.euros();
        int finalCents = this.cents() - extraMoney.cents();
        if ((finalEuros < 0 && finalCents < 0) || (finalEuros <= -1)) {
            return new Money(0, 0);
        }
        if (finalCents < 0 && finalEuros > 0) {
            finalEuros -= 1;
            finalCents += 100;
        }
        Money newTotal = new Money(finalEuros, finalCents);
        return newTotal;

    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
}
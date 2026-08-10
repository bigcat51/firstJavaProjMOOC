public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void advance() {
        this.advance(1);
    }

    public void advance(int howManyDays) {
        day += howManyDays;
        while (day > 30) {
            day -= 30;
            month += 1;
        }
        while (month > 12) {
            month -= 12;
            year += 1;
        }
        //if each month was 30 days
    }

    public SimpleDate afterNumberOfDays(int num) {
        this.advance(num);
        return new SimpleDate(day, month, year);
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }
}
public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {return day;}

    public int getMonth() {return month;}

    public int getYear() {return year;}

    public int hashCode() {
        return this.year * 1000 + this.month * 10 + this.day * 2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof SimpleDate)) {
            return false;
        }

        SimpleDate obj = (SimpleDate) object;

        if (this.day == obj.getDay() && this.getMonth() == obj.month && this.year == obj.getYear()) {
            return true;
        }

        return false;
    }
}

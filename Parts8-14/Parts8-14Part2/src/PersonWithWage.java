public class PersonWithWage implements Comparable<PersonWithWage> {
    private int wage;
    private String name;

    public PersonWithWage(String name, int wage){
        this.wage = wage;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }

    @Override
    public int compareTo(PersonWithWage obj) {
        return this.wage - obj.getWage();
    }

    @Override
    public String toString() {
        return "" + this.wage;
    }
}

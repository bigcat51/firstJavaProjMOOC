public class Person {
    protected String name;
    protected String Adress;

    public Person(String name, String Adress) {
        this.name = name;
        this.Adress = Adress;
    }

    @Override
    public String toString() {
        return name + "\n" + Adress;
    }
}

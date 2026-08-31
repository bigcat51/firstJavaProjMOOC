public class Teacher extends Person {
    protected int salary;

    public Teacher(String name, String Adress, int salary) {
        super(name, Adress);
        this.salary = salary;
    }

    public int returnSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "salary " + salary + " euro/month" ;
    }
}

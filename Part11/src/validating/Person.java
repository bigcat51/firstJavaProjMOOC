package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name.length() > 40 || name.isEmpty() || name == null) {
            throw new IllegalArgumentException("Name too long, empty, or null");
        }
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {}

    public void sleep() {}

    public String getName() {
        return name;
    }
}

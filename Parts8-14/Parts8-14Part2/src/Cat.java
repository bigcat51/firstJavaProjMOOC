public class Cat extends Animal implements NoiseCapable{

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super("Cat");
    }

    public void purr() {
        System.out.println(getName() + " purrs");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps");
    }

    @Override
    public void makeNoise() {
        purr();
    }
}
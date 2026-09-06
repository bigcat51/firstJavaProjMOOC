public class Dog extends Animal implements NoiseCapable{

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    public void bark() {
        System.out.println(getName() + " barks");
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
        bark();
    }
}

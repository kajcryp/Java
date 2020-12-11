package Abstract_Classes;

public class Dog extends Animal {

    public Dog(String name) {
        super(name); //use the default super to save the name in the animal class
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }



}

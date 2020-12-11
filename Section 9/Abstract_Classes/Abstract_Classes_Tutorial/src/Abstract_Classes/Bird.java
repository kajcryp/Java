package Abstract_Classes;

public abstract class Bird extends Animal implements canFly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

 //   public abstract void fly();

    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}

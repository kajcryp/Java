package Abstract_Classes;

// An abstract class can have member variables that are inherited that can't be done in an interface
// Interfaces can have variables but they're all public static final variables, which mean they are going to be constant values that never change with a static scope
// They have to be static as non static variables require an instance and of course you can't instantiate an interface
// Interfaces can not have constructors but abstract classes can
// All methods of an interface are automatically public whereas methods of an abstract class can have any visibility. e.g. private, protected etc
// Abstract classes can have defined methods i.e. methods with an implementation e.g getName() whilst all methods in an Interface are abstract.
// No code in abstract methods. All the actual code has to be written in class that implements the particular interface


public class Main {

    public static void main(String[] args) {
        Dog Yorkie = new Dog("Yorkie");
        Yorkie.breathe();
        Yorkie.eat();

        Parrot parrot = new Parrot("Australian ringneck"); //error message as can't directly instantiate a class that is abstract anyway
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin EmperorPenguin = new Penguin("Emperor");
        EmperorPenguin.fly();
    }
}

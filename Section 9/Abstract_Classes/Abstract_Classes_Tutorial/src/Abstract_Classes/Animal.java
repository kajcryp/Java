package Abstract_Classes;

// Here is an abstract class. Here we are going to inherit from this abstract class and is going to define behaviours that are
// necessary without specifying how they are meant to be performed
// It ensures the subclasses like the dog must implement them
// This is because in the normal class, extension from a class you can create a base method in the class but no requirement to use that method
// By creating abstract methods, we are forcing class to implement from abstract methods to create those methods for us


public abstract class Animal {

    private String name;

    public Animal(String name) {

        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}

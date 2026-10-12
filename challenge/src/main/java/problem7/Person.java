package problem7;

public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    // Abstract method to be implemented by subclasses
    public abstract void display();
}
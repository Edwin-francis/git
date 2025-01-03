package aspireTest;

// Parent Class
class Parent {
    String name;

    // Constructor for Parent class
    public Parent(String name) {
        this.name = name;
        System.out.println("Parent class constructor called. Name: " + this.name);
    }

    // Method in Parent class
    public void display() {
        System.out.println("This is the Parent class.");
    }
}

// Child Class
class Child extends Parent {
    int age;

    // Parameterized constructor for Child class
    public Child(String name, int age) {
        super(name); // Call the Parent constructor
        this.age = age; // Assign age
        System.out.println("Child class constructor called. Age: " + this.age);
    }

    // Default constructor for Child class
   

    // Overriding display method in Child class
    public void display() {
        super.display(); // Call Parent's display method
        System.out.println("This is the Child class.");
    }
}

// Main Class
public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Creating an object with parameterized constructor:");
        Child child1 = new Child("Alice", 10); // Call parameterized constructor
        child1.display();

      
    }
}

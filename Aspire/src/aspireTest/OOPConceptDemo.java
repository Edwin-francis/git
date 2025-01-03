package aspireTest;




/***************************************************************************
 * Program Name: OOP Concepts Demo                                         *
 * Developer: Edwin Francis C                                              *
 * Date: 17-12-2024                                                        *
 * Description:                                                            *
 * This program demonstrates core OOP concepts in Java including:          *
 * - Class and Object                                                      *
 * - Encapsulation                                                         *
 * - Inheritance                                                           *
 * - Polymorphism (Method Overloading and Method Overriding)               *
 * - Abstraction                                                           *
 ****************************************************************************/


 
// Abstract Class: Represents partial abstraction
abstract class Vehicle {
    /**
     * Abstract method to be implemented by child classes.
     */
    public abstract void start();

    /**
     * A concrete method to show vehicle type.
     */
    public void vehicleType() {
        System.out.println("This is a vehicle.");
    }
}

// Interface: Represents full abstraction
interface Fuel {
    /**
     * Abstract method to display fuel type.
     */
    void fuelType();
}

/**
 * Parent Class: Represents a generic Car.
 */
class Car extends Vehicle implements Fuel {
    private String brand; // Encapsulation: private variable
    private int speed;

    /**
     * Constructor to initialize Car object.
     * 
     *  brand Car brand
     *  speed Car speed
     */
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Getter and Setter methods for encapsulation
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Implementation of abstract method from Vehicle class.
     */
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    /**
     * Implementation of interface method to display fuel type.
     */
    @Override
    public void fuelType() {
        System.out.println("Fuel Type: Petrol or Diesel");
    }

    /**
     * Method Overloading: Display car information with and without parameters.
     */
    public void displayInfo() {
        System.out.println("Car Brand: " + brand + ", Speed: " + speed + " km/h");
    }

    public void displayInfo(String color) {
        System.out.println("Car Brand: " + brand + ", Color: " + color + ", Speed: " + speed + " km/h");
    }
}

/**
 * Child Class: Represents an Electric Car.
 */
class ElectricCar extends Car {
    private int batteryCapacity;

    /************************************************************
     * Constructor to initialize ElectricCar object.            *
     *                                                          *
     *  brand Car brand                                         *
     *  speed Car speed                                         *
     *  batteryCapacity Battery capacity of the electric car    *
     ************************************************************/
    public ElectricCar(String brand, int speed, int batteryCapacity) {
        super(brand, speed); // Call to parent class constructor
        this.batteryCapacity = batteryCapacity;
    }

    /**
     * Method Overriding: Override start method from the parent class.
     */
    @Override
    public void start() {
        System.out.println("Electric Car is starting silently...");
    }

    /**
     * Display battery capacity.
     */
    public void displayBattery() {
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

/**
 * Main class to test all OOP concepts.
 */
public class OOPConceptDemo {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car("Toyota", 180);
        car.start(); // Polymorphism (method overriding)
        car.vehicleType();
        car.fuelType();
        car.displayInfo();
        car.displayInfo("Red"); // Method overloading

        System.out.println();

        // Create an ElectricCar object
        ElectricCar eCar = new ElectricCar("Tesla", 200, 100);
        eCar.start(); // Polymorphism (method overriding)
        eCar.vehicleType();
        eCar.fuelType();
        eCar.displayInfo();
        eCar.displayBattery();
    }
}


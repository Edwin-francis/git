package aspireTest;

//Base class Employee
class Employee {
 public String name;
 public int id;

 // Constructor
 public Employee(String name, int id) {
     this.name = name;
     this.id = id;
 }

 // Method to display employee details
 public void display() {
     System.out.println("Employee ID: " + id);
     System.out.println("Employee Name: " + name);
 }
}

//Derived class Manager that extends Employee
class Manager extends Employee {
 private String department;

 // Constructor
 public Manager(String name, int id, String department) {
     super(name, id); // Call the constructor of the base class
     this.department = department;
 }

 // Overriding the display method to include department details
 @Override
 public void display() {
     super.display(); // Call the base class display method
     System.out.println("Department: " + department);
 }
}

//Main class to test the program
public class EmployeeManagement {
 public static void main(String[] args) {
     // Create an Employee object
     Employee emp = new Employee("Edwin", 101);
     emp.display();

     System.out.println(); // Separator for clarity

     // Create a Manager object
     Manager mgr = new Manager("Francis", 102, "IT");
     mgr.display();
 }
}


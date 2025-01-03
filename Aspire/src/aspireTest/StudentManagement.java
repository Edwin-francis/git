package aspireTest;

class Student {
    private String name;
    private int rollNumber;

    // Constructor to initialize Student attributes
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    // Method to display Student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class GraduateStudent extends Student {
    private String specialization;

    // Constructor to initialize GraduateStudent attributes
    public GraduateStudent(String name, int rollNumber, String specialization) {
        super(name, rollNumber); // Call the base class constructor
        this.specialization = specialization;
    }

    // Getter method for specialization
    public String getSpecialization() {
        return specialization;
    }

    // Overriding the displayDetails method to include specialization
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the base class method
        System.out.println("Specialization: " + specialization);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        // Creating an object of GraduateStudent
        GraduateStudent gradStudent = new GraduateStudent("Edwin francis", 101, "Computer Science");

        // Displaying all details
        gradStudent.displayDetails();
    }
}

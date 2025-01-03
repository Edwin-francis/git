package aspireTest;

interface Grading {
    // Method to assign a grade based on marks
    String assignGrade(int marks);
}

class Stu implements Grading {
    private String name;
    private int marks;

    // Constructor to initialize Student attributes
    public Stu(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Implementing the assignGrade method from Grading interface
    @Override
    public String assignGrade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    // Method to display student details along with the grade
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + assignGrade(marks));
    }
}

public class StuMag {
    public static void main(String[] args) {
        // Create Student objects
        Stu student1 = new Stu("Edwin", 92);
        Stu student2 = new Stu("Francis", 78);
        Stu student3 = new Stu("Charles", 45);

        // Display details for each student
        System.out.println("Student 1 Details:");
        student1.displayDetails();

        System.out.println();

        System.out.println("Student 2 Details:");
        student2.displayDetails();

        System.out.println();

        System.out.println("Student 3 Details:");
        student3.displayDetails();
    }
}


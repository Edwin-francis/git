package aspireTest;

interface Bonus {
    // Method to calculate bonus
    double calculateBonus(double salary, String performance);
}

class Emp implements Bonus {
    private String name;
    private double salary;
    private String performance;

    // Constructor to initialize Employee attributes
    public Emp(String name, double salary, String performance) {
        this.name = name;
        this.salary = salary;
        this.performance = performance;
    }

    // Implementing the calculateBonus method from Bonus interface
    @Override
    public double calculateBonus(double salary, String performance) {
        double bonus;
        switch (performance.toLowerCase()) {
            case "excellent":
                bonus = salary * 0.20; // 20% of salary
                break;
            case "good":
                bonus = salary * 0.10; // 10% of salary
                break;
            case "average":
                bonus = salary * 0.05; // 5% of salary
                break;
            default:
                bonus = 0; // No bonus for poor performance
                break;
        }
        return bonus;
    }

    // Method to display employee details along with calculated bonus
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Performance: " + performance);
        System.out.println("Bonus: " + calculateBonus(salary, performance));
    }
}

public class EmpMang {
    public static void main(String[] args) {
        // Create an Employee object
        Emp emp1 = new Emp("Edwin Francis", 50000, "Excellent");
        Emp emp2 = new Emp("Ishu", 40000, "Good");

        // Display employee details
        System.out.println("Employee 1 Details:");
        emp1.displayDetails();

        System.out.println();

        System.out.println("Employee 2 Details:");
        emp2.displayDetails();
    }
}

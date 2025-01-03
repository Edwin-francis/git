package aspireTest;

//Interface for Employee Benefits
interface Benefits {
 String getHealthInsuranceDetails();

 String getRetirementPlan();
}

//Interface for Employee Performance
interface Performance {
 double calculatePerformanceBonus(int performanceRating);
}

//Class implementing both interfaces
class SeniorEmployee implements Benefits, Performance {
 private String name;
 private int yearsOfExperience;
 private double salary;

 // Constructor to initialize attributes
 public SeniorEmployee(String name, int yearsOfExperience, double salary) {
     this.name = name;
     this.yearsOfExperience = yearsOfExperience;
     this.salary = salary;
 }

 // Implementing Benefits interface methods
 @Override
 public String getHealthInsuranceDetails() {
     if (yearsOfExperience >= 10) {
         return "Premium Health Insurance Plan";
     } else if (yearsOfExperience >= 5) {
         return "Standard Health Insurance Plan";
     } else {
         return "Basic Health Insurance Plan";
     }
 }

 @Override
 public String getRetirementPlan() {
     if (yearsOfExperience >= 10) {
         return "Gold Retirement Plan";
     } else {
         return "Silver Retirement Plan";
     }
 }

 // Implementing Performance interface method
 @Override
 public double calculatePerformanceBonus(int performanceRating) {
     double bonusPercentage;
     switch (performanceRating) {
         case 5:
             bonusPercentage = 0.20; // 20% of salary
             break;
         case 4:
             bonusPercentage = 0.15; // 15% of salary
             break;
         case 3:
             bonusPercentage = 0.10; // 10% of salary
             break;
         default:
             bonusPercentage = 0.05; // 5% of salary
     }
     return salary * bonusPercentage;
 }

 // Method to display SeniorEmployee details
 public void displayDetails() {
     System.out.println("Employee Name: " + name);
     System.out.println("Years of Experience: " + yearsOfExperience);
     System.out.println("Salary: " + salary);
 }
}

public class EmpMag2 {
 public static void main(String[] args) {
     // Create a SeniorEmployee object
     SeniorEmployee seniorEmployee = new SeniorEmployee("Edwin franis", 15, 80000);

     // Dynamic polymorphism: Using interface references
     Benefits benefits = seniorEmployee;
     Performance performance = seniorEmployee;

     // Display SeniorEmployee details
     System.out.println("Senior Employee Details:");
     seniorEmployee.displayDetails();

     // Call Benefits methods via interface reference
     System.out.println("\nBenefits:");
     System.out.println("Health Insurance: " + benefits.getHealthInsuranceDetails());
     System.out.println("Retirement Plan: " + benefits.getRetirementPlan());

     // Call Performance method via interface reference
     System.out.println("\nPerformance:");
     int performanceRating = 5; // Example performance rating
     System.out.println("Performance Bonus: " + performance.calculatePerformanceBonus(performanceRating));
 }
}

import java.util.Scanner;

public class cs3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();

        Employee e1 = new Employee(id, name, basicSalary);

        e1.calculateSalary();
        e1.displaySalary();

        sc.close();
    }
}

class Employee {

    int employeeId;
    String name;
    double basicSalary;
    double hra = basicSalary;
    double da = basicSalary;

    double grossSalary;

    // Constructor
    Employee(int id, String n, double salary) {
        employeeId = id;
        name = n;
        basicSalary = salary;
    }

    // Salary calculation
    void calculateSalary() {

        double hra = basicSalary * 20 / 100;
        double da = basicSalary * 10 / 100;

        double grossSalary = basicSalary + hra + da;

    }

    // Display method
    void displaySalary() {
        System.out.println("\n----- Salary Details -----");

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Salary details displayed successfully.");
    }
}
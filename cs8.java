import java.util.Scanner;

public class cs8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String employeeName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double employeeSalary = sc.nextDouble();

        Employee e1 = new Employee(employeeName, employeeSalary);

        System.out.println("\n----- Employee Details -----");
        e1.displayEmployee();


        sc.nextLine();

        System.out.print("\nEnter Manager Name: ");
        String managerName = sc.nextLine();

        System.out.print("Enter Manager Salary: ");
        double managerSalary = sc.nextDouble();

        System.out.print("Enter Manager Bonus: ");
        double bonus = sc.nextDouble();

        Manager m1 = new Manager(managerName, managerSalary, bonus);

        System.out.println("\n----- Manager Details -----");
        m1.displayManager();

        sc.close();
    }
}


class Employee {

    String name;
    double salary;

    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}


class Manager extends Employee {

    double bonus;

    Manager(String n, double s, double b) {

        super(n, s);

        bonus = b;
    }

    void displayManager() {

        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Total Salary: ₹" + (salary + bonus));
    }
}
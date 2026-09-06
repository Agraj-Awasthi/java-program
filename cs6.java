import java.util.Scanner;

public class cs6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Patient Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();

        Patient p1 = new Patient(id, name, age, temperature);

        p1.checkFever();
        p1.displayPatient();

        sc.close();
    }
}


class Patient {

    int patientId;
    String name;
    int age;
    double temperature;

    // Constructor
    Patient(int id, String n, int a, double temp) {
        patientId = id;
        name = n;
        age = a;
        temperature = temp;
    }

    // Check fever
    void checkFever() {

        if (temperature > 100.4) {
            System.out.println("Fever");
        }
        else {
            System.out.println("Normal");
        }
    }

    // Display patient details
    void displayPatient() {

        System.out.println("\n----- Patient Details -----");

        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature + " F");
    }
}
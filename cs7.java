import java.util.Scanner;

public class cs7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Set your PIN: ");
        int pin = sc.nextInt();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        ATM a1 = new ATM(pin, balance);

        int attempts = 0;
        boolean login = false;

        while (attempts < 3) {

            System.out.print("\nEnter PIN: ");
            int enteredPin = sc.nextInt();

            if (a1.checkPin(enteredPin)) {
                login = true;
                System.out.println("PIN correct. Login successful.");
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN.");
                System.out.println("Attempts left: " + (3 - attempts));
            }
        }

        if (login == true) {

            int choice;

            do {
                System.out.println("\n----- ATM Menu -----");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                if (choice == 1) {

                    System.out.print("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();

                    a1.withdraw(amount);

                } else if (choice == 2) {

                    System.out.print("Enter amount to deposit: ");
                    double amount = sc.nextDouble();

                    a1.deposit(amount);

                } else if (choice == 3) {

                    a1.displayBalance();

                } else if (choice == 4) {

                    System.out.println("Thank you for using ATM.");

                } else {

                    System.out.println("Invalid choice.");
                }

            } while (choice != 4);

        } else {

            System.out.println("\nYour account is blocked.");
            System.out.println("Too many incorrect PIN attempts.");
        }

        sc.close();
    }
}


class ATM {

    int pin;
    double balance;

    ATM(int p, double b) {
        pin = p;
        balance = b;
    }

    boolean checkPin(int enteredPin) {

        if (enteredPin == pin) {
            return true;
        } else {
            return false;
        }
    }

    void withdraw(double amount) {

        if (amount <= balance) {

            balance = balance - amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance: ₹" + balance);

        } else {

            System.out.println("Insufficient balance.");
        }
    }

    void deposit(double amount) {

        balance = balance + amount;

        System.out.println("Amount deposited successfully.");
        System.out.println("Updated balance: ₹" + balance);
    }

    void displayBalance() {

        System.out.println("Current balance: ₹" + balance);
    }
}
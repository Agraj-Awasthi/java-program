import java.util.Scanner;

public class cs2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        sc.nextLine(); // leftover Enter ko remove karne ke liye

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        // Object creation
        BankAccount b1 = new BankAccount(accountNumber, name, balance);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();

        b1.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();

        b1.withdraw(withdrawAmount);

        b1.displayBalance();

        sc.close();
    }
}


class BankAccount {

    int accountNumber;
    String name;
    double balance;

    // Constructor
    BankAccount(int accNo, String n, double bal) {
        accountNumber = accNo;
        name = n;
        balance = bal;
    }

    // Deposit method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    // Withdraw method
    void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        }
        else {
            System.out.println("Insufficient balance.");
        }
    }

    // Display balance method
    void displayBalance() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }
}
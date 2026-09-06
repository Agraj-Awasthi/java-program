import java.util.Scanner;

public class cs5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        Book b1 = new Book(id, title, author);

        b1.displayBook();

        System.out.print("\nDo you want to issue the book? (yes/no): ");
        String choice = sc.nextLine();

        if (choice.equals("yes")) {
            b1.issueBook();
        }

        System.out.print("\nDo you want to return the book? (yes/no): ");
        choice = sc.nextLine();

        if (choice.equals("yes")) {
            b1.returnBook();
        }

        b1.displayBook();

        sc.close();
    }
}


class Book {

    int bookId;
    String bookTitle;
    String author;

    boolean available;

    // Constructor
    Book(int id, String title, String a) {
        bookId = id;
        bookTitle = title;
        author = a;

        available = true;
    }

    // Issue book
    void issueBook() {

        if (available == true) {
            available = false;
            System.out.println("Book issued successfully.");
        }
        else {
            System.out.println("Book is already issued.");
        }
    }

    // Return book
    void returnBook() {

        if (available == false) {
            available = true;
            System.out.println("Book returned successfully.");
        }
        else {
            System.out.println("Book was not issued.");
        }
    }

    // Display book
    void displayBook() {

        System.out.println("\n----- Book Details -----");

        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);

        if (available == true) {
            System.out.println("Availability: Available");
        }
        else {
            System.out.println("Availability: Issued");
        }
    }
}
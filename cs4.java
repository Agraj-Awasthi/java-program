import java.util.Scanner;

public class cs4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        Product p1 = new Product(id, name, price, quantity);

        p1.calculateCost();
        p1.displayProduct();

        sc.close();
    }
}


class Product {

    int productId;
    String productName;
    double price;
    int quantity;

    double totalCost;

    // Constructor
    Product(int id, String name, double p, int q) {
        productId = id;
        productName = name;
        price = p;
        quantity = q;
    }

    // Calculate cost of this product
    void calculateCost() {
        totalCost = price * quantity;
    }

    // Display product details
    void displayProduct() {

        System.out.println("\n----- Product Details -----");

        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }
}
import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        sc.nextLine(); // Consume newline

        String[] productName = new String[n];
        int[] quantity = new int[n];
        double[] price = new double[n];

        // Input product details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Product " + (i + 1));

            System.out.print("Product Name: ");
            productName[i] = sc.nextLine();

            System.out.print("Quantity: ");
            quantity[i] = sc.nextInt();

            System.out.print("Price: ");
            price[i] = sc.nextDouble();
            sc.nextLine(); // Consume newline
        }

        int choice;

        do {
            System.out.println("\n===== Inventory Management System =====");
            System.out.println("1. Display Inventory");
            System.out.println("2. Search Product");
            System.out.println("3. Update Quantity");
            System.out.println("4. Calculate Total Inventory Value");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\nProduct\t\tQuantity\tPrice");

                    for (int i = 0; i < n; i++) {
                        System.out.println(productName[i] + "\t\t" + quantity[i] + "\t\t" + price[i]);
                    }
                    break;

                case 2:
                    System.out.print("Enter product name to search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (productName[i].equalsIgnoreCase(search)) {
                            System.out.println("Product Found!");
                            System.out.println("Name: " + productName[i]);
                            System.out.println("Quantity: " + quantity[i]);
                            System.out.println("Price: " + price[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter product name: ");
                    String update = sc.nextLine();

                    boolean updated = false;

                    for (int i = 0; i < n; i++) {
                        if (productName[i].equalsIgnoreCase(update)) {

                            System.out.print("Enter new quantity: ");
                            quantity[i] = sc.nextInt();

                            System.out.println("Quantity updated successfully.");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("Product not found.");
                    }

                    break;

                case 4:
                    double total = 0;

                    for (int i = 0; i < n; i++) {
                        total += quantity[i] * price[i];
                    }

                    System.out.println("Total Inventory Value = " + total);
                    break;

                case 5:
                    System.out.println("Thank you! Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}

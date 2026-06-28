import java.util.Scanner;

public class ContactManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Contact[] contacts = new Contact[100];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Contact ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    contacts[count] = new Contact(id, name, phone, email);
                    count++;

                    System.out.println("Contact Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No contacts available.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            contacts[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Contact ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (contacts[i].contactId == searchId) {
                            contacts[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Contact ID to Delete: ");
                    int deleteId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (contacts[i].contactId == deleteId) {

                            for (int j = i; j < count - 1; j++) {
                                contacts[j] = contacts[j + 1];
                            }

                            contacts[count - 1] = null;
                            count--;

                            found = true;
                            System.out.println("Contact Deleted Successfully!");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact Not Found!");
                    }
                    break;

                case 5:
                    System.out.println("Thank You for Using Contact Management System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice>=1 && choice<= 5);

        sc.close();
    }
}
    


class Contact {
    int contactId;
    String name;
    String phoneNumber;
    String email;

    // Constructor
    Contact(int contactId, String name, String phoneNumber, String email) {
        this.contactId = contactId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Display Contact Details
    void display() {
        System.out.println("\nContact ID   : " + contactId);
        System.out.println("Name         : " + name);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Email        : " + email);
        System.out.println("----------------------------");
    }
}

//      Hospital Management System

import java.util.Scanner;

public class MiniProject {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Patients: ");
        int n = sc.nextInt();

        Patient[] patients = new Patient[n];

        // Input
        for (int i = 0; i < n; i++) {
            patients[i] = new Patient();
            System.out.println("\nEnter Details of Patient " + (i + 1));
            patients[i].input(sc);
        }

        // Display
        System.out.println("\n===== PATIENT DETAILS =====");
        System.out.println("ID\tName\tAge\tDisease");

        for (int i = 0; i < n; i++) {
            patients[i].display();
        }

        sc.close();
    }
}
class Patient {
    int id;
    String name;
    int age;
    String disease;

    void input(Scanner sc) {
        System.out.print("Enter Patient ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Disease: ");
        disease = sc.nextLine();
    }

    void display() {
        System.out.println(id + "\t" + name + "\t" + age + "\t" + disease);
    }
}
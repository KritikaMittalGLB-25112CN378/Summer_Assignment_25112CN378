import java.util.Scanner;

public class SalaryManagementSystem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        SalaryManagement sm = new SalaryManagement();

        int choice;

        do {

            System.out.println("\n===== Salary Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Salary Details");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sm.addEmployee(sc);
                    break;

                case 2:
                    sm.displayEmployees();
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    sm.searchEmployee(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    sm.updateSalary(sc, sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter Employee ID: ");
                    sm.deleteEmployee(sc.nextInt());
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice>=1 && choice <= 6);

        sc.close();
    }
}


class Employee {
    int empId;
    String name;
    double basicSalary;
    double hra;
    double da;
    double grossSalary;

    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;

        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;
        grossSalary = basicSalary + hra + da;
    }

    void display() {
        System.out.println("--------------------------");
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA         : " + hra);
        System.out.println("DA          : " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

class SalaryManagement {

    Employee[] employees = new Employee[100];
    int count = 0;

    void addEmployee(Scanner sc) {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        employees[count] = new Employee(id, name, salary);
        count++;

        System.out.println("Employee Added Successfully!");
    }

    void displayEmployees() {

        if (count == 0) {
            System.out.println("No Records Found!");
            return;
        }

        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }

    void searchEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].empId == id) {
                employees[i].display();
                return;
            }
        }

        System.out.println("Employee Not Found!");
    }

    void updateSalary(Scanner sc, int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].empId == id) {

                System.out.print("Enter New Basic Salary: ");
                employees[i].basicSalary = sc.nextDouble();

                employees[i].hra = employees[i].basicSalary * 0.20;
                employees[i].da = employees[i].basicSalary * 0.10;
                employees[i].grossSalary = employees[i].basicSalary + employees[i].hra + employees[i].da;

                System.out.println("Salary Updated Successfully!");
                return;
            }
        }

        System.out.println("Employee Not Found!");
    }

    void deleteEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].empId == id) {

                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }

                employees[count - 1] = null;
                count--;

                System.out.println("Employee Deleted Successfully!");
                return;
            }
        }

        System.out.println("Employee Not Found!");
    }
}

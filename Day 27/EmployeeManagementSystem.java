import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        EmployeeManagement em = new EmployeeManagement();

        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    em.addEmployee(sc);
                    break;

                case 2:
                    em.displayEmployees();
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    em.searchEmployee(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    em.updateEmployee(sc, sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter Employee ID: ");
                    em.deleteEmployee(sc.nextInt());
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice!= 6);

        sc.close();
    }
}


class Employee {
    int empId;
    String name;
    String department;
    double salary;

    Employee(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("---------------------------");
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : " + salary);
    }
}

class EmployeeManagement {

    Employee[] employees = new Employee[100];
    int count = 0;

    void addEmployee(Scanner sc) {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        employees[count] = new Employee(id, name, dept, salary);
        count++;

        System.out.println("Employee Added Successfully!");
    }

    void displayEmployees() {

        if (count == 0) {
            System.out.println("No Employee Records Found!");
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

    void updateEmployee(Scanner sc, int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].empId == id) {

                sc.nextLine();

                System.out.print("Enter New Name: ");
                employees[i].name = sc.nextLine();

                System.out.print("Enter New Department: ");
                employees[i].department = sc.nextLine();

                System.out.print("Enter New Salary: ");
                employees[i].salary = sc.nextDouble();

                System.out.println("Employee Updated Successfully!");
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

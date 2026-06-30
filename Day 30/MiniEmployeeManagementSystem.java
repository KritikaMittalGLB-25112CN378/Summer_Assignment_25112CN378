import java.util.Scanner;

public class MiniEmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        int[] empId = new int[n];
        String[] empName = new String[n];
        String[] department = new String[n];
        double[] salary = new double[n];

        // Input employee details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Enter Employee ID: ");
            empId[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            empName[i] = sc.nextLine();

            System.out.print("Enter Department: ");
            department[i] = sc.nextLine();

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();
            sc.nextLine();
        }

        // Display employee details
        System.out.println("\n========== EMPLOYEE DETAILS ==========");
        System.out.println("ID\tName\t\tDepartment\tSalary");

        for (int i = 0; i < n; i++) {
            System.out.println(empId[i] + "\t" + empName[i] + "\t\t" + department[i] + "\t\t" + salary[i]);
        }

        sc.close();
    }
}

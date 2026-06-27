import java.util.Scanner;

public class MarksheetGenerationSystem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MarksheetManagement mm = new MarksheetManagement();

        int choice;

        do {

            System.out.println("\n===== Marksheet Generation System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Marksheet");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    mm.addStudent(sc);
                    break;

                case 2:
                    mm.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter Roll Number: ");
                    mm.searchStudent(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Roll Number: ");
                    mm.deleteStudent(sc.nextInt());
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}

class Student {
    int rollNo;
    String name;
    int m1, m2, m3, m4, m5;
    int total;
    double percentage;
    String grade;

    Student(int rollNo, String name, int m1, int m2, int m3, int m4, int m5) {
        this.rollNo = rollNo;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;

        calculateResult();
    }

    void calculateResult() {
        total = m1 + m2 + m3 + m4 + m5;
        percentage = total / 5.0;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 50)
            grade = "D";
        else
            grade = "Fail";
    }

    void display() {
        System.out.println("-----------------------------");
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Name       : " + name);
        System.out.println("Subject 1  : " + m1);
        System.out.println("Subject 2  : " + m2);
        System.out.println("Subject 3  : " + m3);
        System.out.println("Subject 4  : " + m4);
        System.out.println("Subject 5  : " + m5);
        System.out.println("Total      : " + total);
        System.out.println("Percentage : " + percentage);
        System.out.println("Grade      : " + grade);
    }
}

class MarksheetManagement {

    Student[] students = new Student[100];
    int count = 0;

    void addStudent(Scanner sc) {

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks of Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        int m3 = sc.nextInt();

        System.out.print("Enter Marks of Subject 4: ");
        int m4 = sc.nextInt();

        System.out.print("Enter Marks of Subject 5: ");
        int m5 = sc.nextInt();

        students[count] = new Student(roll, name, m1, m2, m3, m4, m5);
        count++;

        System.out.println("Student Record Added Successfully!");
    }

    void displayStudents() {

        if (count == 0) {
            System.out.println("No Records Found!");
            return;
        }

        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }

    void searchStudent(int roll) {

        for (int i = 0; i < count; i++) {

            if (students[i].rollNo == roll) {
                students[i].display();
                return;
            }
        }

        System.out.println("Student Not Found!");
    }

    void deleteStudent(int roll) {

        for (int i = 0; i < count; i++) {

            if (students[i].rollNo == roll) {

                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }

                students[count - 1] = null;
                count--;

                System.out.println("Record Deleted Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found!");
    }
}
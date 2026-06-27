import java.util.Scanner;
public class StudentRecordManagementSystem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        StudentManagement sm = new StudentManagement();

        int choice;

        do{
            System.out.println("\n===== Student Record Management =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice){

                case 1:
                    sm.addStudent(sc);
                    break;
                
                case 2:
                    sm.displayStudent();
                    break;

                case 3:
                     System.out.print("Enter Roll Number: ");
                    sm.searchstudent(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Roll Number: ");
                    sm.updateStudent(sc, sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter Roll Number: ");
                    sm.deleteStudent(sc.nextInt());
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
   
        }while(choice<=6 && choice>=1);
    }
}

class Student{
    int rollNo;
    String name;
    int age;
    double marks;

    Student(int rollNo,String name,int age,double marks){
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
        this.marks=marks;
    }

    void display(){
        System.out.println("Roll No: "+rollNo);
        System.out.println("Name   : "+name);
        System.out.println("Age    : "+age);
        System.out.println("Marks  : "+marks);
        System.out.println("----------------------");
    }
}
class StudentManagement{

    Student[] student=new Student[100];
    int count=0;

    void addStudent(Scanner sc){
        System.out.print("Enter te Roll Number: ");
        int roll=sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name=sc.nextLine();

        System.out.print("Enter Age: ");
        int age=sc.nextInt();

        System.out.print("Enter Marks: ");
        double marks=sc.nextDouble();

        student[count]=new Student(roll,name,age,marks);
        count++;

        System.out.print("Student Added Successfully!");

    }

    void displayStudent(){
        if(count==0){
            System.out.print("No Record Found!");
            return;
        }

        for(int i=0;i<count;i++){
            student[i].display();
        }
    }

    void searchstudent(int roll){
        for(int i=0;i<count;i++){
            if(student[i].rollNo==roll){
                student[i].display();
                return;
            }
        }

        System.out.print("Student Not Found!");
    }

    void updateStudent(Scanner sc, int roll) {
        for (int i = 0; i < count; i++) {
            if (student[i].rollNo == roll) {

                sc.nextLine();

                System.out.print("Enter New Name: ");
                student[i].name = sc.nextLine();

                System.out.print("Enter New Age: ");
                student[i].age = sc.nextInt();

                System.out.print("Enter New Marks: ");
                student[i].marks = sc.nextDouble();

                System.out.println("Record Updated Successfully!");
                return;
            }
        }
        System.out.print("Student Not Found!");
    }

    void deleteStudent(int roll) {
        for (int i = 0; i < count; i++) {

            if (student[i].rollNo == roll) {

                for (int j = i; j < count - 1; j++) {
                    student[j] = student[j + 1];
                }

                student[count - 1] = null;
                count--;

                System.out.println("Student Deleted Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found!");
    }
}

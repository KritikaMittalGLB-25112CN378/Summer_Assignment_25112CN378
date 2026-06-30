import java.util.Scanner;

public class StudentRecordSystemUsingArraysAndStrings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n=sc.nextInt();

        int[] rollNo=new int[n];
        String[] name=new String[n];
        double[] marks=new double[n];

        // Input Students Record

        for(int i=0;i<n;i++){
            System.out.println("\nEnter Details of Student" + (i+1));

            System.out.print("Enter Roll NO.: ");
            rollNo[i]=sc.nextInt();

            System.out.print("Enter Name: ");
            name[i]=sc.next();

            System.out.print("Enter marks: ");
            marks[i]=sc.nextDouble();


        }

        //Display Student Record

        System.out.println("\n------Student Records------");
        System.out.println("RollNo\tName\tMarks");

        for(int i=0; i<n; i++){
            System.out.println(rollNo[i]+"\t"+name[i]+"\t"+marks[i]);
        }

        sc.close();
    }
}

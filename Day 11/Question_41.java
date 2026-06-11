import java.util.Scanner;

public class Question_41 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the number: ");
        int num2=sc.nextInt();

        int sum=Sum(num1,num2);
        System.out.print("The sum of the two numbers is "+sum+ ".");
        sc.close();
    }

    static int Sum(int num1,int num2){
        return num1+num2;
    }
}

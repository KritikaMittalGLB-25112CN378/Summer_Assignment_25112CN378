import java.util.Scanner;

public class Question_42 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the number: ");
        int num2=sc.nextInt();

        max(num1,num2);
        sc.close();

    }
    static void max(int a,int b){
        if(a>b){
            System.out.print(a+" is greater than "+ b+ ".");
        }
        else if(a==b){
            System.out.print(a+ " is equal to "+b+ ".");
        }
        else{
            System.out.print(b+ " is greater than "+a+ ".");
        }
    }
}

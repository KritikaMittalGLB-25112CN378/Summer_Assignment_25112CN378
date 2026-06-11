import java.util.Scanner;
public class Question_44 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int Factorial=factorial(num);
        System.out.print("The factorial of "+ num +" is "+ Factorial+ ".");

        sc.close();
    }
    
    static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }


}

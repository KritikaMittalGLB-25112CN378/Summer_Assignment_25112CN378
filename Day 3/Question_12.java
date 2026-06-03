import java.util.Scanner;

public class Question_12 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();
        int max=(num1>num2)? num1: num2;
        int lcm=max;
        
        while(true){
            
            if(lcm%num1==0 && lcm%num2==0){
                break;
            }
            lcm++;

        }
        System.out.print("The LCM of "+ num1 + " and " + num2+ " is "+ lcm);

    }
        
    

    
}

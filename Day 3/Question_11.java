import java.util.Scanner;

public class Question_11 {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2=sc.nextInt();
        int gcd=0;
        if(num1>num2){
            for(int i=1;i<=num1;i++){
            
                if(num1%i==0 && num2%i==0){
                gcd=i;
                }
            }
        }
        else{
            for(int i=1;i<=num1;i++){
                if(num1%i==0 && num2%i==0){
                gcd=i;
                }
            }
        }
        System.out.print("The GCD of "+ num1 + " and "+ num2+ " is " + gcd);

    }
}

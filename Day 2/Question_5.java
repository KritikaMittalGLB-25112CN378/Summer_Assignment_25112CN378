import java.util.Scanner;
public class Question_5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int sum=0;
        int dup=num;
        while(dup!=0){
            int b=dup%10;
            sum+=b;
            dup/=10;
        }
        System.out.print("The sum of the digits of "+ num + " is "+sum );


    }
    
}

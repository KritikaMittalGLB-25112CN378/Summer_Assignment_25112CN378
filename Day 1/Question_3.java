import java.util.Scanner;
public class Question_3 
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        System.out.print("The factorial of the number is: "+ fact);
    }
    
}

import java.util.Scanner;

public class Question_7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int prod=1;
        int dup=num;
        while(dup!=0){
            int b=dup%10;
            prod*=b;
            dup/=10;
        }
        System.out.print("The product of the digits of " +num+ " is " +prod);
    }
    
}

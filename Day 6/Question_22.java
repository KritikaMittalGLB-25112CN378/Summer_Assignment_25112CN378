import java.util.Scanner;
public class Question_22 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int dup=num;
        
        int rem=0;
        int count=0;
        int dec=0;
        int power=0;
        
        while(dup!=0){
            rem=dup%10;
            dec+=(int)Math.pow(2,power)*rem;
            power++;
            dup/=10;
        }
        System.out.print("The decimal of "+ num+ " is "+dec);
    }
    
}

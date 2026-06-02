import java.util.Scanner;

public class Question_8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int rev=0;
        int dup=num;
        while(dup!=0){
            rev=rev*10+dup%10;
            dup/=10;
        }
        if(num==rev){
            System.out.print(num+" is Palindrome.");
        }
        else{
            System.out.print(num+ " is not Palindrome.");
        }
    }
    
}

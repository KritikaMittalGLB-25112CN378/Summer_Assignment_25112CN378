import java.util.Scanner;

public class functionforpalindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        Palindrome(num);
        sc.close();

    }
    static void Palindrome(int num){

        int dup=num;
        int rev=0;
        while(dup!=0){
            int rem=dup%10;
            rev=rev*10+rem;
            dup/=10;
        }
        if(num==rev){
            System.out.print(num+" is Palindrome number.");
        }
        else{
            System.out.print(num+ " is not Palindrome number.");
        }
    }
}

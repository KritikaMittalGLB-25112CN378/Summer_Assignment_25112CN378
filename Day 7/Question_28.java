import java.util.Scanner;

public class Question_28 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        System.out.print("The reverse of the number is ");
        reverseofnumber(num);
    }

    static void reverseofnumber(int num){
        int rem=num%10;
        if(num==0){
            return;
        }
        System.out.print(rem); 
        reverseofnumber(num/10);

    }
}

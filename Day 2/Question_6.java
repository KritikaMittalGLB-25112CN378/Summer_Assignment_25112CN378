import java.util.Scanner;

public class Question_6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int dup=num;
        int rev=0;
        while(dup!=0){
            rev=dup%10;
            System.out.print(rev);
            dup/=10;
        }
    }
    
}

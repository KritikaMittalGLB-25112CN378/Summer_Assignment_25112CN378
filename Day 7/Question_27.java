import java.util.Scanner;

public class Question_27 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int sum=sumofdigits(num);
        System.out.print("The sum of the digits is "+sum);

    }
    static int sumofdigits(int num){
        int rem=num%10;
        if(num==0){
            return 0;
        }
        return rem+sumofdigits(num/10);
       
    }
    
}

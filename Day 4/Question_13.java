import java.util.Scanner;
public class Question_13{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int num=sc.nextInt();
        int a=1;
        int b=1;
        if(num<=0){
            System.out.print("No fibonacci Series");
        }
        System.out.print("The fibonacci series is: ");
        if(num>=1){
            System.out.print(a+ " ");
        }
        if(num>=2){
            System.out.print(b+" ");
        }

        
        for(int i=3;i<=num;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");

        }
    }
}
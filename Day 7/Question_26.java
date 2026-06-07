import java.util.Scanner;

public class Question_26 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int a=fibonacci(num);
        System.out.print("The fibonacci term is "+a);

    }
    static int fibonacci(int num){
        if(num==1){
            return 0;
        }
        if(num==2){
            return 1;
        }
        return fibonacci(num-1)+fibonacci(num-2);
    }
}

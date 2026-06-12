import java.util.Scanner;
public class functionforfibonacci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();

        Fibonacci(num);
        sc.close();
    }
    static void Fibonacci(int num){
        int a=0;
        int b=1;
        if(num<=0){
            System.out.print("No Fibonacci Series.");
        }
        
        else if(num==1){
            System.out.print("The Fibonacci Series is "+a);
        }
        else if(num==2){
            System.out.print("The Fibonacci Series is "+a +" "+b);
        }
        else{
            System.out.print("The Fibonacci Series is ");
            System.out.print(a+" "+b+" ");
            for(int i=3;i<=num;i++){
                int c=a+b;
                a=b;
                b=c;
                System.out.print(+ c + " ");
            }
        }
    }
}
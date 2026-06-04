import java.util.Scanner;

public class Question_14 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Nth terms whose value to find: ");
        int num=sc.nextInt();
        int a=1;
        int b=1;
        int c=0;
        if(num<=0){
            System.out.print("No value");
        }
        if(num==1){
            System.out.print("The value of 1st term is "+a);
        }
        if(num==2){
            System.out.print("The value of 2nd term is "+b);
        }
        if(num>=3){
            for(int i=3;i<=num;i++){
                c=a+b;
                a=b;
                b=c;
            }
        System.out.print("The value of "+ num+"th term is "+ c);
        }
    }
    
}

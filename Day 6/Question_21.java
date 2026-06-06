import java.util.Scanner;

public class Question_21 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int dup=num;
        int place=1;
        int bin=0;
        
        while(dup!=0){
            int rem=dup%2;
            bin=bin+rem*place;
            place*=10;
            
            dup/=2;
        }
        System.out.print("The binary of "+ num+" is "+bin);
        sc.close();
    }
    
}

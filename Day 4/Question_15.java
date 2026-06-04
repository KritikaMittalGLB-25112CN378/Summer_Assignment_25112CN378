import java.util.Scanner;

public class Question_15 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int dup=num;
        int count=0;
        int temp=num;
        int sum=0;
        while(dup!=0){
            
            count++;
            dup/=10;
        }
        
        while(temp!=0){
            int a=temp%10;
            sum+=(int)Math.pow(a,count);   //as Math.pow() return double data type value.
            temp/=10;

        }
        if(sum==num){
            System.out.print(num+ " is the Armstrong Number.");
        }
        else{
            System.out.print(num+ " is not an Armstrong Number.");
        }









    }
    
}

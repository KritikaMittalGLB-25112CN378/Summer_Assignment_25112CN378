import java.util.Scanner;

public class functionforarmstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        Armstrong(num);
        sc.close();
    }

    static void Armstrong(int num){
        int dup=num;
        int count=0;
        int sum=0;
        while(dup!=0){
            count++;
            dup/=10;
        }
        int a=num;
        while(a!=0){
            int rem=a%10;
            sum+=(int)Math.pow(rem,count);
            a/=10;
        }
        if(sum==num){
            System.out.print(num+" is an Armstrong Number.");
        }
        else{
            System.out.print(num+" is not an Armstrong Number.");
        }
    }
}

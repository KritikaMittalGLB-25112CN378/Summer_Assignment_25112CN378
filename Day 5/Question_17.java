import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum == num){
            System.out.print(num + " is a Perfect number.");
        }
        else{
            System.out.print(num+" is not a Perfect number.");
        }
    }
    
}

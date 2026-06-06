import java.util.Scanner;
public class Question_24 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        System.out.print("Enter the power: ");
        int pow=sc.nextInt();
        int power=1;
        for(int i=1;i<=pow;i++){
            power*=num;

        }
        System.out.print("The number "+num+" with power "+pow+ " is "+power);

    }
    
}

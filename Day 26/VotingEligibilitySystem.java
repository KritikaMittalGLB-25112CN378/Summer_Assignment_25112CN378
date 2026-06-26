import java.util.Scanner;

public class VotingEligibilitySystem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age=sc.nextInt();

        if(age>0){
            if(age>=18){
                System.out.print("You are eligible to vote.");
            }

            else{
                System.out.print("You are not eligible to vote.");
            }
        }

        else{
            System.out.print("Invalid Age.");
        }

        sc.close();
    }
}

import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int number=random.nextInt(100)+1;

        int attempts=0;

        while(true){
            System.out.print("Enter the guess: ");
            int num=sc.nextInt();

            attempts++;
            if(num==number){
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("Attempts taken: "+ attempts);
                break;
            }

            else if(num>number){
                System.out.println("Your number is High.");
            }

            else{
                System.out.println("Your number is low.");
            }

        }

        sc.close();
    }
}

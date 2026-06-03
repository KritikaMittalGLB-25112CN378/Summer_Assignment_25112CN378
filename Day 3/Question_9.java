import java.util.Scanner;

public class Question_9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int count=0;
        if(num==1){
            System.out.print("1 is neither a prime number or a composite number.");
        }
        else{
            for(int i=1;i<=num;i++){
                if(num%i==0){
                count++;
                }
            }
            if(count==2){
                System.out.print(num+ " is the prime number.");
            }
            else{
                System.out.print(num+ " is not a prime number.");
            }
        }
    }
    
}

import java.util.Scanner;
public class Question_19 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        System.out.print("The factors of the numbers are ");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i +" ");
            }
        }
    }
    
}

import java.util.Scanner;
public class Question_25 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int a=fact(num);
        System.out.print("The factorial of the number is "+a);
    }



    static int fact(int num) {
        if(num==0){
            return 1;
        }
        if(num==1){
            return 1;
        }
        
        return num*fact(num-1);

    }
    
    
}

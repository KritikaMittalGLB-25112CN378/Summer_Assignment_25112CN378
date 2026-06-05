import java.util.Scanner;
public class Question_20 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int max=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                int count=0;
                for(int j=1;j<=i;j++){
                    
                    if(i%j==0){
                        count++;
                    }
                }
                if(count==2){
                    max=i;
                }
            }
        }
        System.out.print("The maximum prime factor is "+ max);
    }
    
}

import java.util.Scanner;

public class Question_10 {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number upto which find prime number: ");
        int ran=sc.nextInt();
        
        if(ran==1){
            System.out.print("1 is neither a prime number nor a composite number.");
        }
        else{
            for(int i=2;i<=ran;i++){
                int count=0;
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                        count++;
                    }
                    
                }
                if(count==2){
                    System.out.print(i +" ");
                }
            }
        }

        
    }
    
}

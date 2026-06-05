import java.util.Scanner;
public class Question_18 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int dup=num;
        int sum=0;
        
        while(dup!=0){
            int a=dup%10;
            int fact=1;
            
            for(int i=a;i>=1;i--){
                fact*=i;


            }
            sum+=fact;
            dup/=10;
            }
        if(sum==num){
            System.out.print(num+ " is a Strong number");
        }
        else{
            System.out.print(num +" is not a Strong number");
        }
    }
    
}

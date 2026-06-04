import java.util.Scanner;
public class Question_16 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the start number of the number: ");
        int str=sc.nextInt();
        System.out.print("Enter the end number of the number: ");
        int end=sc.nextInt();
        System.out.print("The Armstrong number between "+str+ " and "+end+ " is: ");
        
        for(int i=str;i<=end;i++){
            int dup=i;
            int temp=dup;
            int count=0;
            int sum=0;
            while(dup!=0){
                count++;
                dup/=10;

            }
            
            while(temp!=0){
                int a=temp%10;
                sum+=(int)Math.pow(a,count);
                temp/=10;

            }
            if(sum==i){
                System.out.print(i+ " ");
            }
        }


    }
    
}

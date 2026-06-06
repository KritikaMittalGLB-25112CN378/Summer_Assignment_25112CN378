import java.util.Scanner;
public class Question_23 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int dup=num;
        int count=0;
        while(dup!=0){
            int rem=dup%2;
            if(rem==1){
                count++;
            }
            dup/=2;

        }
        System.out.print("The set bits in "+num+" is "+count);


    }
    
}

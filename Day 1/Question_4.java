import java.util.Scanner;
public class Question_4 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int dup=num;
        int count=0;
        while(dup!=0){
            int nb=dup%10;
            count+=1;
            dup/=10;

        }
        System.out.print("The number of digits in a number is: "+ count);

    }    

}

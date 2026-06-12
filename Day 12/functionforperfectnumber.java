import java.util.Scanner;

public class functionforperfectnumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        Perfect_Number(num);
        sc.close();

    }
    static void Perfect_Number(int num){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.print(num+ " is a Perfect Number.");
        }
        else{
            System.out.print(num+ " is not a Perfect Number.");
        }
    }
}

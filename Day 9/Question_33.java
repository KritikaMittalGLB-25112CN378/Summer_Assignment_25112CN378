import java.util.Scanner;
public class Question_33{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows=sc.nextInt();
        int str=5;
        int sp=0;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=str;j++){
                System.out.print("*");
            }
            str--;
            System.out.println();
        }
        sc.close();
    }

}
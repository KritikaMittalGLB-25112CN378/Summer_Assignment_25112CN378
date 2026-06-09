import java.util.Scanner;

public class Question_35 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows=sc.nextInt();
        char b;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                int a=i+64;
                b=(char)a;
                System.out.print(b);
            }
            System.out.println();
        }
        sc.close();
    }
    
}

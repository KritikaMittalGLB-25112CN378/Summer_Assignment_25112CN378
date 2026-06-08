import java.util.Scanner;

public class Question_31 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=65;j<=64+i;j++){
                char a=(char)j;
                System.out.print(a);

            }
            System.out.println();
        }
        sc.close();
    }
}

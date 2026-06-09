import java.util.Scanner;
public class Question_36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                if(i==1 || j==1 || i==rows ||j==rows){
                    System.out.print("*");
                }
                
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        sc.close();
    }
    
}

import java.util.Scanner;

public class coloumnwisesum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row of the matrix: ");
        int row=sc.nextInt();

        System.out.print("Enter the coloumn of the matrix: ");
        int col=sc.nextInt();

        System.out.println("Enter the elements in the matrix: ");
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int j=0;j<col;j++){
            int sum=0;
            for(int i=0;i<row;i++){
                sum+=arr[i][j];
            }
            System.out.println("The sum of coloumn "+ (j+1)+ " is "+sum);
        }

        sc.close();
    }
}

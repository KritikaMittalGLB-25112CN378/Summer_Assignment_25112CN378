import java.util.Scanner;
public class Diagonalsumofmatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of row of first matrix: ");
        int row=sc.nextInt();

        System.out.print("Enter the size of coloumns of first matrix: ");
        int col=sc.nextInt();

        int[][] arr=new int[row][col];

        System.out.println("Enter the elements in first matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        if(row==col){
            int sum=0;
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(i==j || i+j==row-1){
                        sum+=arr[i][j];
                    }
                }
            }
            int ans=0;
            ans=sum-arr[row/2][col/2];

            System.out.print("The sum of the diagonal elements are "+ ans);
        }

        else{
            System.out.print("Diagonal only possible for matrix whose rows and coloumns are equal. ");
        }

        sc.close();
    }
}

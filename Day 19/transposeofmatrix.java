import java.util.Scanner;
public class transposeofmatrix {
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

        int[][] brr=new int[col][row];
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                brr[i][j]=arr[j][i];
            }
        }

        System.out.println("Transpose of the matrix is: ");
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(brr[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

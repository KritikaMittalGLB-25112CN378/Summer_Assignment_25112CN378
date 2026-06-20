import java.util.Scanner;

public class multiplicationofmatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of row of first matrix: ");
        int row1=sc.nextInt();

        System.out.print("Enter the size of coloumns of first matrix: ");
        int col1=sc.nextInt();

        int[][] arr1=new int[row1][col1];

        System.out.println("Enter the elements in first matrix: ");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter the size of row of second matrix: ");
        int row2=sc.nextInt();
        System.out.print("Enter the size of coloumns of second matrix: ");
        int col2=sc.nextInt();

        int[][] arr2=new int[row2][col2];
        System.out.println("Enter the elements in second matrix: ");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        int [][]crr=new int[row1][col2];

        if(col1==row2){

            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++){
                    for(int k=0;k<col1;k++){
                        crr[i][j]+=arr1[i][k]*arr2[k][j];
                    }
                }
            }
            System.out.println("Multiplication of matrices:");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print(crr[i][j] + " ");
                }
                System.out.println();
            }

        }

        else{
            System.out.print("Multiplication is not posssible.");
        }
        sc.close();
    }
}

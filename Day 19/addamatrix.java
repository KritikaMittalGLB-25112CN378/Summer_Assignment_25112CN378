import java.util.Scanner;

public class addamatrix {
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

        if(row1==row2 && col1==col2){

            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    arr1[i][j]+=arr2[i][j];
                }
            }
            System.out.println("The sum of two matrices is: ");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    System.out.print(arr1[i][j]+ " ");
                }
            System.out.println();
            }
        }

        

        else{
            System.out.print("Sum is not possible.");
        }

        sc.close();


    }
    
}


        

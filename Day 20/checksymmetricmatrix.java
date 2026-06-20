import java.util.Scanner;

public class checksymmetricmatrix {
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

        boolean found=true;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                if(arr[j][i]!=arr[i][j]){
                    found=false;
                    break;
                }

            }
            if(!found){
                break;
            }
        }

        

        if(found){
            System.out.print("Matrix is Symmetric.");
        }
        else{
            System.out.print("Matrix is not symmetric.");
        }

        sc.close();
    }
}

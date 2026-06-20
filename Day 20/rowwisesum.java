import java.util.Scanner;

public class rowwisesum {
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

        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<col;j++){
                sum+=arr[i][j];
            }

            System.out.println("The sum of the row "+ (i+1) +" is "+ sum);
        }

        sc.close();

    }
}

import java.util.Scanner;

public class sumandaverageofelementsofarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size=sc.nextInt();
        int[] arr=new int [size];

        System.out.print("Enter the elements of an array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int sum=0;
        float avg=0.0f;
        for(int i=0;i<size;i++){
            sum+=arr[i];
            avg=(float) sum/arr.length;
        }

        System.out.println("The sum of the elements of an array is "+ sum);
        System.out.print("The average of the elements of an array is "+ avg);

        sc.close();
    }
}

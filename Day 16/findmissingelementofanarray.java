import java.util.Scanner;
public class findmissingelementofanarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number upto elements in an array: ");
        int size=sc.nextInt();
        int[] arr=new int[size-1];

        System.out.print("Enter the elements in an array: ");
        for(int i=0;i<size-1;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size-1;i++){
            sum+=arr[i];
        }
        int expected_sum=(size*(size+1))/2;

        int missing_number=expected_sum - sum;

        System.out.print("The missing elements in the array is "+missing_number);
        sc.close();
    }
}

import java.util.Scanner;

public class countevenandoddelementsinanarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements of an array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter the elements of an array: ");

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int ceven=0;
        int codd=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                ceven++;
            }
            if(arr[i]%2!=0){
                codd++;
            }
        }
        System.out.println("The number of odd elements in ana array are "+ codd);
        System.out.print("The number of even elements in an array are "+ ceven);

        sc.close();
    }
}

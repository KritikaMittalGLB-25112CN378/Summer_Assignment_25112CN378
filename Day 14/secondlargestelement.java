import java.util.Scanner;
public class secondlargestelement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter the element of an array: ");
        int max=arr[0];
        int smax=arr[0];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i=0;i<size;i++){
            if(smax<arr[i] && max!=arr[i]){
                smax=arr[i];
            }
        }

        System.out.print("The second largest element in an array is "+smax);
        sc.close();
    }
}

import java.util.Scanner;

public class largestandsmallestelementofanarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size=sc.nextInt();
        int[] arr=new int [size];
        System.out.print("Enter the elements in an array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        
        for(int i=0;i<size;i++){
            
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum element in an array is "+ max);
        System.out.print("The minimum element in an array is "+min);
        sc.close();

    }
}

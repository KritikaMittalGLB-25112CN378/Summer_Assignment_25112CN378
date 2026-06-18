import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];

        System.out.print("Enter the elements in an array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        //Selection Sort
        int temp=0;
        for(int i=0;i<size-1;i++){
            int min=i;
            for(int j=i+1;j<size;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }

        System.out.print("Sorted Array: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}

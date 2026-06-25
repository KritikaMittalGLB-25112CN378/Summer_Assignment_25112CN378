import java.util.*;

public class mergesortedarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        int size1=sc.nextInt();

        int[] arr1=new int[size1];
        System.out.print("Enter the elements in first array: ");
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.print("Enter the size of second array: ");
        int size2=sc.nextInt();

        int[] arr2=new int[size2];
        System.out.print("Enter the elements in second array: ");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }

        int[] merged=new int[size1+size2];
        int i=0;
        int j=0;
        int k=0;

        while(i<size1 && j<size2){
            if(arr1[i]<arr2[j]){
                merged[k]=arr1[i];
                i++;
            }

            else{
                merged[k]=arr2[j];
                j++;
            }
            k++;
        }

        while(i<size1){
            merged[k]=arr1[i];
            i++;
            k++;

        }

        while(j<size2){
            merged[k]=arr2[j];
            j++;
            k++;
        }

        System.out.print("The sorted merged array are "+ Arrays.toString(merged));
        sc.close();
    }    
}

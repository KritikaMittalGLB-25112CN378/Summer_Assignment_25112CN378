import java.util.Scanner;
public class binarysearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];

        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int ele=sc.nextInt();

        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==ele){
                System.out.print("The element "+ele+ " is found at "+ (mid+1) + " position");
                break;
            }

            else if(arr[mid]>ele){
                end=mid-1;
            }

            else{
                start=mid+1;
            }
        }
        if(start>end){
            System.out.print("Element not found");
        }

        
       sc.close();     
        
    }
}
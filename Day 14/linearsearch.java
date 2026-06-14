import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in an array: ");
        int size=sc.nextInt();
        int index=-1;
        int[] arr=new int[size];
        
        System.out.print("Enter the elements in an array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element to find: ");
        int ele=sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==ele){
                index=i;
                break;
            }
            
            
        }
        if(index!=-1){
                System.out.print("Element found at position "+(index +1));
            }
        else{
            System.out.print("Element not found");
        }
        sc.close();
    }
}

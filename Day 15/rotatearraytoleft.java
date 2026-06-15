import java.util.Scanner;
public class rotatearraytoleft{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];

        System.out.print("Enter the elements in an array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the number of times rotation: ");
        int k=sc.nextInt();
        for(int i=1;i<=k;i++){
            int temp=arr[0];
            for(int j=0;j<size-1;j++){
                arr[j]=arr[j+1];
            }
            arr[size-1]=temp;

            
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close(); 
    }
}
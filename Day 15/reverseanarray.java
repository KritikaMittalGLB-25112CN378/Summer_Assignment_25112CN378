import java.util.Scanner;
public class reverseanarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        int[] rev=new int[size];

        System.out.print("Enter the elements of an array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.print("The reversed array is: ");
        for(int i=0;i<size;i++){
           rev[i]=arr[size-i-1];
           System.out.print(rev[i]+" ");

        }
        sc.close();
    }
}

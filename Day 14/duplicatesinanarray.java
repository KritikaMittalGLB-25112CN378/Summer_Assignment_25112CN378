import java.util.Scanner;
public class duplicatesinanarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter the elements in an array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The duplicates in an array are: ");
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+ " ");
                    break;
                }
            }
        }
        sc.close();
    }
}

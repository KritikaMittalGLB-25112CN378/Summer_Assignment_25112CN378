import java.util.Scanner;

public class movezeroestoend {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        int[] result=new int[size];

        System.out.print("Enter the elements of an array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            
        }
        int j=0;
        System.out.print("The modified array is: ");
        for(int i=0;i<size;i++){
            if(arr[i]!=0){
                result[j]=arr[i];
                j++;
            }
            
        }
        for(int i=0;i<size;i++){
            System.out.print(result[i]+" ");
        }
    }
}

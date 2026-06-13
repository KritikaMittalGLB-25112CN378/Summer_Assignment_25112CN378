import java.util.Scanner;
public class Inputandprintanarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size=sc.nextInt();
        int [] arr=new int [size];

        System.out.print("Enter the elements in an array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("The elements of an array are ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

        sc.close();
    }
}

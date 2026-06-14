import java.util.Scanner;

public class frequencyofanelementinanarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size=sc.nextInt();
        int[] arr=new int [size];
        int count=0;
        System.out.print("Enter the elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element whose frequency to find: ");
        int freq=sc.nextInt();

        for(int i=0;i<size;i++){
            if(arr[i]==freq){
                count++;
            }
        }
        System.out.print("The frequency of "+ freq +" is "+ count);
        sc.close();
    }
}

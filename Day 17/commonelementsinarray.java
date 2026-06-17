import java.util.Scanner;

public class commonelementsinarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        int size1=sc.nextInt();
        int[] arr1=new int[size1];

        System.out.print("Enter the elements in first array: ");
        for(int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter the size of second array: ");
        int size2=sc.nextInt();
        int[] arr2=new int[size2];

        System.out.print("Enter the elements in second array: ");
        for(int i=0;i<size2;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.print("Common elements are ");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
        
        sc.close();

    }
}



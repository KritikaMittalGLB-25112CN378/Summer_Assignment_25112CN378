import java.util.Scanner;

public class intersectionofarray {
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
        
        int[] intersection=new int[size1+size2];
        int k=0;
        for (int i = 0; i < size1; i++) {
            boolean found = false;

            for (int j = 0; j < size2; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            boolean alreadyAdded = false;
            for (int j = 0; j < k; j++) {
                if (intersection[j] == arr1[i]) {
                   alreadyAdded = true;
                    break;
                }
            }

            if (found && !alreadyAdded) {
                intersection[k] = arr1[i];
                k++;
            }
        }

                

        System.out.print("The intersection of array is ");
        for(int i=0;i<k;i++){
            System.out.print(intersection[i]+" ");
        }
        sc.close();

    }
}

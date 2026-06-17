import java.util.Scanner;

public class unionofarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size1=sc.nextInt();
        int[] arr1=new int[size1];

        System.out.print("Enter the elements in first array: ");
        for(int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter the size of second array: ");
        int size2=sc.nextInt();
        int[] arr2=new int[size2];

        System.out.print("Enter the elements in first array: ");
        for(int i=0;i<size2;i++){
            arr2[i]=sc.nextInt();
        }

        //Merge array
        int[] merged=new int[size1+size2];
        for(int i=0;i<size1;i++){
            merged[i]=arr1[i];
        }
        for(int i=0;i<size2;i++){
            merged[size1+i]=arr2[i];
        }
        int[] union=new int[size1+size2];
        int k=0;
        for(int i=0;i<merged.length;i++){
            boolean isdup=false;
            for(int j=0;j<i;j++){
                if(merged[i]==merged[j]){
                    isdup=true;
                    break;
                }
            }

            if(!isdup){
                union[k]=merged[i];
                k++;
            }
        }
        System.out.print("Union of the array is ");
        for(int i=0;i<k;i++){
            System.out.print(union[i]+" ");
        }
        sc.close();
    }
}

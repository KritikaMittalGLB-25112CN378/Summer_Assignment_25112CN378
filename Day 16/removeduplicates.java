import java.util.Scanner;

public class removeduplicates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        
        System.out.print("Enter the elements of an array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int[] dup=new int[size];
        int k=0;
        for(int i=0;i<size;i++){
            boolean isdup=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    isdup=true;
                }
            }
            if(!isdup){
               dup[k]=arr[i];
               k++;
            }
        }

        
        for(int i=0;i<k;i++){
            System.out.print(dup[i]+ " " );
        }
        sc.close();


   }
}

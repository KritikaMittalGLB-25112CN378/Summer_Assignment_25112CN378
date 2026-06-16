import java.util.Scanner;

public class maximumfrequencyelement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];

        System.out.print("Enter the elements of an array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max_element=arr[0];
        int max_frequency=0;
        for(int i=0;i<size;i++){
            int count=0;
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

            if(count>max_frequency){
                max_frequency=count+1;
                max_element=arr[i];
            }
            
        }
        System.out.println("The maximum frequency element is "+ max_element);
        System.out.print("The maximum frequency is "+max_frequency);

        sc.close();
    }   
}

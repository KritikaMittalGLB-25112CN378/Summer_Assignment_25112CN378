import java.util.Scanner;
public class findpairwithgivensum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];

        System.out.print("Enter the elements of an array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the sum whose pair to find: ");
        int sum=sc.nextInt();
        boolean found=false;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.print("The pairs are "+arr[i]+ " and "+arr[j]);
                    found=true;
                }
            }
        }

        if(!found){
            System.out.print("Pair not found.");
        }
        sc.close();
    }
}
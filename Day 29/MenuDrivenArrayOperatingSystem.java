import java.util.Scanner;

public class MenuDrivenArrayOperatingSystem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.print("Enter the elements in an array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int choice;

        do{

            System.out.println("\n===== Array Operations Menu =====");
            System.out.println("1. Display Array");
            System.out.println("2. Search an Element");
            System.out.println("3. Find Maximum");
            System.out.println("4. Find Minimum");
            System.out.println("5. Calculate Sum");
            System.out.println("6. Calculate Average");
            System.out.println("7. Exit");

            System.out.print("Enter the choice: ");
            choice=sc.nextInt();


            switch(choice){
                case 1:
                    System.out.print("The elements of an array are: ");
                    for(int i=0;i<size;i++){
                        System.out.print(arr[i]+" ");
                    }
                    break;

                case 2:
                    System.out.print("Enter the element to be searched: ");
                    int ele=sc.nextInt();
                    boolean found=false;
                    int el=-1;

                    for(int i=0;i<size;i++){
                        if(arr[i]==ele){
                            found=true;
                            el=i+1;
                            break;
                        }
                    }

                    if(found){
                        System.out.print("Element found at "+ el);
                    }
                    else{
                        System.out.print("Element not found!");
                    }
                    break;

                case 3:
                    int max=arr[0];
                    for(int i=1;i<size;i++){
                        if(max<arr[i]){
                            max=arr[i];
                        }
                    }
                    System.out.print("The Maximum value in an array is: "+max);
                    break;

                case 4:
                    int min=arr[0];
                    for(int i=1;i<size;i++){
                        if(min>arr[i]){
                            min=arr[i];
                        }
                    }
                    System.out.print("The Minimum value in an array is: "+min);
                    break;

                case 5:
                    int sum=0;
                    for(int i=0;i<size;i++){
                        sum+=arr[i];
                    }
                    System.out.print("The sum of elements in an array: "+sum);
                    break;

                case 6:
                    int sum1=0;
                    for(int i=0;i<size;i++){
                        sum1+=arr[i];

                    }
                    float avg=(float)sum1/size;
                    System.out.print("The average of elements in an array: "+ avg);
                    break;

                case 7:
                    System.out.print("Thank you! Program Ended.");
                    break;

                default:
                    System.out.print("Invalid choice.");

            }
        }while(choice!=7);

        sc.close();

    }
}

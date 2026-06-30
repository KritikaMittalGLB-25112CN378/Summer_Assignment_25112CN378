import java.util.Scanner;

public class MiniLibrarySystem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int n=sc.nextInt();
        sc.nextLine();

        String[] bookName=new String[n];
        String[] author=new String[n];
        int[] bookId=new int[n];

        // Input Book Details
        for(int i=0;i<n;i++){
            System.out.println("\nEnter Details of Book "+(i+1));

            System.out.print("Enter BookId: ");
            bookId[i]=sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Book Name: ");
            bookName[i]=sc.nextLine();

            System.out.print("Enter Author Name: ");
            author[i]=sc.nextLine();
        }
        
        // Display Books

        System.out.println("\n-------Library Books-------");
        System.out.println("BookId\tBook Name\tAuthor");

        for(int i=0;i<n;i++){
            System.out.println(bookId[i]+"\t"+bookName[i]+"\t\t"+author[i]);
        }

        sc.close();
    }   
}

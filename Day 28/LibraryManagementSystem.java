import java.util.Scanner;
public class LibraryManagementSystem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        Book[] books=new Book[100];
        int count=0;
        int choice;

        do{
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.println("Enter Author Name: ");
                    String author = sc.nextLine();

                    books[count] = new Book(id, title, author);
                    count++;

                    System.out.println("Book Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("\nLibrary Books:");
                        for (int i = 0; i < count; i++) {
                            books[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (books[i].Id == issueId) {
                            found = true;

                            if (!books[i].issued) {
                                books[i].issued = true;
                                System.out.println("Book Issued Successfully!");
                            } else {
                                System.out.println("Book is already issued.");
                            }
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to Return: ");
                    int returnId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (books[i].Id == returnId) {
                            found = true;

                            if (books[i].issued) {
                                books[i].issued = false;
                                System.out.println("Book Returned Successfully!");
                            } else {
                                System.out.println("Book was not issued.");
                            }
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Book Title to Search: ");
                    String searchTitle = sc.nextLine();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (books[i].title.equalsIgnoreCase(searchTitle)) {
                            books[i].display();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using Library Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice!= 6);

        sc.close();
    }
}


class Book{
    int Id;
    String title;
    String author;
    boolean issued;

    Book(int Id,String title,String author){
        this.Id=Id;
        this.title=title;
        this.author=author;
        this.issued=false;
    }

    void display(){
        System.out.println("Book Id: "+Id);
        System.out.println("Title  : "+title);
        System.out.println("Author : "+author);
        System.out.println("Status : "+ (issued? "Issued" : "Available"));
        System.out.println("--------------------------");

    }
}

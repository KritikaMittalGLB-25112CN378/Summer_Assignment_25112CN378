import java.util.Scanner;

public class MenuDrivenStringOperationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int choice;

        do {
            System.out.println("\n===== String Operations Menu =====");
            System.out.println("1. Display String");
            System.out.println("2. Find Length");
            System.out.println("3. Convert to Uppercase");
            System.out.println("4. Convert to Lowercase");
            System.out.println("5. Reverse String");
            System.out.println("6. Check Palindrome");
            System.out.println("7. Count Vowels");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("String: " + str);
                    break;

                case 2:
                    System.out.println("Length of string: " + str.length());
                    break;

                case 3:
                    System.out.println("Uppercase: " + str.toUpperCase());
                    break;

                case 4:
                    System.out.println("Lowercase: " + str.toLowerCase());
                    break;

                case 5:
                    System.out.print("Reversed String: ");
                    for (int i = str.length() - 1; i >= 0; i--) {
                        System.out.print(str.charAt(i));
                    }
                    System.out.println();
                    break;

                case 6:
                    String reverse = "";

                    for (int i = str.length() - 1; i >= 0; i--) {
                        reverse += str.charAt(i);
                    }

                    if (str.equals(reverse)) {
                        System.out.println("The string is a Palindrome.");
                    } else {
                        System.out.println("The string is not a Palindrome.");
                    }
                    break;

                case 7:
                    int count = 0;

                    for (int i = 0; i < str.length(); i++) {
                        char ch = Character.toLowerCase(str.charAt(i));

                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                            count++;
                        }
                    }

                    System.out.println("Number of vowels: " + count);
                    break;

                case 8:
                    System.out.println("Thank you! Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}

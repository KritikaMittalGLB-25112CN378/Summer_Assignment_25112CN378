import java.util.Scanner;
public class checkpalindromestring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();

        str=str.toLowerCase();

        String rev="";

        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.print("String is Palindrome.");
        }

        else{
            System.out.print("String is not Palindrome.");
        }
        sc.close();
    }
}
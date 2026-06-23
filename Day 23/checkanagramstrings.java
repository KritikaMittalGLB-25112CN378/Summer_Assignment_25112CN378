import java.util.Arrays;
import java.util.Scanner;

public class checkanagramstrings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1=sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2=sc.nextLine();

        char[] a=str1.toLowerCase().toCharArray();
        char[] b=str2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            System.out.print("Strings are anagram");

        }
        else{
            System.out.print("Strings are not anagram.");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class reverseofastring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();

        String rev=" ";

        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);

        }

        System.out.print("The reverse of the string is "+ rev);

        sc.close();

    }
}

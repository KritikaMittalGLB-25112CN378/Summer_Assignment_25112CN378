import java.util.Scanner;

public class checkstringrotation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1=sc.nextLine();

        System.out.print("Enter the second string: ");
        String s2=sc.nextLine();

        if(s1.length()==s2.length() && (s1+s1).contains(s2)){
            System.out.print(s2+ " is the string rotation of "+s1);
        }
        else{
            System.out.print(s2+ " is not the string rotation of "+s1);
        }

        sc.close();
    }
}

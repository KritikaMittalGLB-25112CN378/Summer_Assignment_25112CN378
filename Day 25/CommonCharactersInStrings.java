import java.util.Scanner;

public class CommonCharactersInStrings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1=sc.nextLine();
        str1=str1.toLowerCase();

        System.out.print("Enter the second string: ");
        String str2=sc.nextLine();
        str2=str2.toLowerCase();

        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);

            for(int j=0;j<i;j++){
                if(ch==str2.charAt(j)){
                    System.out.print("The common character in the string is "+ ch +" ");
                    break;
                }
            }
                
        }
        sc.close();
    }
}

import java.util.Scanner;

public class compressedstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();

        String compress="";
        int count=1;
        for(int i=0;i<str.length();i++){
            if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
            }

            else{
                compress+=str.charAt(i);
                compress+=count;
                count=1;
            }
        }

        System.out.print("Compressed String "+compress);

        sc.close();
    }
}

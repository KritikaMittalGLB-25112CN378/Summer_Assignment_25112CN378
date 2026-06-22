import java.util.Scanner;

public class removespacesfromstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sent=sc.nextLine();

        String result="";
        for(int i=0;i<sent.length();i++){
            if(sent.charAt(i)!=' '){
                result+=sent.charAt(i);
            }
        }

        System.out.print("String after removing spaces: "+result);

        sc.close();
    }
}

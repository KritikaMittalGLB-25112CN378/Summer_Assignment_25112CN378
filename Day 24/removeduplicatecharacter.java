import java.util.Scanner;

public class removeduplicatecharacter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();

        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            boolean found=false;

            for(int j=0;j<i;j++){
                if(str.charAt(j)==ch){
                    found=true;
                    break;
                }
            }
            if(!found){
                result+=ch;
            }
        }
        System.out.print("String after removing duplicates: "+ result);
        sc.close();
    }
}

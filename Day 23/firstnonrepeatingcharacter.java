import java.util.Scanner;

public class firstnonrepeatingcharacter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();

        str=str.toLowerCase();
        boolean found=false;
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }

            if(count==1){
                System.out.print("The first non repeating character in a string is "+ str.charAt(i));
                found=true;
                break;
            }
        }
        if(!found){
            System.out.print("There is no first non repeating character in a string.");
        }

        sc.close();

    }
}

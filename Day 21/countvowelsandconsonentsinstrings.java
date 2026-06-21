import java.util.Scanner;

public class countvowelsandconsonentsinstrings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();

        int countvowels=0;
        int countconsonents=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            
            char ch= str.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    countvowels++;
                }
                else{
                    countconsonents++;
                }

            }
        }
        System.out.println("The number of vowels in the string is "+countvowels);
        System.out.print("The number of consonents in the string is "+countconsonents);
        
        sc.close();
    }
}

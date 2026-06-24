import java.util.Scanner;

public class longestword {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sent=sc.nextLine();

        String[] words=sent.split(" ");
        String longest=words[0];

        for(int i=1;i<words.length;i++){
            if(words[i].length()>longest.length()){
                longest=words[i];
            }
        }
        System.out.print("Longest word is "+longest);
        sc.close();
    }
}

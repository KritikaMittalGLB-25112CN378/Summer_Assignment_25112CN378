import java.util.Scanner;
public class countwordsinasentence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sent=sc.nextLine();

        sent=sent.trim();
        int count=0;
        if(!sent.isEmpty()){
            count=1;

            for(int i=0;i<sent.length()-1;i++){
                if(sent.charAt(i)==' ' && sent.charAt(i+1)!=' '){
                    count++;
                }
            }
        }

        System.out.print("Number of Words is "+count);

        sc.close();
    }
}

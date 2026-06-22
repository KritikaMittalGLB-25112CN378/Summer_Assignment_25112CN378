import java.util.Scanner;

public class characterfrequency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();

        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            boolean counted=false;
            for(int j=0;j<i;j++){
                if(str.charAt(i)==str.charAt(j)){
                    counted=true;
                    break;
                }
            }

            if(counted){
                continue;
            }


            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }

                
            }
            System.out.println("Character frequency of "+str.charAt(i)+ " is "+count);
        }
        sc.close();
    }
}

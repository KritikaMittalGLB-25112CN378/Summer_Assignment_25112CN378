import java.util.Scanner;
public class Question_40 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows=sc.nextInt();
        int sp=rows-1;
        int str=1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=sp;j++){
            System.out.print(" ");
            }
            int k=1;
            for(int j=1;j<=str;j++){
                int a=k+64;
                char b=(char)a;
                System.out.print(b);
                if(j<=str/2){
                    k++;
                }
                else{
                    k--;
                }
            }
            sp--;
            str+=2;
            System.out.println();
        }
        sc.close();
    }
}

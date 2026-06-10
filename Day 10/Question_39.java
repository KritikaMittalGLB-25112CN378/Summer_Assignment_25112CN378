import java.util.Scanner;
public class Question_39 {
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
                System.out.print(k);
                if(j<=str/2){
                    k++;
                }
                else{
                    k--;
                }
            }
            System.out.println();
            sp--;
            str+=2;
        }
        sc.close();
    }
}

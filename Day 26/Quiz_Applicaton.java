import java.util.Scanner;

public class Quiz_Applicaton {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int score=0;
        char answer;

        System.out.println("====== Quiz Started ======");
        System.out.println("Which Keyword is used to create an object in java? ");
        System.out.println("a) create");
        System.out.println("b) object");
        System.out.println("c) new");
        System.out.println("d) class");
        System.out.print("Enter your answer: ");
        answer=sc.next().charAt(0);

        if(answer=='c' ||answer=='C'){
            System.out.println("Correct Answer!");
            score++;
        }
        else{
            System.out.println("Wrong Answer!");
            System.out.println("Correct answer is option c");

        }

        System.out.println("Which company originally developed java? ");
        System.out.println("a) Microsoft");
        System.out.println("b) Sun Microsystems");
        System.out.println("c) Google");
        System.out.println("d) Apple");
        System.out.print("Enter your answer: ");
        answer=sc.next().charAt(0);

        if(answer=='b' ||answer=='B'){
            System.out.println("Correct Answer!");
            score++;
        }
        else{
            System.out.println("Wrong Answer!");
            System.out.println("Correct answer is option b");

        }

        System.out.println("Which operator is used for comparison in java? ");
        System.out.println("a) =");
        System.out.println("b) ==");
        System.out.println("c) +=");
        System.out.println("d) %");
        System.out.print("Enter your answer: ");
        answer=sc.next().charAt(0);

        if(answer=='b' ||answer=='B'){
            System.out.println("Correct Answer!");
            score++;
        }
        else{
            System.out.println("Wrong Answer!");
            System.out.println("Correct answer is option b");

        }

        System.out.println("===== Quiz completed Successfully ====");
        System.out.println("Your Score: "+ score+" /3");

        if(score==3){
            System.out.println("Excellent!");
        }
        else if(score==2){
            System.out.println("Good Job!");
        }
        else{
            System.out.println("Better Luck Next Time!");
        }
        sc.close();

    }
}

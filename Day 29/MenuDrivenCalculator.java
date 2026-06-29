import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int choice;
        do{
            System.out.println("\n=====Calculator Menu=====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter the choice from 1-5: ");
            choice=sc.nextInt();

            System.out.print("Enter First Number: ");
            int num1=sc.nextInt();

            System.out.print("Enter Second Number: ");
            int num2=sc.nextInt();

            float result;

            switch(choice){

                case 1:
                    result=num1+num2;
                    System.out.print("Result: "+result);
                    break;

                case 2:
                    result=num1-num2;
                    System.out.print("Result: "+result);
                    break;

                case 3:
                    result=num1*num2;
                    System.out.print("Result: "+result);
                    break;

                case 4:
                    if(num2!=0){
                        result=(float)num1/num2;
                        System.out.print("Result: "+result);
                        break;
                    }
                    else{
                        System.out.print("Not divisible by zero");
                        break;
                    }

                case 5:
                    System.out.print("Thank you! Program Ended.");
                    break;

                default:
                    System.out.print("Invalid Choice!");
            }
        }while(choice>=1 && choice<5);

        sc.close();
    }
}


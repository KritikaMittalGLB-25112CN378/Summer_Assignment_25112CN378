import java.util.Scanner;

public class ATM_Simulation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the balance: ");
        double balance=sc.nextDouble();

        if(balance>=1000){
            int choice;

            do{
                System.out.println("\n ======= ATM MENU =======");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");

                System.out.print("Enter the choice from 1-4: ");
                choice=sc.nextInt();


                switch(choice){
                    case 1:
                        System.out.println("Current Balance: "+balance);
                        break;
                    
                    case 2:
                        System.out.print("Enter Deposit Amount: ");
                        double deposit=sc.nextDouble();
                        if(deposit>0){
                            balance+=deposit;
                            System.out.println("Amount Deposited Successfully.");
                            System.out.println("Updated Balance: "+ balance);
                        }
                        else{
                            System.out.print("Invalid Deposit Amount: ");
                        }
                        break;

                    case 3:
                        System.out.print("Enter Withdrawal Amount: ");
                        double withdraw=sc.nextDouble();

                        if(withdraw<=balance){
                            balance-=withdraw;
                            System.out.println("Please collect your cash.");
                            System.out.println("Remaining Balance: "+ balance);
                        }
                        else if(withdraw<0){
                            System.out.print("Invalid Withdraw Amount.");
                        }
                        else{
                            System.out.print("Insufficient Balance.");
                        }
                        break;

                    case 4:
                        System.out.println("Thank you for using the ATM.");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            }
            while(choice!=4);
            
        }

        else{
            System.out.print("There must be minimum 1000 as balance");
        }

        sc.close();
    }
}

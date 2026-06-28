import java.util.Scanner;

public class BankAccountSystem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        BankAccount[] accounts=new BankAccount[100];
        int count=0;
        int choice;

        do{
            System.out.println("\n===== BANK ACCOUNT MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Display All Accounts");
            System.out.println("5. Search Account");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double bal = sc.nextDouble();

                    accounts[count] = new BankAccount(accNo, name, bal);
                    count++;

                    System.out.println("Account Created Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (accounts[i].accountNumber == accNo) {
                            System.out.print("Enter Deposit Amount: ");
                            double amount = sc.nextDouble();
                            accounts[i].deposit(amount);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Account Not Found!");
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (accounts[i].accountNumber == accNo) {
                            System.out.print("Enter Withdrawal Amount: ");
                            double amount = sc.nextDouble();
                            accounts[i].withdraw(amount);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Account Not Found!");
                    break;

                case 4:
                    if (count == 0) {
                        System.out.println("No Accounts Available!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            accounts[i].display();
                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter Account Number to Search: ");
                    accNo = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (accounts[i].accountNumber == accNo) {
                            accounts[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Account Not Found!");
                    break;

                case 6:
                    System.out.println("Thank You for Using the Bank Account System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        }while (choice>=1 && choice<= 6);

        sc.close();
    }
}
class BankAccount{
    int accountNumber;
    String accountHolder;
    double balance;

    BankAccount(int accountNumber,String accountHolder,double balance){
        this.accountNumber=accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount){
        balance+=amount;
        System.out.println("Amount Deposited Successfully!");
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("Withdrawal Successfully!");
        }
        else{
            System.out.println("Insufficient Balance!");
        }
    }

    void display(){
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : " + balance);
        System.out.println("------------------------------");
    }
}
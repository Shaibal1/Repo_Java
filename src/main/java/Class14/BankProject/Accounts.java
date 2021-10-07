package Class14.BankProject;
import java.util.Scanner;

    public class Accounts
    {
        private String accountType; //Checking or Savings or CD
        private int accountId; //int Id, because its numbers
        private double balance; //int balance, because its numbers
        private double creditLine; // int creditLine, because its numbers

        /**
         * 1. openAccount
         * Type (Savings, Checking)
         * Starting deposit
         * user should get unique account number
         */

        public Accounts()
        {
            accountId = 13;
            accountType = "No account opened";
        }

        public Accounts(String accountType, int depositAmount) {
            this.accountType = accountType;
            accountId = Bank.encrypted++;
            if (accountType.equals("CHECKING")) {
                if (depositAmount >= 750 || depositAmount <= 850) {
                    creditLine = 5000.00;
                } else if (depositAmount >= 549) {
                    creditLine = 300.00;
                } else {
                    System.out.println("You are not qualified to open an account with us.");
                }
                balance = 0.0;
            } else {
                balance = depositAmount;
            }
            this.showBalance();
        }

        protected Accounts openAccount() {
            Scanner input = new Scanner(System.in);
            System.out.println("WHAT TYPE OF ACCOUNT WOULD YOU LIKE TO OPEN? /n"
                    + "1. CHECKING /n"
                    + "2. CHECKING /n"
                    + "PRESS 1 or 2, THEN PRESS ENTER: /n ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    accountType = "CHECKING";
                    accountId = Bank.encrypted++;
                    System.out.println("ENTER DEPOSIT AMOUNT: ");
                    balance = input.nextDouble();
                    break;

                case 2:
                    accountType = "SAVINGS";
                    accountId = Bank.encrypted++;
                    System.out.println("ENTER DEPOSIT AMOUNT: ");
                    balance = input.nextDouble();
                    break;

                default:
                    System.out.println("INVALID RESPONSE, EXITING PROCESS");
                    break;
            }
            this.showBalance();
            return this;
        }

        /**
         * 2. deposit
         *        account number
         *        amount
         * */

        protected void makeDeposit(double amt)
        {
            if (accountType.equals("CHECKING"))
            {
                  balance -= amt;
            }
            else
                { balance -= amt; }

            this.showBalance();
            System.out.println("THANK YOU FOR YOUR TRANSACTION");
        }

        /**
         * 1. withdraw
         *        account number
         *        amount
         * */

        protected void makeWithdrawal(double amt)
        {
            if (accountType.equals("CHECKING"))
            {
                if (balance + amt >= creditLine)
                {
                    System.out.println("THIS CHARGE CANNOT BE COMPLETED BECAUSE YOU BALANCE WILL EXCEED THE LIMIT !");
                }
                else
                {
                    balance += amt;
                }
                this.showBalance();
                System.out.println("THANK YOU FOR YOUR TRANSACTION");
             }
        }

        /**
         * 1. showBalance
         *        account number
         *        sout(balance)
         * */

        protected void showBalance()
        {
            if (accountId == 13)
            {
                System.out.println(accountType);
            }
            else
            {
                System.out.println("ACCOUNT NUMBER: " +accountId);
                if (accountType.equals("CHECKING"))
                {
                    System.out.println("CREDIT LINE: $ "+creditLine);
                }
                System.out.println("BALANCE: $"+balance);
            }
        }
    }

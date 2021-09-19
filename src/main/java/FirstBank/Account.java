package FirstBank;
/*
import javax.imageio.ImageTranscoder;
import java.util.Scanner;

public class Account {

    //Class Variables

    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    //Class Constructor
    Account(String cname,String cid)
    {
        customerName = cname;
        customerID =cid;
    }

    //Function for depositing money
    void deposit (int amount)
    {
        if (amount !=0)
        {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }
    //Function for withdrawing money
    void withdraw(int amount)
    {
        if (amount !=0)
        {
            balance = balance - amount;
            previousTransaction = amount;
        }
    }
    // Function showing the previous transaction
    void  getPreviousTransaction()
    {
        if (previousTransaction > 0)
        {
            System.out.println("Deposited: "  + previousTransaction);
        } else if (previousTransaction < 0)
        {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else{
            System.out.println("No transactions occurred");

        }
    }

    //Function calculating interest of current funds after a number of years
    void calculateInterest(int years)
    {
        double interestRate = 0.185;
        double newBalance = (balance * interestRate * years) + balance;
        System.out.println("The current interest rate is: " + (100 * interestRate) + "%");
        System.out.println("After " + years + "years, your balance will be: " + newBalance);
    }

    //Function showing the main menu
    void showMenu()
    {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, " + customerName + "!");
        System.out.println("Your ID is: " + customerID);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println("A. Check your balance");
        System.out.println("B. Make a deposit");
        System.out.println("C. Make a withdrawal");
        System.out.println("D. View previous transaction");
        System.out.println("E. Calculate interest");
        System.out.println("F. Exit");

        do {
            System.out.println();
            System.out.println("Enter an option: ");
            char option1 = scanner.next().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();

            switch (option) {
                //Case 'A' allows the user to check their account balance
                case 'A':
                    System.out.println("==================================");
                    System.out.println("Balance = $" + balance);
                    System.out.println("==================================");
                    System.out.println();
                    break;
                ;
                //Case 'B' allows the user to deposit money into their account using the 'deposit' function

                case 'B':
                    System.out.println("Enter an amount");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;

                //Case 'C' allows the user to withdraw money from their account using the 'withdraw' function
                case 'C':
                    System.out.println("Enter an amount to withdraw: ");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;

                //Case 'D' allows the user to view their most recent transaction using the 'getPreviousTransaction' function


                case 'D':

                case 'E':


                case 'F':


                    break;

*/
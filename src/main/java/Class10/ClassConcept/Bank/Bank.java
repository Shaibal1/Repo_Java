package Class10.ClassConcept.Bank;

public class Bank {
    public static void main(String[] args) {

        Accounts a1 = new Accounts();

        Accounts a2 = new Accounts();

        a1. makeDeposits(1000);

        a2.makeDeposits(500);

        a1.showBalance();

        a1.makeWithdraw( 200);

        a1.showBalance();
        a2.showBalance(); 






    }
}

package Class10.ClassConcept.Bank;

public class Accounts {

    // Field Variable
    double myBalance;
    String bankName = "ABCD Bank";


    // Methods

    /*

    * Deposits                  (Non- static method)
    * Withdraw                  (Non- static method)
    * CheckBalance              (Non- static method)

      showTermsAndConditions    (static method)
    * */

    /*
    * myBalance =  100000000;
    *  */

    public void makeDeposits(double amount){
        //myBalance = myBalance += amount;
        myBalance += amount;
    }

    public void makeWithdraw(double amount){
        // myBalance = myBalance - amount;
        myBalance -= amount;
    }

    public void showBalance(){
        System.out.println("Balance: " + myBalance);

    }




}

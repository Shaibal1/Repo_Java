package Class14.BankProject;

import java.util.Scanner;

/*
    1. Create Profile
        name
        ssn
        phone
        cityName(optional)
    */
    public class Customer extends Accounts
{
    private final String userName;
    private String pass ;
    private final String name;
    private final String ssn;
    private String phoneNumber;
    private String city;
    private int numOfAcc;
    private final Accounts[] acc =new Accounts[5];

    public Customer(String userName,String pass,String name, String ssn, String phoneNumber)
    {
        this.userName = userName;
        this.pass = pass;
        this.name = name;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
        this.numOfAcc = 0;
        this.acc[0] = new Accounts();
        this.acc[1] = new Accounts();
        this.acc[2] = new Accounts();
        this.acc[3] = new Accounts();
        this.acc[4] = new Accounts();
        Bank.database[Bank.customerCount] = this;
        Bank.customerCount++;
    }
    public Customer(String userName, String pass, String name, String ssn, String phoneNumber, String city)
    {
        this.userName = userName;
        this.pass = pass;
        this.name = name;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.acc[0] = new Accounts();
        this.acc[1] = new Accounts();
        this.acc[2] = new Accounts();
        this.acc[3] = new Accounts();
        this.acc[4] = new Accounts();
        Bank.database[Bank.customerCount] = this;
        Bank.customerCount++;
    }

    public Customer(String username)
    {
        this.userName = username;
        boolean uExist = true;
        Scanner input = new Scanner(System.in);
        System.out.println("*****----- REGISTRATION -----*****");
        System.out.println("ENTER YOUR NAME: ");
        name = input.nextLine();
        System.out.println("CREATE A USERNAME: ");
        String userName = input.nextLine();
        while (uExist)
        {
            uExist = false;
            for (int i = 0; i <= Bank.customerCount; i++)
            {
                if (Bank.database[i].getUser().equals(userName))
                {
                uExist = true;
                System.out.println("USERNAME EXISTS, PLEASE ENTER A NEW USERNAME: ");
                userName = input.nextLine();
                break;
                }
            }
        }
        userName = userName;
        System.out.println(" ENTER A PASSWORD (NO SPACES PERMITTED) ");
        pass = input.nextLine();
        input.nextLine();
        System.out.println("ENTER YOUR SOCIAL SECURITY NUMBER");
        ssn = input.nextLine();
        System.out.println("ENTER YOUR PHONE NUMBER: ");
        phoneNumber = input.nextLine();
        System.out.println("ENTER YOUR CITY (OPTIONAL)");
        city = input.nextLine();
        numOfAcc = 0;
        System.out.println("THANK YOU " + name + " YOUR PROFILE HAS BEEN CREATED");
     }

     private void updateProfile(String fieldName, String newVal)
     {
         switch (fieldName.toUpperCase())
         {
             case  "PASSWORD":
                 pass = newVal;
                 break;
             case  "CITY":
                 city = newVal;
                 break;
             case "PHONE NUMBER":
                 phoneNumber = newVal;

             default:
                 System.out.println("THE ENTERED FIELD CANNOT BE CHANGED OR DOES NOT EXIST");
                 break;
          }
     }
     private void showProfile()
     {
         System.out.println("Name: " + name.toUpperCase());
         System.out.println("Phone number " + phoneNumber.toUpperCase());
         System.out.println("City: " + city.toUpperCase());
         System.out.println("Accounts Opened: " + numOfAcc);
     }

     protected Accounts openAccount()
     {
         acc[numOfAcc] = super.openAccount();
         numOfAcc++;
         return acc[numOfAcc - 1];
     }
     private void getBankBalance(int accIndex)
     {
         this.acc[accIndex].showBalance();
     }
     String getUser()
     {
         return userName;
     }
     public String getPass()
     {
         return pass;
     }
}



    /*
    * 2. Update profile(name, john)
    *    Customer should send fieldName and newValue
    *    name
    *    ssn
    *    phone
    *    cityName (optional)
    * */

    /*
     * 3. showProfile
     *    name:
     *    phone
     *    (If provided) CityName:
     * */

    /**
     * Every Customer can have a maximum 5 bank account with bank.
     *
     * */

    /**
     * openAnAccount
     *      Please use openAccount from Accounts Class
     * */

    /**
     * makeDeposit
     *      Please use deposit method from Accounts Class
     * */

    /**
     * makeWithdraw
     *      Please use withdraw method from Accounts Class
     * */

    /**
     * getBankBalance
     *      with 1 argument
     *      please use showBalance method from Accounts Class
     *
     *      Account Number: 1234
     *      Balance $ 100.00
     * */

    /**
     * getBankBalance
     *      WITH NO ARGUMENTS
     *          please use showBalance method to print balance
     *          to all Account with the Customer
     *
     *  Total number of Accounts: 4
     *
     *  Account Number: 1234
     *  Balance $ 100.00
     *
     *  Account Number: 5678
     *  Balance $ 200.00
     *
     *  Account Number: 9012
     *  Balance $ 200.00
     *
     *  Account Number: 3456
     *  Balance $ 2000.00

     * */




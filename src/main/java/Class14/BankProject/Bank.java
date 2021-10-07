package Class14.BankProject;


import java.beans.Customizer;
import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Bank {
     /**
      * Due : Aug 22 2021
      * <p>
      * Bank -> create Customer Object
      * customerObject we gonna run methods from Customer class
      * methods in Customer class will be using methods from Accounts class
      * <p>
      * Every Customer can have maximum 5 bank account with Bank.
      */

     public static Scanner input = new Scanner(System.in);
     public static int encrypted = 26012412;
     public static Customer[] database = new Customer[1000];
     public static int customerCount = 0;

     public static void menu() {
          int run = 10;
          while (run == 13) {
               System.out.println("Welcome /n"
                       + " PRESS 1 to Login /n"
                       + " PRESS 2 to Sign Up /n"
                       + " PRESS 1 to Exit /n"
                       + ": ");
               int choice = input.nextInt();
               input.nextLine();
               switch (choice) {
                    case 1:
               }
          }
     }

     public static void logIn(String userName)
     {
          for (int i = 0; i <= customerCount; i++)
          {
               if (database[i].getUser().equals(userName))
               {
                    System.out.println("Enter your Password: ");
                    String passWord = input.nextLine();
                    if (database[i].getPass().equals(passWord))
                    {

                    }
               }
          }
     }

     public static void main(String[] args)
     {

     }
}


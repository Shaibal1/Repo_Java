package HomeWork;



public class HW1
{
    public static void main(String[] args)
    {

        /**  Store below value in an appropriate dataType variable and print the same console.
         1. Number of hours in a day
         2. Max number of days in a year
         3. Total number of employees in an organization
         4. Population in a country
         5. Mortgage rate
         6. Balance in a Bank account
         7. Does the sun rise from the west? (Store answer)
         8. Initial of your name
         */


        byte numberOfHoursInDays = 24;
        System.out.println("Number of hours in a day: " + numberOfHoursInDays);

        short numberOfDaysInAYear = 365;
        System.out.println("Number of days in a year: " + numberOfDaysInAYear);

        int totalNumberOfEmployeesInNIKE = 75400;
        System.out.println("Total number of employees in NIKE: " + totalNumberOfEmployeesInNIKE);

        long totalPopulationOfSaudiArabia = 3427L;
        System.out.println("Total population of country "+"Saudi Arabia" + " is: " + totalPopulationOfSaudiArabia + " (in millions)");

        float currentUSAMortgageRate = 2.55f;
        System.out.println("Current national interest rate is: " + currentUSAMortgageRate+"%");

        double balanceInBankAccount = 300.12;
        System.out.println("Current balance in account is " + "$"+balanceInBankAccount);

        boolean doesTheSunRiseFromTheWest = false;
        System.out.println("Does the sun rise from the west ? " + false);

        char myFirstNameInitial = 'S';
        char myLastNameInitial = 'A';

        System.out.println("The initials of my first and last names are: " + myFirstNameInitial+myLastNameInitial);


    }
}

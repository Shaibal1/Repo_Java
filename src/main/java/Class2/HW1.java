package Class2;

public class HW1
{

    public static void main(String[] args) {

        /**
         *
         * Due: July 8
         *
         Store below scenario value in an appropriate dataType variable, and print the same in console.
         1. number of hours in a day (byte)
         2. max no. of days in an year
         3. total number of employees in an organization
         4. population in a country
         5. mortgage rate
         6. balance in a bank account
         7. does the sun rise from the west? Store answer
         8. initials of your name (^Use: char)
         // My initials : AB

         */
        String []threeWordSentence = new String[] {"hApPy, nEW ,yeAr"};

        String firstWord = threeWordSentence[0].substring(0,1).toUpperCase() + threeWordSentence[0].substring(1).toLowerCase();
//        String secondWord = threeWordSentence[1].substring(0,1).toUpperCase() + threeWordSentence[1].substring(1).toLowerCase();
//        String thirdWord = threeWordSentence[2].substring(0,1).toUpperCase() + threeWordSentence[2].substring(1).toLowerCase();

        System.out.println(firstWord);



    }
}

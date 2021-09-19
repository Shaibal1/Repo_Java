package HomeWork;

import javax.swing.*;
import java.util.Arrays;

import static java.lang.constant.ConstantDescs.NULL;

public class Practice2 {
//    public static void main(String[] args) {

    int[] array = {45, 37, 23, 80, 18}; // * find the average *

    //String[] names = {"john", "happy", "peACe", "jOy", "lui", "harry", "go"};

    // HOMEWORK # 6
    // print the names from array if the name-length is >=5 and name contains 'o' or 'O'

    /* * Limitation: both array must be of same length
     *
     * if the numbers-array has 33 in it,
     *      print the index at which 33 is present in numbers array
     *      And, print the name present at same index in names array.
     */
//        int[] numbers = {11, 22, 33, 44, 55, 98, 65};
//        String[] names2 = {"john", "happy", "peACe", "jOy", "LEarN", "joy", "laugh"};
//        int numToFind = 98;
//
//        for (int i = 0; i<numbers.length; i++)
//        {
//            if (numbers[i] ==  numToFind)
//            {
//                System.out.println(numToFind + " is present at index number "+ i + "in the array " + "the same in index in names array names " + names2[i] + "is present");
//            }
//        }

    // Question_7

        /*  Limitation: both array must be of same length
         *
         * if the numbers-array has 33 in it,
         *      print the index at which 33 is present in numbers array
         *      And, print the name present at same index in names array.
         *
        int[] numbers = {11, 22, 33, 44, 55, 98, 65};
        String[] names2 = {"john", "happy", "peACe", "jOy", "LEarN", "joy", "laugh"};
         */

    /**
     * Create an array and store 5 int-values.
     * Print the average of numbers in array.
     *
     * sum of values / number of values
     *
     * {10, 20, 30, 40, 50}
     * (10+20+30+40+50)/5
     *
     */

    /**
     * if name found, Print "LUI is at position-5 in the array"
     * if name not found, print "king is not present in the array"
     **/

    String[] names = {"john", "happy", "peACe", "jOy", "lui", "harry"};
    /**
     * Task 1:
     * Find out if the value stored in word variable is palindrome.
     * And, store the result in "isPalindrome" variable
     * --> palindrome: string which reads the same in reverse
     * eg:
     * level --> level          (palindrome)
     * eye  --> eye             (palindrome)
     * head --> daeh            (not palindrome)
     * racecar --> racecar      (palindrome)
     */
/*
        String word = "LEVel";
        String isPalindrome = "";
        String[] wordSplit = word.split("");
        for (int i =0 ; i <= wordSplit.length-1; i++)
        {
            isPalindrome = isPalindrome + wordSplit[wordSplit.length-1-i];
        }
        if (isPalindrome.equalsIgnoreCase(word))
        {
            System.out.println("word "  + "'"+ word + "'"+  " is Palindrome");
        }
        else
            System.out.println("word "  + "'"+ word + "'"+ " is not Palindrome");
*/



    /* Task2:
     * Find if the value stored in num variable is a prime number or not.
     * And, store the final result in "isPrime" variable
     * --> prime number -> number which is ONLY divisible by 1 and itself.
     * eg:
     * 5 -> prime
     * 7 -> prime
     * 10 -> not a prime
     *         int num = 5;
     *         Pseudo code:
     *         1. create var to store given num
     *         2. declare var to store result
     *         3. loop
     *         pick number from '2' to 'given num - 1'
     *         if modulus of picked num == 0 store result as "not a prime number"
     *               else result "is a prime number"
     *         condition complete - break
     *         4. display the result
     */

//         Task_2
//         Pseudo code:
//         1. create var to store given num
//         2. declare var to store result
//         3. loop
//              pick number from '2' to 'given num - 1'
//              if modulus of picked num == 0 store result as "not a prime number"
//              else result "is a prime number"
//              condition complete - break
//         4. display the result
//        */

    /**
     * Task3:
     * Write code to reverse a string
     * <p>
     * "happy holidays"
     * <p>
     * "syadiloh yppah"
     */


        /*
        Task_4
        Pseudo code
        1. create array of strings to store vowels
        2. store given sentence in var
        3. split given sentence
        4. declare var to store how many vowels in the sentence
        5. we have two arrays with different length so need to declare one more int for loop
        6. loop
           pick letter from '0' index to last one and compare if it equals to any index value in vowels array
           then if it is equal 'count variable' increasing by 1.
        7. print how many vowels in given sentence.

         */

//    //All methods are with return type and using one user input
//
//    // Task_1
//
//    /**
//     * Write a method to convert given string into Titlecase
//     * <p>
//     * Input sentence = "happy new year TO You DeaR"
//     * Final answer = "Happy New Year To You Dear"
//     */
//
    //     * Input sentence = "happy new year TO You DeaR"
//     * Final answer = "Happy New Year To You Dear"
    public static String toTitleCase(String userString)
    {
        String[] userStringToArray = userString.split(" ");
        String result = "";

        for (int i =0; i<userStringToArray.length;i++) {
            result += " " + userStringToArray[i].substring(0, 1).toUpperCase() + userStringToArray[i].substring(1).toLowerCase();
        }
        return result;

    }

   public static String reverseStringg(String userString)
   {
       String[] reverseStringSplit = userString.split("");
       String result = "";
       for (int i =0; i <reverseStringSplit.length; i++)
       {
           result += reverseStringSplit[reverseStringSplit.length-1-i];

       }
       return result;

    }

    public static String reverseString(String userString) {
        String[] userStringSplit = userString.split("");
        String result = "";
        int i;
        for (i = 0; i < userStringSplit.length; i++) {
            result += userStringSplit[userStringSplit.length - 1 - i];
        }
        return result;
    }

 public static boolean checkPalindrome(String userString)
 {
     boolean isPalindrome = false;
     String[] wordSplit = userString.split("");
     String reverse = "";

     for (int i = 0; i < wordSplit.length; i++)
     {
         reverse += wordSplit[wordSplit.length-1-i];
     }
     if (reverse.equalsIgnoreCase(userString))
     {
         isPalindrome = true;
     }
     return isPalindrome;
 }

    public static double averageOfArray (int[] userArray)
    {
        double average = 0;
        for (int i =0; i<userArray.length; i++)
        {
            average /= userArray.length;
        }
        return average;
    }

    public static int findMaxValue(int[] userArray) {
        int maxValue = userArray[0];
        for (int i = 0; i < userArray.length; i++)
        {
            if (userArray[i] > maxValue)
            {
                maxValue = userArray[i];
            }
        }
        return maxValue;
    }

/*    public static void main(String[] args)
    {
//        System.out.println(toTitleCase("HoW are YoU my DeaR"));
//        System.out.println(checkPalindrome("eVE"));
//        System.out.println(reverseString("welcome"));
//        System.out.println("The average of the array is: "+ averageOfArray(new int[]  {7, 10, 3, 6, 10}));
//        System.out.println("The max value in the array is: " + averageOfArray(new int[] {33, 54, 67, 19, 9, 52}));
//        System.out.println(countWordsWhichContain);
*/

 /*   public static void main(String[] args)
    {
        String userArray2 = "happy holidays, how are you, have a happy vacation, happyness is the key, I want happiness for you, happy holidays,have a happy vacation, happyness is the key";
        String wordToFind = "happy";
        System.out.println(countOccurrences(userArray2, wordToFind));
    }

    public static int countOccurrences(String userArray2, String word)
    {

        // split the string by spaces in a
        String a[] = userArray2.split(" ");

        // search for pattern in a
        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            // if match found increase count
            if (word.equals(a[i]))
                count++;
        }

        return count;
    }
}
*/
//  happy holidays,how are you,have a happy vacation,happyness is the key,I want happiness for you;

public static String[] countWordsWhichContain (String[] userArray, String wordToSearch)
{
        int count = 0;
        for (int i = 0; i < userArray.length; i++)
        {
            if (userArray[i].toLowerCase().contains(wordToSearch.toLowerCase()))
            {
                count++;
            }
        }
        String[] arrayToReturn = new String[count];

        int index = 0;
        for (int i = 0; i < userArray.length; i++)
        {
            if (userArray[i].toLowerCase().contains(wordToSearch.toLowerCase()))
            {
                arrayToReturn[index] = userArray[i];
                index ++;
            }
        }
        return  arrayToReturn;

}
}













    /*--------------------------------------------------------------------------------------------------------------------------------------------------------*/



















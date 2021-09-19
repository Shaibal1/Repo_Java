package Class9;

import java.util.Arrays;

public class HW8 {
    public static void main(String[] args) {


        String sentence = " this is a school of cultural and behavior knowledge ";
        //Write code to count the number of vowels in the sentence

        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int c = 0; c < sentence.length(); c++)
        {
            char ch = sentence.toLowerCase().charAt(c);
            for (char vowel : vowels)
            {
                if (vowel == ch)
                {
                    count++;
                }
            }
            //System.out.println(count);
        }
        System.out.println(count);

        int[]  numbers  = {88, 55, 34, 23, 65, 91};
        //Write the code to find the average of the array
        double avg = 0;
        for (int i = 0; i <numbers.length; i++)
        {
            avg+= numbers[i];
        }
        avg /=(numbers.length);
        System.out.println("The Average Of " + Arrays.toString(numbers)+ "is " +avg);


    }


















    // Due : Aug 01, 2021

    /**
     * Write a method to convert given string into Titlecase
     *
     * Input sentence = "happy new year TO You DeaR"
     * Final answer = "Happy New Year To You Dear"
     */

    /**
     * Write a method to reverse a String
     */

    /**
     * Write a method which will return the result, if the given string is a Palindrome
     *
     * return type: boolean
     */

    /**
     * Write a method to return the average of a given int array
     *
     * Input array : {7, 10, 3, 6, 10}
     * ans : 7.2
     *
     */

    /**
     * Write a method to return the maximum value from a given int array
     *
     * Input array: {33, 54, 67, 19, 9, 52}
     * max : 67
     */

}

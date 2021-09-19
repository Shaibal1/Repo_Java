package HomeWork;

import java.util.Arrays;

public class Practice {


    /*----------------------------------------    ALL HOMEWORK PRACTICE----------------------------------------------*/

    // HOMEWORK 3
//
        /**
         * 1.Using Ternary operator assigning result_1 as '100' if the length of sentence_1 is 10 or greater
         * else assigning result_1 as '15'
         * */

//        String sentence_1 = "Temperatures will reach a high of 84 on Thursday, followed by 75 on Friday";
//        int result_1 = sentence_1.length();
//        String myResult = result_1 >= 10 ? "100" : "15";
//        System.out.println(myResult);
//        // PART_2
//
//        //1.Replacing all 'R/r' with 'F'. Displaying result.
//
//        String sentence_2 = "We all ARe GOod ProgrAMmers";
//        String sentence_2_ToLowerCase = sentence_2.toLowerCase();
//        System.out.println("\n" + sentence_2_ToLowerCase.replace('r', 'F'));
//
//        // PART_3
//
//        //1.Displaying sentence_3 length
//        String sentence_3 = "ABC Networks";
//        int result_3 = sentence_3.length();
//        System.out.println("\nthe length of \"" + sentence_3 + "\" is: " + result_3);
//
//        //2.Checking if sentence_3 starts with "a" (ignoring cases)
//        String sentence_3_lowerCase = sentence_3.toLowerCase();
//        boolean isStartsWith_a = sentence_3_lowerCase.startsWith("a".toLowerCase());
//        System.out.println("\n" + isStartsWith_a);
//
//        //3. Checking sentence_3 ends with "k" (ignoring cases)
//        boolean isEndsWith_K = sentence_3_lowerCase.endsWith("K".toLowerCase());
//        System.out.println("\n" + isEndsWith_K);
//
//        /**
//         4. Assigning result_4 as "Media" if sentence_4 starts with 'a' (ignore cases)
//         else assigning "Entertainment". Printing the result_4.
//         */
//
//        String sentence_4 = "ABC Networks";
//        String sentence_4_lowerCase = sentence_4.toLowerCase();
//        boolean isStartsWith_a1 = sentence_4_lowerCase.startsWith("a".toLowerCase());
//        String result_4 = isStartsWith_a1 ? "\nMedia" : "\nEnterteinment";
//        System.out.println(result_4);
//        /*--------------------------------------------------------------------------------------------------------------------------------------------------------*/
    // HOMEWORK 4
//    public static void main(String[] args) {


        // Question - 1:
        /**
         * String threeWordSentence = "hApPy nEW yeAr"
         * // code
         * String threeWordSentence = "Happy New Year"
         */

/*
    String threeWordSentence = "hApPy nEW yeAr";
    String[] sentenceToLowerCase = threeWordSentence.toLowerCase().split(" ");


    String firstWord = sentenceToLowerCase[0].toUpperCase().charAt(0) + sentenceToLowerCase[0].substring(1);
    String secondWord = sentenceToLowerCase[1].toUpperCase().charAt(0) + sentenceToLowerCase[1].substring(1);
    String thirdWord =  sentenceToLowerCase[2].toUpperCase().charAt(0) + sentenceToLowerCase[2].substring(1);
        System.out.println(firstWord + secondWord + thirdWord);

 */

//        String threeWordSentence_1 = "hApPy nEW yeAr";
//        System.out.println("Before code : " + threeWordSentence_1);     // "hApPy nEW yeAr"

        // code

        // assign the value to the string var.

//        String threeWordSentence = "hApPy nEW yeAr";
//
//        /*
//         convert sentence to LowerCase
//         split the sentence into three words (create String array)
//        */
//
//        String[] threeWordSentence_modified = threeWordSentence.toLowerCase().split(" ");
//
//        // declaration new variables and add values to var.
//
//        int i = 0;
//        char a = threeWordSentence_modified[i].charAt(0);
//        char b = threeWordSentence_modified[i].toUpperCase().charAt(0);
//        threeWordSentence_modified[i] = threeWordSentence_modified[i].replace(a, b);
//
//        i = 1;
//        a = threeWordSentence_modified[i].charAt(0);
//        b = threeWordSentence_modified[i].toUpperCase().charAt(0);
//        threeWordSentence_modified[i] = threeWordSentence_modified[i].replace(a, b);
//
//        i = 2;
//        a = threeWordSentence_modified[i].charAt(0);
//        b = threeWordSentence_modified[i].toUpperCase().charAt(0);
//        threeWordSentence_modified[i] = threeWordSentence_modified[i].replace(a, b);
//
//        // array to string , display the result
//
//        String result = String.join(" ", threeWordSentence_modified);
//        System.out.println("Original sentence: " + threeWordSentence + "\nSentence after code: " + result);
//
//        //Question1 Second code version.
//
//        // declaration new var.
//
//        String sentence_5 = "hOw aRE YOu";
//
//        // sentence_1 to LowerCase, string to array
//
//        String[] sentence_5_toLowerCase = sentence_5.toLowerCase().split(" ");
//
//        // convert first char in every word toUpperCase then join the rest of the word using substring()
//
//        String word_1 = sentence_5_toLowerCase[0].toUpperCase().charAt(0) + sentence_5_toLowerCase[0].substring(1);
//        String word_2 = sentence_5_toLowerCase[1].toUpperCase().charAt(0) + sentence_5_toLowerCase[1].substring(1);
//        String word_3 = sentence_5_toLowerCase[2].toUpperCase().charAt(0) + sentence_5_toLowerCase[2].substring(1);
//
//        // display original sentence and modified version
//
//        System.out.println("\nOriginal sentence: " + sentence_5 + "\nSentence after code: " + word_1 + " "
//                + word_2 + " " + word_3);
//
//
//        // Question - 2:
//        /**
//         * create the abbreviation  // HNY
//         */
//        // String threeWordSentence_2 = "very gOOD MorNING";
//        //String abbr = "";
//
//        // code
//
//        //System.out.println("Abbreviation for '" + threeWordSentence_2 + "' is : " + abbr);
//        // Abbreviation for 'very gOOD MorNING' is : VGM
//
//
//        // declaration string var.
//
//        String sentence_6 = "hApPy IndepenDence DAY";
//
//         /*convert sentence to UpperCase
//         split the sentence into three words (create String array)
//        */
//
//        String[] sentence_6toUpperCase = sentence_6.toUpperCase().split(" ");
//
//        // getting first letter of the word
//
//        String word1 = String.valueOf(sentence_6toUpperCase[0].charAt(0));
//        String word2 = String.valueOf(sentence_6toUpperCase[1].charAt(0));
//        String word3 = String.valueOf(sentence_6toUpperCase[2].charAt(0));
//
//        // declaration of new var.
//
//        String abbreviation = word1 + word2 + word3;
//
//        // display original sentence and it abbreviation
//
//        System.out.println("\nAbbreviation for sentence " + "\"" + sentence_6 + "\" is: " + abbreviation);
//
//
//        // Question - 3:
//
//        /**
//         * Using this method is NOT PERMISSIBLE for the Question below.
//         * String cityName = "neW yOrK";
//         *          * To find the length of a given String
//         *          * method: length()
//         int cityNameLength = cityName.length();
//         *System.out.println("\nLength of '" + cityName + "' is : " + cityNameLength);
//         */
//
//        //print the number of words in the sentence.
//        //String sentence_3 = "We all are here to learn programming and testing";
//
//        String sentence_7 = "We are all here to learn programming and testing";
//        String[] sentence_7_toArray = sentence_7.split(" ");
//
//        // create int var. to store array length which is represent total number of words in sentence_3
//
//        int numOfTheWords = sentence_7_toArray.length;
//
//        // print the number of words in the sentence_3
//
//        System.out.println("\nThe number of words in sentence: " + sentence_7 + " is: " + numOfTheWords);
//
//    }
//}

         /*--------------------------------------------------------------------------------------------------------------------------------------------------------*/
                                                                              // HOMEWORK 5


 /*  * Create variable to store studentScore and maxScore;
  * Based on the percentage, display grade to student:
  * Grade A: 91-100
  * Grade B: 81-90.99
  * Grade C: 71-80.99
  * Grade D: 61-70.99
  * Grade E: 51-60.99
  * Grade F: less than or equal to 50.99

        int studentScore = 80;
        int maxScore = 150;
        //switch ()
        // calculate percentage --> 80*100/150
        // print result like:
        // Your percentage: XX.yy and your Grade is: Z
**/



//        //Declare variables to store studentScore and maxScore.
//
//        double studentScore = 149.0;
//        double maxScore = 150.0;
//
//        /*
//         * A: 100 - 91
//         * B: 90.00 - 81
//         * C: 80.99 - 71
//         * D: 70.99 - 61
//         * E: 60.99 - 51
//         * F: 50.99 or less
//         */
//
//        // Declare variables to store score percentage and grade
//
//        double percentage = 100 * studentScore / maxScore;
//        String grade;
//
//        //if condition is true certain value will be accepted to grade var.
//
//        if (percentage >= 91.0) {
//            grade = "A";
//        } else if (percentage >= 81.0) {
//            grade = "B";
//        } else if (percentage >= 71.0) {
//            grade = "C";
//        } else if (percentage >= 61.0) {
//            grade = "D";
//        } else if (percentage >= 51.0) {
//            grade = "E";
//        } else {
//            grade = "F";
//        }
//
//        //display the code result
//
//        System.out.println("Student score is: " + studentScore + " out of " + maxScore +
//                "\nThe percentage is: " + percentage + "\nTne grade is: " + grade);


 /**                //Question_2
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number

        int num2 = 16;
*/

//        //Question_2
//
//        //* store value in an int variable
//        //         * if number is divisible by 3, print "divisible by 3"
//        //         * if number is divisible by 5, print "divisible by 5"
//        //         * if number is divisible by 3 and 5, print "divisible by both"
//        //         * if not divisible by 3 or 5, print the number
//        //         */
//        //        int num2 = 16;
//
//
//        // Declare variable to store a number to check
//
//        int num2 = 16;
//
//        // if condition is true print definite result
//
//        if (num2%3 == 0 && num2%5 == 0){
//            System.out.println(num2 + " is divisible by both");
//        } else if (num2%5 == 0) {
//            System.out.println(num2 + " is divisible by 5");
//        } else if (num2%3 == 0) {
//            System.out.println(num2 + " is divisible by 3");
//        } else {
//            System.out.println(num2);
//        }



//        String day = " WeekDaY ";                // weekday or weekend
//        String clothes = "";            // casual, formals, suit
//        boolean anyMeeting = true;      // true or false
//
//        /**
//         * day = weekend ; clothes = casual
//         * day = weekdays and I have meetings ; clothes = suit
//         * day = weekdays and I have no meetings ; clothes = formals
//         */
//
//        // write if-else code block to assign value to 'clothes' variable
//
//        if (day == "weekend") {
//            clothes = "casual";
//        } else if (day == "weekday" && anyMeeting) {
//            clothes = "suit";
//        } else if (day == "weekday" && !anyMeeting) {
//            clothes = "formals";
//        }
//        System.out.println("clothes : " + clothes);
//
//
//        if (day.trim().equalsIgnoreCase("weekend")) {     // equals or equalsIgnoreCase
//            clothes = "casual";
//        } else if (day.trim().equalsIgnoreCase("weekday") && anyMeeting) {
//            clothes = "suit";
//        } else if (day.trim().equalsIgnoreCase("weekday") && !anyMeeting) {
//            clothes = "formals";
//        }
//        System.out.println("clothes : " + clothes);
//
//
//        /**
//         * day = weekend ; clothes = casual
//         * day = weekdays
//         *      if I have meetings ; clothes = suit
//         *      else clothes = formals
//         */
//
//        if (day.trim().equalsIgnoreCase("weekend")) {     // equals or equalsIgnoreCase
//            clothes = "casual";
//        } else if (day.trim().equalsIgnoreCase("weekday")) {
//            if (anyMeeting) {
//                clothes = "suit";
//            } else {
//                clothes = "formals";
//            }
//        }
//        System.out.println("clothes : " + clothes);


         /*
            Print the words which contains 'e' in it.
            Note: Pls ignore cases
            Expected ans:
            Peace
            LEARN
            slEEP
            outside
            Hello
            Bye

        String[] myWords = {"Happy", "Peace", "Grow", "LEARN", "slEEp", "outside", "Hello", "Bye"};
        String toSearch = "e";
        String nameToPrint = "";
        // Pseudo code:
        // loop
        // pick each name to check if it contain 'e' (ignore case) and name-length is >=5
        // add this name into a var.
        // print the result.
        for (int i = 0; i < myWords.length;i++)
        {
            if (myWords[i].toUpperCase().contains(toSearch.toUpperCase()))
            {
                nameToPrint = nameToPrint + " " + myWords [i];
            }
        }
        System.out.print("\nWords: " + nameToPrint + " contains 'e'");
*/

        /**
         if name found, Print "LUI is at position-5 in the array"
         if name not found, print "king is not present in the array"
         **/

        // String[] names = {"john", "happy", "peACe", "jOy", "lui", "harry"};
        String nameToSearch = "faith";


        //System.out.println(names.substring(4));

        // Due: Sunday July 25

        /**
         * String sentence = "happy new year TO You DeaR"
         * // code
         * String sentence = "Happy New Year To You Dear"
         *
         * For hint refer: Loops_Concept , Line#34
         */

//        String sentence = "happy new year TO You DeaR happy new year TO You DeaR";
//        String sevenWordSentence_1 = sentence.toLowerCase();
//        String [] arr1 = sevenWordSentence_1.split(" ");    // ["Hello" , "DEAR"]
//        String firstWord = arr1[0].substring(0, 1).toUpperCase() + arr1[0].substring(1);
//        String secondWord = arr1[1].substring(0, 1).toUpperCase() + arr1[1].substring(1);
//        String thirdWord = arr1[2].substring(0, 1).toUpperCase() + arr1[2].substring(1);
//        String fourthWord = arr1[3].substring(0, 1).toUpperCase() + arr1[3].substring(1);
//        String fifthWord = arr1[4].substring(0, 1).toUpperCase() + arr1[4].substring(1);
//        String sixthword = arr1[5].substring(0, 1).toUpperCase() + arr1[5].substring(1);
//        sevenWordSentence_1 = firstWord + " "+secondWord+" "+ thirdWord+" "+ fourthWord+" "+ fifthWord+" "+ sixthword;
//
//        System.out.println("After code : " + sevenWordSentence_1);
//
//        /**
//         * create the abbreviation  // HNY
//         */
//        String threeWordSentence_2 = "very gOOD MorNING to You dear";
//        String abbr = "";
//
//        // code
//
//        System.out.println("Abbreviation for '" + threeWordSentence_2 + "' is : " + abbr);
//        // Abbreviation for 'very gOOD MorNING to You dear' is : VGMTYD
//
//


//
//        /*--------------------------------------------------------------------------------------------------------------------------------------------------------*/
//                                                                                        // HOMEWORK 6
//        //Question_1

        /**
         * String sentence = "happy new year TO You DeaR"
         * // code
         * String threeWordSentence = "Happy New Year To You Dear"
         *
         * For hint refer: Loops_Concept , Line#34
         */


        /**
         * create the abbreviation  // HNY
         */
        /*
            String threeWordSentence_2 = "very gOOD MorNING to You dear";
            String abbr = "";

            // code

            System.out.println("Abbreviation for '" + threeWordSentence_2 + "' is : " + abbr);
            // Abbreviation for 'very gOOD MorNING to You dear' is : VGMTYD
         */




//        //Declare var to store original sentence
//
//        String sentence = "hApPy nEW yeAr my DeaR";
//
//        //convert string to array using split method
//
//        String[] sentenceToArray = sentence.split(" ");
//
//        //Declare var to store result
//
//        String result1 = "";
//
//        //Declare var to store index number
//
//        int i;
//
//        //creating loop where we assign the value to "i" from first index num to the last one.
//        //assigning value to the result var.: modifying elements of array(capitalize first letter of every word),
//
//        for (i = 0; i <= sentenceToArray.length - 1; i++) {
//            result1 = result1 + " " + sentenceToArray[i].substring(0, 1).toUpperCase() +
//                    sentenceToArray[i].substring(1).toLowerCase();
//        }
//
//        //getting rid of extra space in the beginning of result sentence
//
//        result = result.trim();
//
//        // Displaying the result
//
//        System.out.println(result);

    // Question_2


//        String sentence_1 = "very gOOD MorNING to You my Dear";
//        String abbr = "";
//
//         /*convert sentence to UpperCase
//         split the sentence into words (create String array)
//        */
//
//        String[] sentence_1_ToArray = sentence_1.toUpperCase().split(" ");
//
//
//        //creating loop where we assign the value to "i" from first index num to the last one.
//        //assigning value to the result var., extracting first char from word
//
//        for (i = 0; i <= sentence_1_ToArray.length - 1; i++) {
//            abbr = abbr + "" + sentence_1_ToArray[i].charAt(0);
//
//        }
//
//        System.out.println("\nAbbreviation for '" + sentence_1 + "' is : " + abbr);
//
//
//        // Question_3
//
//        //Declare variables to store studentScore and maxScore.
//
//        double studentScore = 90;
//        double maxScore = 150.0;
//
//        /*
//         * A: 100 - 91
//         * B: 90.00 - 81
//         * C: 80.99 - 71
//         * D: 70.99 - 61
//         * E: 60.99 - 51
//         * F: 50.99 or less
//         */
//
//        // Declare variables to store score percentage and grade
//
//        double percentage = 100 * studentScore / maxScore;
//        String grade = "";
//
//        //if condition is true certain value will be accepted to grade var.
//        //display scholarship status, based on grade
//
//
//        if (percentage > 100) {
//            System.out.println("\nStudent score " + percentage + " more then maximum score " + maxScore);
//        } else if (percentage >= 91.0) {
//            grade = "A";
//            System.out.println("\nbased on your grade " + grade + " you get full scholarship for next year.");
//        } else if (percentage >= 81.0) {
//            grade = "B";
//            System.out.println("\nbased on your grade " + grade + " you get  half scholarship for next year.");
//        } else if (percentage >= 71.0) {
//            grade = "C";
//            System.out.println("\nbased on your grade " + grade + " you get  half scholarship for next year.");
//        } else if (percentage >= 61.0) {
//            grade = "D";
//            System.out.println("\nbased on your grade " + grade + " you doesn't get scholarship for next year.");
//        } else if (percentage >= 51.0) {
//            grade = "E";
//            System.out.println("\nbased on your grade " + grade + " you doesn't get scholarship for next year.");
//        } else {
//            grade = "F";
//            System.out.println("\nbased on your grade " + grade + " you doesn't get scholarship for next year.");
//
//        }
//
//        //display the code result
//
//        System.out.println("Student score is: " + studentScore + " out of " + maxScore +
//                "\nThe percentage is: " + percentage + "\nTne grade is: " + grade);
//
//
//        //Question_4
//
//
//        //declare an array
//
//        int[] array = {45, 37, 23, 80, 18};
//
//        //declare var to store index value

//        //declare var to store sum value
//
//        int sum = 0;
//
//        //create the loop to calculate a sum of nums in array
//
//        for (i = 0; i <= array.length - 1; i++) {
//            sum += array[i];
//        }
//
//        /*declaring var and assigning value to it to store average of nums in array using formula
//         * to calculate average, added 1.0 to display nums after decimal point
//         */
//
//        double average = 1.0 * sum / array.length;
//
//        //result displaying
//
//        System.out.println("\nThe average of numbers in array is: " + average);
//
//
//        // Question_5
//
//
//        //declare vars. to store names, name to search
//        String[] names = {"john", "happy", "peACe", "jOy", "lui", "harry", "go"};
//        String nameToSearch = "peace";
//        boolean found = false;
//
//        //loop that checking every string in array if it equals to search name when it found - break the code
//        //if not found print nameToSearch not present in array, using boolean var as an indicator
//
//        for (i = 0; i < names.length; i++) {
//            if (names[i].equalsIgnoreCase(nameToSearch)) {
//                System.out.println("\n\"" + nameToSearch + "\" is at position - " + (i + 1) + " in the array");
//                found = true;
//                break;
//            }
//        }
//        if (!found) {
//            System.out.println("\n\"" + nameToSearch + "\" is not present in the array");
//        }
//
//
//
//        // Question_6
//
//        // print the names from array if the name-length is >=5 and name contains 'o' or 'O'
//
//        String[] names1 = {"jOhntt", "happy", "peACe", "jOy", "LEarN", "Orange", "king kong", "iRON MAN"};
//        String toSearch = "O";
//        String nameToPrint = "";
//
//        // Pseudo code:
//        // loop
//        // pick each name to check if it contain 'o' (ignore case) and name-length is >=5
//        // add this name into a var.
//        // print the result.
//
//        for (i=0; i<names1.length;i++){
//            if (names1[i].toUpperCase().contains(toSearch.toUpperCase()) && names1[i].length()>=5) {
//                nameToPrint = nameToPrint + " " + names1[i];
//
//            }
//        }
//        System.out.println("\nNames: " + nameToPrint.trim() + " - contains 'o' and name-length is >=5.");
//
//
//        // Question_7
//
        /* * Limitation: both array must be of same length
         *
         * if the numbers-array has 33 in it,
         *      print the index at which 33 is present in numbers array
         *      And, print the name present at same index in names array.
         */

//        int[] numbers = {11, 22, 33, 44, 55, 98, 65};
//        String[] names2 = {"john", "happy", "peACe", "jOy", "LEarN", "joy", "laugh"};
//        int numToFind = 98;
//        for(i=0; i < numbers.length; i++){
//            if(numbers[i] == numToFind){
//                System.out.println("\n\'" + numToFind + "\' is present at index number: " + i + " in number array"
//                        + "\nat the same index in names array name \'" + names2[i] + "\' is present.");
//
//            }
//        }

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
/*
            int[] numberOfGrades = new int[5];
            int numberOfGradesLength = numberOfGrades.length;

            numberOfGrades[0] = 10;
            numberOfGrades[1] = 20;
            numberOfGrades[2] = 30;
            numberOfGrades[3] = 40;
            numberOfGrades[4] = 50;


            System.out.println(numberOfGrades[0]+numberOfGrades[1]+numberOfGrades[2]+
            numberOfGrades[3]+numberOfGrades[4] / 5);
*/


        /**
         if name found, Print "LUI is at position-5 in the array"
         if name not found, print "king is not present in the array"
         **/

        // String[] names = {"john", "happy", "peACe", "jOy", "lui", "harry"};
       // String nameToSearch = "faith";


        //System.out.println(names.substring(4));

        String[] names = {"john", "happy", "peACe", "jOy", "lui", "harry"};

//    String nameToFind = "peACe";
//    boolean found = false;
//
//            for (String n : names) {
//        if (n == nameToFind) {
//            found = true;
//            break;
//        }
//    }
//
//            if(found)
//            System.out.println(nameToFind + " is found.");
//            else
//                    System.out.println(nameToFind + " is not found.");







    /*--------------------------------------------------------------------------------------------------------------------------------------------------------*/
                                                                                         // HOMEWORK 7


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
           Task_1
         Pseudo code:
         1. declare vars to store given word and result
         2. split word to array of strings
         3. loop:
            pick letter from last index of array and assign as first letter of result word.
         4. if result word equals given word print: "the word is palindrome"
         5. else print: "the word is not palindrome"
        */

//        String word = "level";
//        String isPalindrome = "";
//        String[] wordSpl = word.split("");
//        int i;
//        for (i = 0; i <= wordSpl.length - 1; i++)
//        {
//            isPalindrome = isPalindrome + wordSpl[wordSpl.length - 1 - i];
//        }
//        if (isPalindrome.equalsIgnoreCase(word)) {
//            System.out.println("\nWord \"" + word + "\" is palindrome");
//        } else {
//            System.out.println("\nWord \"" + word + "\" is not palindrome");
//        }
//
//        /*

        /**
         * Task2:
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
//
//        int num = 155;
//        String isPrime = "";
//
//        for (i = 2; i < (num - 1); i++)
//        {
//            if (num % i == 0) {
//                isPrime = " not a prime number";
//            } else {
//                isPrime = " is a prime number";
//            }
//            break;
//        }
//        System.out.println("\n" + num + isPrime);

        /**
         * Task3:
         * Write code to reverse a string
         *
         * "happy holidays"
         *
         * "syadiloh yppah"
         *
         */
        String task3String = "";


//        // Task_3
//
//        // the code is pretty similar as in task1 except if part.
//
//        String givenSentence = "happy holidays";
//        String[] givenSentenceSplit = givenSentence.split("");
//        String task3String = "";
//
//        for (i = 0; i < givenSentenceSplit.length; i++) {
//            task3String = task3String + givenSentenceSplit[givenSentenceSplit.length - 1 - i];
//        }
//        System.out.println("\n" + "Given sentence is:    " + givenSentence + "\nReversed sentence is: " + task3String);


        /**
         * Task4:
         * Count the number of the vowels (a,e,i,o,u) present in the given sentence.
         */


        String task4Sentence = "hOW arE You My DEAr FRiEnd";    // 9
//        /*
//        Task_4
//        Pseudo code
//        1. create array of strings to store vowels
//        2. store given sentence in var
//        3. split given sentence
//        4. declare var to store how many vowels in the sentence
//        5. we have two arrays with different length so need to declare one more int for loop
//        6. loop
//           pick letter from '0' index to last one and compare if it equals to any index value in vowels array
//           then if it is equal 'count variable' increasing by 1.
//        7. print how many vowels in given sentence.
//         */
//
//        String[] vowels = {"a", "e", "i", "o", "u"};
//        String sentence4 = "hOW arE You DEar";
//        String[] sentence4Split = sentence4.split("");
//        int count = 0;
//        int j;
//        for (i = 0; i < sentence4Split.length; i++) {
//            for (j = 0; j < vowels.length; j++) {
//                if (sentence4Split[i].equalsIgnoreCase(vowels[j])) {
//                    count++;
//                }
//            }
//        }
//        System.out.println("\nSentence: \"" + sentence4 + "\" contains " + count + " vowels in it.");
//    }
//}
//        /*--------------------------------------------------------------------------------------------------------------------------------------------------------*/
//                                                                                        // HOMEWORK 8
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
    public static String toTitleCase(String userString)
    {
        String[] userStringToArray = userString.split(" ");
        String result = "";
        int i;
        for (i = 0; i <= userStringToArray.length - 1; i++)
        {
            result += " " + userStringToArray[i].substring(0, 1).toUpperCase() + userStringToArray[i].substring(1).toLowerCase();
        }
        result = result.trim();
        return result;
    }

//
//    // Task_2
//
//    /**
//     * Write a method to reverse a String
//     */

    public static String reverseString(String userString) {
        String[] userStringSplit = userString.split("");
        String result = "";
        int i;
        for (i = 0; i < userStringSplit.length; i++) {
            result += userStringSplit[userStringSplit.length - 1 - i];
        }
        return result;
    }

//    // Task_3
//
//    /**
//     * Write a method which will return the result, if the given string is a Palindrome
//     * return type: boolean
//     */


    public static boolean checkPalindrome(String userString)
    {

        boolean isPalindrome = false;
        String reversed = "";
        String[] wordSpl = userString.split("");
        int i;
        for (i = 0; i <= wordSpl.length - 1; i++)
        {
            reversed += wordSpl[wordSpl.length - 1 - i];
        }
        if (reversed.equalsIgnoreCase(userString))
        {
            isPalindrome = true;
        }
        return isPalindrome;
    }

//    // Task_4
//
//    /**
//     * Write a method to return the average of a given int array
//     * <p>
//     * Input array : {7, 10, 3, 6, 10}
//     * ans : 7.2
//     */

    public static double averageOfArray(int[] userArray) {

        double average = 0;
        for (int i = 0; i < userArray.length; i++) {
            average += userArray[i];
        }
        average /= userArray.length;

        return average;
    }

//    // Task_5

    /**
     * Write a method to return the maximum value from a given int array
     *
     * Input array: {33, 54, 67, 19, 9, 52}
     * max : 67
     */

    public static int findMaxValue (int[] userArray) {
        int maxValue = userArray[0];

        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] > maxValue) {
                maxValue = userArray[i];
            }
        }
        return maxValue;
    }



    public static void main(String[] args) {

        // Task_1
        System.out.println(toTitleCase("happy new year TO You DeaR"));

        // Task_2
        System.out.println(reverseString("Vacation! Summer!"));

        // Task_3
        System.out.println(checkPalindrome("eye"));

        // Task_4
        System.out.println(averageOfArray(new int[]{30, 45, 50, 18, 0}));

        // Task_5
        System.out.println(findMaxValue(new int[]{45,12,29,67,-170}));

//        /*--------------------------------------------------------------------------------------------------------------------------------------------------------*/
//                                                                                      // HOMEWORK 9
//
//        /**
//         * Count the words which contains "happy" in the given array.
//         *
//         * if no word contains 'happy' --> "none"
//         * if 1 word contains 'happy' --> word
//         * if 2 or more words contain 'happy' --> all the words which happy
//         *
//         * {"happy holidays" , "how are you", "have a happy vacation", "happyness is the key" , "I want happiness for you"}
//         *      {"happy holidays", "have a happy vacation", "happyness is the key"}
//         *
//         * {"happidays" , "how are you"}
//         *      none
//         *
//         * {"happy holidays" , "happiness is the key" , "I want happiness for you"}
//         *      happy holidays
//         *
//         * input: 2 ( String[] , String )
//         * return type: String[]
//         *
//         *
//         */
//
//        // in this method I used two 'for loop' First one define how many indexes I need to store in my returnArray
//        // and next one adding the value (which contains wordToSearch) into that index
//        // if there are no wordToSearch, returnArray will be empty.
//
//
//        public static String[] countWordsWhichContain (String[] userArray, String wordToSearch){
//
//            int i;
//            int count =0;
//            for (i=0;i< userArray.length;i++){
//                if(userArray[i].toLowerCase().contains(wordToSearch.toLowerCase())){
//                    count++;
//                }
//            }
//            String [] arrayToReturn = new String[count];
//
//            int index = 0;
//            for (i=0; i<userArray.length; i++){
//                if (userArray[i].toLowerCase().contains(wordToSearch.toLowerCase())){
//                    arrayToReturn[index] = userArray[i];
//                    index++;
//                }
//            }
//            return arrayToReturn;
//        }
//
//        // Task_2
//
//        /**
//         * Find the name which has the max length.
//         *
//         * Note: If 2 or more names has same length (which is max) then send all such names
//         *
//         * {"happy, "peaceful", "loving", "dear"}
//         *      peaceful
//         *
//         * {"happy, "peace", "love", "dear"}
//         *      happy, peace
//         *
//         * input: 1 (String[])
//         * return type: String[]
//         *
//         */
//
//        public static void main(String[] args) {
//            String[] userAray = {"happy happy" , "how are you", "have a happy vacation", "happyness is the key" , "I want happiness for you"};
//            String wordToFind = "happy";
//            System.out.println("\nWord: \'" + wordToFind + "\' presents in this indexes of given Array; "
//                    + Arrays.toString(countWordsWhichContain(userAray,wordToFind)));
//        }
//    }
//
//
//        /*--------------------------------------------------------------------------------------------------------------------------------------------------------*/
                                                                                        // MIDTERM
//        // Task_1
//
//        /**
//         * Count the words which contains "happy" in the given array.
//         *
//         * if no word contains 'happy' --> "none"
//         * if 1 word contains 'happy' --> word
//         * if 2 or more words contain 'happy' --> all the words which happy
//         *
//         * {"happy holidays" , "how are you", "have a happy vacation", "happyness is the key" , "I want happiness for you"}
//         *      {"happy holidays", "have a happy vacation", "happyness is the key"}
//         *
//         * {"happidays" , "how are you"}
//         *      none
//         *
//         * {"happy holidays" , "happiness is the key" , "I want happiness for you"}
//         *      happy holidays
//         *
//         * input: 2 ( String[] , String )
//         * return type: String[]
//         *
//         *
//         */
//
//        // in this method I used two 'for loop' First one define how many indexes I need to store in my returnArray
//        // and next one adding the value (which contains wordToSearch) into that index
//        // if there are no wordToSearch, returnArray will be empty.
//
//
//        public static String[] countWordsWhichContain (String[] userArray, String wordToSearch){
//
//            int i;
//            int count =0;
//            for (i=0;i< userArray.length;i++){
//                if(userArray[i].toLowerCase().contains(wordToSearch.toLowerCase())){
//                    count++;
//                }
//            }
//            String [] arrayToReturn = new String[count];
//
//            int index = 0;
//            for (i=0; i<userArray.length; i++){
//                if (userArray[i].toLowerCase().contains(wordToSearch.toLowerCase())){
//                    arrayToReturn[index] = userArray[i];
//                    index++;
//                }
//            }
//            return arrayToReturn;
//        }
//
//        // Task_2
//
//        /**
//         * Find the name which has the max length.
//         *
//         * Note: If 2 or more names has same length (which is max) then send all such names
//         *
//         * {"happy, "peaceful", "loving", "dear"}
//         *      peaceful
//         *
//         * {"happy, "peace", "love", "dear"}
//         *      happy, peace
//         *
//         * input: 1 (String[])
//         * return type: String[]
//         *
//         */
//         public static void main(String[] args) {
//            String[] userAray = {"happy happy" , "how are you", "have a happy vacation", "happyness is the key" , "I want happiness for you"};
//            String wordToFind = "happy";
//            System.out.println("\nWord: \'" + wordToFind + "\' presents in this indexes of given Array; "
//                    + Arrays.toString(countWordsWhichContain(userAray,wordToFind)));
//        }
//    }
//
//    /**
//     * Question 1:
//     * Scenario: Traffic ticketing system
//     * Write a method, that will print (not return) the points to be charged against
//     * the license for over speeding.
//     * <p>
//     * 1. Speed Limit = 70
//     * 2. Every 5 miles over the speed limit will add 1 point
//     * 3. If user speed is such that system shows 12 points for a speed
//     * then print, license is suspended
//     * <p>
//     * Example:
//     * user speed = 74 ; 0 points
//     * user speed = 78 ; 1 points  // 70-75(1) 75-78(0) = 1
//     * user speed = 88 ; 3 points  // 70-75(1) 75-80(1) 80-85(1) 85-88(0) = 3
//     * user speed = 178 ; 21 points (License suspended).
//     * user speed = 70 ; Thank you for driving within the speed limit.
//     */
//
//    public void trafficTicket(int speed) {
//        // declare all var I'm gonna use assigning values to it
//        int speedLimit = 70;
//        int pointsPerMilesOver = 5;
//        int overSpeedLimit = speed - speedLimit;
//        int points;
//        // depending on conditions I'm displaying different messages
//        if (overSpeedLimit >= pointsPerMilesOver) {
//            points = overSpeedLimit / pointsPerMilesOver;
//            if (points < 12) {
//                System.out.println("Your speed equals " + speed + ". Given points : " + points);
//            } else {
//                System.out.println("Your speed equals " + speed + ". Given points : " + points + " (Your license suspended)");
//            }
//        } else {
//            System.out.println("Your speed equals " + speed + ". Thank you for driving within the speed limit.");
//        }
//    }
//
//
//    /**
//     * Question 2:
//     * Create a method to return an int-array
//     * after removing a given int-value from a given int array.
//     * <p>
//     * Input array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Input Number: 24
//     * Returned array: {32, 14, 98, 56, 148, 78}
//     * <p>
//     * Input array:     {1, 2, 4, 3, 1, 6, 1}    Input Number: 11
//     * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
//     */
//
//    public static int[] removeIntValue(int[] userArray, int userNum) {
//        // code logic
//        // 1. Picking every number of int Array and if it equal to userNum I'm increasing count by 1
//        int i;
//        int count = 0;
//        for (i = 0; i < userArray.length; i++) {
//            if (userArray[i] == userNum) {
//                count++;
//            }
//        }
//        // 2. Creating new int returnArray without userNum
//        // Picking every number from given Array(using 'for loop') compare this num with userNum and
//        // if they are not equal assigning this value to the first index of returnArray, the increase index by 1.
//        int[] returnArray = new int[userArray.length - count];
//        int index = 0;
//        for (i = 0; i < userArray.length; i++) {
//            if (userArray[i] != userNum) {
//                returnArray[index] = userArray[i];
//                index++;
//            }
//        }
//        return returnArray;
//    }
//
//
//    /**
//     * Question 3:
//     * Create a method to return missing smallest positive integer (greater than 0) from given int-array.
//     * <p>
//     * Example:
//     * For array : {3, 5, 1, 4, 2, 7}
//     * Method should return : 6
//     * <p>
//     * For array : {2, 5, -1, 0, 6}
//     * Method should return : 1
//     * <p>
//     * For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
//     * Method should return : 4
//     * <p>
//     * For array : {-2, -5, -1, -10, -6}
//     * Method should return : 1
//     *
//     * @return
//     */
//
//    public static int minMissedNum(int[] userArray) {
//
//        // code logic
//        // 1. Sorting array from smallest num to largest:in outer 'for loop' I'm picking first value in given Array
//        // in the inner 'for loop' I'm picking second value (first+1) of Array,then I'm compare this two values and
//        // if my first value is greater then second I assign it to new var, after I assign second value to first
//        // and then the greater number (which was stored in new var) I put into second value
//        // the all this repeat till all values in Array will be checked.
//
//        int i;
//        int min = userArray[0];
//
//        int j;
//        int index;
//        for (i = 0; i < userArray.length; i++) {
//            for (index = i + 1; index < userArray.length; index++) {
//                if (userArray[i] > userArray[index]) {
//                    j = userArray[i];
//                    userArray[i] = userArray[index];
//                    userArray[index] = j;
//                }
//            }
//        }
//        // 2. In second part of my code in 'for loop' I'm picking every number of previously sorted Array and
//        // if this number negative I assign 1 to variable where my minimum missed num is stored
//        // if number is positive then I go to another condition where I'm checking if my number equals to min number
//        // if condition is true then I assign to min missed number new value (userArray[i] +1);
//
//        for (i = 0; i < userArray.length; i++) {
//            if (userArray[i] <= 0) {
//                min = 1;
//            } else {
//                if (userArray[i] == min) {
//                    min = userArray[i] + 1;
//                }
//            }
//        }
//        return min;
//    }
//
//    public static void main(String[] args) {
//        //to run first task I need to create object of this class
//        Test_1 speedTraffic = new Test_1();
//        //declare var to store user speed
//        int userSpeed=70;
//        speedTraffic.trafficTicket(userSpeed);
//
//        // Display how my removeIntValue method(Q2) is working:
//        int[] givenArray = {49, 38, 38, 19, 0};
//        int numToRemove = 38;
//        int[] returnedArray = removeIntValue(givenArray, numToRemove);
//        System.out.println("\nNew Array after removing given number " + numToRemove + " is: " + Arrays.toString(returnedArray));
//
//        //Display how my minMissedNum method(Q3) is working:
//        int[] myArray = {-4, 1, 12, 4, 5, -9, 3};
//        int minNum = minMissedNum(myArray);
//        System.out.println("\nThe smallest missed number in given array is: " + minNum);


         /*--------------------------------------------------------------------------------------------------------------------------------------------------------*/
                                                                                        // HOMEWORK 10












         /*--------------------------------------------------------------------------------------------------------------------------------------------------------*/
                                                                                        // HOMEWORK 11
        /**
         * Question 1:
         * Create a method that would return the common values between two given arrays
         * <p>
         * ["happy", "King" , "HAPPY", "PEACE"]
         * ["king", "Peace", "happiness", "connection", "learn"]
         * <p>
         * ["king", "peace"]
         * <p>
         * ["happy", "Kingdom" , "HAPPY", "PEACeful"]
         * ["king", "Peace", "happiness", "connection", "learn"]
         * <p>
         * []
         */

//        public static ArrayList<String> findCommonArraysValues(ArrayList<String> list1, ArrayList<String> list2) {
//            // create returning arraylist
//            ArrayList<String> list3 = new ArrayList<>();
//            //declare int var to use in 'for loop'
//            int i;
//            int j;
//            //'for loop' which compare one value from first arraylist with values in second list
//            // if it equal(ignore case) then save the value into returning arraylist.
//            for (i = 0; i < list1.size(); i++) {
//                for (j = 0; j < list2.size(); j++) {
//                    if (list1.get(i).equalsIgnoreCase(list2.get(j))) {
//                        list3.add(list1.get(i).toLowerCase());
//                    }
//                }
//            }
//            // for loop to remove duplicated values from returning arraylist.
//            for (i = 0; i < list3.size(); i++) {
//                for (j = i + 1; j < list3.size(); j++) {
//                    if (list3.get(i).equals(list3.get(j))) {
//                        list3.remove(j);
//                        j--;
//                    }
//                }
//            }
//            return list3;
//        }
//
//
//
//        /**
//         * Question 2:
//         * Create a method that would return the values occurring more than 1 times in given array
//         * String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
//         * ["happy", "joy" , "laugh"]
//         * <p>
//         * <p>
//         * String[] words = {"happy", "peace", "laugh", "joy"};
//         * []
//         */
//
//        public static ArrayList<String> findDuplicatedValues(String[] words) {
//            // create returning arraylist
//            ArrayList<String> list3 = new ArrayList<>();
//            //declare int var to use in 'for loop'
//            int i;
//            int j;
//            // for loop to add values that occurring more then once in given String[] into returning arraylist.
//            for (i = 0; i < words.length; i++) {
//                for (j = i + 1; j < words.length; j++) {
//                    if (words[i].equalsIgnoreCase(words[j])) {
//                        list3.add(words[j].toLowerCase());
//                    }
//                }
//            }
//            // 'for loop' to remove duplicated values from returning arraylist.
//            for (i = 0; i < list3.size(); i++) {
//                for (j = i + 1; j < list3.size(); j++) {
//                    if (list3.get(i).equals(list3.get(j))) {
//                        list3.remove(j);
//                        j--;
//                    }
//                }
//            }
//            return list3;
//        }
//
//
//        /**
//         * Question 3:
//         * Create a method that can print the count of given value in the given array
//         * String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
//         * String word = "happy"
//         *
//         * output: 'happy' occurs N times in array.
//         *
//         * String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
//         * String word = "PEace"
//         *
//         * output: 'peace' occur only one time in array
//         *
//         * String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
//         * String word = "Helpful"
//         *
//         * output: 'Helpful' is not present in array
//         * @return
//         */
//
//        public static void  countGivenValue (String[] userArray, String wordToCount) {
//            int i;
//            int count =0;
//            // for loop to count how many times given word is occurring in the given array
//            for (i = 0; i < userArray.length; i++) {
//                if (userArray[i].equalsIgnoreCase(wordToCount)) {
//                    count ++;
//                }
//            }
//            if(count==0){
//                System.out.println("Word \'" + wordToCount + "\' is not present in array.");
//            }
//            if(count==1) {
//                System.out.println("Word \'" + wordToCount + "\' occur only one time in array.");
//            }
//            if(count > 1) {
//                System.out.println("Word \'" + wordToCount + "\' occur " + count + " times in array.");
//            }
//        }
//
//
//        public static void main(String[] args) {
//            //create two arraylists
//            ArrayList<String> list1 = new ArrayList<>();
//            ArrayList<String> list2 = new ArrayList<>();
//
//            //adding values to the arraylists
//            list1.add("Happy");
//            list1.add("moOn");
//            list1.add("earTh");
//            list1.add("Sun");
//
//            list2.add("sun");
//            list2.add("nePtun");
//            list2.add("Earth");
//            list2.add("moon");
//            list2.add("Happiness");
//            list2.add("sun");
//            list2.add("earth");
//
//            //display how findCommonArraysValues method works
//            System.out.println("Common values in two arrays: " + findCommonArraysValues(list1, list2));
//
//            //display how findDuplicateValues method works
//            String[] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
//            System.out.println("Values that occurring more then one time in given array: " + findDuplicatedValues(words));
//
//            //display how countGivenValue method works
//            countGivenValue (words,"grow");


        /*--------------------------------------------------------------------------------------------------------------------------------------------------------*/
                                                                                        // HOMEWORK 12






























    }
}
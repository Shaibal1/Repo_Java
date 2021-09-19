package Class7;
import java.util.Arrays;

public class HW6 {

        public static void main(String[] args) {


            // Due: Sunday July 25


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

            /**
             * Create variable to store studentScore and maxScore;
             * Based on the percentage, display grade to student:
             * Grade A: 91-100
             * Grade B: 81-90.99
             * Grade C: 71-80.99
             * Grade D: 61-70.99
             * Grade E: 51-60.99
             * Grade F: less than or equal to 50.99
             *
             * student got grade A, gets full scholarship for next year
             *
             * student got better than grade D (i.e. B or C), get half scholarship for next year
             *
             * otherwise no scholarship for next year
             *
             *
             * Sample output:
             *  Your percentage: XX.yy and your Grade is: Z
             *  Based on your grade(Z), you get XXXX scholarship for next year
             *
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
              String nameToSearch = "faith";


              //System.out.println(names.substring(4));





            /**
             *
             * String[] names = {"john", "happy", "peACe", "jOy", "LEarN", "Orange", "king kong", "iRON MAN"};
             * print the names from array if the name-length is >=5 and name contains 'o' or 'O'
             *
             */



            /**
             * int[] numbers = {11, 22, 33, 44, 55, 98, 65};
             * String[] names = {"john", "happy", "peACe", "jOy", "LEarN", "joy", "laugh"};
             *
             * Limitation: both array must be of same length
             *
             * if the numbers-array has 33 in it,
             *      print the index at which 33 is present in numbers array
             *      And, print the name present at same index in names array.
             *
             */
             /*
        Question - 6, 1
     */




                // Due: Sunday July 25

                /**
                 * String sentence = "happy new year TO You DeaR"
                 * // code
                 * String sentence = "Happy New Year To You Dear"
                 *
                 * For hint refer: Loops_Concept , Line#34
                 */

                String sentence = "happy new year TO You DeaR happy new year TO You DeaR";
                String sevenWordSentence_1 = sentence.toLowerCase();
                String [] arr1 = sevenWordSentence_1.split(" ");    // ["Hello" , "DEAR"]
                String firstWord = arr1[0].substring(0, 1).toUpperCase() + arr1[0].substring(1);
                String secondWord = arr1[1].substring(0, 1).toUpperCase() + arr1[1].substring(1);
                String thirdWord = arr1[2].substring(0, 1).toUpperCase() + arr1[2].substring(1);
                String fourthWord = arr1[3].substring(0, 1).toUpperCase() + arr1[3].substring(1);
                String fifthWord = arr1[4].substring(0, 1).toUpperCase() + arr1[4].substring(1);
                String sixthword = arr1[5].substring(0, 1).toUpperCase() + arr1[5].substring(1);
                sevenWordSentence_1 = firstWord + " "+secondWord+" "+ thirdWord+" "+ fourthWord+" "+ fifthWord+" "+ sixthword;

                System.out.println("After code : " + sevenWordSentence_1);

        /*
            result = result + " " + arr1[0].substring(0, 1).toUpperCase() + arr1[0].substring(1);
                        "" + " " + Hello
            result = " Hello"

            result = result + " " + arr1[1].substring(0, 1).toUpperCase() + arr1[1].substring(1);
                      " Hello" + " " + Dear
                      " Hello Dear"


            arr1[i].substring(0, 1).toUpperCase() + arr1[i].substring(1);   // int i=0 ; i<=lastIndex   ; i++   (0,1,2,3...lastIndex)

         */
                String result = "";
                for (int i=0 ; i<=arr1.length-1 ; i++) {
                    result = result + " " + arr1[i].substring(0, 1).toUpperCase() + arr1[i].substring(1);
                }
                result = result.trim();
                System.out.println(result);


                /**
                 * create the abbreviation  // HNY
                 */
                String threeWordSentence_2 = "very gOOD MorNING to You dear";
                String abbr = "";

                // code

                System.out.println("Abbreviation for '" + threeWordSentence_2 + "' is : " + abbr);
                // Abbreviation for 'very gOOD MorNING to You dear' is : VGMTYD


                /**
                 * Create variable to store studentScore and maxScore;
                 * Based on the percentage, display grade to student:
                 * Grade A: 91-100
                 * Grade B: 81-90.99
                 * Grade C: 71-80.99
                 * Grade D: 61-70.99
                 * Grade E: 51-60.99
                 * Grade F: less than or equal to 50.99
                 *
                 * student got grade A, gets full scholarship for next year
                 *
                 * student got better than grade D (i.e. B or C), get half scholarship for next year
                 *
                 * otherwise no scholarship for next year
                 *
                 *
                 * Sample output:
                 *  Your percentage: XX.yy and your Grade is: Z
                 *  Based on your grade(Z), you get XXXX scholarship for next year
                 *
                 */
                int maxScore = 100;
                int studentScore = 86;
                String Grade = "";
                String yesOrNo = "";
                double percentage = (studentScore*100.00)/maxScore;
                if (percentage >= 91 && percentage <= 100) {
                    Grade = "A";
                } else if (percentage >= 81 && percentage <= 90.99) {
                    Grade = "B";
                } else if (percentage >= 71 && percentage <= 80.99) {
                    Grade = "C";
                } else if (percentage >= 61 && percentage <= 70.99) {
                    Grade = "D";
                } else if (percentage >= 51 && percentage <= 60.99) {
                    Grade = "E";
                } else if (percentage <= 50.99) {
                    Grade = "F";
                }
                if (percentage >= 91)
                    yesOrNo = "Full Scholarship";
                else if (percentage >= 71 && percentage <= 90.99)
                    yesOrNo = "Half Scholarship";
                else
                    yesOrNo = "No Scholarship";
                System.out.println("Your percentage is : " + percentage + " and your Grade is: " + Grade + " and Scholarship status is --> " + yesOrNo);


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
                 *
                 * String[] names = {"john", "happy", "peACe", "jOy", "lui", "harry"}
                 * String nameToSearch = "faith";
                 *
                 * if name found, Print "LUI is at position-5 in the array"
                 * if name not found, print "king is not present in the array"
                 *
                 */



                /**
                 *
                 * String[] names = {"john", "happy", "peACe", "jOy", "LEarN", "Orange", "king kong", "iRON MAN"};
                 * print the names from array if the name-length is >=5 and name contains 'o' or 'O'
                 *
                 */

            String[] names =  {"john", "happy", "peACe", "jOy", "LEarN", "Orange", "king kong", "iRON MAN"};
            String toSearch = "e";
            String namesToPrint = "";

            for (int i = 0; i < names.length; i++)
            {
                if (names[i].toUpperCase().contains(toSearch.toUpperCase()))
                {
                    namesToPrint = namesToPrint + "" + names[i];
                }
            }

            System.out.println(namesToPrint);



                /**
                 * int[] numbers = {98, 87, 65, 54, 90, 35};
                 * String[] names = {"john", "happy", "peACe", "jOy", "LEarN", "joy", "laugh"};
                 *
                 * Limitation: both array must be of same length
                 *
                 * if the numbers-array has 33 in it,
                 *      print the index at which 33 is present in numbers array
                 *      And, print the name present at same index in names array.
                 *
                 */
        /*

            code to get value at particular index of array (numbers-array)
            if (numbers[0] == 33) {
                sout("33 is present at index-0)
                sout("name present at index-0" + names[0])
            }

            if (numbers[1] == 33) {
                sout("33 is present at index-1)
                sout("name present at index-1" + names[1])
            }

            if (numbers[2] == 33) {
                sout("33 is present at index-2)
                sout("name present at index-2" + names[2])
            }
            ...
            ...
            if (numbers[lastIndex] == 33) {
                sout("33 is present at index-lastIndex)
                sout("name present at index-lastIndex" + names[lastIndex])
            }

            if (numbers[i] == 33) {                         // int i=0 ; i <= numbers.length-1 ; i++     (i -> 0,1,2,3....lastIndex)
                sout("33 is present at index-i)
                sout("name present at index-i" + names[i])
            }

         */
            /*
                int[] numbers = {98, 87, 65, 54, 90, 35};
                String[] names = {"john", "happy", "peACe", "jOy", "LEarN", "joy", "laugh"};
                for (int i=0 ; i <= numbers.length-1 ; i++) {
                    if (numbers[i] == 33) {
                        System.out.println("33 is present at index-"+i);
                        System.out.println("name present at index-i" + names[i]);
                    }
                }

             */







            }
    }

    /* String[] top5Students = new String[5];
        int top5StudentsLength = top5Students.length;
        System.out.println(top5StudentsLength);

         top5Students[0] = "Happy";
         top5Students[4] = "Toni";
         top5Students[1] = "Toni";
         top5Students[3] = "KiNg";
         top5Students[2] = "JoY";

         System.out.println("top 5 students : " + top5Students);
         System.out.println("top 5 students : " + Arrays.toString(top5Students));

        System.out.println(top5Students[0]);

        // Verify if index 1 value and index-2 are not same.
        // top5Students : [HaPPy, Toni, JoY, KiNg, Toni]

        boolean isEqual = top5Students[1].equalsIgnoreCase(top5Students[2]);
        System.out.println("Are the same value at index-1 and index 2 same : " + isEqual);*/
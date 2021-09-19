package Class8;

public class HW7 {
    public static void main(String[] args) {

        // Due date: July 28

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
        String word = "level";
        String isPalindrome = "";
        String[] wordSpl = word.split("");

        for (int i = 0; i <= wordSpl.length - 1; i++) {
            isPalindrome = isPalindrome + wordSpl[wordSpl.length - 1 - i];
        }
        if (isPalindrome.equalsIgnoreCase(word)) {
            System.out.println("\nWord \"" + word + "\" is palindrome");
        } else {
            System.out.println("\nWord \"" + word + "\" is not palindrome");
        }


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
        int num = 155;
        String isPrime = "";

        for (int i = 2; i < (num - 1); i++)
        {
            if (num % i == 0)
            {
                isPrime = " not a prime number";
            } else
            {
                isPrime = " is a prime number";
            }
            break;
        }
        System.out.println("\n" + num + isPrime);


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


        /**
         * Task4:
         * Count the number of the vowels (a,e,i,o,u) present in the given sentence.
         */
        String task4Sentence = "hOW arE You My DEAr FRiEnd";    // 9


        /*---------------------------------------------------------------------------------------------*/


            // Due date: July 28

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
           // String task1Word = "";


            /**
             * Task2:
             * Find if the value stored in num variable is a prime number or not.
             * And, store the final result in "isPrime" variable
             * --> prime number -> number which is ONLY divisible by 1 and itself.
             * eg:
             * 5 -> prime
             * 7 -> prime
             * 10 -> not a prime
             */

            // int num = 5;


            /**
             * Task3:
             * Write code to reverse a string
             *
             * "happy holidays"
             *
             * "syadiloh yppah"
             *
             */

           // String task3String = "";


            /**
             * Task4:
             * Count the number of the vowels (a,e,i,o,u) present in the given sentence.
             */
         //   String task4Sentence = "how ArE yOu";    // 9
            /**
             1. creating an array of vowels (vowels = {a, e, i, o u})
             2. picking index-0 letter
             3. if index-o letter is a vowel, you are increasing the count
             */
            int count = 0;
            char[] vowels = {'a', 'e', 'i', 'o', 'u'};
            for (int c = 0; c < task4Sentence.length(); c++) {
                char ch = task4Sentence.toLowerCase().charAt(c);
                for (char vowel : vowels) {
                    if (vowel == ch) {
                        count++;
                    }
                }
                //System.out.println(count);
            }
            System.out.println(count);

            /**
             1. using split method on task4Sentence, create an array of letter {"h", "o", "w", "A", "r", "E", "y", "O", "u"}
             2. pick index-0-letter from array ("h")
             3. if (index-0-letter == "a" || "e" || "i" || "o" || "u")
             count++
             2. pick index-1-letter from array ("o")
             3. if (index-1-letter == "a" || "e" || "i" || "o" || "u")
             count++
             ...
             ...
             2. pick index-lastIndex-letter from array ("h")
             3. if (index-lastIndex-letter == "a" || "e" || "i" || "o" || "u")
             count++
             */


            /**
             1. char at index-0 from task4Sentence
             3. if (index-0-letter == 'a' || 'e' || 'i' || 'o' || 'u')
             count++
             2. char at index-1 from task4Sentence
             3. if (index-1-letter == 'a' || 'e' || 'i' || 'o' || 'u')
             count++
             ...
             ...
             2. char at index-lastIndex from task4Sentence
             3. if (index-lastIndex-letter == 'a' || 'e' || 'i' || 'o' || 'u')
             count++
             */
        }
    }



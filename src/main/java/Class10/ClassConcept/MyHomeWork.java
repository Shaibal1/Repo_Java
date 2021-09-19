package Class10.ClassConcept;

public class MyHomeWork {

        /**
         * Method - static or non-static
         *
         * To use static method, user needs to use the class name (in which method is present)
         *
         * To use non-static method, user needs to use the object of the class (in which method is present)
         *
         *Syntax of creating an object
         * <class name> <variableName> = new <className>();
         *
         * */

        public static void main(String[] args) {

        //Reverse a String
       String reversed = MyStringMethods.reverseString("hello");
            System.out.println("Reverse : " + reversed);

       MyStringMethods.toTitleCase("Happy new yEar");

       //Find average of an int-array
            int[] numbers = {1,2,3,4,5,6};
            double avg = MyArrayMethods.findArrayAverage(numbers);
            System.out.println("Avg: " +avg);

            MyStringMethods strMethods = new MyStringMethods();
            boolean isPalindrome = strMethods.isStringPalindrome("hello");
            System.out.println("is  ' hello a palindrome? " + isPalindrome);

// find max from {22,55,34,87,11}
       int[] myNumbers = {22,55,34,87,11};
       MyArrayMethods arrayMethods = new MyArrayMethods();
       int maxNum = arrayMethods.findMaxFromArray(myNumbers);
            System.out.println("Max from array : " + maxNum);






            // check if "hello" is palindrome
            /*
            *   use isStringPalindrome from MyStringMethods class
            *   because, isStringPalindrome is non-static
            *   1. Create object of MyStringMethods (if not already created in the scope)
            *   2. Use object to access any non-static method/variable from MyStringMethods
            * */







            // check if "eye" is palindrome
            /*
             *   use isStringPalindrome from MyStringMethods class
             *   because, isStringPalindrome is non-static
             *   1. Create object of MyStringMethods (if not already created in the scope)
             *   2. Use object to access any non-static method/variable from MyStringMethods
             * */
            System.out.println(strMethods.isStringPalindrome("eye"));

            // create abbreviation for Happy new Year.

            // check if "eye" is palindrome
            /*
             *   use isStringPalindrome from MyStringMethods class
             *   because, isStringPalindrome is non-static
             *   1. Create object of MyStringMethods (if not already created in the scope)
             *   2. Use object to access any non-static method/variable from MyStringMethods
             * */
        strMethods.createAbbreviation("happy new year");




    }
}

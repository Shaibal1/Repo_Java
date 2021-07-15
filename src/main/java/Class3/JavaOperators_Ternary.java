package Class3;

import java.util.Scanner;

public class JavaOperators_Ternary
{
    public static void main(String[] args) {

        /**
         *  Logical (&&, ||, !)
         *
         *  Logical operators are getting used in order to join two or more conditions
         *  Final result will always be a boolean datatype.
         *
         *  &&  --> and operator
         *  ||  --> or operator
         *  !   --> not operator
         */
        /**
         * minimum credit score = 600
         * should be first time home buyer
         * when both conditions satisfy , mortgage rate = 2.0
         * when only only conditions satisfy, mortgage rate = 3.0
         *
         * cs = 700, not a first time buyer
         *
         *
         * int creditScore = 700
         * boolean isFirstTimeBuyer = false
         *
         */
//        int creditScore = 500;
//        boolean isFirstTimeBuyer = true;

        /**
         * && Operator (and operator)
         * all combined conditions must be true to get final result as true.
         * If any one of the conditions is false, final result is false.
         */

      //  boolean isCustomerBoth = creditScore >= 600 && isFirstTimeBuyer;
        /**
         *  boolean isCustomerBoth = creditScore >= 600 && isFirstTimeBuyer;
         *  is same as
         *  boolean isCustomerBoth = creditScore >= 600 && isFirstTimeBuyer == true;
         */

        /**
         * || Operator (or operator)
         * any one of the combined conditions needs to be true, to get final result as true.
         * If all conditions are false, then only final result will be false.
         */


//        boolean isCustomerAny = creditScore >= 600 || isFirstTimeBuyer;

        /**
         * ! Operator (not operator)
         *  not operator will make true as false and vice-versa.
         */

//        int lVar1 = 10, lVar2 = 20, lVar3 = 30, lVar4 = 40;
//
//        boolean lRes1 = lVar3 > lVar4 || !(lVar4 + lVar1 <= lVar2*4);
//        System.out.println("lRes1 = " + lRes1);
        /*
            lVar3 > lVar4 || !(lVar4 + lVar1 <= lVar2*4)
            30 > 40 || !(lVar4 + lVar1 <= lVar2*4)
            false || !(40 + 10 <= 80)
            false || !(50 <= 80)
            false || !(true)
            false || false
            false

         */

//        boolean lRes2 = (lVar3 > lVar1 || !(lVar4 + lVar1 <= lVar2*4)) && (lVar2+lVar3-lVar1 == lVar4 && !(lVar4 + lVar1 < lVar2 + lVar3));
//        System.out.println("lRes2 = " + lRes2);

        /*
        (lVar3 > lVar1 || !(lVar4 + lVar1 <= lVar2*4)) && (lVar2+lVar3-lVar1 == lVar4 && !(lVar4 + lVar1 < lVar2 + lVar3));
        (30 > 10 || !(40+10 <= 80)) && (lVar2+lVar3-lVar1 == lVar4 && !(lVar4 + lVar1 < lVar2 + lVar3));
        ( true || !(true)) && (lVar2+lVar3-lVar1 == lVar4 && !(lVar4 + lVar1 < lVar2 + lVar3));
        ( true || false ) && (lVar2+lVar3-lVar1 == lVar4 && !(lVar4 + lVar1 < lVar2 + lVar3));
        true && (lVar2+lVar3-lVar1 == lVar4 && !(lVar4 + lVar1 < lVar2 + lVar3));
        true && (20+30-10 == 40 && !(lVar4 + lVar1 < lVar2 + lVar3));
        true && (true && !(40 + 10 < 20 + 30));
        true && (true && !(false));
        true && (true && true);
        true && true
        true
         */
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your test score: ");
//        double score = input.nextDouble();
//
//        String resultOfTest = score >= 65 ? "Pass" : "Failed";
//        System.out.println("You " + resultOfTest + " the test!");


        /* Java program to find largest among two numbers using ternary operator

        int num1=13, num2=15, maxNum;
        maxNum = num1 > num2 ? num1 : num2;

        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Max number is: " + maxNum);

         */

        // Java code to illustrate ternary operator
        int n1 = 9, n2 = 10, result;

        System.out.println("First number: " + n1);
        System.out.println("Second number: " + n2);

        result = n1 > n2 ? n1 + n2 : n1 - n2;
        System.out.println("Result " + result);

        // -----------------------------------------------

        String str = "Hello world, have a great day";
        int strLength = str.length();
        int lastIndex = strLength - 1;
        System.out.println(str.charAt(lastIndex));

        System.out.println(str.charAt(str.length()-1));



    }
}

package Class6;

public class HW5 {
    public static void main(String[] args) {
//        // Due: July 21
//
//        /**
//         * Create variable to store studentScore and maxScore;
//         * Based on the percentage, display grade to student:
//         * Grade A: 91-100
//         * Grade B: 81-90.99
//         * Grade C: 71-80.99
//         * Grade D: 61-70.99
//         * Grade E: 51-60.99
//         * Grade F: less than or equal to 50.99
//         */
//        int studentScore = 80;
//        int maxScore = 150;
//        //switch ()
//        // calculate percentage --> 80*100/150
//        // print result like:
//        // Your percentage: XX.yy and your Grade is: Z
//
//
//
//
//        /**
//         * store value in an int variable
//         * if number is divisible by 3, print "divisible by 3"
//         * if number is divisible by 5, print "divisible by 5"
//         * if number is divisible by 3 and 5, print "divisible by both"
//         * if not divisible by 3 or 5, print the number
//         */
//        int num2 = 16;
//
//
//
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
//
//
//
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
         */
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














    }
}

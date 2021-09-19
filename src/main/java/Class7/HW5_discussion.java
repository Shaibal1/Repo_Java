package Class7;

public class HW5_discussion {
    public static void main(String[] args) {

        // Due: July 21

        /**
         * Create variable to store studentScore and maxScore;
         * Based on the percentage, display grade to student:
         * Grade A: 91-100
         * Grade B: 81-90.99
         * Grade C: 71-80.99
         * Grade D: 61-70.99
         * Grade E: 51-60.99
         * Grade F: less than or equal to 50.99
         */






        int studentScore = 1480;
        int maxScore = 150;
        // calculate percentage --> 80*100/150
        // print result like:
        //      Your percentage: XX.yy and your Grade is: Z

        // studentScore > 0 and studentScore <= maxScore

        if (studentScore > 0 && studentScore <= maxScore) {

            // calculate percentage and get grade
            double percentage = studentScore * 100.0/ maxScore;
            char yourGrade = 'a';

            if (percentage >= 91) {
                yourGrade = 'A';
            } else if (percentage >= 81) {
                yourGrade = 'B';
            } else if (percentage >= 71) {
                yourGrade = 'C';
            } else if (percentage >= 61) {
                yourGrade = 'D';
            } else if (percentage >= 51) {
                yourGrade = 'E';
            } else {
                yourGrade = 'F';
            }
            System.out.println("Your percentage is: " + percentage + " and your Grade is: " + yourGrade);

        } else {
            System.out.println("Invalid student score entered : " + studentScore);
        }


        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         */
        int num2 = 2;








    }
}

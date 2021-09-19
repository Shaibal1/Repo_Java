package Class5;

public class HW4 {
    public static void main(String[] args) {

        // Due: July 18

        // Question - 1:
        /**
         * String threeWordSentence = "hApPy nEW yeAr"
         * // code
         * String threeWordSentence = "Happy New Year"
         */

//        String threeWordSentence_1 = "hApPy nEW yeAr";
//        System.out.println("Before code : " + threeWordSentence_1);     // "hApPy nEW yeAr"

        // code



        //System.out.println("After code : " + threeWordSentence_1.substring(0,1).toUpperCase() );

        String[] threeWordSentence = new String[]{"hApPy", "nEW", "yeAr"};

        String firstWord = threeWordSentence[0].substring(0, 1).toUpperCase() + threeWordSentence[0].substring(1).toLowerCase();
        String secondWord = threeWordSentence[1].substring(0, 1).toUpperCase() + threeWordSentence[1].substring(1).toLowerCase();
        String thirdWord = threeWordSentence[2].substring(0, 1).toUpperCase() + threeWordSentence[2].substring(1).toLowerCase();

        System.out.println(firstWord + secondWord + thirdWord);


        // Question - 2:
        /**
         * create the abbreviation  // HNY
         */
        // String threeWordSentence_2 = "very gOOD MorNING";
        //String abbr = "";

        // code

        //System.out.println("Abbreviation for '" + threeWordSentence_2 + "' is : " + abbr);
        // Abbreviation for 'very gOOD MorNING' is : VGM

        String threeWordSentence_2 = "very gOOD MorNING";
        String[] sentence_2ToUpperCase = threeWordSentence_2.toUpperCase().split(" ");

        String firstWordLetter = String.valueOf(sentence_2ToUpperCase[0].charAt(0));
        String secondWordLetter = String.valueOf(sentence_2ToUpperCase[1].charAt(0));
        String thirdWordLetter = String.valueOf(sentence_2ToUpperCase[2].charAt(0));


        String abbreviation =  firstWordLetter + secondWordLetter + thirdWordLetter;


        System.out.println(abbreviation);






        // Question - 3:
        /**
         * Using this method is NOT PERMISSIBLE for the Question below.
         * String cityName = "neW yOrK";
         *          * To find the length of a given String
         *          * method: length()
         int cityNameLength = cityName.length();
         *System.out.println("\nLength of '" + cityName + "' is : " + cityNameLength);
         */

        //print the number of words in the sentence.
        //String sentence_3 = "We all are here to learn programming and testing";


//        String clothes = "";
//        String day = "";
//        boolean anyMeeting = true;
//
//        if (day=="weekend")
//        {
//            System.out.println("Clothes = casual");
//        }
//        else if ()

    }
}
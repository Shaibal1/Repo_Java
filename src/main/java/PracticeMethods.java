

public class PracticeMethods {
    public static int vowelCount(String userString) {
        int count = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int c = 0; c < userString.length(); c++) {
            char ch = userString.toLowerCase().charAt(c);
            for (char vowel : vowels) {
                if (vowel == ch) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String name = "Hello World";

        int nameVowelCount = vowelCount(name);

        System.out.println(vowelCount("how ARE yOU my DEar"));

        String[] nameSplit = name.split(" ");

        String nameUpperCase = name.toUpperCase();

        String abr = createAbbreviation("happy new year");
        System.out.println("Abbreviation of 'happy new year' is : " + abr);

        System.out.println(createAbbreviation("hello World"));

        System.out.println(createAbbreviation("how are you"));

        System.out.println(createAbbreviation("King kong"));


    }

    public static String createAbbreviation(String happy_new_year)
    {


        return happy_new_year;
    }
}



/**
    int marks=0	;
        try{
                //Scanner class is wrapper class of System.in object
                Scanner inputDevice = new Scanner(System.in);

                System.out.print("Please enter your Marks (between 0 to 100) >> ");

                marks = inputDevice.nextInt();

                //Checking input validity and grade based on input value
                if(marks< 0){
        System.out.println("Marks can not be negative: Your entry= "+ marks );
        }else if(marks==0){
        System.out.println("You got Zero Marks: Go to ZOO");

        }else if (marks>100){
        System.out.println("Marks can not be more than 100: Your entry= "+ marks );

        }else if (marks>0 & marks< 35){
        System.out.println("You need to work hard: You failed this time with marks ="+ marks);

        }else if (marks>=35 & marks < 50){
        System.out.println("Your score is not bad, but you need improvement, you got C Grade");

        }else if (marks>=50 & marks < 60){
        System.out.println("You can improve performance, you got C+ grade");

        }else if (marks>=60 & marks < 70){
        System.out.println("Good performance with B grade");

        }else if (marks>=70 & marks < 80){
        System.out.println("You can get better grade with little more efforts, your grade is B+");

        }else if (marks>=80 & marks < 90){
        System.out.println("Very good performance, your grade is A ");

        }else if (marks>=90){
        System.out.println("One of the best performance, Your grade is A+");

        }
        }catch (Exception e){
        //This is to handle non-numeric values
        System.out.println("Invalid entry for marks:" );

*/

















































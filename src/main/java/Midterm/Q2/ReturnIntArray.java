package Midterm.Q2;

public class ReturnIntArray {

    public static int findMaxFromArray(int[] userArray) {


        int max = userArray[0];
        for (int i=1 ; i < userArray.length ; i++) {
            if (max < userArray[i]) {
                max = userArray[i];
            }
        }
        return max;
    }
}

package assignments;

import java.util.Arrays;

public class GoogleInterviewQuestion {

    public boolean sumOfTwoElementsFromAnArrayEqualToSum(int[] numberArray, int sum) {

        System.out.println(Arrays.toString(numberArray));

        for (int i : numberArray) {
            sum -= i;
            if (sum == i){
                return true;
            }
        }
        return false;
    }

}

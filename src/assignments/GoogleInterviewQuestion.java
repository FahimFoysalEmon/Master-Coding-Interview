package assignments;

import java.util.Arrays;

public class GoogleInterviewQuestion {

    public boolean sumOfTwoElementsFromAnArrayEqualToSum(int[] numberArray, int sum) {

        System.out.println(Arrays.toString(numberArray));

        for (int i=0 ; i<numberArray.length-1 ; i++) {
            int check = sum - numberArray[i];
            System.out.println(check);
            if (check == numberArray[i+1]){
                return true;
            }
        }
        return false;
    }

}

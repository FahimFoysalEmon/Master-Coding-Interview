import assignments.ContainsCommonItem;
import assignments.GoogleInterviewQuestion;

import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        //Exercise 1
        //----------Contains Common Item Check-----------

//        System.out.println("Starting the Contains-Common-Item");
//
//        char[] hasCommonItemArray1 = {'a', 'b', 'c', 'x'};
//        char[] hasCommonItemArray2 = {'z', 'y', 'i'};
//
//        char[] hasNoCommonItemArray1 = {'a', 'b', 'c', 'x'};
//        char[] hasNoCommonItemArray2 = {'z', 'y', 'x'};
//
//        ContainsCommonItem callingContainsCommonItem = new ContainsCommonItem();

//        looping through all the items and it's time complexity it O(n^2)

//        boolean hasCommonItem = callingContainsCommonItem.containsCommonItem(hasCommonItemArray1, hasCommonItemArray2);
//        boolean hasNoCommonItem = callingContainsCommonItem.containsCommonItem(hasNoCommonItemArray1, hasNoCommonItemArray2);
//
//        System.out.println("Has Common Item so it is returning -> "+hasCommonItem);
//        System.out.println("Has No Common Item so it is returning -> "+hasNoCommonItem);


        //converting array to hashmap
//        Map<Character, Integer> commonItemArray1 = callingContainsCommonItem.arrayToHashMap(hasCommonItemArray1);
//        Map<Character, Integer> commonItemArray2 = callingContainsCommonItem.arrayToHashMap(hasCommonItemArray2);
//        Map<Character, Integer> noCommonItemArray1 = callingContainsCommonItem.arrayToHashMap(hasNoCommonItemArray1);
//        Map<Character, Integer> noCommonItemArray2 = callingContainsCommonItem.arrayToHashMap(hasNoCommonItemArray2);
//
//        boolean hasCommonItemHashMap = callingContainsCommonItem.checkingTwoArraysByHashMap(commonItemArray1, commonItemArray2);
//        boolean hasNoCommonItemHashMap =callingContainsCommonItem.checkingTwoArraysByHashMap(noCommonItemArray1, noCommonItemArray2);
//
//        System.out.println("Has Common Item so it is returning -> "+hasCommonItemHashMap);
//        System.out.println("Has No Common Item so it is returning -> "+hasNoCommonItemHashMap);


        //Exercise 2
        //----------------GOOGLE INTERVIEW QUESTION (Sum of the two elements of the array would be equal to sum)-------------------
        //[1,2,4,4] ----> sum = 8

        GoogleInterviewQuestion googleInterviewQuestion = new GoogleInterviewQuestion();
        int[] numArray = {2,2,3,9};
        int sum = 4;

        System.out.println(googleInterviewQuestion.sumOfTwoElementsFromAnArrayEqualToSum(numArray, sum));

    }
}
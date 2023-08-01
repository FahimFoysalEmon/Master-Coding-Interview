package dataStructure;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {

    public List<Integer> mergeSortedArray(int[] intArrayOne, int[] intArrayTwo) {

        List<Integer> sortedArray = new ArrayList<>();
        int i=0;
        int j=0;


        for (int k = 0; k < intArrayOne.length + intArrayTwo.length; k++) {
            if (i < intArrayOne.length && (j >= intArrayTwo.length || intArrayOne[i] <= intArrayTwo[j])) {
                sortedArray.add(intArrayOne[i]);
                i++;
            } else if (j < intArrayTwo.length) {
                sortedArray.add(intArrayTwo[j]);
                j++;
            }
        }


        for (i=0 ; i<sortedArray.size() ; i++) {
            System.out.println(sortedArray.get(i));
        }

        return null;
    }

}

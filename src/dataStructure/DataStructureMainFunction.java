package dataStructure;

public class DataStructureMainFunction {
    public static void main(String[] args) {
        System.out.println("Hello World From Data Structure Main");

        //Reverse Str Array
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverseString("Hi, My name is Emon"));


        //MergeSortedTwoArrays
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] firstArray = {1,2,3,4};
        int[] secondArray = {5,6,7,8};
        mergeSortedArray.mergeSortedArray(new int[]{0,3,4,3}, new int[]{4,6,30});

    }
}

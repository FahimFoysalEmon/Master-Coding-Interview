import assignments.ContainsCommonItem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting the Contains-Common-Item");

        char[] hasCommonItemArray1 = {'a', 'b', 'c', 'x'};
        char[] hasCommonItemArray2 = {'z', 'y', 'i'};

        char[] hasNoCommonItemArray1 = {'a', 'b', 'c', 'x'};
        char[] hasNoCommonItemArray2 = {'z', 'y', 'x'};

        ContainsCommonItem callingContainsCommonItem = new ContainsCommonItem();

        //looping through all the items and it's time complexity it O(n^2)
        boolean hasCommonItem = callingContainsCommonItem.containsCommonItem(hasCommonItemArray1, hasCommonItemArray2);
        boolean hasNoCommonItem = callingContainsCommonItem.containsCommonItem(hasNoCommonItemArray1, hasNoCommonItemArray2);

        System.out.println("Has Common Item so it is returning -> "+hasCommonItem);
        System.out.println("Has No Common Item so it is returning -> "+hasNoCommonItem);

    }
}
package assignments;

import java.lang.reflect.Array;

public class ContainsCommonItem {

    public boolean containsCommonItem(char[] array1, char[] array2) {
        // Logic to check for common items between array1 and array2
        for (char item : array1) {
            for (char value : array2) {
                if (item == value) {
                    return true;
                }
            }
        }
        return false;
    }

}

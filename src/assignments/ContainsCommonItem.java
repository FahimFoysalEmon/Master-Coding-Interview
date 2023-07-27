package assignments;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

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

    private static Map<Character, Integer> arrayToHashMap(char[] array) {
        Map<Character, Integer> hashMap = new HashMap<>();
        for (char ch : array) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);
        }
        return hashMap;
    }

}

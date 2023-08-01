package dataStructure;

public class ReverseString {

    public String reverseString(String str) {
        char[] charArray = str.toCharArray();
        char[] revCharArray = new char[charArray.length];

        for (int i = charArray.length - 1; i >= 0; i--) {
            revCharArray[charArray.length - 1 - i] = charArray[i];
        }

        return new String(revCharArray);
    }


}

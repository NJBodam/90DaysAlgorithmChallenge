package sub;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueCharacters {
    /*
    * /**
     * <===========MONDAY===========>
     * Task
     * Write a program to determine if a string contains all unique characters. Return true if it does and false otherwise.
     *
     * The string may contain any of the 128 ASCII characters.
     *
     * Specification
     * Challenge.hasUniqueChars(str)
     * Parameters
     * str: String - The string that may or may not contain all unique characters
     *
     * Return Value
     * boolean - True if all characters in the string are unique
     *
     * Examples
     * str Return Value
     * "abcdefg" true
     * "abbcdefg" false
     */

    public static boolean uniqueCharChecker(String str) {
        List<String> arr = Arrays.asList(str.split(""));
        Collections.sort(arr);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).equals(arr.get(i - 1))) {
                return true;
            }
        }
        return false;
    }
}

import java.util.Arrays;
import java.util.stream.Stream;

public class ShortestWordLength {
        /*
        * Simple, given a string of words, return the length of the shortest word(s).

          String will never be empty and you do not need to account for different data types.
        *
        */
    public static int findShort(String s) {

        /*String[] sArr = s.split(" ");
        int num = sArr[0].length();
        for (int i = 1; i < sArr.length; i++) {
            if (sArr[i].length() < num) {
                num = sArr[i].length();
            }
        }
        return num;*/

        //Alternative
        return Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }

}

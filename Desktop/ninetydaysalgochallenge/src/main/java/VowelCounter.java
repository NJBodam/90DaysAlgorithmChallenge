import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelCounter {
    /*
    * Return the number (count) of vowels in the given string.

    We will consider a, e, i, o, u as vowels for this Kata (but not y).

    The input string will only consist of lower case letters and/or spaces.
    */
    public static int getCount(String str) {
        int vowelsCount = 0;
        List<String> input = Arrays.asList(str.split(""));
            for (int i = 0; i < input.size(); i++) {
                if (input.get(i).equals("a") || input.get(i).equals("e")
                || input.get(i).equals("i") || input.get(i).equals("o")
                || input.get(i).equals("u")) {
                    vowelsCount++;
                }
        }
        return vowelsCount;
    }

    // ALTERNATIVE
    /*
    * return str.replaceAll("(?i)[^aeiou]", "").length()
    *
    * return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    *
    * public static int vowelCount(String words) {
        List<String> count = new ArrayList<>();
        List<String> vowels = new ArrayList<String>(Arrays.asList("a", "e", "i", "o", "u"));
        for(String ch : words.split("")) {
            if(vowels.contains(ch)) {
                count.add(ch);
            }
        }
        return count.size();
 }
    * */
}

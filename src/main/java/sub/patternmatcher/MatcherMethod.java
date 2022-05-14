package sub.patternmatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherMethod {

    public static void main(String[] args) {
        String text = "Regex is a powerful tool for programmers";
        Matcher matcher = Pattern.compile("tool").matcher(text);

        matcher.region(10, 20); // start index = 10, end index = 20
        System.out.println(matcher.find()); // false
        matcher.region(20, 30); // start index = 20, end index = 30
        System.out.println(matcher.find()); // true
    }
}

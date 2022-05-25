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

        // How many times will the invocation of matcher.find() return true?
        String str = "Aaab 123 ab 787 abba 12ab 55AB";

        Pattern pattern = Pattern.compile("[ab]+");

        Matcher matcher2 = pattern.matcher(str);

        while (matcher2.find()) {
            System.err.println(matcher2.group());
        }

    }
}

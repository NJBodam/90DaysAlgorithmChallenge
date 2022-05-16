package sub.patternmatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {


    public static void main(String[] args) {

        Pattern pattern = Pattern.compile(".*java.*", Pattern.CASE_INSENSITIVE);

        String text = "We use JAVA to write modern applications";

        Matcher matcher = pattern.matcher(text);

        System.out.println(matcher.matches()); // true

        System.out.println(Pattern.matches(".*[Jj]ava.*", "We use Java to write modern applications")); // true

        System.out.println(Pattern.matches("(?is).*java.*", "\n\nJAVA\n\n")); // true

        String text1 = "Regex is a powerful tool for programmers";

        Pattern pattern1 = Pattern.compile("tool");
        Matcher matcher1 = pattern1.matcher(text);

        System.out.println(matcher1.matches()); // false, the whole string does not match the pattern
        System.out.println(matcher1.find()); // true, there is a substring that matches the pattern

        Pattern pattern2 = Pattern.compile("^tool$");
        Matcher matcher2 = pattern2.matcher(text1);

        System.err.println(matcher2.matches()); // false
        System.err.println(matcher2.find());   // false


    }
}

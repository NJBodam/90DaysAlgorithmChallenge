package sub.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAndReplace {


    public static void main(String[] args) {

//        String digitRegex = "\\d"; // a regex to match a digit
//
//        String str = "ab73c80abc9"; // a string consisting of letters and digits
//
//        String result1 = str.replaceAll(digitRegex, "#"); // it replaces each digit with #
//
//        System.out.println(result1); // "ab##c##abc#"
//
//        String result2 = str.replaceFirst(digitRegex, "#"); // it replaces only the first digit with #
//
//        System.out.println(result2); // "ab#3c80abc9
//
//
//        String regex = "[A-Z]+";
//
//        String str2 = "aBoeQNmDFEFu";
//
//        String result = str.replaceAll(regex, "-"); // "a-oe-m-u"
//
//
//        Pattern pattern = Pattern.compile("\\d"); // a regex to match a digit
//
//        String str3 = "ab73c80abc9"; // a string consisting of letters and digits
//
//        Matcher matcher = pattern.matcher(str);
//
//        System.out.println(matcher.replaceAll("#")); // ab##c##abc#
//        System.out.println(matcher.replaceFirst("#")); // ab#3c80abc9

        String text = "<h2 style='fontsize'>Header with <b>bold</b> text</h2>";
        String regex = "//*?";
        String reg = "<.*?>";
        String regex2 = "(\"/\\*.*?\\*/\")|(/\\*.*?\\*/)";
        String regex3 = "(\"//.*)|(//.*)";
        String result = text.replaceAll(reg, "");

        String text2 = "int b = 0;/* expression */ b = b /* **/* b /* b * b = b squared */; // 0 * 0 = 0\n";

        // System.out.println(result);

        String result2 = text2.replaceAll(regex2, "").replaceAll(regex3, "");
        System.out.println(result2);

        System.out.print("**");
        System.out.println();
        System.out.println("**");
        System.out.print("**");




    }
}

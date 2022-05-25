package sub.patternmatcher;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BigNumberExtractor {


    /*
    Write a program that extracts and outputs all big numbers from a string.
    A big number contains at least 10 characters.

    Output all the big numbers you found. Each number should start with a new
    line and be followed by its length (the number of digits). Put the colon : character to separate numbers and their lengths.

    Try to use Matcher and Pattern to solve it. All the needed modules are already imported.
    */

    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        String stringWithNumbers = "If X is 609348676234, Y is 3077, the sum is 609348679311.";
       // String line = sc.nextLine();


        Pattern pattern = Pattern.compile("\\d{10,}");

        Matcher matcher = pattern.matcher(stringWithNumbers);

       // System.err.println(matcher.matches());

        while (matcher.find()) {
            System.out.println(matcher.group() + ":" + matcher.group().length());
            // Alternative
            //System.out.println(String.format("%s:%s", matcher.group(), matcher.group().length()));
        }

        /*
        Write a program extracting all words that include the substring "program" from a given text.
        The text can be large enough. You should not count whitespaces, punctuation marks
        and other special characters as parts of extracted words.

        Try to use Matcher and Pattern to solve it. All the needed modules are already imported.
        Your pattern should be case insensitive.

        Input data format

        A single string containing a text about programs, programmers, or programming.

        Output data format

        Multiple lines where each line contains two parts separated by one whitespace: the
        starting index of the word and the word itself.
        */

        Pattern pattern1 = Pattern.compile("program[a-z]*", Pattern.CASE_INSENSITIVE);

        String strings = "All Java programmers program good programs.";
        String string2 = "Computer programming is the process of building and designing an executable computer program for accomplishing a specific computing task. Programming involves tasks such as analysis, generating algorithms, profiling algorithms' accuracy and resource consumption, and the implementation of algorithms in a chosen programming language. The source code of a program is written in one or more programming languages. The purpose of programming is to find a sequence of instructions that will automate the performance of a task for solving a given problem. The process of programming thus often requires expertise in several different subjects, including knowledge of the application domain, specialized algorithms, and formal logic.";
        Matcher matcher1 = pattern1.matcher(string2);

        // System.err.println(matcher.matches());

        while (matcher1.find()) {
            System.err.println(matcher1.start() + " " + matcher1.group());
        }

    }
}

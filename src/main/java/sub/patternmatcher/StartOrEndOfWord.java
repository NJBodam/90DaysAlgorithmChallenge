package sub.patternmatcher;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartOrEndOfWord {

    /*
    The first line of the input contains a sequence of letters.

    The second line of the input contains some text.

    Your task is to determine if any of the words of this text start or
    end with the sequence specified in the first line of the input.
    If there is, you should output "YES", otherwise output "NO".
    A word can only contain symbols of the English alphabet.
    You should ignore the case while searching for matches.

    Sample Input 1:

    ing
    Java is the most popular programming language
    Sample Output 1:

    YES
    Sample Input 2:

    press
    Regular expressions is hard to read, isn't it?
    Sample Output 2:

    NO
    Sample Input 3:

    ho
    Wow! How awesome is that!
    Sample Output 3:

    YES
    Sample Input 4:

    ONE
    ponep,onep!
    Sample Output 4:

    YES


    // NUMBER PARSING
    You need to write a regular expression that can match any number.

    A number can be positive or negative. If it is negative, then it must start with a '-'.
    If it is positive, it may start with a '+'. If it doesn't start with either '+' or '-' it is considered positive.

    A number representation can't be padded with leading zeroes. For example, 001 is not a valid number (but 0 is).

    A number can have a fractional part. A delimiter between an integer part and a
    fractional part can be either a dot . or a comma ,.
    A fractional part can't be padded with trailing zeros:
    for example, 1.01 and 1.0 are valid numbers, but 1.00 and 1.10 are not.

    Output "YES" if a given string is a valid number, otherwise output "NO".
    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String part = scanner.nextLine();
        String line = scanner.nextLine();

        Pattern pattern = Pattern.compile("(" + part + "\\b)|(\\b" + part + ")", Pattern.CASE_INSENSITIVE);


        Matcher matcher = pattern.matcher(line);

        System.out.println(matcher.find() ? "YES" : "NO");



    }
}

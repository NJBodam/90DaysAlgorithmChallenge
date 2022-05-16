package sub.patternmatcher;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWordWithLength {

    /*
    For a given number N and a line with text, output "YES" if this line contains
    a word with exactly N symbols, otherwise output "NO".

    A word can contain only symbols of the English alphabet.

    Sample Input 1:

    3
    Java is the most popular programming language
    Sample Output 1:

    YES
    Sample Input 2:

    11
    Regular expression is hard to read, isnt it?
    Sample Output 2:

    NO
    Sample Input 3:

    one
    Wow! How awesome is that!
    Sample Output 3:

    YES
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();

        // write your code here
        Pattern pattern = Pattern.compile("\\b[a-zA-Z]{" + size +"}\\b");

        Matcher matcher = pattern.matcher(line);

        System.out.println(matcher.find() ? "YES" : "NO");
     //   System.out.println(line.matches( "\\s.{3}\\s"));



    }
}

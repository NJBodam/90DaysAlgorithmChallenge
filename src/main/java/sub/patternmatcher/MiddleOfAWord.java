package sub.patternmatcher;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MiddleOfAWord {

    /*
    The first line of the input contains a sequence of letters.

    The second line of the input contains some text.

    Your task is to determine whether any of the words from the
    second line contain this sequence of letters.
    Count only the words that do not start or end with your search term.
    If such a word is present in the line, output "YES", otherwise output "NO".
    The word can contain only the letters of the English alphabet. Ignore the case while searching for matches.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();


        Pattern pattern = Pattern.compile(".*[^ ]" + part + "[^ ].*", Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(line);

        System.err.println(matcher.matches());


    }


    /*
    //QUESTION
    Suppose you are writing a program to match an e-mail address. The rules for email addresses are:

    The e-mail username can consist of lowercase and uppercase Latin letters, digits and symbols _%+-..
    The domain name (the part that comes after the @ symbol in an e-mail address)
    can consist only of lowercase and uppercase Latin letters.
    The e-mail domain should include a subdomain and a top-level domain.
    Here are some valid examples:

    bob.smith@gmail.com

    anna@example.ru

    kat9%yy+@subdomain.topleveldomain

    Which of the following regexes can help you write this program?

    //ANSWER
    ^[a-zA-Z0-9_%+-.]+@[a-zA-Z]+\\.[a-zA-Z]+$

    */
}

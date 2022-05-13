package sub.regex;

import java.util.Scanner;

public class IllegalIdentifierRegex {

    public static void main(String[] args) {
        /*
        Suppose, you want to create a new programming language that supports variables.
        There is a set of rules for identifiers (names) of variables:

        It can include lower and upper letters, digits and the underscore character _;
        It can only start with a letter or an underscore;
        If an identifier starts with an underscore, the second character should be
        either a letter or a digit, but not an underscore;
        Note that a single _ is not a valid identifier.

        Using the provided template, write a program that reads n identifiers
        and then outputs all invalid ones in the same order as they appear in the input data.
        We hope that you will use regexes to solve the problem.
        */

        Scanner scanner = new Scanner(System.in);
        String regex = "(?=.*[a-zA-Z])(?=.*[\\d]).";
        String regex2 = "[__]";
        String reg = "";
        while (scanner.hasNext()) {
            String identifier = scanner.nextLine();

        }
    }
}

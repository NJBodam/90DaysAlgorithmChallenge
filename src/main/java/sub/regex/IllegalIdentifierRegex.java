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

        Sample Input 1:
        6
        ident
        i
        __
        1a
        b33
        _n1

        Sample Output 1:
        __
        1a

        */

        Scanner scanner = new Scanner(System.in);
        String regex = "([0-9$].*)|(__.*)|_";
        String regex1 = "_[_].*";
        String regex2 = "[a-zA-Z_][^_]*";

        String reg = "";
        int size = scanner.nextInt();
        String[] arr = new String[size];

       // System.out.println(scanner.next().matches(regex2));

        int index = 0;
       // size -= 1;
        while (index != size) {
            arr[index] = scanner.next();
            index++;
        }
//
        for (String s : arr) {
            if(s.matches(regex)) {
                System.err.println(s);;
            }

        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i].charAt(0) == "") System.out.println(arr[i]);;
//        }
    }
}

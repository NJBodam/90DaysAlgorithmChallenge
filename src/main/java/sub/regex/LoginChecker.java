package sub.regex;

import java.util.Scanner;

public class LoginChecker {

    public static void main(String[] args) {

        /*
        Let's consider a program that checks whether the input string is a valid login.
        We assume that login can contain any Latin letter, a number,
        the underscore character _, and the dollar sign $.
        The length must be no less than 5 characters and no more than 12 characters.
        There is one additional feature: we should ignore all whitespace characters in
        the beginning and the end of the input string.
        */

        /* The scanner object to read data from the standard input */
        Scanner scanner = new Scanner(System.in);

        /* The common pattern for valid logins */
        String loginRegex = "\\s*[a-zA-Z0-9_$]{5,12}\\s*";

        /* The read string which may be a login */
        String mayBeLogin = scanner.nextLine();

        boolean isLogin = mayBeLogin.matches(loginRegex);

        System.out.println(isLogin);
    }
}

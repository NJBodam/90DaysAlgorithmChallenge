package sub.regex;

import java.util.Scanner;

public class CheckDateRegex {

    /*
    Write a program that uses regular expressions to check whether the input date is valid.
    The input date can be in any of the two formats: yyyy-mm-dd or dd-mm-yyyy.
    The year must be 19yy or 20yy. - /. symbols can be used as splitters.

    dd from 01 to 31

    mm from 01 to 12

    For a given string output Yes if this string is a valid date, otherwise output No.
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String dateRegex = "((0[1-9]|[1-3]\\d)[-/.](0[1-9]|" +
                "1[0-2])[-/.](19|20)\\d{2})|" +
                "((19|20)\\d{2}[-/.](0[1-9]|1[0-2])" +
                "[-/.](0[1-9]|[1-3]\\d))";

        String date = scanner.nextLine();
        System.out.println(date.matches(dateRegex) ? "YES" : "NO");


    }
}

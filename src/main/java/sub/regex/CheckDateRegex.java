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

        String dateRegex = "(0\\d|[1-3]\\d)[-/.](0\\d|1[0-3])[-/.](19|20)\\d{2}";

        // (5[1-5]|2[2-7])
        //"(5[1-5]|2[2-7])\\d{14}"

        String date = scanner.nextLine();
        System.out.println(date.matches(dateRegex) ? "YES" : "NO");
        // |0//d

        // 21/12/1999

        // (19|20)[0-9][0-9][/]((0//d)|[10-12])[/]((0//d)|10-31)|
    }
}

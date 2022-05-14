package sub.regex;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIPAddress {

    /*
    An IP address consists of four numbers from 0 to 255, inclusive,
    divided by the dots. For example, 127.0.0.1 is a valid IP address,
    but 256.0.0.1 and 127.0.1 are invalid IP addresses.
    For a given string output "YES" if this string is a valid IP address, otherwise output "NO"
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex2 = "((2*[0-5]*[0-5]*)+|([0-1][0-9]*[0-9]*)+)" +
                "\\.((2*[0-5]*[0-5]*)+|([0-1]*[0-9]*[0-9]*)+)" +
                "\\.((2*[0-5]*[0-5]*)+|([0-1]*[0-9]*[0-9]*)+)" +
                "\\.((2*[0-5]*[0-5]*)+|([0-1]*[0-9]*[0-9]*)+)";

        //10.20.99.199
        if (scanner.next().matches(regex2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        // Alternative
        // String oneNumber = "([0-9]{1,2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])";
        // String regex = String.format("%s\\.%s\\.%s\\.%s", oneNumber, oneNumber, oneNumber, oneNumber);

        // Alternative
        String exp = "((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)(\\.(?!$)|$)){4}";
        System.out.println(scanner.nextLine()
                .matches(exp) ? "YES" : "NO");

    }
}

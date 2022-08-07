package sub.regex;

import java.util.Scanner;

public class LengthOfSequence {

//    For its input, the program gets a sequence of non-negative integers;
//    each integer is written in a separate line. The sequence ends with an
//    integer 0; when the program reads 0, it should end its work and
//    output the length of the sequence (not counting the final 0).
//
//    Don’t read numbers following the number 0.

    //Solution
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        int count = 0;
        while (sc.hasNext()) {
            if (sc.nextLine().matches("[1-9]|[1-9][0-9]*")) {
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}

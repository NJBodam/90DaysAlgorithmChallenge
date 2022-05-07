package sub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SymmetricalNumber {

    /*
    * Given a four-digit number, determine whether its decimal notation is symmetric.
    * If the number is symmetric, output 1; otherwise, output any other integer.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        ArrayList<Integer> arr;
        String num = scanner.next();

        if (num.charAt(3) == num.charAt(0) && num.charAt(2) == num.charAt(1)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        // alternative
        //         System.out.println(fourNumber.equals(new StringBuilder(fourNumber).reverse().toString()) ? 1 : 0);
    }
}

package sub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerSplitter {

    /*
    * Task
        In this challenge, you will write a function to divide an integer into a number of even parts, which will be returned in a result array. Summing the integers in this result array will produce the original number.

        For example, given number = 10 and parts = 2, splitInteger(10, 2) should return an array of integers with length equal to parts: [5, 5].

        Not all numbers will offer a clean division. In this case, we should split the number as closely as possible to even, with the smaller numbers in the front of the array. For example,

        splitInteger(11, 3) → [3, 4, 4]
        There is no reason to test for edge cases; the input to your function will always be valid for this challenge. Please see the below specification for the exact constraints on the input:

        Challenge.splitInteger(num, parts)
        Divides an integer into an even number of parts.

        Parameters
        num: Integer - The integer number that should be split into equal parts

        parts: Integer - The number of parts that the integer should be split into

        Return Value
        List<Integer> - An array of part values which sum to num. The parts will be ordered from smallest to largest.

        Constraints
        0 < num ≤ 100
        0 < parts ≤ num
        Examples
        num	parts	Return Value
        Completely even parts	10	5	[2,2,2,2,2]
        Divided as closely as possible into even parts with the smallest parts grouped at the front of the result
        *
        *
        * FAILED TESTS
        *
        * expected:<[108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 109, 109, 109, 109]> but was:<[108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 108, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109, 109]>

        * expected:<[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2]> but was:<[1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2]>

    * */
    public static List<Integer> splitInteger(int num, int parts) {
        ArrayList<Integer> result = new ArrayList<>();
        if(num % parts == 0) {
            int partsHalf = parts / 2;
            int partsNum = num / parts;
            evenSplitter(partsNum, parts, result);
        } else {
            float midFloat = (float) num / parts;
            int midInt = Math.round(midFloat);
            if (midInt % 2 == 0) {
                int partsHalf = parts / 2;
                int partsNum = num / parts;
                evenSplitter((int) Math.floor(partsNum), partsHalf, result);
                evenSplitter((int) Math.ceil(partsNum) + 1, partsHalf + 1, result);
            } else {
                int partsHalf = parts / 2;
                int partsNum = num / parts;
                evenSplitter(partsNum, (int) Math.ceil(partsHalf) + 1 , result);
                evenSplitter(partsNum + 1, (int) Math.floor(partsHalf) - 1, result);
            }

        }

        return result;
    }

    private static void evenSplitter(int num, int parts, ArrayList<Integer> result) {
        int count = parts;
        while (count > 0) {
            result.add(num);
            count--;
        }
    }

    public static void main(String[] args) {
        List<Integer> result = splitInteger(20, 6);
        System.out.println(result);

    }
}

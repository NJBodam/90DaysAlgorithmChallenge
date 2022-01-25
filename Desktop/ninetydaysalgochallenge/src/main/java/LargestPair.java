import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class LargestPair {


        /*QUESTION 4
        Given a sequence of numbers, find the largest pair sum in the sequence.

        For example

        [10, 14, 2, 23, 19] --> 42 (= 23 + 19)
        [99, 2, 2, 23, 19] --> 122 (= 99 + 23)
        Input sequence contains minimum two elements and every element is an integer.*/


    public static int largestPairSum(int[] arr) {
        Arrays.sort(arr);
        // Alternative
        // ArrayList<Integer> arr2 = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());;
        // Collections.reverse(arr2);
        return arr[arr.length - 1] + arr[arr.length -2];
    }
}

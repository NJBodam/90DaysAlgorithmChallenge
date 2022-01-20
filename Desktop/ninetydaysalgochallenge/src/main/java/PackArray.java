import java.util.ArrayList;

public class PackArray {

    /**
     QUESTION 1
     Given an array of 2k integers (for some integer k, which will be betwen 0 and 5 inclusive),
     perform the following operations until the array contains only one element:
     * <p>
     * On the 1st, 3rd, 5th, etc. iterations (1-based) replace each pair of consecutive elements with their sum;
     * On the 2nd, 4th, 6th, etc. iterations replace each pair of consecutive elements with their product.
     * After the algorithm has finished, there will be a single element left in the array. Return that element.
     * <p>
     * Specification
     * Challenge.packArray(arr)
     * <p>
     * Parameters
     * arr: Integer[] - An array of integers to be packed
     * Return Value
     * Integer - The final product
     * Constraints
     * arr.length == 2k
     * 0 ≤ k ≤ 5
     * -9 ≤ arr[i] ≤ 99
     * Example:
     * For arr = [1, 2, 3, 4, 5, 6, 7, 8], the output should be 186.
     * We have [1, 2, 3, 4, 5, 6, 7, 8] -> [3, 7, 11, 15] -> [21, 165] -> [186], so the answer is 186.
     */

    public static int packArray(ArrayList<Integer> arr) {
        int count = 1;
        int num = 0;
        if (arr.size() == 1) {
            return arr.get(0);
        }
        if (arr.size() > 1) {
            for (int i = 1; i < arr.size(); i++) {
                num = arr.get(i) + arr.get(i - 1);
                arr.set(i - 1, num);
                arr.remove(i);
                count++;
            }
            for (int i = 1; i < arr.size(); i++) {
                num = arr.get(i) * arr.get(i - 1);
                arr.set(i - 1, num);
                arr.remove(i);
                count++;
            }
        }
        return packArray(arr);
    }





}

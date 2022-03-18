package sub;

import java.util.Arrays;

public class ArrayOfIntegers {

    /*
    * Build a function that returns an array of integers from n to 1 where n>0.

        Example : n=5 --> [5,4,3,2,1]
    * */

    public static int[] reverse(int n){
        //your code
        int[] arr = new int[n];
        int index = 0;
        while (n > 0) {
            arr[index] = n;
            index++;
            n--;
        }
        System.out.println(Arrays.toString(arr));
        return arr;

        // Alternative
        // return IntStream.iterate(n, i -> i - 1).limit(n).toArray();

        // Alternative
        // IntStream.range(-n, 0).map(Math::abs).toArray();
    }
}

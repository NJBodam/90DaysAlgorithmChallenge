import java.util.Arrays;

public class ArrayOfIntegers {
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

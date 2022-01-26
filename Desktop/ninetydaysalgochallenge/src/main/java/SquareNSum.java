public class SquareNSum {

    /*
    * Complete the square sum function so that it squares each number passed into it and then sums the results together.

       For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
    * */

    public static int squareSum(int[] n)
    {
        //Your Code
        int temp = 0;
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            temp = n[i] * n[i];
            sum += temp;
        }
        return sum;
        // ALTERNATIVE
        // return Arrays.stream(xs).map(x -> x * x).sum();
    }

}

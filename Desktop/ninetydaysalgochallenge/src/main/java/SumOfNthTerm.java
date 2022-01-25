import java.math.BigDecimal;
import java.text.DecimalFormat;

public class SumOfNthTerm {

    /*
    * Task:
        Your task is to write a function which returns the sum of following series upto nth term(parameter).

        Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
        Rules:
        You need to round the answer to 2 decimal places and return it as String.

        If the given value is 0 then it should return 0.00

        You will only be given Natural Numbers as arguments.

        Examples:(Input --> Output)
        1 --> 1 --> "1.00"
        2 --> 1 + 1/4 --> "1.25"
        5 --> 1 + 1/4 + 1/7 + 1/10 + 1/13 --> "1.57"
    * */

    public static String seriesSum(int n) {
        double result = 1;
        double temp = 0;
        int den = 4;
        while (n > 1) {
            result += Math.round(((double) 1 / den) * 100.0) / 100.0;
            System.out.println(result);
            n--;
            den += 3;
        }
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(result);
    }
}

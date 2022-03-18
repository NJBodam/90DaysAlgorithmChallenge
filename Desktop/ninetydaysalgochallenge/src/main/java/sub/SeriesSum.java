package sub;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class SeriesSum {

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
    *
    * */
    public static String seriesSum(int n) {
        // Happy Coding ^_^

        double c = n;
        double sum = 1;
        double one = 1;
        double den = 4;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        if(!(c == 1)) {
            while (c != 1) {
                sum += one / den;
                df.format(sum);
                den += 4;
                c--;
            }
        }
        return String.valueOf(df.format(sum));
    }
}

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class SeriesSum {
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
                den += 4;
                c--;
            }
        }
        return String.valueOf(df.format(sum));
    }
}

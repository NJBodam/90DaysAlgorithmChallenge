package sub.functionalinterfaces;

import java.util.Locale;

    /*
    Write a lambda expression that accepts seven (!) string arguments and
    returns a string in uppercase concatenated from all of them (in the order of arguments).
    Solution format. Submit your lambda expression with seven arguments in any valid format with ; at the end.
    Examples (only with two args): (x, y) -> x + y; (x, y) -> { return x + y; };

    Sample Input 1:
    The lambda has too many string arguments.

    Sample Output 1:
    THELAMBDAHASTOOMANYSTRINGARGUMENTS.
    */
public class Seven {
    public static SeptenaryStringFunction fun = (a, b, c, d, e, f, g) -> {
        String res = a + b + c + d + e + f + g;
        return res.toUpperCase(Locale.ROOT);
    };
}



@FunctionalInterface
interface SeptenaryStringFunction {
    String apply(String s1, String s2, String s3, String s4, String s5, String s6, String s7);
}

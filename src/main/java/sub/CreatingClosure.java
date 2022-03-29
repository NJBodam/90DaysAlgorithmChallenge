package sub;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class CreatingClosure {

    /*
    * Write a lambda expression that takes single String argument, removes all whitespaces
    * on its both ends and adds PREFIX (before) and SUFFIX (after) to it. PREFIX and SUFFIX
    * are final variables provided in the code template.
     */

    public static final String PREFIX = "__pref__";
    public static final String SUFFIX = "__suff__";

    public static UnaryOperator<String> operator = (str) -> PREFIX + str.trim() + SUFFIX;
// without use Math library
    public static IntBinaryOperator binaryOperator = (x, y) -> {
        return x > y ? x : y;
    };

    public static int a = 10;
    public static int b = 20;
    public static int c = 30;

    public static DoubleUnaryOperator unaryOperator = x -> {
        return a * Math.pow(x, 2) + b * x + c;
    }; // Write your code here

    public static LongUnaryOperator longUnaryOperator = x -> {
        return x % 2 == 0 ? x + 2 : x + 1;
    }; // Write your code here

}

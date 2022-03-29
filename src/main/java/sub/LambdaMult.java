package sub;

import java.util.function.Function;

public class LambdaMult {

    public static void printResultOfLambda(Function<String, Integer> function) {
        System.out.println(function.apply("HAPPY NEW YEAR 3000!"));
    }


}

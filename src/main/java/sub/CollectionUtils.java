package sub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CollectionUtils {

    public static Collection<Integer> pow2(Collection<Integer> numbers) {
        // write your code here;
        Collection<Integer> result = new ArrayList<>();
        result.addAll(numbers.forEach(number -> Math.pow(number, number)));
        System.out.println(result);
        return result;
    }
}
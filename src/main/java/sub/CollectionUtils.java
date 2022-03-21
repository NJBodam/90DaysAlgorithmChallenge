package sub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

class CollectionUtils {

    public static Collection<Integer> pow2(Collection<Integer> numbers) {
        // write your code here
        Collection<Integer> result = numbers;
        return numbers.forEach(num -> Math.pow(num, num));
    }
}
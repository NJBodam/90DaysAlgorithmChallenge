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
        numbers.forEach(number -> result.add(number * number));
       // return numbers.stream().map(n -> n * n).collect(Collectors.toList());
        return result;
    }

    public static Collection<String> filterPhones(Collection<String> phones, Collection<String> blacklist) {
        // write your code here
        phones.removeAll(blacklist);
        //  phones.removeIf(p -> blacklist.contains(p));
        // blacklist.forEach(phones::remove);
        return phones;
    }
}
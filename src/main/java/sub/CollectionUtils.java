package sub;

import java.util.*;

public class CollectionUtils {

    public static Collection<Integer> pow2(Collection<Integer> numbers) {
        // write your code here;
        Collection<Integer> result = new ArrayList<>();
        numbers.forEach(number -> result.add(number * number));
       // List<Integer> list = new ArrayList<>(new int{2, 3, 5, 6});
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 0, 1, 7));
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
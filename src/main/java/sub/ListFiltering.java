package sub;


import java.util.ArrayList;
import java.util.List;

public class ListFiltering {
    /*
    * In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.

    Example
    Kata.filterList(Arrays.asList(1, 2, "a", "b")) => Arrays.asList(1,2)
    Kata.filterList(Arrays.asList(1, 2, "a", "b", 0, 15)) => Arrays.asList(1,2,0,15)
    Kata.filterList(Arrays.asList(1, 2, "a", "b", "aasf", "1", "123", 231)) => Arrays.asList(1, 2, 231)

    * */
    public static List filterList(final List list) {
        // Return the List with the Strings filtered out
        List<Object> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Object letter = list.get(i);
            if (letter.getClass() == Integer.class) {
                result.add(list.get(i));
            }
        }
        return result;
    }

    // ALTERNATIVE
    // return list.stream().filter(e -> e instanceof Integer).collect(Collectors.toList());
    /*
     ALTERNATIVE
    *
        public static List<?> filterList(List<?> list) {
                List<?> collect = list.stream().filter(x -> x.getClass().equals(Integer.class)).collect(toList());
                return collect;
            }
    * */
}

package sub.mapinterface;

import java.util.*;

public class MapUtils {

    public static SortedMap<String, Integer> wordCount(String[] strings) {
        // write your code here
        //System.out.println(Arrays.toString(strings));
        SortedMap<String, Integer> result = new TreeMap<>();
        for (String c : strings) {
            result.putIfAbsent(c, 0);
            int num = result.get(c);
            result.put(c, ++num);
        }
        System.out.println(result);

        return result;
    }

    public static void printMap(Map<String, Integer> map) {
        // write your code here
        map.forEach((key, value) -> System.out.printf("%s : %d\n", key, map.get(key)));
    }


/* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        MapUtils.printMap(MapUtils.wordCount(words));
    }
}
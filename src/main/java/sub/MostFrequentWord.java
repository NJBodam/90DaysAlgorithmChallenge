package sub;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentWord {
    public static void FrequentWord(String[] arr) {
        Map<String, Integer> stringMap = new HashMap<>();
        for (String str : arr) {
            if (stringMap.containsKey(str)) {
                stringMap.put(str, stringMap.get(str) + 1);
            } else {
                stringMap.put(str, 1);
            }
            // Map Traversing.
            String maxValueKey = "";
            int maxValue = 0;
            for (Map.Entry<String, Integer> entry : stringMap.entrySet()) {
                String key = entry.getKey();
                int value = entry.getValue();
                if (value > maxValue) {
                    maxValue = value;
                    maxValueKey = key;
                }
                // Tie condition.
                else if (value == maxValue) {
                    if (key.length() < maxValueKey.length())
                        maxValueKey = key;
                }
            }
            System.out.println("Key of Maximum word count: " + maxValueKey);
            System.out.println("Maximum word count value: " + maxValue);
        }
    }

}
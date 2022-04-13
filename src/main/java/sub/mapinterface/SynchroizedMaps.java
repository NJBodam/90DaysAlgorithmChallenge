package sub.mapinterface;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchroizedMaps {
    /*
    * Let's consider the following example. Here we have two threads: writer which
    * adds non-negative numbers to the map, and the main thread which adds negative numbers to the map.
    *
    * Everything works as intended and the resulting size of the map is always the same.
    * However, if you experiment and use a classic non-synchronized map instead of a synchronizedMap,
    * the size of the returned map can be totally unpredictable.
     */


    public static void main(String[] args) throws InterruptedException {
        Map<Integer, String> synchronizedNumbers = Collections.synchronizedMap(new HashMap<>());

        Thread writer = new Thread(() -> addPositiveNumbers(synchronizedNumbers));
        writer.start();

        addNegativeNumbers(synchronizedNumbers); // add negative numbers from the main thread

        writer.join(); // wait for the writer thread

        System.out.println(synchronizedNumbers.size()); // the size is always 200_000
        System.out.println(synchronizedNumbers);
    }

    private static void addPositiveNumbers(Map<Integer, String> target) {
        for (int i = 0; i < 100_000; i++) {
            target.put(i, "Number is " + i);
        }
    }

    private static void addNegativeNumbers(Map<Integer, String> target) {
        for (int i = -100_000; i < 0; i++) {
            target.put(i, "Number is " + i);
        }
    }
}

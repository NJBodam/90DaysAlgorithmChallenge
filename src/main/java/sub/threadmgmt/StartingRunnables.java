package sub.threadmgmt;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.IntStream;

public class StartingRunnables {
    public static void startRunnables(Runnable[] runnables) {
        // implement the method

        Arrays.stream(runnables).forEach(x -> new Thread(x).start());
    }

/*
        * Java has a standard interface named java.lang.Runnable with the single method run. The method has no arguments and returns nothing.

        You should implement the given method createRunnable that takes two arguments: text and repeats.
        * The method must return an instance of an anonymous class implementing java.lang.Runnable.
        * The overridden method of the anonymous class should print the text to
        * the standard output a specified number of times (repeats).

        Use the provided code template, do not write the standard interface java.lang.Runnable.

        For example, if the text is "Hello!" and repeats is 3, the output should be:

        Hello!
        Hello!
        Hello!
* */

    public static Runnable createRunnable(String text, int repeats) {
        return () -> {
//            for (int i = 0; i < repeats; i++) {
//                System.out.println(text);
//            }
           IntStream.range(0, repeats).forEach(i -> System.out.println(text));
        };
    }
// Call the static createRunnable method under a main thread ending with the .run() Runnable method

    //

}

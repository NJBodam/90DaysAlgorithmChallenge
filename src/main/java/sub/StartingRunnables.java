package sub;

import java.util.Arrays;

public class StartingRunnables {
    public static void startRunnables(Runnable[] runnables) {
        // implement the method

        Arrays.stream(runnables).forEach(x -> new Thread(x).start());
    }
}

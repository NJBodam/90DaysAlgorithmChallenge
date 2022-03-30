package sub;

public class StartingRunnables {
    public static void startRunnables(Runnable[] runnables) {
        // implement the method
        Arrays.stream(Runnable[]).forEach(x -> new Thread(x).start());
    }
}

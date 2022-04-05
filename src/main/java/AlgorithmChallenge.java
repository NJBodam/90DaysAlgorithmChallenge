import sub.CollectionUtils;
import sub.MultiDimensionalArr;

import java.util.*;
import java.util.function.Function;

import static sub.CreatingClosure.operator;
import static sub.LambdaMult.printResultOfLambda;

public class AlgorithmChallenge {
    Object obj = new Object();
    class Box<T> {
        T value;

        void set(T value) {
            this.value = value;
        }
    }

    private static long mainThreadId = Thread.currentThread().getId();

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

      //  SlowStringProcessor processor = new SlowStringProcessor(str);
      //  System.out.println(processor.getNumberOfUniqueCharacters());

        System.out.println("Started");
        Thread.currentThread().start();
        Thread.currentThread().wait();


        Thread.sleep(2000L); // suspend current thread for 2000 millis

        System.out.println("Finished");

        //MultiDimensionalArr.numValForTwoDimArray(new int[2][10]);
        Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        nameSet.forEach(System.out::println);

        int[][] twoDimArr = new int[][]{
                {0, 0, 9, 9},
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        //MultiDimensionalArr.reverseElements(twoDimArr);
//
//        MultiDimensionalArr.cinemaSeats();
//        Collection<Integer> languages = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 0, 1, 7));
//        languages.add(10);
//        languages.add(20);
//        languages.add(-5);
//
//        CollectionUtils.pow2(languages);

        // it returns the length of a string
        Function<String, Integer> f = s -> s.length();
        printResultOfLambda(f); // it prints 20

        // It prints the number of digits: 4
        // A funtion that takes in a lambda expression
        printResultOfLambda(s -> {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    count++;
                }
            }
            return count;
        });


        System.out.println(operator.apply("names"));

        Thread t = Thread.currentThread(); // main thread

        Thread tt = new Thread(); // main thread

        // Thread Properties

        System.out.println("Name: " + t.getName());
        System.out.println("ID: " + t.getId());
        System.out.println("Alive: " + t.isAlive());
        System.out.println("Priority: " + t.getPriority());
        System.out.println("Daemon: " + t.isDaemon());

        t.setName("my-thread");
        System.out.println("New name: " + t.getName());

        System.out.println("Name: " + tt.getName());
        System.out.println("ID: " + tt.getId());
        System.out.println("Alive: " + tt.isAlive());
        System.out.println("Priority: " + tt.getPriority());
        System.out.println("Daemon: " + tt.isDaemon());
    }


}

package sub;

import java.util.stream.IntStream;

/*
* Write a service that takes a message and the number of its repetitions as constructor parameters and prints the message in the standard output the specified number of times.

Use the provided template for your class.

The testing system will start the service as a regular thread.
* */
public class MessageNotifier extends Thread {

    // write fields to store variables here
    private String msg;
    private int repeats;

    public MessageNotifier(String msg, int repeats) {
        // implement the constructor
        this.msg = msg;
        this.repeats = repeats;
    }

    @Override
    public void run() {
        // implement the method to print the message stored in a field
        int num = repeats;
        while (num > 0) {
            System.out.println(msg);
            num--;
        }

        // Alternative

      //  @Override
      //  public void run() {
            IntStream.rangeClosed(1, repeats).forEach(x -> System.out.println(this.msg));
      //  }
    }
}

/*
* Writing a thread for printing numbers
 Easy
2312 users solved this problem. Latest completion was about 8 hours ago.
Write a class named NumbersThread that extends the Thread class. The class must have a constructor that takes two integer numbers from and to as range borders.

Implement the method run. It must print all numbers from the given range (inclusive) to the standard output.

Use the provided template.
* */

class NumbersThread extends Thread {
    int from;
    int to;

    public NumbersThread(int from, int to) {
        // implement the constructor
        super();
        this.from = from;
        this.to = to;
    }

    // you should override some method here
    @Override
    public void run() {
        IntStream.rangeClosed(from, to).forEach(x -> System.out.println(from++));
    }
}
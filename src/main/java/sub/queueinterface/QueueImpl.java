package sub.queueinterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class QueueImpl {


    public static void main(String[] args) {

        // If you need to implement a Queue for FIFO,
        // Use ArrayDeque that implements Queue interface
        System.err.println("<<<<<<<<<<< Deque >>>>>>>>>>>>>");
        Queue<String> q = new ArrayDeque<>();

        q.offer("first");
        q.offer("second");
        q.offer("third");

        System.out.println(q.peek()); // first
        System.out.println(q.peek()); // first
        System.out.println(q.poll()); // first,

        System.out.println(q.peek()); // second
        System.out.println(q.poll()); // second
        System.out.println(q.poll()); // third

        System.out.println(q.isEmpty()); // true


        // If you need to implement a Stack for LIFO or both (FIFO),
        // Use ArrayDeque that implements Deque interface
        System.err.println("<<<<<<<<<<< Deque as Stack >>>>>>>>>>>>>");

        Deque<String> stack = new ArrayDeque<>();

        stack.offerLast("first");
        stack.offerLast("second");
        stack.offerLast("third");

        System.out.println(stack); // [first, second, third]

        System.out.println(stack.pollLast()); // third
        System.out.println(stack.pollLast()); // second
        System.out.println(stack.pollLast()); // first

        System.out.println(stack.pollLast());

        System.err.println("<<<<<<<<<<< Legacy Stack >>>>>>>>>>>>>");
        Stack<String> stack2 = new Stack<>();

        stack.push("first");
        stack.push("second");
        stack.push("third");

        System.out.println(stack); // [first, second, third]

        System.out.println(stack.pop()); // "third"
        System.out.println(stack.pop()); // "second"
        System.out.println(stack.pop()); // "first"

        System.out.println(stack.pop()); // throws EmptyStackException



    }
}

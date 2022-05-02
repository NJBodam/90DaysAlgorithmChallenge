package sub.queueinterface;

import com.sun.tools.javac.util.List;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;

public class DequeTest {


    public static void main(String[] args) {
        System.err.println("<<<<<<<<<<< Test >>>>>>>>>>>>>");

        Deque<String> states = new ArrayDeque<String>();

        states.add("Germany");
        states.add("France");
        states.push("UK");
        states.offerLast("Norway");

        String sPop = states.pop();
        String sPeek = states.peek();
        String sPeekLast = states.peekLast();
        states.offer(sPop);
        String sPollLast = states.pollLast();

        while (states.peek() != null) {
            System.out.println(states.pop());
        }
        /*Create ArrayDeque named queue and enqueue the following four numbers 2, 0, 1, 7.
        The code for displaying the queue is already written.

        Sample Input 1:

        Sample Output 1:
        [2, 0, 1, 7]
        */
        Queue<Integer> caps = new ArrayDeque<>(new ArrayList<Integer>(List.of(2, 0, 1, 7)));
        while (caps.peek() != null) {
            System.out.print(caps.poll());
        }

    }
}

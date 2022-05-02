package sub.queueinterface;

import java.util.ArrayDeque;
import java.util.Deque;

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
            System.out.print(states.pop());
        }
    }
}

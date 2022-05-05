package sub.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorTest {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(com.sun.tools.javac.util.List.of(1, 2, 3, 4));
        ListIterator<Integer> iterator = list.listIterator(); // only for lists!

        // go to the last element
        while (iterator.hasNext()) { System.out.println(iterator.next()); }

        // print elements in the backward order with their indexes

        // If you invoke previous before previousIndex the result will differ
        // since previous changes the state of the iterator: the current position.

        while (iterator.hasPrevious()) {
            int previousIndex = iterator.previousIndex();
            int element = iterator.previous();
            System.out.println(element + " on " + previousIndex);
        }


    }

    public static void removeElementsGreaterThanValue(Iterator<Long> iterator, Long val) {
        // write your code here

    }
}

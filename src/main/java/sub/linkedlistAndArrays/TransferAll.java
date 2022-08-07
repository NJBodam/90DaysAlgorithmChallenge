package sub.linkedlistAndArrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TransferAll {
//    Transfer both lists
//    You're working with the two lists: LinkedList and ArrayList, containing String elements.
//
//    You need to implement the transferAllElements method. All elements of LinkedList should become elements of ArrayList and vice versa.
//
//    Note that both lists always have the same size.
//
//            Example:
//
//// original lists
//
//    LinkedList [0, 1, 2, 3, 4]
//    ArrayList  [5, 6, 7, 8, 9]
//
//// after the transferAllElements method invocation
//
//    LinkedList [5, 6, 7, 8, 9]
//    ArrayList  [0, 1, 2, 3, 4]

    public static void transferAllElements(LinkedList<Integer> linkedList, ArrayList<Integer> arrayList) {
        // write your code here
        int size = arrayList.size();
        int count = 0;
        while (count != size) {
            linkedList.addLast(arrayList.get(count));
            arrayList.set(count, linkedList.removeFirst());
            count++;
        }
        System.err.println("new arr" + arrayList);
        System.err.println("new link" + linkedList);
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        ArrayList<Integer> arrayList = new ArrayList<>(List.of(5, 6, 7, 8, 9));
        transferAllElements(linkedList, arrayList);

    }

}

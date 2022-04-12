package sub;

public class SinglyLinkedList {

    /*
    * Write a function that takes in the head of a Singly Linked List, reverses the list in place (i.e., doesn't create a brand new list), and returns its new head.

    Each LinkedList node has an integer value as well as a next node pointing to the next node in the list or to None / null if it's the tail of the list.

    You can assume that the input Linked List will always have at least one node; in other words, the head will never be None / null.

    Sample Input
    head = 0 -> 1 -> 2 -> 3 -> 4 -> 5 // the head node with value 0
    Sample Output
    5 -> 4 -> 3 -> 2 -> 1 -> 0 // the new head node with value 5*/

    public static LinkedList reverseLinkedList(LinkedList head) {
        // Write your code here.

//        while (head.next <= 0) {
//            int temp = head.next.value;
//            head.next.value = head.value;
//            head.value = temp;
//        }

        return head;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
    }
}

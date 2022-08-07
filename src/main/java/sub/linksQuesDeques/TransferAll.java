package sub.linksQuesDeques;

import java.util.*;

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

    /*The same letter
    r/>
    There is a Map with countries as keys and capitals as values. You need to implement the method printWithSameLetter.
    It should print only the country and the capital which have the same first letters.

    Sample Input:
    Australia Canberra
    Belgium Brussels
    Germany Berlin

    Sample Output:
    Belgium Brussels*/

    public static void printWithSameLetter(Map<String, String> map) {
        // write your code here
        for(Map.Entry<String, String> entry : map.entrySet()) {
            if(entry.getKey().charAt(0) == entry.getValue().charAt(0)) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

        //Alternative
//        map.entrySet()
//                .stream()
//                .filter(e -> e.getKey().charAt(0) == e.getValue().charAt(0))
//                .forEach(e -> System.out.printf("%s %s", e.getKey(), e.getValue()));

    }

//    Remove long names
//    There is a Map with countries as keys and capitals as values. You need to implement the method removeLongNames.
//    It should delete all elements which have a long key or a long value. Long means that their length is bigger than 7 symbols.
    public static void removeLongNames(Map<String, String> map) {
        // write your code here
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        entrySet.removeIf(entry -> entry.getKey().length() > 7 || entry.getValue().length() > 7);
    }

//    You're working with the two maps that contain String keys and String values.
//    You need to implement the calcTheSamePairs method. It should print how many
//    common pairs both maps contain. The pair is considered to be the same when
//    the element from the first map has the same key and the same value as the element from the second map.
//
//    Example:
//
//    map1:                 map2:
//    keyA valueA           key1 value1
//    keyB valueB           keyA valueA
//    keyC valueC           key2 value2
//    keyD valueD           keyB valueB
//    keyE valueE

    public static void calcTheSamePairs(Map<String, String> map1, Map<String, String> map2) {
        // write your code here
//        Set<Map.Entry<String, String>> entrySet1 = map1.entrySet();
//        Set<Map.Entry<String, String>> entrySet2 = map2.entrySet();
        long count = map1.entrySet().stream().filter(map2.entrySet()::contains).count();
        System.out.println(count);

    }

//    Write a program that reads numbers and stores them in a deque.
//    Any even number should be added as the first element, an odd number as the last.
//    Then the program must output all elements from the first to the last.
//
//    The first line contains the number of elements. Each line followed the first one contains an element.

    public static void evenGoFirst() {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        Deque<Integer> stat = new ArrayDeque<>(count);

        while (count != 0) {
            int num = sc.nextInt();
            if (num % 2 != 0) {
                stat.add(num);
            } else {
                stat.push(num);
            }
            count--;
        }

        while (stat.peek() != null) {
            System.out.println(stat.poll());
        };

    }


    public static void main(String[] args) {
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.add(0);
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(3);
//        linkedList.add(4);
//
//        ArrayList<Integer> arrayList = new ArrayList<>(List.of(5, 6, 7, 8, 9));
//        transferAllElements(linkedList, arrayList);

        evenGoFirst();

    }

}

package sub.queueinterface;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class GreedyLoadBalancer {
    /*Write a program that implements a simple load balancer.

        The program must read tasks from the standard input and distribute them between two queues.
        Tasks will be processed by a system (in the future).
        Each task has a unique identifier and a number indicating the load on the system (in parrots).
        The balancer should distribute tasks between queues by the following rule:
        the task is added to the lower-load queue (by the total load).
        If both queues have the same total load indicator, the task must be added to the first queue.
        It's guaranteed, the input data contain at least two tasks.

        Input data format

        The first line contains the number of tasks.
        Other lines consist of task description: an identifier and a load indicator (separated by a space).

        Output data form
        The first line should contain identifiers of tasks in the first queue,
        the second line should contain the identifiers in the second queue.

        Sample Input 1:
        6
        1 1
        2 1
        3 1
        4 3
        5 1
        6 1

        Sample Output 1:
        1 3 5 6
        2 4

        */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        Queue<Integer> firstQ = new ArrayDeque<>(size);
        Queue<Integer> secondQ = new ArrayDeque<>(size);
        int firstQLoad = 0;
        int secondQLoad = 0;

        while (sc.hasNextLine() && size > 0) {
           // String[] arr = sc.next().split(" ");
            int task = sc.nextInt();
            int load = sc.nextInt();
            if (secondQLoad >= firstQLoad) {
                firstQ.add(task);
                firstQLoad += load;
            } else {
                secondQ.add(task);
                secondQLoad += load;
            }
            size--;
        }

        print(firstQ);
        System.out.println();
        print(secondQ);

    }

    private static void print(Queue queue) {
        queue.forEach(System.out::print);
    }

}

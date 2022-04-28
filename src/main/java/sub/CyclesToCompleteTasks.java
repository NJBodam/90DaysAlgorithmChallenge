package sub;

import java.util.ArrayList;

public class CyclesToCompleteTasks {
    public static void main(String[] args) {
        ArrayList<Integer> jobs = new ArrayList<>();
        jobs.add(3);
        jobs.add(10);
        jobs.add(20);
        jobs.add(1);
        jobs.add(2);


        int index = 3;
        int total = jobs.stream().filter(x -> x <= jobs.get(0)).mapToInt(x -> x).sum();
        System.err.println(total);
    }
}

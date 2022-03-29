import sub.CollectionUtils;
import sub.MultiDimensionalArr;

import java.util.*;
import java.util.function.Function;

import static sub.CreatingClosure.operator;
import static sub.LambdaMult.printResultOfLambda;

public class AlgorithmChallenge {
    Object obj = new Object();
    class Box<T> {
        T value;

        void set(T value) {
            this.value = value;
        }
    }



    public static void main(String[] args) {


        //MultiDimensionalArr.numValForTwoDimArray(new int[2][10]);

        int[][] twoDimArr = new int[][]{
                {0, 0, 9, 9},
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        //MultiDimensionalArr.reverseElements(twoDimArr);
//
//        MultiDimensionalArr.cinemaSeats();
//        Collection<Integer> languages = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 0, 1, 7));
//        languages.add(10);
//        languages.add(20);
//        languages.add(-5);
//
//        CollectionUtils.pow2(languages);

        // it returns the length of a string
        Function<String, Integer> f = s -> s.length();
        printResultOfLambda(f); // it prints 20

        // It prints the number of digits: 4
        // A funtion that takes in a lambda expression
        printResultOfLambda(s -> {
            int count = 0;
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    count++;
                }
            }
            return count;
        });


        System.out.println(operator.apply("names"));




    }


}

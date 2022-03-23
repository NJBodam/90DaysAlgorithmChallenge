import sub.CollectionUtils;
import sub.MultiDimensionalArr;

import java.util.*;

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

        MultiDimensionalArr.reverseElements(twoDimArr);
//
//        MultiDimensionalArr.printTheThirdRow(twoDimArr);
        Collection<Integer> languages = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 0, 1, 7));
        languages.add(10);
        languages.add(20);
        languages.add(-5);

        CollectionUtils.pow2(languages);




    }


}

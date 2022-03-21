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

//        int[][] twoDimArr = new int[][]{
//                {1, 1, 1},
//                {2, 2, 2},
//                {3, 3, 3}
//        };
//
//        MultiDimensionalArr.printTheThirdRow(twoDimArr);
        Collection<Integer> languages = new ArrayList<>();

        languages.add(10);
        languages.add(20);
        languages.add(-5);

        CollectionUtils.pow2(languages);



    }


}

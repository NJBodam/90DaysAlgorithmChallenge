import sub.MultiDimensionalArr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}
        };

        MultiDimensionalArr.printTheThirdRow(twoDimArr);



    }


}

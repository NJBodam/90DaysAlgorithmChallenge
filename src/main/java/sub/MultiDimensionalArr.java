package sub;

import java.util.Arrays;

public class MultiDimensionalArr {


    public static int numValForTwoDimArray(int[][] twoArray) {

        int[][] twoDimArray = new int[2][10];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = 1;
            }
        }
        twoDimArray[0][2] = 10;
        twoDimArray[1][2] = 10;
        twoDimArray[0][4] = 10;
        twoDimArray[1][4] = 10;
        twoDimArray[0][6] = 10;
        twoDimArray[1][6] = 10;

        for (int i = 0; i < twoDimArray.length; i++) {
            System.out.println(Arrays.toString(twoDimArray[i]));
        }
        return 0;
    }



}

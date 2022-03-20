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

    public static int numValForThreeDimArray() {
        int[][][] threeDimArray = new int[3][3][3];

        int element = 0;
        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray[i].length; j++) {
                for (int k = 0; k < threeDimArray[i][j].length; k++) {

                    //element++;

                    threeDimArray[i][j][k] = element;
                    element++;
                }
            }
            element = 0;
        }

        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray[i].length; j++) {
                System.out.print(Arrays.toString(threeDimArray[i][j]) + " ");
            }
            System.out.println();
        }

        return 0;
    }



}

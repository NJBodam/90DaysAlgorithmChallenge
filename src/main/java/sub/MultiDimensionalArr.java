package sub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

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

    public static void reverseElements(int[][] twoDimArray) {
        // write your code here
//        List<Integer> list = Arrays.stream(twoDimArray[0]).boxed().collect(toList());
//        Collections.reverse(list);
//        int[] newArr = new int[list.size()];
//        Arrays.stream(list.toArray()).mapToInt(num -> newArr.);
//        twoDimArray[0] = newArr;


        for (int i = 0; i < twoDimArray.length; i++) {
           // List<Integer> list = Arrays.stream(twoDimArray[i]).boxed().collect(toList());
            int temp = twoDimArray[i][0];
            twoDimArray[i][0] = twoDimArray[i][3];
            twoDimArray[i][3] = twoDimArray[i][1];
            twoDimArray[i][1] =  twoDimArray[i][2];
            twoDimArray[i][2] =  twoDimArray[i][3];
            twoDimArray[i][3] = temp;

           // System.out.println();
            System.out.println(Arrays.toString(twoDimArray[i]));

        }

//        for (int i = 0; i < twoDimArray.length; i++) {
//            System.out.println(Arrays.toString(twoDimArray[i]));
//        }
    }
// CMD + alt + V === to get the variable type
// CMD + alt + M === to extract method from a complex method
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

    public static void printTheThirdRow(int[][] twoDimArray) {
        // write your code here
        for (int j = 0; j < twoDimArray[2].length; j++) {
            System.out.print(twoDimArray[2][j] + " ");
        }
    }





}

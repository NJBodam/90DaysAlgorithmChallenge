package sub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringHiLo {

        /*
        * QUESTION 7
        From a string of numbers, return the highest and the lowest value as a string. For example:
        "3 4 2 9 -4" -> "-4 9"
        * */

    public static String hiAndLoString(String numbers) {
        List<Integer> arrNum = new ArrayList<>();
        List<String> arr = Arrays.asList(numbers.split(" "));
        System.out.println(arr.toString());
        for (int i = 0; i < arr.size(); i++) {
            arrNum.add(Integer.parseInt(arr.get(i)));
        }
        Collections.sort(arrNum);
        return String.valueOf(arrNum.get(0)) + " " + String.valueOf(arrNum.get(arrNum.size() - 1));
    }
}

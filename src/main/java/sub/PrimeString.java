package sub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeString {
    public static boolean primeString(String s) {
        List<String> arr = Arrays.asList(s.split(""));

        //Collections.sort(arr);
        System.out.println(Arrays.asList(arr));
        System.out.println(arr.size());
        if(arr.size() == 1) {
            return true;
        }

       // arr.stream().distinct().collect(Collectors.toList());
        List<String> arr2 = arr.stream().distinct().collect(Collectors.toList());
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < arr2.size(); i++) {
            word.append(arr2.get(i));
        }
        System.out.println(word);
        System.out.println(Arrays.toString(new String[]{arr2.toString()}));

        if(s.contains(word) && arr.size() % arr2.size() != 0) {
            return true;
        }


        /*List<Integer> numarr = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++) {
            if (arr.get(0) == arr.get(i)) {
                numarr.set(0, numarr.get(0) + 1);
              //  arr.stream().distinct(arr.get(0));
            }
        }*/
        /*if(arr.size() % 2 == 0 && arr.) {
            int num = arr.size() / 2;
            if(arr.subList(0, num) == arr.subList(num + 1, arr.size() - 1)) {
                return true;
            }
        }*/
        //if(arr.)



        return false;
    }
}

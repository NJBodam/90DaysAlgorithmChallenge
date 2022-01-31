import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorithmChallenge {
    public static void main(String[] args) {


       // ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16));
        List<String> list = new ArrayList<>();
        list.add("gather:field:wheat");
        list.add("bake:flour:bread");
        list.add("mill:wheat:flour");

      //  ArrayList<Integer> str = new ArrayList<>(Arrays.asList(24, 85, 0));
        System.out.println(Arrays.toString(new List[]{EfficientSetOfSteps.efficienSteps("field", "bread", list)}));


    }
}

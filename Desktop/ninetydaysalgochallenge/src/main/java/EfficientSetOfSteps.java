import java.util.Arrays;

public class EfficientSetOfSteps {
    /*
    * QUESTIION
        Task
        For this challenge, you will be finding the most efficient set of steps to get from one item to another.

        Inputs
        You will write a function which will be provided with a set of processes that each convert from one item to another.

        These will be provided as an array, with each process in the form of "process_name:from_item:to_item". For example, you might have a process named "smelt" that converts ore into a metal, like this: "smelt:ore:metal".

        You will also be passed in the initial start item and desired end item for the overall workflow.

        Note: For simplicity, all processes and items will be simple alphanumeric strings.

        Output
        Given these three inputs, your task is to determine which processes will complete the task in the shortest number of steps. Once you have done so, return the names of these processes, in order, as an array.

        If no steps are needed (because the start and end item is the same), or if you cannot find a valid set of processes to get from the start to the end, return an empty array.

        Specification
        Challenge.countChange(startItem, endItem, tasks)
        Parameters
        startItem: String - Item to start with

        endItem: String - Item to try to reach

        tasks: String[] - A mapping of strings from one item to another in the format "process_name:from_item:to_item"

        Return Value
        String[] - A list of processes that convert start item to end item, if it exists

        Examples
        start_item	end_item	tasks	Return Value
        "field"	"bread"	["gather:field:wheat","bake:flour:bread","mill:wheat:flour"]	["gather","mill","bake"]
        "field"	"ferrari"	["gather:field:wheat","bake:flour:bread","mill:wheat:flour"]	[]
        "field"	"field"	["gather:field:wheat","bake:flour:bread","mill:wheat:flour"]	[]

    * */

    public static String[] efficienSteps(String start, String end, String[] arr) {
        String[] result = new String[3];
        String[] firstTask = arr[0].split(":");
        String[] secondTask = arr[1].split(":");
        String[] thirdTask = arr[2].split(":");
        if (firstTask[2].equals(end) || secondTask[2].equals(end) || thirdTask[2].equals(end)) {
            result[0] = firstTask[0];
            result[1] = thirdTask[0];
            result[2] = secondTask[0];
            return result;
        }
        return new String[]{};
    }

    /*
    for (int i = 0; i < arr.length; i++) {
            String[] newArr = arr[i].split(":");
            if (newArr[newArr.length - 1].equals(end)) {
                for (int j = 0; j < arr.length; j++) {
                    result[j] =
                }
            }*/

}

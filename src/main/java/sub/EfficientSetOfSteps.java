package sub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        Challenge.countChange(startItem, endItem, arr)
        Parameters
        startItem: String - Item to start with

        endItem: String - Item to try to reach

        arr: String[] - A mapping of strings from one item to another in the format "process_name:from_item:to_item"

        Return Value
        String[] - A list of processes that convert start item to end item, if it exists

        Examples
        start	end	arr	Return Value
        "field"	"bread"	["gather:field:wheat","bake:flour:bread","mill:wheat:flour"]	["gather","mill","bake"]
        "field"	"ferrari"	["gather:field:wheat","bake:flour:bread","mill:wheat:flour"]	[]
        "field"	"field"	["gather:field:wheat","bake:flour:bread","mill:wheat:flour"]	[]
        *

        expected:<[collect, freeze, carve]> but was:<[]>
        *
        expected:<[make_bricks, build_house]> but was:<[]>
        *
        *
        *
    String[] firsttask = tasks.get(0).split(":");
    String[] secondtask = tasks.get(1).split(":");
    String[] thirdtask = tasks.get(2).split(":");
    String[] result = new String[3];
    *
    * try splitting every thing into a stream of strings


    if(firsttask[1].equals(start_item) && secondtask[2].equals(end_item)) {
      result[0] = firsttask[0];
      result[2] = secondtask[0];
      result[1] = thirdtask[0];
      return Arrays.asList(result);
    }
    if(firsttask[1].equals(start_item) && thirdtask[2].equals(end_item)) {
      result[0] = firsttask[0];
      result[2] = thirdtask[0];
      result[1] = secondtask[0];
      return Arrays.asList(result);
    }
    if(secondtask[1].equals(start_item) && thirdtask[2].equals(end_item)) {
      result[0] = secondtask[0];
      result[2] = thirdtask[0];
      result[1] = firsttask[0];
      return Arrays.asList(result);
    }



      return new ArrayList<String>();

    * */

    public static List<String> efficienSteps(String start, String end, List<String> arr) {
        String[] firsttask = arr.get(0).split(":");
        String[] secondtask = arr.get(1).split(":");
        String[] thirdtask = arr.get(2).split(":");
        String[] result = new String[3];


        if(firsttask[2].equals(end)) {
            result[2] = firsttask[0];
            if(secondtask[1].equals(start)) {
                result[0] = secondtask[0];
                result[1] = thirdtask[0];
                return Arrays.asList(result);
            } else if(thirdtask[1].equals(start)) {
                result[0] = thirdtask[0];
                result[1] = secondtask[0];
                return Arrays.asList(result);
            }
        }
        if(secondtask[2].equals(end)) {
            result[2] = secondtask[0];
            if(firsttask[1].equals(start)) {
                result[0] = firsttask[0];
                result[1] = thirdtask[0];
                return Arrays.asList(result);
            } else if(thirdtask[1].equals(start)) {
                result[0] = thirdtask[0];
                result[1] = secondtask[0];
                return Arrays.asList(result);
            }
        }
        if(thirdtask[2].equals(end)) {
            result[2] = thirdtask[0];
            if(secondtask[1].equals(start)) {
                result[0] = secondtask[0];
                result[1] = thirdtask[0];
                return Arrays.asList(result);
            } else if(firsttask[1].equals(start)) {
                result[0] = firsttask[0];
                result[1] = secondtask[0];
                return Arrays.asList(result);
            }
        }
        return new ArrayList<String>();




























        /*String[] result = new String[3];
        String[] firstTask = arr[0].split(":");
        String[] secondTask = arr[1].split(":");
        String[] thirdTask = arr[2].split(":");
        if (firstTask[2].equals(end)) {
            result[2] = firstTask[0];
            if (secondTask[1].equals(start)) {
                result[0] = secondTask[0];
                result[1] = thirdTask[0];
            } else if (thirdTask[1].equals(start)) {
                result[0] = thirdTask[0];
                result[1] = secondTask[0];
            }
            return result;
        } else if (secondTask[2].equals(end)) {
            result[2] = secondTask[0];
            if (firstTask[1].equals(start)) {
                result[0] = firstTask[0];
                result[1] = thirdTask[0];
            } else if (thirdTask[1].equals(start)) {
                result[0] = thirdTask[0];
                result[1] = firstTask[0];
            }
            return result;
        } else if (thirdTask[2].equals(end)) {
            result[2] = thirdTask[0];
            if (secondTask[1].equals(start)) {
                result[0] = secondTask[0];
                result[1] = thirdTask[0];
            } else if (firstTask[1].equals(start)) {
                result[0] = firstTask[0];
                result[1] = secondTask[0];
            }
            return result;
        }
        return new String[]{};*/

    }

}

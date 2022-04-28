package sub.catchingexceptions;

public class UserMainCode {

    public static void main(String[] args) {
       // System.out.println(calc(5, new int[]{1,4,5,4,5}));
        int rem = 14 / 3;
        System.out.println(Math.floor(14/3));
    }

    public static int calc (int input1, int[] input2){
        int result = 0;
        int holder = input1;
        int i = 0;

//        if(check(b,a)){
//
//        }

        while(input2[i] < input1){
            result += input2[i];
            i++;
        }
        while(i < input2.length){
            result += input1;
            input1++;
            i++;
        }

        return result;
    }
//
//    public static boolean check(int[] arr, int toCheckValue) {
//        boolean test = false;
//        for (int element : arr) {
//            if (element == toCheckValue) {
//                test = true;
//                break;
//            }
//        }
//        System.out.println(test);
//        return test;
//    }
}

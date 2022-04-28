package sub.catchingexceptions;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class InchConversion {

    public static double convertInchesToFeet(double num) {
        return num / 12;
    }

    public static double convertInchesToYard(double num) {
        return convertInchesToFeet(num) / 3;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double inches = sc.nextDouble();
//        System.out.println(inches + " inches == " + convertInchesToFeet(inches) + " Feet");
//        System.out.println(inches + " inches == " + convertInchesToYard(inches) + " Yard");
//        System.out.println(2 + (-3) + 5 + (-8));





      //  int[] jobs = {3,10,20,1,2};

        ArrayList<Integer> jobs = new ArrayList<>();
        jobs.add(3);
        jobs.add(10);
        jobs.add(20);
        jobs.add(1);
        jobs.add(2);


        int index = 3;
        int total = jobs.stream().filter(x -> x <= jobs.get(0)).mapToInt(x -> x).sum();
        System.err.println(total);
    }
}

package sub.catchingexceptions;

import java.util.Scanner;

public class InchConversion {

    public static double convertInchesToFeet(double num) {
        return num / 12;
    }

    public static double convertInchesToYard(double num) {
        return convertInchesToFeet(num) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inches = sc.nextDouble();
        System.out.println(inches + " inches == " + convertInchesToFeet(inches) + " Feet");
        System.out.println(inches + " inches == " + convertInchesToYard(inches) + " Yard");
        System.out.println(2 + (-3) + 5 + (-8));

    }
}

package sub.catchingexceptions;

import java.util.Scanner;

public class PaintCalculator {

    private static double calculateWallArea(double l, double w, double h) {
        return 2 * (l * h + l * w + h * w);
    }

    public static double gallonsOfPaintNeeded(double surfaceArea) {
        System.err.println(surfaceArea);
        System.out.println("Price of gallons of paint needed: " + (surfaceArea / 350) * 32);
        return surfaceArea / 350;
    }



    public static void main(String[] args) {
        System.out.println("Welcome to paint calculator");
        System.out.println("Input length of room: ");
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        System.out.println("Input width of room: ");
        double w = sc.nextDouble();
        System.out.println("Input height of room: ");
        double h = sc.nextDouble();

        System.out.println(gallonsOfPaintNeeded(calculateWallArea(l, w, h)));

    }
}

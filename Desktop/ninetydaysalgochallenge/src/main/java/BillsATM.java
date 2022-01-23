import java.util.Arrays;

public class BillsATM {

    /**
     * <=============TUESDAY============>
     * An ATM only has 100, 50 and 20 dollar bills (USD) available to be dispensed.
     *
     * Given an amount between 40 and 10000 dollars (inclusive) and assuming that the ATM wants to use as few bills as possible, determinate the minimal number of 100, 50 and 20 dollar bills the ATM needs to dispense (in that order).
     *
     * Here is the specification for the withdraw method you'll complete:
     *
     * Challenge.withdraw(amount)
     * Parameters
     * amount: Integer - Amount of money to withdraw. Assume that the amount is always divisible into 100, 50 and 20 bills.
     *
     * Return Value
     * Integer[] - An array of 3 integers representing the number of 100, 50 and 20 dollar bills needed to complete the withdraw (in that order).
     *
     * Constraints
     * 40 ≤ amount ≤ 1000
     *
     * Examples
     * amount Return Value
     * 250 [2,1,0]
     * 260 [2,0,3]
     * 370 [3,1,1]
     * @return
     */

    public static String atmBilling(int amount) {
        int firstbill = 0;
        int secondbill = 0;
        int thirdbill = 0;

        if (amount >= 100) {
            firstbill = (int) Math.floor(amount / 100);
            amount -= (firstbill * 100);
        }
        if (amount >= 50 && amount % 20 != 0) {
            secondbill = (int) Math.floor(amount / 50);
            amount -= (secondbill * 50);
        }
        if (amount % 20 == 0) {
            thirdbill = amount / 20;
        }

        int[] arr = {firstbill, secondbill, thirdbill};
        return Arrays.toString(arr);
    }
}

public class RomanConversion {


   /* QUESTION 3
   Create a function taking a positive integer as its parameter and returning a string
    containing the Roman Numeral representation of that integer.
        Modern Roman numerals are written by expressing each digit
        separately starting with the left most digit and skipping any digit
        with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM,
        90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII.
        1666 uses each Roman symbol in descending order: MDCLXVI.

        1000 = M
        900 = CM
        800 = DCCC
        700 = DCC
        600 = DC
        500 = D
        400 = CD
        300 = CCC
        200 = CC
        100 = C
        90 = XC
        60 = LX
        50 = L
        40 = XL
        30 = XXX
        20 = XX
        10 = X

        */

    public static String romanConverter(int num) {
        String roman = "";
        String[] romanNum = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int i = 0; i < numbers.length; i++) {
            while (num >= numbers[i]) {
                roman += romanNum[i];
                num -= numbers[i];
            }
        }

        return String.valueOf(roman);

        // Alternative
       /* StringBuilder roman = new StringBuilder();
        int rem = num;
        while (rem >= 1000) {
            roman.append("M");
            rem -= 1000;
        }
        while (rem >= 900) {
            roman.append("CM");
            rem -= 900;
        }
        while (rem >= 800) {
            roman.append("DCCC");
            rem -= 800;
        }
        while (rem >= 700) {
            roman.append("DCC");
            rem -= 700;
        }
        while (rem >= 600) {
            roman.append("DC");
            rem -= 600;
        }
        while (rem >= 500) {
            roman.append("D");
            rem -= 500;
        }
        while (rem >= 400) {
            roman.append("CD");
            rem -= 400;
        }
        while (rem >= 300) {
            roman.append("CCC");
            rem -= 300;
        }
        while (rem >= 200) {
            roman.append("CC");
            rem -= 200;
        }while (rem >= 100) {
            roman.append("C");
            rem -= 100;
        }while (rem >= 90) {
            roman.append("XC");
            rem -= 90;
        }while (rem >= 80) {
            roman.append("LXXX");
            rem -= 80;
        }while (rem >= 70) {
            roman.append("LXX");
            rem -= 70;
        }while (rem >= 60) {
            roman.append("LX");
            rem -= 60;
        }while (rem >= 50) {
            roman.append("L");
            rem -= 50;
        }while (rem >= 40) {
            roman.append("XL");
            rem -= 40;
        }while (rem >= 30) {
            roman.append("XXX");
            rem -= 30;
        }while (rem >= 20) {
            roman.append("XX");
            rem -= 20;
        }while (rem >= 10) {
            roman.append("X");
            rem -= 10;
        }while (rem >= 9) {
            roman.append("IX");
            rem -= 9;
        }while (rem >= 8) {
            roman.append("VIII");
            rem -= 8;
        }while (rem >= 7) {
            roman.append("VII");
            rem -= 7;
        }while (rem >= 6) {
            roman.append("VI");
            rem -= 6;
        }while (rem >= 5) {
            roman.append("V");
            rem -= 5;
        }while (rem >= 4) {
            roman.append("IV");
            rem -= 4;
        }while (rem >= 3) {
            roman.append("III");
            rem -= 3;
        }while (rem >= 2) {
            roman.append("II");
            rem -= 2;
        }while (rem >= 1) {
            roman.append("I");
            rem -= 1;
        }

        return roman.toString();*/
    }
}

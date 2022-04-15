package sub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testing {
    static class Seat {
        private Long rate;
        private Long lock;
        private Long value;

        Seat(Long rate, Long lock, Long value) {
            this.rate = rate;
            this.lock = lock;
            this.value = value;
        }
        Seat() {

        }

        public Long getRate() {
            return rate;
        }

        public void setRate(Long rate) {
            this.rate = rate;
        }

        public Long getLock() {
            return lock;
        }

        public Long getValue() {
            return value;
        }

        public void setValue(Long value) {
            this.value = value;
        }

        public void setLock(Long lock) {
            this.lock = lock;
        }

        @Override
        public String toString() {
            return "Seat{" +
                    "rate=" + rate +
                    ", lock=" + lock +
                    '}';
        }
    }

    public static void main(String[] args) {
        String strRates = "5.0,100,5.5,101,6.0,102:L10;        5.0,99,5.5,100,6.0,101:L20;";

        List<Seat> availableSeats = new ArrayList<>();

        //strRates.split(";");
        String subString = strRates.substring(0, strRates.length() - 1);
        String[] split = subString.split(";");
        List<String[]> allList = new ArrayList<>();
        for(String s: split) {
            allList.add(s.split(","));
        }
        System.out.println(allList.get(0)[0]);
        int size = split.length;
        int[][] dimArr = new int[size][size];
        Seat seat = new Seat();
        String s = split[0];

        int num = 0;
        int rate = allList.get(0).length;
        int lock = allList.get(0).length;

        for (int i = 0; i < dimArr.length; i++) {
            for (int j = 0; j < dimArr[i].length; j++) {
                dimArr[i][j] = num++;
            }
            num = 1;
        }

        for (int i = 0; i < dimArr.length; i++) {
            for (int j = 0; j < dimArr[i].length; j++) {
                //seat = new MultiDimensionalArr.Seat();
                System.out.println("rate:" + num);
                seat.setRate(Long.parseLong(allList.get(num)[num+2]));
                System.out.println("lock:" + dimArr[i][j]);
                seat.setLock((long) dimArr[i][j]);
                seat.setValue((long) num);
                availableSeats.add(seat);
            }
            num++;
        }
        //availableSeats.add(seats);
        System.out.println(availableSeats);


    }



}

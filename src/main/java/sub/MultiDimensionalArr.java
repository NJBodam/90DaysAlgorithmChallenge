package sub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MultiDimensionalArr {
    



    public static int numValForTwoDimArray(int[][] twoArray) {

        int[][] twoDimArray = new int[2][10];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = 1;
            }
        }


        for (int i = 0; i < twoDimArray.length; i++) {
            System.out.println(Arrays.toString(twoDimArray[i]));
        }
        return 0;
    }
    static class Cinema {
        private Long totalRows;
        private Long totalColumns;
        private List<Seat> availableSeats;

        Cinema(Long totalRows, Long totalColumns, List<Seat> availableSeats) {
            this.totalRows = totalRows;
            this.totalColumns = totalColumns;
            this.availableSeats = availableSeats;
        }

        Cinema() {

        }

        public Long getTotalRows() {
            return totalRows;
        }

        public void setTotalRows(Long totalRows) {
            this.totalRows = totalRows;
        }

        public Long getTotalColumns() {
            return totalColumns;
        }

        public void setTotalColumns(Long totalColumns) {
            this.totalColumns = totalColumns;
        }

        public List<Seat> getSeatList() {
            return availableSeats;
        }

        public void setSeatList(List<Seat> availableSeats) {
            this.availableSeats = availableSeats;
        }

        @Override
        public String toString() {
            return "Cinema{" +
                    "totalRows=" + totalRows +
                    ", totalColumns=" + totalColumns +
                    ", availableSeats=" + availableSeats +
                    '}';
        }
    }

    static class Seat {
        private Long row;
        private Long column;

        Seat(Long row, Long column) {
            this.row = row;
            this.column = column;
        }
        Seat() {

        }

        public Long getRow() {
            return row;
        }

        public void setRow(Long row) {
            this.row = row;
        }

        public Long getColumn() {
            return column;
        }

        public void setColumn(Long column) {
            this.column = column;
        }

        @Override
        public String toString() {
            return "Seat{" +
                    "row=" + row +
                    ", column=" + column +
                    '}';
        }
    }


    public static void cinemaSeats() {
        Seat seat;
        Cinema cinema = new Cinema();
        cinema.setTotalRows(9L);
        cinema.setTotalColumns(9L);
        List<Seat> seats = new ArrayList<>();

        int[][] dimArr = new int[9][9];

        int num = 1;
        for (int i = 0; i < dimArr.length; i++) {
            for (int j = 0; j < dimArr[i].length; j++) {
                dimArr[i][j] = num++;
            }
            num = 1;
        }

        for (int i = 0; i < dimArr.length; i++) {
            for (int j = 0; j < dimArr[i].length; j++) {
                seat = new Seat();
                System.out.println("row:" + num);
                seat.setRow((long) num);
                System.out.println("column:" + dimArr[i][j]);
                seat.setColumn((long) dimArr[i][j]);
                seats.add(seat);
            }
            num++;
        }
        cinema.setSeatList(seats);
       // System.out.println(cinema);


    }

    public static void reverseElements(int[][] twoDimArray) {


        for (int i = 0; i < twoDimArray.length; i++) {
            List<Integer> list = Arrays.stream(twoDimArray[i]).boxed().collect(toList());
            Collections.reverse(list);
            int[] array = list.stream().mapToInt(num->num).toArray();
            twoDimArray[i] = array;
            System.out.println(Arrays.toString(array));
        }

        //Alternative
//        for (int i = 0; i < twoDimArray.length; i++) {
//            for (int j = 0; j < twoDimArray[i].length / 2; j++) {
//                int temp = twoDimArray[i][j];
//                twoDimArray[i][j] = twoDimArray[i][twoDimArray[i].length - j - 1];
//                twoDimArray[i][twoDimArray[i].length - j - 1] = temp;
//            }
//        }
    }
// CMD + alt + V === to get the variable type
// CMD + alt + M === to extract method from a complex method
    public static int numValForThreeDimArray() {
        int[][][] threeDimArray = new int[3][3][3];

        int element = 0;
        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray[i].length; j++) {
                for (int k = 0; k < threeDimArray[i][j].length; k++) {

                    //element++;

                    threeDimArray[i][j][k] = element;
                    element++;
                }
            }
            element = 0;
        }

        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray[i].length; j++) {
                System.out.print(Arrays.toString(threeDimArray[i][j]) + " ");
            }
            System.out.println();
        }

        return 0;
    }

    public static void printTheThirdRow(int[][] twoDimArray) {
        // write your code here
        for (int j = 0; j < twoDimArray[2].length; j++) {
            System.out.print(twoDimArray[2][j] + " ");
        }
    }





}

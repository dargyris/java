package org.example.master.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Theater {
    private final String name;
    private int numRows;
    private int seatsPerRow;
    public List<Seat> seats;

    static final Comparator<Seat> PRICE_ORDER = new Comparator<>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            if (seat1.getPrice() < seat2.getPrice()) {
                return -1;
            }

            if (seat1.getPrice() > seat2.getPrice()) {
                return 1;
            }

            return 0;
        }
    };

    /* With static initialization Block
    static final Comparator<Seat> PRICE_ORDER;

    static {
        PRICE_ORDER = new Comparator<Seat> {
            @Override
            public int compare(Seat seat1, Seat seat2) {
                if (seat1.getPrice() < seat2.getPrice()) return -1;
                if (seat1.getPrice() > seat2.getPrice()) return 1;
                return 0
            }
        };
    }
    */

    public Theater(String name, int numRows, int seatsPerRow) {
        this.name = name;
        this.numRows = numRows;
        this.seatsPerRow = seatsPerRow;
        seats = new ArrayList<>();

        initializeSeats();
    }

    private void initializeSeats() {
        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
//                double seatPrice = 12.0;
//                if ((row < 'D') && (seatNum >= 4 && seatNum <= 9)) {
//                    seatPrice = 14.0;
//                } else if ((row > 'F') || (seatNum < 4 || seatNum > 9)) {
//                    seatPrice = 7.0;
//                }
                String seatNumber = row + String.format("%02d", seatNum);
                double seatPrice = calcSeatPrice(seatNumber);
                Seat seat = new Seat(seatNumber, seatPrice);
                seats.add(seat);
            }
        }
    }

    public double calcSeatPrice(String seatNumber) {
        char[] seatChars = seatNumber.toCharArray();
        int row = seatChars[0];
        int seatNum = seatChars[1] * 10 + seatChars[2] * 1;

        if ((row < 'D') && (seatNum >= 4 && seatNum <= 9)) {
            return 14.0;
        }

        if ((row > 'F') || (seatNum < 4 || seatNum > 9)) {
            return 7.0;
        }

        return 12.0;
    }

    class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private double price;
        private boolean reserved;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.reserved = false;
        }

        @Override
        public int compareTo(Seat seat) {
            return seatNumber.compareToIgnoreCase(seat.seatNumber);
        }

        public boolean reserve() {
            if (!reserved) {
                reserved = true;
                return true;
            }
            return false;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }
    }

    public void printSeats() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            s.append("{ ");
            for (int j = 0; j < seatsPerRow; j++) {
                s.append(seats.get(i * seatsPerRow + j).getSeatNumber() + " ");
            }
            s.append("}\n");
        }
        System.out.println(s.toString());
    }

    public boolean reserveSeat(String seatNumber) {
        double seatPrice = calcSeatPrice(seatNumber);
        Seat requestedSeat = new Seat(seatNumber, seatPrice);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        }
        return false;
    }

    //    public void sortList(List<? extends Theater.Seat> list) {
    public void sortList() {
        for (int i = 0; i < seats.size() - 1; i++) {
            for (int j = i + 1; j < seats.size(); j++) {
                if (seats.get(i).compareTo(seats.get(j)) > 0) {
                    Collections.swap(seats, i, j);
                }
            }
        }
    }

    public void shuffleList() {
        Collections.shuffle(seats);
    }

    public void sortListSort() {
        Collections.sort(seats);
    }

    public void printList() {
        for (Theater.Seat seat : seats) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println("\n==============================================");
    }

    public String getName() {
        return name;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getSeatsPerRow() {
        return seatsPerRow;
    }

    public void setSeatsPerRow(int seatsPerRow) {
        this.seatsPerRow = seatsPerRow;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public Seat seatCreator(String seatName, double seatPrice) {
        return new Seat(seatName, seatPrice);
    }
}

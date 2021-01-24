package org.example.master.collections.intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theater {
    private final String name;
    private int numRows;
    private int seatsPerRow;
    public List<Seat> seats;

    public Theater(String name, int numRows, int seatsPerRow) {
        this.name = name;
        this.numRows = numRows;
        this.seatsPerRow = seatsPerRow;
        seats = new ArrayList<>();

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getName() {
        return name;
    }

    public boolean reserveSeat(String seatNumber) {
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                return seat.reserve();
            }
        }
        System.out.println("There is no seat " + seatNumber);
        return false;
    }

    public boolean reserveSeatComparable(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        }
        System.out.println("There is no seat " + seatNumber);
        return false;
    }

    public void getSeats() {
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

    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private boolean reserved;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
            this.reserved = false;
        }

        @Override
        public int compareTo(Seat seat) {
            return seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                return true;
            }
            return false;
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            }
            return false;
        }
    }

}
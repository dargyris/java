package org.example.m.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainCompare {
    public static void main(String[] args) {
        Theater theater = new Theater("Olympian", 8, 12);
        if (theater.reserveSeat("D12")) {
            System.out.println("Please pay " + theater.calcSeatPrice("D12"));
        }

        List<Theater.Seat> priceSeats = new ArrayList<>(theater.getSeats());
        priceSeats.add(theater.seatCreator("B00", 13.00));
        priceSeats.add(theater.seatCreator("A00", 13.00));
        Collections.sort(priceSeats, Theater.PRICE_ORDER);
        printList(priceSeats);
    }

    public static void printList(List<Theater.Seat> list) {
        for (Theater.Seat seat : list) {
            System.out.print(" " + seat);
        }
    }

}

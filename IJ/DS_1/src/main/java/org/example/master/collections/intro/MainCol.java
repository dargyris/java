package org.example.master.collections.intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainCol {
    public static void main(String[] args) {
        Theater theater = new Theater("Olympian", 8, 12);

        //Shallow copy
        List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats);
        printList(seatCopy);

        //The array lists are separate, but they refer to the SAME objects!
        Collections.reverse(seatCopy);
        printList(seatCopy);
        Collections.shuffle(theater.seats);
        printList(theater.seats);
        Theater.Seat minSeat = Collections.min(seatCopy);
        Theater.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat: " + minSeat.getSeatNumber());
        System.out.println("Max seat: " + maxSeat.getSeatNumber());
        Collections.sort(seatCopy);
//        printList(seatCopy);

        sortList(seatCopy);
        printList(seatCopy);
    }

    public static void printList(List<Theater.Seat> list) {
        for (Theater.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("=======================================================");
    }

    public static void sortList(List<? extends Theater.Seat> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}

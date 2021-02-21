package org.example.a.algos.recursion;

public class Hanoi {
    public void solve(int disk, char source, char middle, char destination) {
        if (disk == 0) {
            System.out.println("Plate " + disk + " from " + source + " to " + destination);
            return;
        }
        solve(disk - 1, source, destination, middle);
        System.out.println("Plate " + disk + " from " + source + " to " + destination);
        solve(disk - 1, middle, source, destination);
    }

    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi();
        hanoi.solve(2, 'A', 'B', 'C');
    }
}

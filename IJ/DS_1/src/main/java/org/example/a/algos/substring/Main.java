package org.example.a.algos.substring;

/*  Substring Search Algos
/   Aim: Find pattern in text.
**/
public class Main {
    public static void main(String[] args) {
        bruteForce();
        boyerMoore();
    }

    public static void bruteForce() {
        System.out.println("1. BRUTE FORCE");
        System.out.println("N: length of text, M: lenfth of pattern");
        System.out.println("Complexity: Number of compares: N * M");
    }

    public static void boyerMoore() {
        System.out.println("2. BOYER-MOORE");
        System.out.println("Matches the tail of the pattern rather than the head.");
        System.out.println("Complexity: N/M compares. Sublinear!");
        System.out.println("The longer the pattern the fatser the algo.");
    }

    public static void rabinKarp() {
        System.out.println("3. RABIN - KARP");
        System.out.println("Complexity: O(N+M)");
        System.out.println("Logic: Hash match. I can eliminate the inner for to match the pattern to the substring chunk of the text.");
        System.out.println("Prime numbers for hashing.");
    }
}

package org.example.agnar.tdd;

public class StringHelper {

    public String replaceAInFirst2Positions(String str) {
        if (str.length() < 2) {
            return str.replaceAll("A", "");
        }

        String first2Chars = str.substring(0, 2);
        String remaining = str.substring(2);

        return first2Chars.replaceAll("A", "") + remaining;
    }

    public boolean areFirstAndLastTwoCharsSame(String str) {
        int length = str.length();

        if (length < 2) {
            return false;
        }

        String firstTwoChars = str.substring(0, 2);
        String lastTwoChars = str.substring(length - 2);
        if (firstTwoChars.equals(lastTwoChars)) {
            return true;
        }

        return false;
    }
}

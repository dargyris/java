package org.example.agnar.simpledesign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class TextHelper {
    public String swapLastTwoCharacters(String str) {
        int length = str.length();
        if (length < 2) {
            return str;
        }

        char lastChar = str.charAt(length - 1);
        char secondLastChar = str.charAt(length - 2);

        String remainingString = str.substring(0, length - 2);
        return remainingString + lastChar + secondLastChar;
    }

    public String swapLastTwoCharactersDiamantis(String str) {
        List<Character> list = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            list.add(ch);
        }

        if (list.size() < 2) {
            return str;
        }

        Collections.swap(list, list.size() - 2, list.size() - 1);
        StringBuilder s = new StringBuilder();
        ListIterator<Character> iterator = list.listIterator();
        while (iterator.hasNext()) {
            s.append(iterator.next());
        }
        return s.toString();
    }

    public String truncateAInFirst2Positions(String str) {
        if (str.length() < 2) {
            return str.replaceAll("A", "");
        }
        String first2Chars = str.substring(0, 2);
        String first2CharsWithARemoved = first2Chars.replaceAll("A", "");
        String remainingString = str.substring(2);
        return first2CharsWithARemoved + remainingString;
    }

    public String truncateAInFirst2PositionsDiamantis(String str) {
        StringBuilder s = new StringBuilder();
        int counter = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'A' && counter < 2) {
                continue;
            }
            s.append(ch);
            counter++;
        }
        return s.toString();
    }
}

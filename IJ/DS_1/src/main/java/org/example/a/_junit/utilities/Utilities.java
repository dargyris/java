package org.example.a._junit;

public class Utilities {
    public static char[] getEveryNthChar(String str, int n) {
        if (str == null) {
            return null;
        }

        char[] sourceArray = str.toCharArray();
        if (sourceArray == null || sourceArray.length < n) {
            return sourceArray;
        }

        int returnedLength = sourceArray.length / n;
        char[] result = new char[returnedLength];

        int index = 0;
        for (int i = n - 1; i < sourceArray.length; i += n) {
            result[index++] = sourceArray[i];
        }

        return result;
    }

    public static String removePairs(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }

        StringBuilder s = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] != charArray[i + 1]) {
                s.append(charArray[i]);
            }
        }
        s.append(charArray[charArray.length - 1]);
        return s.toString();
    }

    public static int converter(int a, int b) {
        if (b != 0) {
            return (a / b) + (a * 30) - 2;
        }
        throw new ArithmeticException();
    }

    public static String nullIfOddLength(String str) {
        if (str.length() % 2 == 0) {
            return str;
        }
        return null;
    }
}
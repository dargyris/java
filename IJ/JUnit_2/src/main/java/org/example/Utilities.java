package org.example;

public class Utilities {
    public char[] everyNthChar(char[] sourceArray, int n) {
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

    public String removePairs(String source) {
        if (source.length() < 2) {
            return source;
        }

        StringBuilder s = new StringBuilder();
        char[] string = source.toCharArray();
        for (int i = 0; i < string.length; i++) {
            if (string[i] != string[i++]) {
                s.append(string[i]);
            }
        }

        return s.toString();
    }

    public int converter(int a, int b) {
        return (a / b) + (a * 30) - 2;
    }

    public String nullIfOddLength(String source) {
        if (source.length() % 2 == 0) {
            return source;
        }

        return null;
    }
}

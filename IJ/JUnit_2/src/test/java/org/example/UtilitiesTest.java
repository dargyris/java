package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private static final String IN_STRING_1 = "AABCDDEFEF";
    private static final String IN_STRING_2 = "";
    private static final String IN_STRING_3 = " ";
    private static final String IN_STRING_4 = null;

    private static final String OUT_STRING_1 = "ABCDEFEF";
    private static final String OUT_STRING_2 = "";
    private static final String OUT_STRING_3 = " ";
    private static final String OUT_STRING_4 = null;

    private static final int INDEX_MULTIPLE = 2;
    private static final char[] OUT_CHAR_ARR_1 = {'A', 'C', 'D', 'F', 'F'};
    private static final char[] OUT_CHAR_ARR_2 = {};
    private static final char[] OUT_CHAR_ARR_3 = {' '};
    private static final char[] OUT_CHAR_ARR_4 = null;

    private static final String EVEN_LENGTH_STR = "EVEN";
    private static final String ODD_LENGTH_STR = "ODD";

    @Test
    public void everyNthCharPrintsInOrderCharactersWhenIndexIsMultipleOfNumber() {
        char[] actual = Utilities.everyNthChar(IN_STRING_1, INDEX_MULTIPLE);
        char[] expected = OUT_CHAR_ARR_1;
        assertArrayEquals(expected, actual);
        actual = Utilities.everyNthChar(IN_STRING_2, INDEX_MULTIPLE);
        expected = OUT_CHAR_ARR_2;
        assertArrayEquals(expected, actual);
        actual = Utilities.everyNthChar(IN_STRING_3, INDEX_MULTIPLE);
        expected = OUT_CHAR_ARR_3;
        assertArrayEquals(expected, actual);
        actual = Utilities.everyNthChar(IN_STRING_4, INDEX_MULTIPLE);
        expected = OUT_CHAR_ARR_4;
        assertArrayEquals(expected, actual);
    }

    @Test
    public void removePairsRemovesOneCharacterOfAnyConsecutiveCharPairs() {
        String actual = Utilities.removePairs(IN_STRING_1);
        String expected = OUT_STRING_1;
        assertEquals(expected, actual);
        actual = Utilities.removePairs(IN_STRING_2);
        expected = OUT_STRING_2;
        assertEquals(expected, actual);
        actual = Utilities.removePairs(IN_STRING_3);
        expected = OUT_STRING_3;
        assertEquals(expected, actual);
        actual = Utilities.removePairs(IN_STRING_4);
        expected = OUT_STRING_4;
        assertEquals(expected, actual);
    }

    @Test
    public void converter() {
        int actual = Utilities.converter(10, 5);
        int expected = 300;
        assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void converterThrowsArithmeticExceptionWhenBValueIs0() throws Exception {
        int actual = Utilities.converter(10, 0);
    }

    @Test
    public void nullIfOddLengthReturnsNullIfInputStringLengthIsOddOtherwiseReturnsTheStringItself() {
        String actual = Utilities.nullIfOddLength(EVEN_LENGTH_STR);
        String expected = EVEN_LENGTH_STR;
        assertEquals(expected, actual);
        actual = Utilities.nullIfOddLength(ODD_LENGTH_STR);
        expected = null;
        assertEquals(expected, actual);
    }
}
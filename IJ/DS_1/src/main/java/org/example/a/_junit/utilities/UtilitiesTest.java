package org.example.a._junit.utilities;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilitiesTest {

    public static final String IN_STRING_1 = "AABCDDEFEF";
    public static final int INDEX_MULTIPLE = 2;

    public static final char[] OUT_CHAR_ARR_1 = {'A', 'C', 'D', 'F', 'F'};
    public static final String OUT_STRING_1 = "ABCDEFEF";

    public static final String EVEN_LENGTH_STR = "EVEN";
    public static final String ODD_LENGTH_STR = "ODD";


    @Test
    public void getEveryNthCharPrintsInOrderCharactersWhenIndexIsMultipleOfNumber() {
        char[] actual = Utilities.getEveryNthChar(IN_STRING_1, INDEX_MULTIPLE);
        char[] expected = OUT_CHAR_ARR_1;
        assertArrayEquals(expected, actual);
    }

    @Test
    public void removePairsRemovesOneCharacterOfAnyConsecutiveCharPairs() {
        String actual = Utilities.removePairs(IN_STRING_1);
        String expected = OUT_STRING_1;
        assertEquals(expected, actual);
    }

    @Test
    public void converterDoesElementaryMathOperations() {
        assertEquals(300, Utilities.converter(10, 5));
    }

    //import org.junit.Test; --> version 4.12
    @Test(expected = ArithmeticException.class)
    public void converterThrowsArithmeticExceptionWhenBValueIs0() throws Exception {
        int actual = Utilities.converter(10, 0);
    }

    @Test
    public void nullIfOddLengthReturnsNullIfInputStringLengthIsOdd_OtherwiseReturnsTheStringItself() {
        String actual = Utilities.nullIfOddLength(EVEN_LENGTH_STR);
        String expected = EVEN_LENGTH_STR;
        assertEquals(expected, actual);

        actual = Utilities.nullIfOddLength(ODD_LENGTH_STR);
        expected = null;
        assertEquals(expected, actual);
    }
}

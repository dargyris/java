package org.example.agnar.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringHelperTest {
    // RED - GREEN - REFACTOR
    StringHelper helper = new StringHelper();

    @Test
    void replaceAInFirst2Positions() {
        assertEquals("BCD", helper.replaceAInFirst2Positions("ABCD"));
        assertEquals("CD", helper.replaceAInFirst2Positions("AACD"));
        assertEquals("BCD", helper.replaceAInFirst2Positions("BACD"));
        assertEquals("AA", helper.replaceAInFirst2Positions("AAAA"));
        assertEquals("MNAA", helper.replaceAInFirst2Positions("MNAA"));
        assertEquals("", helper.replaceAInFirst2Positions(""));
        assertEquals("", helper.replaceAInFirst2Positions("A"));
        assertEquals("", helper.replaceAInFirst2Positions("AA"));
        assertEquals("B", helper.replaceAInFirst2Positions("B"));
        assertEquals("BC", helper.replaceAInFirst2Positions("BC"));
    }

    @Test
    void areTheFirstAndLastTwoCharsTheSame() {
        assertFalse(helper.areFirstAndLastTwoCharsSame(""));
        assertFalse(helper.areFirstAndLastTwoCharsSame("A"));
        assertFalse(helper.areFirstAndLastTwoCharsSame("ABC"));
        assertFalse(helper.areFirstAndLastTwoCharsSame("ABCDEBA"));

        assertTrue(helper.areFirstAndLastTwoCharsSame("AB"));
        assertTrue(helper.areFirstAndLastTwoCharsSame("AAA"));
        assertTrue(helper.areFirstAndLastTwoCharsSame("ABCAB"));
    }
}

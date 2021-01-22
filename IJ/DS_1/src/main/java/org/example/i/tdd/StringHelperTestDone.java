package org.example.i.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTestDone {
    //"", "A", "AA", "B", "BC"
    StringHelperDone helper = new StringHelperDone();

    @Test
    void testReplaceAInFirst2Positions() {
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

    //""=>false, "A"=>false, "AB"=>true, "ABC"=>false, "AAA"=>true, "ABCAB"=>true, "ABCDEBA"=>false
    //Red
    //Green
    //Refactor

    @Test
    void testAreFirstTwoAndLastTwoCharsTheSame() {
        assertFalse(helper.areFirstTwoAndLastTwoCharsTheSame(""));
        assertFalse(helper.areFirstTwoAndLastTwoCharsTheSame("A"));
        assertTrue(helper.areFirstTwoAndLastTwoCharsTheSame("AB"));
        assertFalse(helper.areFirstTwoAndLastTwoCharsTheSame("ABC"));
        assertTrue(helper.areFirstTwoAndLastTwoCharsTheSame("AAA"));
        assertTrue(helper.areFirstTwoAndLastTwoCharsTheSame("ABCAB"));
        assertFalse(helper.areFirstTwoAndLastTwoCharsTheSame("ABCDEBA"));
    }

}

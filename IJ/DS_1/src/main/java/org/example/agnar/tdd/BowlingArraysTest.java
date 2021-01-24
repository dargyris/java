package org.example.agnar.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingArraysTest {
    BowlingArrays bowling = new BowlingArrays();

    @Test
    void rollOnly0s() {
        gameSet(0, 20);
        assertEquals(0, bowling.getScore());
    }

    @Test
    void rollOnly1s() {
        gameSet(1, 20);
        assertEquals(20, bowling.getScore());
    }

    @Test
    void rollHalf1sAndHalf2s() {
        gameSet(1, 10);
        gameSet(2, 10);
        assertEquals(30, bowling.getScore());
    }

    @Test
    void rollHalf5sAndHalf4s() {
        for (int i = 0; i < 10; i++) {
            gameSet(5, 1);
            gameSet(4, 1);
        }
        assertEquals(90, bowling.getScore());
    }

    @Test
    void SpareRoll5TwoTimesAnd1EighteenTimes() {
        gameSet(5, 2);
        gameSet(1, 18);
        assertEquals(29, bowling.getScore());
    }

    @Test
    void allRoles5() {
        gameSet(5, 21);
        assertEquals(155, bowling.getScore());
    }

    @Test
    void rollTwoFramesOf5AndTheRest1() {
        gameSet(5, 4);
        gameSet(1, 16);
        assertEquals(42, bowling.getScore());
    }

    @Test
    void allSetsFirstRollIsStrikeWithExtraSet() {
        for (int i = 0; i < 10; i++) {
            gameSet(10, 1);
            gameSet(0, 1);
        }
        gameSet(10, 1);
        assertEquals(300, bowling.getScore());
    }

    private void gameSet(int pinsKnockedDown, int rolls) {
        for (int i = 0; i < rolls; i++) {
            bowling.knockDown(pinsKnockedDown);
        }
    }
}

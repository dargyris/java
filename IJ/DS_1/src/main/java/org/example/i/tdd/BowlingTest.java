package org.example.i.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest {
    Bowling bowling = new Bowling();

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

    private void gameSet(int pinsKnockedDown, int rolls) {
        int rollStart = bowling.getRollsMapSize();
        rolls += bowling.getRollsMapSize();
        for (int rollCounter = rollStart; rollCounter < rolls; rollCounter++) {
            bowling.knockDown(pinsKnockedDown, rollCounter);
        }
    }
}

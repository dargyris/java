package org.example.i.tdd;

public class BowlingArrays {
    public static final int MAX_ROLLS = 20;
    public static final int ROLLS_PER_FRAME = 2;
    int[] rolls = new int[21];
    private int score;
    int rollIndex;

    public BowlingArrays() {
        score = 0;
        rollIndex = 0;
    }

    public void knockDown(int pinsKnockedDown) {
        rolls[rollIndex++] = pinsKnockedDown;
    }

    public int getScore() {
        for (int rollCount = 0; rollCount < MAX_ROLLS; rollCount += ROLLS_PER_FRAME) {
            int framePoints = rolls[rollCount] + rolls[rollCount + 1];
            score += framePoints + getExtraPoints(rollCount, framePoints);
        }

        getFinalRollPointsWhenLastFrameIs10();
        return score;
    }

    private void getFinalRollPointsWhenLastFrameIs10() {
        if (rolls[18] + rolls[19] == 10) {
            score += rolls[20];
        }
    }

    private int getExtraPoints(int rollCount, int framePoints) {
        if (framePoints < 10) {
            return 0;
        }

        if (framePoints > 10) {
            throw new IllegalStateException();
        }

        if (rollCount <= 16 && rolls[rollCount + 2] == 10) {
            return rolls[rollCount + 2] + rolls[rollCount + 4];
        }

        return rolls[rollCount + 2];
}
}
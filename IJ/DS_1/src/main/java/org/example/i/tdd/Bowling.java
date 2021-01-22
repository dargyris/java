package org.example.i.tdd;

import java.util.HashMap;
import java.util.Map;

public class Bowling {
    Map<Integer, Integer> rollsMap;
    private int score;

    public Bowling() {
        rollsMap = new HashMap<>();
        score = 0;
    }

    public void knockDown(int pinsKnockedDown, int rollCounter) {
        rollsMap.put(rollCounter, pinsKnockedDown);
    }

    public int getScore() {
        for (int i = 0; i < rollsMap.size() - 2; i++) {
            boolean isFrameStart = i % 2 == 0;
            if (isFrameStart) {
                int framePoints = rollsMap.get(i) + rollsMap.get(i+1);
                if (framePoints == 10) {
                    score += framePoints + rollsMap.get(i + 2);
                } else {
                    score += framePoints;
                }
            }
        }
        int lastFramePoints = rollsMap.get(rollsMap.size() - 2) + rollsMap.get(rollsMap.size() - 1);
        score += lastFramePoints;
        return score;
    }

    public int getRollsMapSize() {
        return rollsMap.size();
    }
}

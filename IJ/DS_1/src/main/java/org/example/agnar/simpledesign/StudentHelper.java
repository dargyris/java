package org.example.agnar.simpledesign;

public class StudentHelper {

    private static final int GRADE_B_LOWER_LIMIT = 51;
    private static final int GRADE_B_UPPER_LIMIT = 80;
    private static final int EXTRA_POINTS_FOR_MATH = 10;

    public boolean isGradeB(int marks, boolean isMaths) {
        int extraLimit = isMaths ? EXTRA_POINTS_FOR_MATH : 0;
        int upperLimit = GRADE_B_UPPER_LIMIT + extraLimit;

        return marks >= GRADE_B_LOWER_LIMIT && marks <= upperLimit;
    }

    public String getGrade(int mark, boolean isMaths) {
        int extraLimit = isMaths ? 5 : 0;

        if (mark >= 91 + extraLimit) {
            return "A";
        }

        if (mark >= 51 + extraLimit) {
            return "B";
        }

        return "C";
    }

    public String willQualifyForQuiz(int marks1, int marks2, boolean isMaths) {
        if (isNotGood(marks1, isMaths) || isNotGood(marks2, isMaths)) {
            return "NO";
        }

        if (isGood(marks1, isMaths) || isGood(marks2, isMaths)) {
            return "YES";
        }

        return "MAYBE";
    }

    private boolean isGood(int marks, boolean isMaths) {
        int extraLimit = isMaths ? 5 : 0;
        return marks >= 80 + extraLimit;
    }

    private boolean isNotGood(int marks, boolean isMaths) {
        int extraLimit = isMaths ? 5 : 0;
        return marks <= 20 + extraLimit;
    }

    public String willQualifyForQuizMine(int marks1, int marks2, boolean isMaths) {
        int extraPoints = isMaths ? 5 : 0;

        if (marks1 <= 20 + extraPoints || marks2 <= 20 + extraPoints) {
            return "NO";
        }

        if (marks1 >= 80 + extraPoints || marks2 >= 80 + extraPoints) {
            return "YES";
        }

        return "MAYBE";
    }

}

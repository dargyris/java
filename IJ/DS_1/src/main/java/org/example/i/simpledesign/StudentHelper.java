package org.example.i.simpledesign;

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
        String grade = "C";

        if (isGradeA(mark, isMaths))
            grade = "A";
        else if (isBGrade(mark, isMaths)) {
            grade = "B";
        }
        return grade;
    }

    private boolean isGradeA(int mark, boolean isMaths) {
        int lowerLimitForAGrade = isMaths ? 95
                : 90;
        return mark > lowerLimitForAGrade;
    }

    private boolean isBGrade(int mark, boolean isMaths) {
        int lowerLimitGradeB = isMaths ? 55
                : 50;
        return mark > lowerLimitGradeB && mark < 90;
    }

    public String willQualifyForQuiz(int marks1, int marks2, boolean isMaths) {
        if ((isMaths ? marks1 <= 25 : marks1 <= 20)
                || (isMaths ? marks2 <= 25 : marks2 <= 20)) return "NO";
        if ((isMaths ? marks1 >= 85 : marks1 >= 80)
                || (isMaths ? marks2 >= 85 : marks2 >= 80)) return "YES";
        return "MAYBE";
    }

}

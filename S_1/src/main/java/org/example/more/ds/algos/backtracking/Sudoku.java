package org.example.more.ds.algos.backtracking;

public class Sudoku {
    class Constants {
        public static final int BOARD_SIZE = 9;
        public static final int MIN_NUMBER = 1;
        public static final int MAX_NUMBER = 9;
        public static final int BOX_SIZE = 3;
    }

    private int[][] sudokuTable;

    public Sudoku(int[][] sudokuTable) {
        this.sudokuTable = sudokuTable;
    }

    public void solveProblem() {
        if (solve(0, 0)) {
            showResults();
        } else {
            System.out.println("No solution found.");
        }
    }

    private void showResults() {
        for (int i = 0; i < Constants.BOARD_SIZE; ++i) {
            if (i % 3 == 0) {
                System.out.println(" ");
            }
            for (int j = 0; j < Constants.BOARD_SIZE; ++j) {
                if (j % 3 == 0) {
                    System.out.print(" ");
                }
                System.out.print(sudokuTable[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean solve(int rowIndex, int columnIndex) {
        if (rowIndex == Constants.BOARD_SIZE && ++columnIndex == Constants.BOARD_SIZE) {
            return true;
        }
        if (rowIndex == Constants.BOARD_SIZE) {
            rowIndex = 0;
        }
        if (sudokuTable[rowIndex][columnIndex] != 0) {
            return solve(rowIndex + 1, columnIndex);
        }
        for (int number = Constants.MIN_NUMBER; number <= Constants.MAX_NUMBER; number++) {
            if (valid(rowIndex, columnIndex, number)) {
                sudokuTable[rowIndex][columnIndex] = number;
                if (solve(rowIndex + 1, columnIndex)) {
                    return true;
                }
                sudokuTable[rowIndex][columnIndex] = 0;
            }
        }
        return false;
    }

    private boolean valid(int rowIndex, int colIndex, int actualNumber) {
        for (int i = 0; i < Constants.BOARD_SIZE; ++i) {
            if (sudokuTable[i][colIndex] == actualNumber) {
                return false;
            }
        }
        for (int k = 0; k < Constants.BOARD_SIZE; ++k) {
            if (sudokuTable[rowIndex][k] == actualNumber) {
                return false;
            }
        }
        int boxColumnOffset = (colIndex / 3) * Constants.BOX_SIZE;
        int boxRowOffset = (rowIndex / 3) * Constants.BOX_SIZE;
        for (int i = 0; i < Constants.BOX_SIZE; ++i) {
            for (int j = 0; j < Constants.BOX_SIZE; ++j) {
                if (actualNumber == sudokuTable[boxRowOffset + i][boxColumnOffset + j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int sudokuTable [][] = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        Sudoku sudoku = new Sudoku(sudokuTable);
        sudoku.solveProblem();
    }
}

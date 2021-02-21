package org.example.more.ds.algos.backtracking;

/*  KNIGHT'S TOUR PROBLEM
> Visit every cell on a NxN chessboard with a knight.
Closed tour: end point is the same as starting point.
Like Hamiltonian path problem. Closed tour same as Hamiltonian cycle problem.
> Divide and Conquer or Backtracking solutions.

> MxN chessboard closed knight problem is feasible unless:
    - M, N both odds
    - M = 1, 2, or 4
    - M = 3 and N = 4, 6, or 8
 */

public class Knights {
    class Constants {
        private Constants() {
            // Constructor private: class can not be instantiated.
        }
        public static final int BOARD_SIZE = 8;
        public static final int NUM_OF_MOVES = 8;
    }
    private int[][] solutionMatrix;
    private int[] xMoves = {2, 1, -1, -2, -2, -1, 1, 2};
    private int[] yMoves = {1, 2, 2, 1, -1, -2, -2, -1};

    public Knights() {
        this.solutionMatrix = new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < Constants.BOARD_SIZE; i++) {
            for (int j = 0; j < Constants.BOARD_SIZE; j++) {
                solutionMatrix[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void solveTour() {
        solutionMatrix[0][0] = 1;
        if (solve(2, 0, 0)) {
            printSolution();
        } else {
            System.out.println("No feasible solution.");
        }
    }

    private void printSolution() {
        for (int i = 0; i < Constants.BOARD_SIZE; i++) {
            for (int j = 0; j < Constants.BOARD_SIZE; j++) {
                System.out.print(solutionMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private boolean solve(int stepCount, int x, int y) {
        if (stepCount == Constants.BOARD_SIZE * Constants.BOARD_SIZE + 1) {
            return true;
        }
        for (int i = 0; i < Constants.NUM_OF_MOVES; i++) {
            int nextX = x + xMoves[i];
            int nextY = y + yMoves[i];
            if (isStepValid(nextX, nextY)) {
                solutionMatrix[nextX][nextY] = stepCount;
                if (solve(stepCount + 1, nextX, nextY)) {
                    return true;
                }
                solutionMatrix[nextX][nextY] = Integer.MIN_VALUE;
            }
        }
        return false;
    }

    private boolean isStepValid(int x, int y) {
        if (x < 0 || x >= Constants.BOARD_SIZE) {
            return false;
        }
        if (y < 0 || y >= Constants.BOARD_SIZE) {
            return false;
        }
        if (solutionMatrix[x][y] != Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Knights knights = new Knights();
        knights.solveTour();
    }
}

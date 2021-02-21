package org.example.more.ds.algos.backtracking;

/*  COLORING PROBLEM
    Color vertices so that no two adjacent vertices share the same color.
    Schedule problems: Different students enrolled on different subjects.
    Radio freq assignment problem: Frequencies assigned to towers to avoid interference.
        Minimum number of frequencies needed.
    Register allocation: Assign large number of target program variables onto a small number of CPU registers.
    Map coloring: No adjacent countries or states get the same color -> four color theorem. Four colors
    are enough to color any map!

    Approaches:
    Greedy approach: It finds a solution but not necessarily the best one possible.
    Backtracking: It can discard and reject multiple bad states within a single iteration (or recursive function call)
    Powell-Welsh algorithm: Relies on sorting the nodes based on the degree (number of edges).
 */

public class Coloring {
    private int numOfVertices;
    private int numOfColors;
    private int[] colors;
    private int[][] adjacencyMatrix;

    public Coloring(int[][] adjacencyMatrix, int numOfColors) {
        this.adjacencyMatrix = adjacencyMatrix;
        this.numOfColors = numOfColors;
        numOfVertices = adjacencyMatrix.length;
        colors = new int[numOfVertices];
    }

    public void solve() {
        if (solveProblem(0)) {
            showResults();
        } else {
            System.out.println("No solution.");
        }
    }

    private void showResults() {
        for (int i = 0; i < numOfVertices; i++) {
            System.out.println("Node " + (i+1) + " has color index: " + colors[i]);
        }
    }

    private boolean solveProblem(int nodeIndex) {
        if (nodeIndex == numOfVertices) {
            return true;
        }
        for (int colorIndex = 1; colorIndex <= numOfColors; colorIndex++) {
            if (isColorValid(nodeIndex, colorIndex)) {
                colors[nodeIndex] = colorIndex;
                if (solveProblem(nodeIndex + 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isColorValid(int nodeIndex, int colorIndex) {
        for (int i = 0; i < numOfVertices; i++) {
            if (adjacencyMatrix[nodeIndex][i] == 1 && colorIndex == colors[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] graphMatrix = new int[][]{
                {0,1,0,1,0},
                {1,0,1,1,0},
                {0,1,0,1,0},
                {1,1,1,0,1},
                {0,0,0,1,0}
        };
        int numOfColors = 3;
        Coloring coloring = new Coloring(graphMatrix, numOfColors);
        coloring.solve();
    }
}

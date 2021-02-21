package org.example.more.ds.algos.backtracking;

/*  HAMILTONIAN CYCLE PROBLEM
    G(V, E): Vertices, Edges. Hamiltonian path is a path in a directed or undirected graph that visits
    each vertex exactly once. A hamiltonian path that is a cycle -> Hamiltonian cycle.
    Adjacency Matrix to represent graph.
    NP-Complete problem: Determining if cycles exist in a G(V, E) graph or not.
 */

public class Hamiltonian {
    private int numOfVertices;
    private int[] hamiltonianPath;
    private int[][] adjacencyMatrix;

    public Hamiltonian(int[][] matrix) {
        this.adjacencyMatrix = matrix;
        this.hamiltonianPath = new int[adjacencyMatrix.length];
        this.numOfVertices = adjacencyMatrix.length;
        hamiltonianPath[0] = 0;
    }

    public void solve() {
        if (findFeasibleSolution(1)) {
            showHamiltonianPath();
        } else {
            System.out.println("No feasible solution.");
        }
    }

    private void showHamiltonianPath() {
        System.out.println("Hamiltonian Cycle:");
        for (int i = 0; i < hamiltonianPath.length; i++) {
            System.out.print((char) (hamiltonianPath[i] + 97) + " ");
        }
        System.out.print((char) (hamiltonianPath[0] + 97));
    }

    private boolean findFeasibleSolution(int position) {
        if (position == numOfVertices) {
            if (adjacencyMatrix[hamiltonianPath[position - 1]][hamiltonianPath[0]] == 1) {
                return true;
            } else {
                return false;
            }
        }
        for (int vertexIndex = 1; vertexIndex < numOfVertices; ++vertexIndex) {
            if (isFeasible(vertexIndex, position)) {
                hamiltonianPath[position] = vertexIndex;
                if (findFeasibleSolution(position + 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isFeasible(int vertexIndex, int actualPosition) {
        if (adjacencyMatrix[hamiltonianPath[actualPosition - 1]][vertexIndex] == 0) {
            return false;
        }
        for (int i = 0; i < actualPosition; i++) {
            if (hamiltonianPath[i] == vertexIndex) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,1,1,0,0},
                {1,0,1,0,1,0},
                {1,1,1,1,0,1},
                {1,0,1,0,0,1},
                {0,1,0,0,0,1},
                {0,1,1,1,1,1}
        };
        Hamiltonian cycle = new Hamiltonian(matrix);
        cycle.solve();
    }
}

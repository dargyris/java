package org.example.zerholc.alg.bfs;

/* Graph traversal algo: Breadth First Search
/ 1. Visit every node of a graph
/ 2. Visit each vertex exactly once
/ 3. O(V+E): Vertices and Edges
/ 4. Memory complexity: need for a queue to store references. Not good. DFS usually preferred.
/ 5. Constructs shortest path. Dijkstra's algo does BFS if all edge weights = 1.
**/

/* Applications
/  Simple Web crawler
/  In AI / machine learning: robots discover surroundings with BFS
/  Maximum flow: Edmonds-Karp algo for finding augmenting paths
/  Cheyen's algo in garbage collection to maintain active references on the heap memory
/  Serialization / deserialization of a tree like structure: Reconstruction of trees
**/

public class MainBfs {
    public static void main(String[] args) {
        Bfs bfs = new Bfs();
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);

        v1.addNeighbourVertex(v2);
        v1.addNeighbourVertex(v4);
        v2.addNeighbourVertex(v3);
        v4.addNeighbourVertex(v5);

        bfs.bfs(v1);
    }
}

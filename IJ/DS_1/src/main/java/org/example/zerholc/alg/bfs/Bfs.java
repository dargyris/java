package org.example.zerholc.alg.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs<T> {
    public void bfs(Vertex<T> root) {
        Queue<Vertex<T>> queue = new LinkedList<>();
        root.setVisited(true);
        queue.add(root);
        while (!queue.isEmpty()) {
            Vertex current = queue.remove();
            System.out.println(current + " ");
            for (Vertex<T> v : (ArrayList<Vertex<T>>) current.getNeighbourList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }
}

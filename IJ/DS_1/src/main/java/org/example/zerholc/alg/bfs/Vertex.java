package org.example.zerholc.alg.bfs;

import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {
    private T data;
    private boolean visited;
    private List<Vertex<T>> neighbourList;

    public Vertex(T data) {
        this.data = data;
        this.neighbourList = new ArrayList<>();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex<T>> getNeighbourList() {
        return neighbourList;
    }

    public void setNeighbourList(List<Vertex<T>> neighbourList) {
        this.neighbourList = neighbourList;
    }

    @Override
    public String toString() {
        return data.toString();
    }

    public void addNeighbourVertex(Vertex<T> vertex) {
        this.neighbourList.add(vertex);
    }
}

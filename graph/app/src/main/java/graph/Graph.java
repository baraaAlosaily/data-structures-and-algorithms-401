package graph;

import java.util.*;

public class Graph<T> {
    Map<Vertex<T>, List<Vertex<T>>>  adjVertices=new HashMap<>();

    public Graph(Map<Vertex<T>, List<Vertex<T>>> adjVertices) {
        this.adjVertices = adjVertices;
    }

    public Graph() {

    }

    public Map<Vertex<T>, List<Vertex<T>>> getAdjVertices() {
        return adjVertices;
    }

    public void setAdjVertices(Map<Vertex<T>, List<Vertex<T>>> adjVertices) {
        this.adjVertices = adjVertices;
    }

    public List addVertex(String label) {
        return adjVertices.putIfAbsent(new Vertex(label), new  ArrayList<>());
    }
    public void removeVertex(String label) {
        Vertex v = new Vertex(label);
        adjVertices.values().stream().forEach(e -> e.remove(v));
        adjVertices.remove(new Vertex(label));
    }

    public void addEdge(String label1, String label2) {
        if(label1.equals(label2)){
            Vertex v1 = new Vertex(label1);
            adjVertices.get(v1).add(v1);
        }else {
            Vertex v1 = new Vertex(label1);
            Vertex v2 = new Vertex(label2);
            adjVertices.get(v1).add(v2);
            adjVertices.get(v2).add(v1);
        }
    }

    public void removeEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        List<Vertex<T>> eV1 = adjVertices.get(v1);
        List<Vertex<T>> eV2 = adjVertices.get(v2);
        if (eV1 != null)
            eV1.remove(v2);
        if (eV2 != null)
            eV2.remove(v1);
    }

    public Set<Object> getnodes(){
        Set<Object> set=new HashSet<>();
        for (Vertex n:adjVertices.keySet()){
            set.add( n.label);
            System.out.println(n.label);
        }
        return set;
    }

    public List<Vertex<T>> getAdjVertices(String label) {
        return adjVertices.get(new Vertex(label));
    }

    @Override
    public String toString() {
        return "Graph{" +
                "adjVertices=" + adjVertices +
                '}';
    }
    public int size(){
        System.out.println(adjVertices.size());
        return adjVertices.size();
    }
}

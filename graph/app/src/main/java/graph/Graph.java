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

    public List<Vertex<T>> breadthFirst(T data){
        Vertex<T>node=new Vertex<T>(data);
        if(node.label==null)return null;
        List<Vertex<T>> nodes=new ArrayList<>();
        Queue<T> breadth=new Queue<T>();
        Set<Vertex<T>> visited= new HashSet<>();

        breadth.enQueue((T) node);
        visited.add(node);
        while (!breadth.isEmpty()){
            Vertex<T> front= (Vertex<T>) breadth.deQueue();
            nodes.add(front);
            for (Vertex<T> neighbor:getAdjVertices((String) front.label)){
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    breadth.enQueue((T) neighbor);
                }
            }
        }
        return nodes;
    }

//    Set<String> breadthFirstTraversal(Graph graph, String root) {
//        Set<String> visited = new LinkedHashSet<String>();
//        Queue<String> queue = new LinkedList<String>();
//        queue.add(root);
//        visited.add(root);
//        while (!queue.isEmpty()) {
//            String vertex = queue.poll();
//            for (Vertex v : graph.getAdjVertices(vertex)) {
//                if (!visited.contains(v.label)) {
//                    visited.add(v.label);
//                    queue.add(v.label);
//                }
//            }
//        }
//        return visited;
//    }

    public Set<Object> getnodes(){
        Set<Object> set=new HashSet<>();
        for (Vertex n:adjVertices.keySet()){
            set.add( n.label);
//            System.out.println(n.label);
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
//        System.out.println(adjVertices.size());
        return adjVertices.size();
    }
}

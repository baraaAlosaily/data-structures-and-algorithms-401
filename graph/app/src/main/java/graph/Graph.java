package graph;

import java.util.*;

public class Graph<T> {
    Map<Vertex<T>, List<Vertex<T>>>  adjVertices=new HashMap<>();
    Map<Vertex<T>, Map<Vertex<T>,Integer>>  wieghtAdjVertices=new HashMap<>();

    public Graph(Map<Vertex<T>, List<Vertex<T>>> adjVertices, Map<Vertex<T>, Map<Vertex<T>, Integer>> wieghtAdjVertices) {
        this.adjVertices = adjVertices;
        this.wieghtAdjVertices = wieghtAdjVertices;
    }

    public Graph() {

    }

    public Map<Vertex<T>, Map<Vertex<T>, Integer>> getWieghtAdjVertices() {
        return wieghtAdjVertices;
    }

    public void setWieghtAdjVertices(Map<Vertex<T>, Map<Vertex<T>, Integer>> wieghtAdjVertices) {
        this.wieghtAdjVertices = wieghtAdjVertices;
    }

    public Map<Vertex<T>, List<Vertex<T>>> getAdjVertices() {
        return adjVertices;
    }

    public void setAdjVertices(Map<Vertex<T>, List<Vertex<T>>> adjVertices) {
        this.adjVertices = adjVertices;
    }

    public List<Vertex<T>> addVertex(String label) {
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

    public void addweight(String label1, String label2,Integer weight) {
        if(label1.equals(label2)){
            Vertex v1 = new Vertex(label1);
            adjVertices.get(v1).add(v1);
        }else {
            Vertex v1 = new Vertex(label1);
            Vertex v2 = new Vertex(label2);
            adjVertices.get(v1).add(v2);
            adjVertices.get(v2).add(v1);
            if(this.adjVertices.containsKey(v1)&&this.adjVertices.containsKey(v2)){
                this.wieghtAdjVertices.putIfAbsent(v1, new HashMap<>());
                this.wieghtAdjVertices.putIfAbsent(v2, new HashMap<>());
                this.wieghtAdjVertices.get(v1).put(v2, weight);
                this.wieghtAdjVertices.get(v2).put(v1, weight);

            }
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
                ", wieghtAdjVertices=" + wieghtAdjVertices +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "Graph{" +
//                "adjVertices=" + adjVertices +
//                '}';
//    }
    public int size(){
//        System.out.println(adjVertices.size());
        return adjVertices.size();
    }

    public String graphbusnisstrip(Graph graph,List<String> cities){
        Integer cost=0;
        for (int i=0;i<cities.size()-1;i++){
            Vertex<String> source=new Vertex<>(cities.get(i));
            Vertex<String> dest=new Vertex<>(cities.get(i+1));
//            System.out.println(((Map)graph.getWieghtAdjVertices().get(source)).get(dest));
//            System.out.println(graph.getWieghtAdjVertices().get(dest));
            if (((Map)graph.getWieghtAdjVertices().get(source)).get(dest)!=null){
                cost+=((Integer)((Map)graph.getWieghtAdjVertices().get(source)).get(dest));
                System.out.println(cost);
            }
        }
        return cost > 0 ? "True, $" + cost : "False, $" + cost;
    }

    public LinkedList<String> dft(String root){
        if (!adjVertices.containsKey(new Vertex<>(root))) return null ;
        LinkedList<String> visited = new LinkedList<String>();
        StackLinkedList<String> stack = new StackLinkedList<String>();

        stack.push(root);

        while (!stack.isEmpty()){
            String poppedVertex = stack.pop();
            if (!visited.includes(poppedVertex)) {
                visited.append(poppedVertex);
                for (Vertex<T> vertex : getAdjVertices(poppedVertex)) {
                    stack.push((String) vertex.getLabel());
                }
            }
        }
        return visited ;
    }
}

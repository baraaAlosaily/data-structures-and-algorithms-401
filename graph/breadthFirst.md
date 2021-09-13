# Challenge Summary
<!-- Description of the challenge -->
Create method theat calld breadth first that accept node and return 

## Whiteboard Process
<!-- Embedded whiteboard image -->
![img](./new.png)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Space O(n^2)
Time O(n)

## Solution
<!-- Show how to run your code, and examples of it in action -->
```
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("F");
        graph.addEdge("A", "B");
        graph.addEdge("A", "D");
        graph.addEdge("B", "C");
        graph.addEdge("D", "C");
        graph.addEdge("B", "F");
        graph.addEdge("D", "F");
```


```
Call function
System.out.println("nnnnn"+graph.breadthFirst("C"));

log
[C, B, D, A, F]
```
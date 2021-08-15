# Challenge Summary
<!-- Description of the challenge -->
Create method to find maximum number in specfic Tree

## Whiteboard Process
<!-- Embedded whiteboard image -->
![img](./img/max.png)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
Space O(1)
Time O(n)

## Solution
<!-- Show how to run your code, and examples of it in action -->
```
    public int maximumValue(Node node){
        if(node==null){
            return -1;
        }
     int res=node.data;
        int ires=maximumValue(node.leftChild);
        int rres=maximumValue(node.rightChild);
        if(ires>res)
            res=ires;
        if(rres>res)
            res=rres;
        return res;
    }
```

Solution

Input 2,5,84,7,3,5

Output 84 
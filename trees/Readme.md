# Trees
<!-- Short summary or background information -->
Binary Trees:
a tree-type non-linear data structure with a maximum of two children for each parent.

Visual:
![link](https://static.javatpoint.com/ds/images/binary-tree.png)

Binary Search Trees:
is a rooted binary tree data structure whose internal nodes each store a key greater than all the keys in the node's left subtree and less than those in its right subtree.

Visual:
![link](https://lh3.googleusercontent.com/proxy/mdUycEJ4nZoUVX9_jQ4mAJyQOHUMuPjBajlXUrPt86AFRXPBOe_TSXgRthfVL9ZY6EC9B3YYpjkv5y-FOPBum3hmq6wl22sColxmBZ7DyMIpWa32yTLynIbj5gpX0JfFDNF-44pnaNKR6jVmrJMnircqx3PnD2vpAg8n8cUjJhh04owvHo_8oD-tNu0hk0E)


## Challenge
<!-- Description of the challenge -->

Binary Tree

Function|description
---|---
Node|Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
Binary Tree|Create a Binary Tree class
Methods in binary tree class|1. pre order 2.in order 3.post order which returns an array of the values, ordered appropriately. **Note**Any exceptions or errors that come from your code should be semantic, capture-able errors.

Binary Search Tree

Function|description
---|---
Create a Binary Search Tree class|This class should be a sub-class (or your languages equivalent) of the Binary Tree Class (Add Arguments: value Return: nothing Adds a new node with that value in the correct location in the binary search tree. Contains Argument: value Returns: boolean indicating whether or not the value is in the tree at least once)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

Binary Tree

**Searching:** For searching element 2, we have to traverse all elements (assuming we do breadth first traversal). Therefore, searching in binary tree has worst case complexity of O(n).

**Insertion:** For inserting element as left child of 2, we have to traverse all elements. Therefore, insertion in binary tree has worst case complexity of O(n).

Binary Search Tree

**Searching:** For searching element 1, we have to traverse all elements (in order 3, 2, 1). Therefore, searching in binary search tree has worst case complexity of O(n). In general, time complexity is O(h) where h is height of BST.

**Insertion:** For inserting element 0, it must be inserted as left child of 1. Therefore, we need to traverse all elements (in order 3, 2, 1) to insert 0 which has worst case complexity of O(n). In general, time complexity is O(h).

## API
<!-- Description of each method publicly available in each of your trees --> 

**Pre-order** means that the root has to be looked at first. In our case, looking at the root just means that we output its value. When we call preOrder for the first time, the root will be added to the call stack

**Post-order** Process all nodes of a tree by recursively processing all subtrees, then finally processing the root. Also known as postfix traversal.

**In-Order** Process all nodes of a tree by recursively processing the left subtree, then processing the root, and finally the right subtree.

**Insertion of a key** A new key is always inserted at the leaf. We start searching a key from the root until we hit a leaf node. Once a leaf node is found, the new node is added as a child of the leaf node. 

**Searching a key** For searching a value, if we had a sorted array we could have performed a binary search. Let’s say we want to search a number in the array what we do in binary search is we first define the complete list as our search space, the number can exist only within the search space.
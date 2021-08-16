/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    //Test 1:  successfully instantiate an empty tree
    @Test void EmptyTree() {
        BinaryTree new1=new BinaryTree();
        assertEquals(null,new1.inOrder(new1.root));
    }
    //Test 1:  successfully instantiate a tree with a single root node
    @Test void singleRoot() {
        BinaryTree new1=new BinaryTree();
        new1.root=new Node(3);
        List<Integer> addnode=new ArrayList<>();
        addnode.add(3);
        assertEquals(addnode,new1.postOrder(new1.root));
    }
    //successfully add a left child and right child to a single root node
    @Test void rightLeftChild() {
        BinaryTree new1=new BinaryTree();
        new1.root=new Node(3);
        new1.root.rightChild=new Node(5);
        new1.root.leftChild=new Node(7);
        List<Integer> addnode=new ArrayList<>();
        addnode.add(7);
        addnode.add(5);
        addnode.add(3);
        assertEquals(addnode,new1.postOrder(new1.root));
    }
    //successfully return a collection from a post-Order traversal
    @Test void postOrderTraversal() {
        BinaryTree new1=new BinaryTree();
        new1.root=new Node(3);
        new1.root.rightChild=new Node(5);
        new1.root.leftChild=new Node(7);
        new1.root.rightChild.leftChild=new Node(4);
        new1.root.rightChild.rightChild=new Node(9);
        List<Integer> addnode=new ArrayList<>();
        addnode.add(7);
        addnode.add(4);
        addnode.add(9);
        addnode.add(5);
        addnode.add(3);
        assertEquals(addnode,new1.postOrder(new1.root));
    }
    @Test void preoderTraversal() {
        BinaryTree new1=new BinaryTree();
        new1.root=new Node(3);
        new1.root.rightChild=new Node(5);
        new1.root.leftChild=new Node(7);
        new1.root.rightChild.leftChild=new Node(4);
        new1.root.rightChild.rightChild=new Node(9);
        List<Integer> addnode=new ArrayList<>();
        addnode.add(3);
        addnode.add(7);
        addnode.add(5);
        addnode.add(4);
        addnode.add(9);
        assertEquals(addnode,new1.preOrder(new1.root));
    }
    //successfully return a collection from an inorder traversal
    @Test void inorderTraveral() {
        BinaryTree new1=new BinaryTree();
        new1.root=new Node(3);
        new1.root.rightChild=new Node(5);
        new1.root.leftChild=new Node(7);
        new1.root.rightChild.leftChild=new Node(4);
        new1.root.rightChild.rightChild=new Node(9);
        List<Integer> addnode=new ArrayList<>();
        addnode.add(7);
        addnode.add(3);
        addnode.add(4);
        addnode.add(5);
        addnode.add(9);
        assertEquals(addnode,new1.inOrder(new1.root));
    }
    //successfully return a collection from a postorder traversal
    @Test void postOrderTraveral() {
        BinaryTree new1=new BinaryTree();
        new1.root=new Node(3);
        new1.root.rightChild=new Node(5);
        new1.root.leftChild=new Node(7);
        new1.root.rightChild.leftChild=new Node(4);
        new1.root.rightChild.rightChild=new Node(9);
        List<Integer> addnode=new ArrayList<>();
        addnode.add(7);
        addnode.add(4);
        addnode.add(9);
        addnode.add(5);
        addnode.add(3);
        assertEquals(addnode,new1.postOrder(new1.root));
    }
    //Code Challenge 16
    @Test void happypath() {
        BinaryTree new1 = new BinaryTree();
        new1.root = new Node(3);
        new1.root.rightChild = new Node(5);
        new1.root.leftChild = new Node(7);
        new1.root.rightChild.leftChild = new Node(4);
        new1.root.rightChild.rightChild = new Node(9);
        assertEquals(9, new1.maximumValue(new1.root));
    }

    @Test void ifNodeHaveOne() {
        BinaryTree new1 = new BinaryTree();
        new1.root = new Node(3);
        assertEquals(3, new1.maximumValue(new1.root));
    }
    //Edge Case
    @Test void edgeCase() {
        BinaryTree new1 = new BinaryTree();
        assertEquals(-1, new1.maximumValue(new1.root));
    }
    // Code Challenge 17
    @Test void happyPath(){
        BinaryTree new1 = new BinaryTree();
        new1.root = new Node(3);
        new1.root.rightChild = new Node(5);
        new1.root.leftChild = new Node(7);
        new1.root.rightChild.leftChild = new Node(4);
        new1.root.rightChild.rightChild = new Node(9);
        List<Integer> addnode=new ArrayList<>();
        addnode.add(3);
        addnode.add(7);
        addnode.add(5);
        addnode.add(4);
        addnode.add(9);
        assertEquals(addnode, new1.breadthFirst(new1));
    }
    //Edge case
    @Test
    public void edgecase(){
        BinaryTree new1 = new BinaryTree();
        assertEquals(null, new1.breadthFirst(new1));
    }

}


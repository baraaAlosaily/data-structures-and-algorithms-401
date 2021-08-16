package trees;

import com.google.common.collect.ForwardingQueue;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree <T> {
    Node <T> root;
    public BinaryTree() {
        root=null;
    }
    List<T> postOrderlist=new ArrayList<>();

    public List<T> postOrder(Node<T> node){

        if (node==null){
            try {
                throw new Exception("Tree is Empty");
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        if (node.leftChild!=null){
            postOrder(node.leftChild);
        }
        if (node.rightChild!=null){
            postOrder(node.rightChild);
        }
        postOrderlist.add(node.data);
        return postOrderlist;
    }

    List <T> inOrderList=new ArrayList<>();
    public List<T> inOrder(Node<T> node){
        if (node==null){
            try {
                throw new Exception("Tree is Empty");
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        if (node.leftChild!=null){
            inOrder(node.leftChild);
        }
//        System.out.println(node.data+" ");
        inOrderList.add(node.data);

        if (node.rightChild!=null){
            inOrder(node.rightChild);
        }
        return inOrderList;

    }

    List<T> preOrderList=new ArrayList<T>();
    public List<T> preOrder(Node<T> node){
        if (node==null){
            try {
                throw new Exception("Tree is Empty");
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        preOrderList.add(node.data);
//        System.out.println(node.data+" ");
        if (node.leftChild!=null){
            preOrder(node.leftChild);
        }

        if (node.rightChild!=null){
            preOrder(node.rightChild);
        }
        return preOrderList;
    }
    public int maximumValue(Node<T> node){
        if(node==null){
            return -1;
        }
     int res= (int) node.data;
        int ires=maximumValue(node.leftChild);
        int rres=maximumValue(node.rightChild);
        if(ires>res)
            res=ires;
        if(rres>res)
            res=rres;
        return res;
    }

    public List<T> breadthFirst(BinaryTree<T> binaryTree) {
        if (binaryTree.root == null) {
            return null;
        }
        List<T> breadth = new ArrayList<T>();
        Queue<T> queue = new Queue<T>();
        queue.enQueue(binaryTree.root);

        while (!queue.isEmpty()) {
            if (queue.fornt.leftChild != null) {
                queue.enQueue(queue.fornt.leftChild);
            }
            if (queue.fornt.rightChild != null) {
                queue.enQueue(queue.fornt.rightChild);
            }
            breadth.add(queue.deQueue());
        }
        return breadth;
    }
//        if(root!=null){
//            breadth.add(root.data);
//        }
//            if (node.leftChild != null) {
//                breadth.add(root.leftChild.data);
//            }
//            if (node.rightChild != null) {
//                breadth.add(root.rightChild.data);
//            }
//
//        return breadth;


}
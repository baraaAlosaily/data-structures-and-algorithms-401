package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    Node root;
    public BinaryTree() {
        root=null;
    }
    List<Integer> postOrderlist=new ArrayList<Integer>();

    public List<Integer> postOrder(Node node){

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

    List <Integer> inOrderList=new ArrayList<>();
    public List<Integer> inOrder(Node node){
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

    List<Integer> preOrderList=new ArrayList<Integer>();
    public List<Integer> preOrder(Node node){
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
//    void preOrder(){
//        preOrder(root);
//    }
//    void inOrder(){
//        inOrder(root);
//    }
//    void postOrder(){
//        postOrder(root);
//    }
}
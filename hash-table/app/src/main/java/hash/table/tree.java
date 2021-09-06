package hash.table;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class tree<T> {
    Node <T> root;
    public tree() {
        root=null;
    }
    Set<T> inOrderList=new HashSet<>();
    public Set<T> inOrder(Node<T> node){
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
}

package fizzBuzzTree;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    public Node root;

    public Tree(){
    }

    public Tree(Node node){
        this.root=node;
    }
    public List<Object> inOrder(){
        List<Object>list=new ArrayList<>();
        return inOrderHelper(list,this.root);
    }
    private List<Object>inOrderHelper(List<Object> list,Node node){
        if(node!=null){
            inOrderHelper(list,node.left);
            list.add(node.data);
            inOrderHelper(list,node.right);
        }
        return list;
    }
}

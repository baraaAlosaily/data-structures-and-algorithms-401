package hash.table;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    public T data;
    public Node leftChild=null;
    public Node rightChild=null;


    public Node(T data) {
        this.data = data;
    }
}

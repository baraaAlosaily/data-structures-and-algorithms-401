package trees;
public class Node<T> {
    public T data;
    public Node leftChild=null;
    public Node rightChild=null;
    public Node next;

    public Node(T data) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
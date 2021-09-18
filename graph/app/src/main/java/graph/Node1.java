package graph;

public class Node1<T> {

    private Node1<T> next;
    private final T data;

    public Node1(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Node1<T> getNext() {
        return next;
    }

    public void setNext(Node1<T> next) {
        this.next = next;
    }

}

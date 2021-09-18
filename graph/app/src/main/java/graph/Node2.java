package graph;

public class Node2<T> {

    private Node2<T> next;
    private final T data;

    public Node2(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Node2<T> getNext() {
        return next;
    }

    public void setNext(Node2<T> next) {
        this.next = next;
    }

}

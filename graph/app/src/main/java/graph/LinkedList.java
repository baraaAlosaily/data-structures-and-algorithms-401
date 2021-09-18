package graph;

public class LinkedList<T> {
    private Node1 head;
    private int length;

    public LinkedList() {
        this.head = null;
        this.length = 0;
    }

    public void append(T data) {
        Node1<T> node = new Node1<T>(data);
        if (head == null) {
            head = node;
            length = 1;
            return;
        } else {
            Node1<T> currentHead = head;
            while (currentHead.getNext() != null) {
                currentHead = currentHead.getNext();
            }
            currentHead.setNext(node);
            length++;
        }

    }

    public void insert(T data) {
        Node1<T> node = new Node1<T>(data);
        if (head == null) {
            head = node;
            length = 1;
            return;
        } else {

            Node1 previousHead = this.head;
            node.setNext(previousHead);
            this.head = node;
            length++;
        }

    }

    public boolean includes(T data) {
        if (this.head == null) return false;
        Node1 node = new Node1(data);
        Node1 currentHead = head;
        if (node.getData() == currentHead.getData()) {
            return true;
        }

        while (currentHead.getNext() != null) {
            currentHead = currentHead.getNext();
            if (node.getData() == currentHead.getData()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        Node1 currentNode = head;
        if (currentNode == null)
            return "empty";
        String output = "{ " + currentNode.getData().toString() + " } -> ";
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
            output += "{ " + currentNode.getData().toString() + " } -> ";
        }
        return output + "NULL";
    }
}

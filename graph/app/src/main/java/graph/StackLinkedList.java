package graph;

public class StackLinkedList<T> {
    private Node2<T> top ;

    public StackLinkedList(){
        this.top = null ;
    }

    public void push(T data){
        Node2<T> newNode = new Node2(data);
        if(this.top == null){
            this.top =newNode ;
            return;
        } else{
            Node2 previousTop = this.top ;
            newNode.setNext(previousTop);
            this.top = newNode ;
            return;
        }

    }

    public T pop(){
        if(this.top == null)
            return (T)"Exception";
        Node2 previousTop = this.top ;
        this.top = this.top.getNext() ;
        previousTop.setNext(null);
        return (T)previousTop.getData() ;
    }

    public T peek(){
        return this.top==null ? (T)"Exception":this.top.getData() ;
    }

    public Boolean isEmpty(){
        return this.top == null;
    }

    public String toString(){
        if (this.top == null)
            return "The stack is empty";
        Node2<T> currentTop = this.top ;
        String output = "{"+currentTop.getData()+"} -> " ;
        while (currentTop.getNext()!=null){
            currentTop = currentTop.getNext() ;
            output+="{"+currentTop.getData()+"} -> " ;
        }
        return output+"NULL" ;
    }

}

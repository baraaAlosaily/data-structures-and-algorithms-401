package graph;

public class Queue <T>{
    Node <T> fornt;
    Node <T> rear;


    public void enQueue(T data) {
        Node<T> node=new Node<>(data);
        if(fornt==null){
            fornt=node;
        }else {
            rear.next=node;
        }
        rear=node;
        System.out.println(node.data);
    }

    public T deQueue() {
        if(fornt==null){
            try {
                throw new Exception("Stack is Empty");
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }else {
            Node<T> rem=fornt;
            fornt=fornt.next;
            rem.next=null;
            return rem.data;
        }
    }
    public T peek(){
        if(fornt==null){
            try {
                throw new Exception("Stack is Empty");
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }else {
            return fornt.data;
        }
    }
    public boolean isEmpty() {
        if (fornt==null){
//            try {
//                throw new Exception("Stack is Empty");
//            } catch (Exception e) {
//                e.printStackTrace();
                return true;
        }
        return false;
    }


    public String show(){
        String str="";
        if(fornt==null){
            System.out.println("Stack is Empty");
        }else {
            Node<T> node=fornt;
            while (node!=null){
//                System.out.print("->{"+temp.data+"}");
                str+="<-{"+node.data+"}";
                node=node.next;
            }
        }
        return "Front"+str+"<-Rear";
    }
}

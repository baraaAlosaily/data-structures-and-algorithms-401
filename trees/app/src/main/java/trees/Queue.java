package trees;

public class Queue<T> {
    Node<T> fornt;
    Node<T> rear;

    public void enQueue(Node<T> node) {
        if (fornt == null) {
            fornt = node;
        } else {
            rear.next = node;
        }
        rear = node;
    }

    public T deQueue() {
        if (fornt == null) {
            try {
                throw new Exception("Stack is Empty");
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else {
            T rem = this.fornt.data;
            Node<T> temp=this.fornt;
            this.fornt = this.fornt.next;
            temp.next = null;
            return rem;
        }
    }

    public T peek() {
        if (fornt == null) {
            try {
                throw new Exception("Stack is Empty");
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else {
            return fornt.data;
        }
    }

    public boolean isEmpty() {
        if (fornt == null) {
            try {
                throw new Exception("Stack is Empty");
            } catch (Exception e) {
                e.printStackTrace();
                return true;
            }
        }
        return false;
    }
}
//    public String show(){
//        String str="";
//        if(fornt==null){
//            System.out.println("Stack is Empty");
//        }else {
//            Node<T> node=fornt;
//            while (node!=null){
////                System.out.print("->{"+temp.data+"}");
//                str+="<-{"+node.data+"}";
//                node=node.next;
//            }
//        }
//        return "Front"+str+"<-Rear";
//    }
//}

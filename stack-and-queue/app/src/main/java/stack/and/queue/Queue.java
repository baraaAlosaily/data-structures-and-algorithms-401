package stack.and.queue;

public class Queue {
    Node fornt;
    Node rear;
    int size = 0;


    public void enQueue(int data) {
        Node node=new Node(data);
        if(size==0){
            fornt=node;
            rear=node;
            size++;
        }else {
            rear.next=node;
            rear=node;
            size++;
        }
    }

    public int deQueue() {
        if(fornt==null){
            try {
                throw new Exception("Stack is Empty");
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }else {
            Node rem=fornt;
            fornt=fornt.next;
            size--;
            return rem.data;
        }
    }
    public int peek(){
        if(fornt==null){
            try {
                throw new Exception("Stack is Empty");
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }else {
            return fornt.data;
        }
    }
    public boolean isEmpty() {
        if (fornt==null){
            try {
                throw new Exception("Stack is Empty");
            } catch (Exception e) {
                e.printStackTrace();
                return true;}

        }
        return false;
    }


    public String show(){
        String str="";
        if(fornt==null){
            System.out.println("Stack is Empty");
        }else {
            Node node=fornt;
            while (node!=null){
//                System.out.print("->{"+temp.data+"}");
                str+="<-{"+node.data+"}";
                node=node.next;
            }
        }
        return "Front"+str+"<-Rear";
    }
}

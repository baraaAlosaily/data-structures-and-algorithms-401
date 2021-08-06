package stack.and.queue;

public class Stack {
    Node top=null;
    Node newTop;
    public void push(int data){
        Node temp=new Node(data);
        temp.data=data;
        temp.next=top;
        top=temp;
    }

    public String show(){
        String str="";
        if(top==null){
            System.out.println("Stack is Empty");
        }else {
            Node temp=top;
            while (temp!=null){
//                System.out.print("->{"+temp.data+"}");
                str+="->{"+temp.data+"}";
                temp=temp.next;
            }
        }
        return str;
    }
    public int pop(){
        if (top==null){
            try {
                throw new Exception("Stack is Empty");
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }
        newTop=top;
        top=top.next;
        return newTop.data;
    }
    public int peek() {
        if (top==null){
            try {
                throw new Exception("Stack is Empty");
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
//            System.out.println("Stack is Empty");
//            return -1;
        }else {
            System.out.println(top.data);
            return top.data;
        }
    }
    public boolean isEmpty() {
        if (top==null){
            try {
                throw new Exception("Stack is Empty");
            } catch (Exception e) {
                e.printStackTrace();
                return true;}

        }
        return false;
    }

}

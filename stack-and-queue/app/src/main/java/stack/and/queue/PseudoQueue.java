package stack.and.queue;

public class PseudoQueue {
    static Stack s1=new Stack();
    static Stack s2=new Stack();

    public String enQueqe(int data){
        s1.push(data);
        System.out.print("->{"+data+"}");
        return data+" ";
    }
    static int deQueue()
    {
while (!s1.isEmpty()){
    s2.push(s1.pop());
}
int x=s2.pop();
while (!s2.isEmpty()){
    s1.push(s2.pop());
}
        return x;
    }

    static String show(){
        if (!s1.isEmpty()){
            System.out.println("peek"+s1.peek());
            return s1.show();

        }else {
            System.out.println("peek"+s2.peek());
            return s2.show();
        }
    }
}

package stack.and.queue;

public class PseudoQueue<T> {
    public Stack<T> s1=new Stack<T>();
    public Stack<T> s2=new Stack();

    public void enQueqe(T data){
        s1.push(data);
        System.out.print("->{"+data+"}");
    }
    public T deQueue()
    {
while (!s1.isEmpty()){
    s2.push(s1.pop());
}
T x=s2.pop();
while (!s2.isEmpty()){
    s1.push(s2.pop());
}
        return x;
    }

    public String show(){
        if (!s1.isEmpty()){
            System.out.println("peek"+s1.peek());
            return s1.show();

        }else {
            System.out.println("peek"+s2.peek());
            return s2.show();
        }
    }
}

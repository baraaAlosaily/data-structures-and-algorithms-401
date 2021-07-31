package linked.list;
//Create Linkedlist class
public class LinkedList {
    //assign the value of Node
    Node head;
    //craete insert method that will used to insert value and return null
    public void insert(int data){
        Node node=new Node(data);
        if (head==null) {
            head=node;
        }else {
            Node current=head;
            while (current.next!=null){
                current=current.next;
            }
            current.next=node;

        }
    }
    //Create includes method that will examine value that insert if it is include in the linkedlist will return true if note will return false
    public boolean includes(int data){
        Node node = head;
        while (node!=null){
                if (node.data==data){
//                    System.out.println("true");
                    return true;
                }else {
//                    System.out.println(node.data);
                    node= node.next;
                }

        }
//        System.out.println(node.next.data);
//        System.out.println("false");
        return false;
    }
    // Create function that will show the list that created and will return structured string
    public String show(){
        String print="";
        Node node=head;
        while (node.next!=null){
         print=print+"{"+node.data+"} -> ";
            node=node.next;
        }
        String print2;
        print2 = print+"{"+node.data+"} -> Null";
        System.out.println(print2);
        return print2;
    }
}

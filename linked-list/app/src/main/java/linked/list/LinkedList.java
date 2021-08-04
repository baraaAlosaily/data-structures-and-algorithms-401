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
            node.data=data;
            node.next=head;
            head=node;
        }
    }
    /* Function to get the nth node from the last of a
     linked list */
    public int kthFromEnd(int var) {
        int len = 0;
        Node temp = head;

        // 1) count the number of nodes in Linked List
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        // check if value of n is not more than length of
        // the linked list
        if (len <= var||var<0) {
            System.out.println("The K is more,less,or negative number");
            return -1;
        }
        temp = head;
        // 2) get the (len-n+1)th node from the beginning
        for (int i = 1; i < len - var ; i++) {
            temp = temp.next;
//            System.out.println(temp.data);
        }
        System.out.println(temp.data);
        return temp.data;
    }
    // Craete method that append add new int at the end of the added value
    public void append(int data){
        Node node=new Node(data);
        Node current=head;
        while (current.next!=null){
            System.out.println("my name is mohammad");
            current=current.next;
        }
        System.out.println("my name is baraa");
        current.next=node;

    }
    // Create metod that add int before certen item
    public void insertbefore(int var,int data){
        Node current=head;
        if (current.data==var){
            Node node = new Node(data);
            head=node;
            node.next=current;
        }
        while (current.next!=null){
            if (current.next.data==var) {
                System.out.println(var);
                Node node = new Node(data);
                node.next=current.next;
//            System.out.println(node.data);
                current.next=node;
//            System.out.println("Are you in");
                break;
            }
            current=current.next;
        }
    }
    // Create metod that add int After certen item
    public void insertAfter(int var,int data){
        Node current=head;
        while (current.next!=null){
            if (current.data==var) {
                System.out.println(var);
                Node node = new Node(data);
                node.next=current.next;
                System.out.println(node.data);
                current.next=node;
                System.out.println("Are you in");
                break;
            }
            current=current.next;
        }
        if (current.next==null){
            append(data);}
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
        while (node!=null){
            print=print+"{"+node.data+"} -> ";
            node=node.next;
        }
        String print2="";
//        if(node!=null){
            print2 = print+"Null";
//        }
        System.out.println(print2);
        return print2;
    }
    public Node zipLists(LinkedList q ,LinkedList p) {
        if (p.head==null&&q.head==null)
            return null;
//        if (p.head==null)return q.head;
//        if (q.head==null)return p.head;

        Node p_curr=p.head,q_curr=q.head;
        Node p_next,q_next;
      while (p_curr!=null&&q_curr!=null){
//          System.out.println("baraa");
            p_next=p_curr.next;
            q_next=q_curr.next;

            q_curr.next=p_next;
            p_curr.next=q_curr;

            p_curr=p_next;
            q_curr=q_next;

        }

//
        q.head=q_curr;
        return p.head;
    }
}

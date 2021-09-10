package linked.list;
import java.util.HashSet;
import java.util.Stack;

//Create Linkedlist class
public class LinkedList {
    //assign the value of Node
    Node head;
    //craete insert method that will used to insert value and return null

    public Node reveerse(Node node){
        Node pre=null;
        Node curr=node;
        Node next=null;
        while (curr!=null){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;

        }
        node=pre;
        return node;
    }
    public int deleteDulicatedEntry(int data) {
        if (head == null) {
            return 1;
        }
        Node current = this.head;
        while (current != null) {
            if (current.data == data) {
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
        return head.data;
    }

    public void delete(int data) {
        if (head == null) {
            return;
        }
        Node current = this.head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
    }


    public int findMax(Node head){
        if(head==null){
            return -1;
        }
        Node curr=head;
        int min=head.data;
        while (curr!=null){
            if(curr.data<=min){
                min=curr.data;
            }
            curr=curr.next;
        }
        System.out.println(min);
        return min;
    }


    public int retunMid(Node head){
        Node mid=head;
        int count=0;
//        if(head==null){
//            return -1;
//        }
        while (head!=null){
            if((count%2)==1){
                mid=mid.next;}
                ++count;
                head=head.next;

        }
        System.out.println(mid.data);
        return mid.data;
    }

    public Node deletemid(Node head){
          if(head==null)return null;
          if(head.next==null)return null;
          Node prev=null;
          Node fast=head;
          Node slow=head;

          while (fast!=null&&fast.next!=null){
              fast=fast.next.next;
              prev=slow;
              System.out.println(slow.data);
              slow=slow.next;
              System.out.println(prev.data);
          }
        System.out.println(slow.data);
          return prev;
    }
    public void deleteDoublicated(Node head){
        // Hash to store seen values
        HashSet<Integer> hs = new HashSet<>();

        /* Pick elements one by one */
        Node current = head;
        Node prev = null;
        while (current != null)
        {
            int curval = current.data;

            // If current value is seen before
            if (hs.contains(curval)) {
                prev.next = current.next;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
    }
    public void sorted(){
        Node current = head, index = null;

        int temp;

        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                // Node index will point to node next to
                // current
                index = current.next;

                while (index != null) {
                    // If current node's data is greater
                    // than index's node data, swap the data
                    // between them
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }

                    index = index.next;
                }
                current = current.next;
            }
        }
    }

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
    public boolean palindrome(LinkedList p) {
        if (head == null)
            return true;

        Node p_curr = p.head;
        Node prev = new Node(head.data);

        while (p_curr.next != null) {
            Node temp = new Node(p_curr.next.data);
            temp.next = prev;
            prev = temp;
            p_curr = p_curr.next;
        }

        Node p1 = head;
        Node p2 = prev;

        while (p1 != null) {
            if (p1.data != p2.data)
                return false;

            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }

//    public Node zipLists(LinkedList q ,LinkedList p) {
//        if (p.head==null&&q.head==null)
//            return null;
////        if (p.head==null)return q.head;
////        if (q.head==null)return p.head;
//
//        Node p_curr=p.head,q_curr=q.head;
//        Node p_next,q_next;
//      while (p_curr!=null&&q_curr!=null){
////          System.out.println("baraa");
//            p_next=p_curr.next;
//            q_next=q_curr.next;
//
//            q_curr.next=p_next;
//            p_curr.next=q_curr;
//
//            p_curr=p_next;
//            q_curr=q_next;
//
//        }
//        q.head=q_curr;
//        return p.head;
//    }
}

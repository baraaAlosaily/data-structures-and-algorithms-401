
package linked.list;

//create app class that will execute the the mehtod that created in the linked list
public class App {
    //    public String getGreeting() {
//        return "Hello World!";
//    }
    public static void main(String[] args) {
//        System.out.println(new App().getGreeting());
        LinkedList list1=new LinkedList();
        list1.insert(5);
        list1.insert(10);
        list1.insert(15);
        LinkedList list2=new LinkedList();
        list2.insert(3);
        list2.insert(4);
        list2.insert(5);
        LinkedList new1=new LinkedList();
        list1.show();
        list2.show();
        new1.head= new1.zipLists(list1,list2);
//        Node current=new1.head;
//        while (current!=null){
//            System.out.println(current.data);
//            current=current.next;
//        }
//        System.out.println(new1.show());
        new1.show();
//        list1.show();
//        list2.show();
//        list.show();
//        list.kthFromEnd(-2);
//        System.out.println(list.includes(5));
    }
}

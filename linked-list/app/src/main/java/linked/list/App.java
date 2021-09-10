
package linked.list;

//create app class that will execute the the mehtod that created in the linked list
public class App {
    //    public String getGreeting() {
//        return "Hello World!";
//    }
    public static void main(String[] args) {
////        System.out.println(new App().getGreeting());
//// ============Uncomment to test the functions===============
        LinkedList list=new LinkedList();
        list.insert(2);
        list.append(5);
        list.append(10);
        list.append(10);
        list.append(30);
        list.append(30);
        list.append(1);
        list.append(1);
//        list.append(10);
//        list.append(10);
//        list.append(10);
//        list.append(10);
//        System.out.println(list.delete(10));

//        list.append(50);
//        list.append(12);
//        list.append(15);
//        list.show();
//        list.findMax(list.head);
//        list.show();
        list.show();
//        list.deleteDoublicated(list.head);
//
        list.deletemid(list.head);
//        list.sorted();
//
//        list.delete(10);
        list.show();

////        list.append(30);
////        list.append(35);
////        list.insertbefore(5,13);
////        list.insertAfter(35,16);
////        list.show();
////        list.kthFromEnd(-2);
////        System.out.println(list.includes(5));
//        list.show();
//       boolean cond= list.palindrome(list);
//        System.out.println(cond
//
//        LinkedList list1=new LinkedList();
//        list1.insert(5);
//        list1.insert(10);
//        list1.insert(15);
////        LinkedList list2=new LinkedList();
////        list2.insert(3);
////        list2.insert(4);
////        list2.insert(5);
////        LinkedList new1=new LinkedList();
////        list1.show();
////        list2.show();
////        new1.head= new1.zipLists(list1,list2);
////        Node current=new1.head;
////        while (current!=null){
////            System.out.println(current.data);
////            current=current.next;
////        }
////        System.out.println(new1.show());
//    list1.show();
////        list1.show();
////        list2.show();
////        list.show();
////        list.kthFromEnd(-2);
////        System.out.println(list.includes(5));
    }
}
